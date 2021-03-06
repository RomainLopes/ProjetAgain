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
public class ResultatsDAO extends DAO<Resultats> {

    /**
     *
     * @param conn
     */
    public ResultatsDAO(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(Resultats obj) {
        String Query;
        String prestationmt = obj.getPrestationmt().replace('\'',' ');
        String resultat = obj.getResultat().replace('\'',' ');
        
        Query = "insert into resultat (ipp,nosejour,idPrescription,service,prestationmt,dateResultat,resultat) "
                + "values ('{" + obj.getIpp() + "}','" + obj.getNosejour() + "','"
                + obj.getIdPrescription() + "','" + obj.getService() + "','"
                + prestationmt + "','" + obj.getDateResultat()
                + "','" + resultat + "')";
        try {
            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println(Query);
            int result = state.executeUpdate(Query);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    @Override
    public boolean updateIpp(String ippgarde, String ippsuppr) {
        String Query;
        Query = "UPDATE resultat "
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
    public ArrayList<Resultats> findIpp(String ipp) {
        ArrayList<Resultats> res = new ArrayList<>();
        String Query;
        Query = "select * from resultat where ipp = '{" + ipp
                + "}'";

        try {

            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);

            while (result.next()) {
                res.add(new Resultats(result.getString("ipp"), result.getString("nosejour"), result.getString("idPrescription"), result.getString("service"), result.getString("prestationmt"), result.getString("dateResultat"), result.getString("resultat")));
             

            }
               return res;
        } catch (SQLException e) {
        }
        return res;
    }

    @Override
    public ArrayList<Resultats> find(String ipp, String nosejour) {
        ArrayList<Resultats> res = new ArrayList<>();
        String Query;
        Query = "select * from resultat where ipp = '{" + ipp
                + "}' and nosejour = '" + nosejour + "'";

        try {

            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);

            while (result.next()) {
                res.add(new Resultats(result.getString("ipp"), result.getString("nosejour"), result.getString("idPrescription"), result.getString("service"), result.getString("prestationmt"), result.getString("dateResultat"), result.getString("resultat")));

            

            }
                return res;
        } catch (SQLException e) {
        }
        return res;
    }

    @Override
    public boolean delete(Resultats obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Resultats> findSer(String ipp, String nosejour, String service) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
