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
public class TracabiliteDAO extends DAO<Tracabilite> {

    public TracabiliteDAO(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(Tracabilite obj) {
        String Query = new String();
        Query = "insert into Tracabilite (ipp,idph,dateconnection) "
                + "values ('{" + obj.getIpp() + "}','{" + obj.getIdph() + "}','"
                + obj.getDateconnection() + "')";
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

    public ArrayList<Tracabilite> findser(String ipp) {
        ArrayList<Tracabilite> tra = new ArrayList<Tracabilite>();
        String Query = new String();
        Query = "SELECT patients.nompatient, patients.prenompatient, personnelhospitalier.nomph, personnelhospitalier.prenomph, personnelhospitalier.fonction, tracabilite.dateconnexion"
                + " FROM tracabilite INNER JOIN personnelhospitalier "
                + " ON tracabilite.idph = personnelhospitalier.id "
                + " INNER JOIN patients "
                + " ON tracabilite.ipp = patients.ipp "
                + " WHERE tracabilite.ipp = '{" + ipp + "}'";

        try {

            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);

            while (result.next()) {
                tra.add(new Tracabilite(result.getString("nompatient"), result.getString("prenompatient"), result.getString("nomph"), result.getString("prenomph"), result.getString("fonction"), result.getString("dateconnexion")));
                result.close();
                state.close();
                return tra;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tra;
    }

    @Override
    public boolean delete(Tracabilite obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Tracabilite obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Tracabilite> find(String id, String service) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
