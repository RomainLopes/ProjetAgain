/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionBDD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author romel
 */
public class DossierMedicalDAO extends DAO<DossierMedical> {

    /**
     *
     * @param conn
     */
    public DossierMedicalDAO(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(DossierMedical obj) {
        String Query;
        Query = "insert into dossiermedical (ipp,nosejour,service,correspondance) "
                + "values ('{" + obj.getIpp() + "}','" + obj.getNosejour() + "','"
                + obj.getService() + "','" + obj.getCorrespondance()
                + "')";
        try {
            
            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            //System.out.println(Query);
            int result = state.executeUpdate(Query);
            return true;
            
        } catch (SQLException e) {
            return false;
        }

    }

    /**
     * Méthode de recherche retournant une liste vide, ou non de l'objet
     *
     * @param ipp
     * @param nosejour
     * @param service
     * @return
     */
    @Override
    public ArrayList<DossierMedical> findSer(String ipp, String nosejour, String service) {
        ArrayList<DossierMedical> dm = new ArrayList<>();
        String Query;
        Query = "select * from dossiermedical where ipp = '{" + ipp
                + "}' and nosejour = '" + nosejour + "' and service = '"
                + service + "'";

        try {

            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);

            while (result.next()) {

                dm.add(new DossierMedical(result.getString("ipp"), result.getString("nosejour"), result.getString("service"), result.getString("correspondance")));

            }
            
            return dm;
            
        } catch (SQLException e) {}

        return dm;
    }

    @Override
    public boolean updateIpp(String ippgarde, String ippsuppr) {
        String Query;
        Query = "UPDATE dossiermedical "
                + "SET ipp = '{" + ippgarde + "}' "
                + "WHERE ipp = '{" + ippsuppr + "}' ";

        try {
            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            int result = state.executeUpdate(Query);

        } catch (SQLException e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean updateCorrespondance(String ipp, String nosejour, String correspondance) {
        String Query;
        Query = "UPDATE dossiermedical "
                + "SET correspondance ='" + correspondance + "' "
                + "WHERE ( ipp = '{" + ipp + "}' and nosejour = '" + nosejour + "' )";

        try {
            
            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            int result = state.executeUpdate(Query);

        } catch (SQLException e) {
            return false;
        }
        return true;
    }

    @Override
    public ArrayList<DossierMedical> find(String ipp, String service) {
        ArrayList<DossierMedical> dm = new ArrayList<>();
        String Query;
        Query = "select * from dossiermedical where ipp = '{" + ipp
                + "}' and service = '"
                + service + "'";

        try {

            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);

            while (result.next()) {

                dm.add(new DossierMedical(result.getString("ipp"), result.getString("nosejour"), result.getString("service"), result.getString("correspondance")));

            }
            
            return dm;
            
        } catch (SQLException e) {}
        
        return dm;
    }

    @Override
    public boolean delete(DossierMedical obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<DossierMedical> findIpp(String ipp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
