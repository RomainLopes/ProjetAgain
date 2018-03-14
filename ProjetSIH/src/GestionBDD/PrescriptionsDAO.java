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
public class PrescriptionsDAO extends DAO<Prescriptions> {

    public PrescriptionsDAO(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(Prescriptions obj) {
        String Query = new String();
        Query = "insert into prescription (ipp,nosejour,idprescription,dateprescription,prescription,service) "
                + "values ('{" + obj.getIpp() + "}','" + obj.getNosejour() + "','"
                + obj.getIdprescription() + "','" + obj.getDateprescription()
                + "','" + obj.getPrescription() + "','" + obj.getService() + "')";
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

    public ArrayList<Prescriptions> findser(String ipp, String nosejour, String service) {
        ArrayList<Prescriptions> pre = new ArrayList<Prescriptions>();
        String Query = new String();
        Query = "select * from prescription where ipp = '{" + ipp
                + "}' and nosejour = '" + nosejour + "' and service = '"
                + service + "'";

        try {

            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);

            while (result.next()) {
                pre.add(new Prescriptions(result.getString("ipp"), result.getString("nosejour"), result.getString("idprescription"), result.getString("dateprescription"), result.getString("prescription"), result.getString("service")));
                result.close();
                state.close();
                return pre;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pre;
    }
    
    public ArrayList<Prescriptions> findsipp(String ipp) {
        ArrayList<Prescriptions> pre = new ArrayList<Prescriptions>();
        String Query = new String();
        Query = "select * from prescription where ipp = '{" + ipp
                + "}'";

        try {

            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);

            while (result.next()) {
                pre.add(new Prescriptions(result.getString("ipp"), result.getString("nosejour"), result.getString("idprescription"), result.getString("dateprescription"), result.getString("prescription"), result.getString("service")));
                result.close();
                state.close();
                return pre;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pre;
    }

    public boolean updateIpp(String ippgarde, String ippsuppr) {
        String Query = new String();
        Query = "UPDATE prescription"
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
    public boolean delete(Prescriptions obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Prescriptions obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Prescriptions> find(String id, String service) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
