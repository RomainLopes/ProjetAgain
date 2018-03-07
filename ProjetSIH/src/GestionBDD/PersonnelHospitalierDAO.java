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
public class PersonnelHospitalierDAO extends DAO<PersonnelHospitalier> {

    public PersonnelHospitalierDAO(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(PersonnelHospitalier obj) {
        String Query = new String();
        Query = "insert into personnelhospitalier (nomph,prenomph,id,mdp,service,fonction) "
                + "values ('{" + obj.getNomph() + "}','{" + obj.getPrenomph() + "}','"
                + obj.getId() + "','" + obj.getMdp() + "','" + obj.getService()
                + "','" + obj.getFonction() + "')";
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

    public PersonnelHospitalier connex(String id, String mdp) {
        PersonnelHospitalier ph = new PersonnelHospitalier();
        String QueryId = new String();
        QueryId = "SELECT * FROM personnelhospitalier WHERE personnelhospitalier.id = '" + id + "' and personnelhospitalier.mdp = '" + mdp + "'"; // WHERE personnelmedical.id = '" + id + "'

        try {

            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(QueryId);

            if (result.next()) {
                ph = new PersonnelHospitalier(result.getString("nomph"), result.getString("prenomph"), result.getString("id"), result.getString("mdp"), result.getString("service"), result.getString("fonction"));
                result.close();
                state.close();
                return ph;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ph;
    }

    /*
    public PersonnelHospitalier findser(String ipp, String nosejour,String service) {
        PersonnelHospitalier ph = new PersonnelHospitalier();
        String Query = new String();
        Query = "select * from personnelhospitalier where ipp = '{" + ipp
                + "}' and nosejour = '{" + nosejour + "}' and service = '"
                + service + "'";

        try {

            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);

            if (result.next()) {
                ph = new PersonnelHospitalier(result.getString("nomph"), result.getString("prenomph"), result.getString("id"), result.getString("mdp"), result.getString("service"), result.getString("fonction"));
                result.close();
                state.close();
                return ph;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ph;
    }*/
    @Override
    public boolean delete(PersonnelHospitalier obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(PersonnelHospitalier obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PersonnelHospitalier find(String id, String service) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
