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
public class OperationsDAO extends DAO<Operations> {

    public OperationsDAO(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(Operations obj) {
        String Query = new String();
        Query = "insert into operation (ipp,nosejour,idph,dateoperation,operation) "
                + "values ('{" + obj.getIpp() + "}','" + obj.getNosejour() + "','"
                + obj.getIdph() + "','" + obj.getDateoperation()
                + "','" + obj.getOperation() + "')";
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

    public boolean updateIpp(String ippgarde, String ippsuppr) {
        String Query = new String();
        Query = "UPDATE operation "
                + "SET ipp = '{" + ippgarde + "}' "
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

    public ArrayList<Operations> findIpp(String ipp) {
        ArrayList<Operations> ope = new ArrayList<Operations>();
        String Query = new String();
        Query = "select * from operation where ipp = '{" + ipp
                + "}'";

        try {

            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);

            while (result.next()) {
                ope.add(new Operations(result.getString("ipp"), result.getString("nosejour"), result.getString("idph"), result.getString("dateoperation"), result.getString("operation")));
                result.close();
                state.close();
                return ope;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ope;
    }

    public ArrayList<Operations> find(String ipp, String nosejour) {
        ArrayList<Operations> ope = new ArrayList<Operations>();
        String Query = new String();
        Query = "select * from operation where ipp = '{" + ipp
                + "}' and nosejour = '" + nosejour + "'";

        try {

            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);

            while (result.next()) {
                ope.add(new Operations(result.getString("ipp"), result.getString("nosejour"), result.getString("idph"), result.getString("dateoperation"), result.getString("operation")));
                result.close();
                state.close();
                return ope;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ope;
    }

    @Override
    public boolean delete(Operations obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Operations obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
