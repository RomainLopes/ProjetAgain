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
public class ResultatsDAO extends DAO<Resultats> {

    public ResultatsDAO(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(Resultats obj) {
        String Query = new String();
        Query = "insert into operations (ipp,nosejour,idPrescription,service,dateResultat,resultat) "
                + "values ('{" + obj.getIpp() + "}','{" + obj.getNosejour() + "}','"
                + obj.getIdPrescription() + "','" + obj.getService()
                + "','" + obj.getDateResultat() + "','" + obj.getResultat() + "')";
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
    public boolean delete(Resultats obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Resultats obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Resultats> find(String ipp, String nosejour) {
        ArrayList<Resultats> res = new ArrayList<Resultats>();
        String Query = new String();
        Query = "select * from resultats where ipp = '{" + ipp
                + "}' and nosejour = '{" + nosejour + "}'";

        try {

            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);

            while (result.next()) {
                res.add(new Resultats(result.getString("ipp"), result.getString("nosejour"), result.getString("idPrescription"), result.getString("service"), result.getString("dateResultat"), result.getString("resultat")));
                result.close();
                state.close();
                return res;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

}
