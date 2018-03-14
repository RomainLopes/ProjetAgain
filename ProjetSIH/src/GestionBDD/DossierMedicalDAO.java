/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionBDD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author romel
 */
public class DossierMedicalDAO extends DAO<DossierMedical> {

    public DossierMedicalDAO(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(DossierMedical obj) {
        String Query = new String();
        Query = "insert into dossiermedical (ipp,nosejour,service,correspondance) "
                + "values ('{" + obj.getIpp() + "}','" + obj.getNosejour() + "','"
                + obj.getService() + "','" + obj.getCorrespondance()
                + "')";
        try {
            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println(Query);
            int result = state.executeUpdate(Query);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public ArrayList<DossierMedical> findser(String ipp, String nosejour, String service) {
        ArrayList<DossierMedical> dm = new ArrayList<DossierMedical>();
        String Query = new String();
        Query = "select * from dossiermedical where ipp = '{" + ipp
                + "}' and nosejour = '" + nosejour + "' and service = '"
                + service + "'";

        try {

            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);

            while (result.next()) {
                dm.add(new DossierMedical(result.getString("ipp"), result.getString("nosejour"), result.getString("service"), result.getString("correspondance")));
                result.close();
                state.close();
                return dm;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return dm;
    }

    @Override
    public boolean delete(DossierMedical obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean updateIpp(String ippgarde, String ippsuppr) {
        String Query = new String();
        Query = "UPDATE dossiermedical"
                + "SET ipp = '{" + ippgarde + "}'"
                + "WHERE ipp = '{" + ippsuppr + "}' ";

        try {
            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println(Query);
            int result = state.executeUpdate(Query);

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public ArrayList<DossierMedical> find(String id, String service) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(DossierMedical obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
