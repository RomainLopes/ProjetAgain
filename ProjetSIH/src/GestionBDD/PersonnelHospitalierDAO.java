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
public class PersonnelHospitalierDAO extends DAO<PersonnelHospitalier> {

    public PersonnelHospitalierDAO(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(PersonnelHospitalier obj) {
        String Query = new String();
        Query = "insert into personnelhospitalier (nomph,prenomph,id,mdp,service,fonction) "
                + "values ('" + obj.getNomph() + "','" + obj.getPrenomph() + "','"
                + obj.getId() + "','" + obj.getMdp() + "','" + obj.getService()
                + "','" + obj.getFonction() + "')";
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
    public PersonnelHospitalier connex(String id, String mdp) {
        PersonnelHospitalier ph = new PersonnelHospitalier();
        String QueryId = new String();
        QueryId = "SELECT * FROM personnelhospitalier WHERE personnelhospitalier.id = '" + id + "' and personnelhospitalier.mdp = '" + mdp + "'";

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

        } catch (SQLException e) {
        }
        return ph;
    }

    @Override
    public ArrayList<PersonnelHospitalier> find(String nomph, String prenomph) {
        ArrayList<PersonnelHospitalier> ph = new ArrayList<PersonnelHospitalier>();
        String QueryId = new String();
        QueryId = "SELECT * FROM personnelhospitalier WHERE personnelhospitalier.nomph = '" + nomph + "' and personnelhospitalier.prenomph = '" + prenomph + "'";

        try {

            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(QueryId);

            while (result.next()) {
                ph.add(new PersonnelHospitalier(result.getString("nomph"), result.getString("prenomph"), result.getString("id"), result.getString("mdp"), result.getString("service"), result.getString("fonction")));
                result.close();
                state.close();
                return ph;
            }

        } catch (SQLException e) {
        }
        return ph;

    }

    @Override
    public boolean delete(PersonnelHospitalier obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateIpp(String ippremplace, String ipprecherche) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<PersonnelHospitalier> findIpp(String ipp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<PersonnelHospitalier> findSer(String ipp, String nosejour, String service) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
