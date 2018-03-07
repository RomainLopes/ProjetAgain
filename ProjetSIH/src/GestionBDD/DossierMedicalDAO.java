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
public class DossierMedicalDAO extends DAO<DossierMedical> {

    public DossierMedicalDAO(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(DossierMedical obj) {
        String Query = new String();
        Query = "insert into operations (ipp,nosejour,service,correspondance) "
                + "values ('{" + obj.getIpp() + "}','{" + obj.getNosejour() + "}','"
                + obj.getService() + "','" + obj.getCorrespondance()
                + "')";
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

  
    public DossierMedical findser(String ipp, String nosejour,String service) {
        DossierMedical dm = new DossierMedical();
        String Query = new String();
        Query = "select * from dossiermedical where ipp = '{" + ipp
                + "}' and nosejour = '{" + nosejour + "}' and service = '"
                + service + "'";

        try {

            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);

            if (result.next()) {
                dm = new DossierMedical(result.getString("ipp"), result.getString("nosejour"), result.getString("service"), result.getString("correspondance"));
                result.close();
                state.close();
                return dm;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dm;
    }

    @Override
    public boolean delete(DossierMedical obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(DossierMedical obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DossierMedical find(String id, String service) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
