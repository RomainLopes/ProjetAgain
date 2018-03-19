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
public class TracabiliteDAO extends DAO<Tracabilite> {

    /**
     *
     * @param conn
     */
    public TracabiliteDAO(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(Tracabilite obj) {
        String Query;
        Query = "insert into tracabilite (ipp,idph,dateconnexion) "
                + "values ('{" + obj.getIpp() + "}','" + obj.getIdph() + "','"
                + obj.getDateconnection() + "')";
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
        Query = "UPDATE tracabilite "
                + "SET ipp = '{" + ippgarde + "}'"
                + "WHERE ipp = '{" + ippsuppr + "}' ";

        try {
            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println(Query);
            int result = state.executeUpdate(Query);

        } catch (SQLException e) {
            return false;
        }
        return true;
    }

    @Override
    public ArrayList<Tracabilite> findIpp(String ipp) {
        ArrayList<Tracabilite> tra = new ArrayList<>();
        String Query;
        Query = "SELECT patients.nompatient, patients.prenompatient, personnelhospitalier.nomph, personnelhospitalier.prenomph, personnelhospitalier.fonction, tracabilite.dateconnexion"
                + " FROM tracabilite LEFT JOIN personnelhospitalier "
                + " ON tracabilite.idph = personnelhospitalier.id "
                + " LEFT JOIN patients "
                + " ON tracabilite.ipp = patients.ipp "
                + " WHERE tracabilite.ipp = '{" + ipp + "}'";

        try {

            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);

            while (result.next()) {
                tra.add(new Tracabilite(result.getString("nompatient"), result.getString("prenompatient"), result.getString("nomph"), result.getString("prenomph"), result.getString("fonction"), result.getString("dateconnexion")));
               
            }
             return tra;
        } catch (SQLException e) {
        }
        return tra;
    }

    @Override
    public boolean delete(Tracabilite obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Tracabilite> find(String id, String service) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Tracabilite> findSer(String ipp, String nosejour, String service) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
