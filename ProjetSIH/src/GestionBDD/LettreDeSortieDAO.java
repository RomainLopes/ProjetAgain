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
public class LettreDeSortieDAO extends DAO<LettreDeSortie> {

    /**
     *
     * @param conn
     */
    public LettreDeSortieDAO(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(LettreDeSortie obj) {
        String Query = new String();
        Query = "insert into lettredesortie (ipp,nosejour,idph,lettre) "
                + "values ('{" + obj.getIpp() + "}','" + obj.getNosejour() + "','"
                + obj.getIdph() + "','" + obj.getLettre() + "')";
        try {
            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            int result = state.executeUpdate(Query);
            return true;
        } catch (SQLException e) {
            return false;
        }

    }

    @Override
    public boolean updateIpp(String ippgarde, String ippsuppr) {
        String Query = new String();
        Query = "UPDATE lettredesortie "
                + "SET ipp = '{" + ippgarde + "}' "
                + "WHERE ipp = '{" + ippsuppr + "}' ";

        try {
            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            //System.out.println(Query);
            int result = state.executeUpdate(Query);

        } catch (SQLException e) {
            return false;
        }
        return true;
    }

    @Override
    public ArrayList<LettreDeSortie> find(String ipp, String nosejour) {
        ArrayList<LettreDeSortie> lds = new ArrayList<LettreDeSortie>();
        String Query = new String();
        Query = "select * from lettredesortie where ipp = '{" + ipp
                + "}' and nosejour = '" + nosejour + "'";

        try {

            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);

            while (result.next()) {
                lds.add(new LettreDeSortie(result.getString("ipp"), result.getString("nosejour"), result.getString("idph"), result.getString("lettre")));
                result.close();
                state.close();
                return lds;

            }
        } catch (SQLException e) {
        }
        return lds;
    }

    @Override
    public boolean delete(LettreDeSortie obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<LettreDeSortie> findIpp(String ipp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<LettreDeSortie> findSer(String ipp, String nosejour, String service) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
