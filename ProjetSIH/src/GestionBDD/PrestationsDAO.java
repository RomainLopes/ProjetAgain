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
public class PrestationsDAO extends DAO<Prestations> {

    public PrestationsDAO(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(Prestations obj) {
        String Query = new String();
        Query = "insert into prestation (ipp,nosejour,datePrestation,service,prestation) "
                + "values ('{" + obj.getIpp() + "}','{" + obj.getNosejour() + "}','"
                + obj.getDatePrestation() + "','" + obj.getService()
                + "','" + obj.getPrestation() + "')";
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

    @Override
    public boolean delete(Prestations obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Prestations obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Prestations> find(String ipp, String nosejour) {
        ArrayList<Prestations> pre = new ArrayList<Prestations>();
        String Query = new String();
        Query = "select * from prestation where ipp = '{" + ipp
                + "}' and nosejour = '{" + nosejour + "}'";

        try {

            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);

            while (result.next()) {
                pre.add(new Prestations(result.getString("ipp"), result.getString("nosejour"), result.getString("datePrestation"), result.getString("service"), result.getString("prestation")));
                result.close();
                state.close();
                return pre;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pre;
    }

}
