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
public class PrestationsDAO extends DAO<Prestations> {

    /**
     *
     * @param conn
     */
    public PrestationsDAO(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(Prestations obj) {
        String Query;
        String prestation = obj.getPrestation().replace('\'',' ');
        
        Query = "insert into prestation (ipp,nosejour,datePrestation,service,prestation) "
                + "values ('{" + obj.getIpp() + "}','" + obj.getNosejour() + "','"
                + obj.getDatePrestation() + "','" + obj.getService()
                + "','" + prestation + "')";
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
        Query = "UPDATE prestation "
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
    public ArrayList<Prestations> find(String ipp, String nosejour) {
        ArrayList<Prestations> pre = new ArrayList<>();
        String Query;
        Query = "select * from prestation where ipp = '{" + ipp
                + "}' and nosejour = '" + nosejour + "'";

        try {

            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);

            while (result.next()) {
                pre.add(new Prestations(result.getString("ipp"), result.getString("nosejour"), result.getString("datePrestation"), result.getString("service"), result.getString("prestation")));

            }
            return pre;
        } catch (SQLException e) {
        }
        return pre;
    }

    @Override
    public boolean delete(Prestations obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Prestations> findIpp(String ipp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Prestations> findSer(String ipp, String nosejour, String service) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
