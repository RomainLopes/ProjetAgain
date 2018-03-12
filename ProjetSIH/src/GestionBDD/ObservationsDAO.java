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
public class ObservationsDAO extends DAO<Observations> {

    public ObservationsDAO(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(Observations obj) {
        String Query = new String();
        Query = "insert into observation (ipp,nosejour,service,dateObservation,idph,nomacte,resume ) "
                + "values ('{" + obj.getIpp() + "}','" + obj.getNosejour() + "','"
                + obj.getService() + "','" + obj.getDateObservation()
                + "','" + obj.getIdph() + "','" + obj.getNomacte()
                + "','" + obj.getResume() + "')";
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

    public ArrayList<Observations> findser(String ipp, String nosejour, String service) {
        ArrayList<Observations> obs = new ArrayList<Observations>();
        String Query = new String();
        Query = "select * from observation where ipp = '{" + ipp
                + "}' and nosejour = '{" + nosejour + "}' and service = '"
                + service + "'";

        try {

            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);

            while (result.next()) {
                obs.add(new Observations(result.getString("ipp"), result.getString("nosejour"), result.getString("service"), result.getString("dateObservation"), result.getString("idph"), result.getString("nomacte"), result.getString("resume")));
                result.close();
                state.close();
                return obs;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obs;
    }

    @Override
    public boolean delete(Observations obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Observations obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Observations> find(String id, String service) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
