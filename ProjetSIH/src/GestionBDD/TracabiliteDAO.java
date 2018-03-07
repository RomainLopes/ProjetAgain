/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionBDD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

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
    
    public Tracabilite findser(String ipp) {
        Tracabilite tra = new Tracabilite();
        String Query = new String();
        Query = "select * from tracabilite where ipp = '{" + ipp
                + "}'";

        try {

            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);

            if (result.next()) {
                tra = new Tracabilite(result.getString("ipp"), result.getString("idph"), result.getString("dateconnection"));
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
    public Tracabilite find(String id, String service) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
