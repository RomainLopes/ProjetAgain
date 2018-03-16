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
public class DossierMedicoAdministratifDAO extends DAO<DossierMedicoAdministratif> {

    public DossierMedicoAdministratifDAO(Connection conn) {
        super(conn);
    }

    @Override
    public String createNumeroSejour() {
        
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
        
        String nosejour = anneestr + moisstr + "00000";

        Query = "select max(nosejour) from dma where nosejour >= '" + nosejour + "'";

        try {
            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);

            if (result.next()) {
                int intNosejour;
                nosejour = result.getString(1);

                intNosejour = Integer.parseInt(nosejour); 
                intNosejour++;
                
                nosejour = String.valueOf(intNosejour);

                result.close();
                state.close();
                return nosejour;
            }
            return nosejour;
        } catch (SQLException e) {
            return nosejour;
        }
    }
    
    @Override
    public boolean create(DossierMedicoAdministratif obj) {
        String Query = new String();
        Query = "insert into dma (ipp,nosejour,dateentree,idph,type,service) "
                + "values ('{" + obj.getIpp() + "}','" + obj.getNosejour() + "','"
                + obj.getDateentree() + "','" + obj.getIdph()
                + "','" + obj.getType() + "','" + obj.getService()
                + "')";
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
        Query = "UPDATE dma "
                + "SET ipp = '{" + ippgarde + "}' "
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
    public ArrayList<DossierMedicoAdministratif> find(String ipp, String nosejour) {
        ArrayList<DossierMedicoAdministratif> dma = new ArrayList<DossierMedicoAdministratif>();
        String Query = new String();
        Query = "select * from dma where ipp = '{" + ipp
                + "}' and nosejour = '" + nosejour + "'";

        try {

            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);

            while (result.next()) {
                dma.add(new DossierMedicoAdministratif(result.getString("ipp"), result.getString("nosejour"), result.getString("dateentree"), result.getString("idph"), result.getString("type"), result.getString("service")));
                result.close();
                state.close();
                return dma;

            }
        } catch (SQLException e) {
        }
        return dma;
    }

    @Override
    public ArrayList<DossierMedicoAdministratif> findSer(String ipp, String nosejour, String service) {
        ArrayList<DossierMedicoAdministratif> dma = new ArrayList<DossierMedicoAdministratif>();
        String Query = new String();
        Query = "select * from dma where ipp = '{" + ipp
                + "}' and nosejour = '" + nosejour + "' and service = '"
                + service + "'";

        try {

            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);

            while (result.next()) {
                dma.add(new DossierMedicoAdministratif(result.getString("ipp"), result.getString("nosejour"), result.getString("dateentree"), result.getString("idph"), result.getString("type"), result.getString("service")));
                result.close();
                state.close();
                return dma;

            }
        } catch (SQLException e) {
        }
        return dma;
    }

    @Override
    public boolean delete(DossierMedicoAdministratif obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<DossierMedicoAdministratif> findIpp(String ipp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
