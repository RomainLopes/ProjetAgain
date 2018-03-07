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
public class LettreDeSortieDAO extends DAO<LettreDeSortie> {

    public LettreDeSortieDAO(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(LettreDeSortie obj) {
        String Query = new String();
        Query = "insert into operations (ipp,idph,texte) "
                + "values ('{" + obj.getIpp() + "}','{" + obj.getIdph() + "}','"
                + obj.getTexte() + "')";
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

    
    public LettreDeSortie find(String ipp) {
        LettreDeSortie lds = new LettreDeSortie();
        String Query = new String();
        Query = "select * from operations where ipp = '{" + ipp
                + "}'";

        try {

            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);

            if (result.next()) {
                lds = new LettreDeSortie(result.getString("ipp"), result.getString("idph"), result.getString("texte"));
                result.close();
                state.close();
                return lds;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lds;
    }

    @Override
    public boolean delete(LettreDeSortie obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(LettreDeSortie obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LettreDeSortie find(String id, String service) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
