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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author romel
 */
public class PrescriptionsDAO extends DAO<Prescriptions> {

    public PrescriptionsDAO(Connection conn) {
        super(conn);
    }

    @Override
     public String createIdPrescription(String ipp) {
        
        String Query;
        
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(new Date());
        
        int annee = calendar.get(Calendar.YEAR);
        String anneestr = String.valueOf(annee).substring(2, 4);
        
        int mois = calendar.get(Calendar.MONTH);
        String moisstr;
        if (String.valueOf(mois).length() == 1){
            moisstr = "0" + String.valueOf(mois);
        }else{
            moisstr = String.valueOf(mois);
        }
        
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        String daystr;
        if (String.valueOf(day).length() == 1){
            daystr = "0" + String.valueOf(day);
        }else{
            daystr = String.valueOf(day);
        }
        
        String idPrescription = "P" + anneestr + moisstr + "0000";

        Query = "select max(idprescription) from prescription where idprescription >= '" + idPrescription + "' and ipp = '{" + ipp + "}' ";

        try {
            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);

            if (result.next()) {
        
                int intIdPrescription;
                idPrescription = result.getString(1).substring(1);

                intIdPrescription = Integer.parseInt(idPrescription); 
                intIdPrescription++;
                
                idPrescription = "P" + String.valueOf(intIdPrescription);

                result.close();
                state.close();
                return idPrescription;
            }
            return idPrescription;
        } catch (SQLException e) {
            return idPrescription;
        }
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
        } catch (SQLException e) {
            return false;
        }
    }

    @Override
    public boolean updateIpp(String ippgarde, String ippsuppr) {
        String Query = new String();
        Query = "UPDATE prescription "
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
    public ArrayList<Prescriptions> findIpp(String ipp) {
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
        } catch (SQLException e) {
        }
        return pre;
    }

    @Override
    public ArrayList<Prescriptions> findSer(String ipp, String nosejour, String service) {
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
        } catch (SQLException e) {
        }
        return pre;
    }

    @Override
    public boolean delete(Prescriptions obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Prescriptions> find(String id, String service) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
