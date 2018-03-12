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
public class DossierMedicoAdministratifDAO extends DAO<DossierMedicoAdministratif> {

    public DossierMedicoAdministratifDAO(Connection conn) {
        super(conn);
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
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public ArrayList<DossierMedicoAdministratif> findser(String ipp, String nosejour, String service) {
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
                dma.add(new DossierMedicoAdministratif(result.getString("ipp"), result.getString("nosejour"), result.getString("dateentree"), result.getString("idph"),result.getString("type"),result.getString("service")));
                result.close();
                state.close();
                return dma;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dma;
    }{
    
}

    @Override
    public boolean delete(DossierMedicoAdministratif obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(DossierMedicoAdministratif obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<DossierMedicoAdministratif> find(String id, String service) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
