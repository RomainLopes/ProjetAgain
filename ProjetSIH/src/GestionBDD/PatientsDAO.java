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
public class PatientsDAO extends DAO<Patients> {

    public PatientsDAO(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(Patients obj) {
        String Query;
        Query = "insert into patients (ipp,nompatient,prenompatient,datedenaissance,localisation,adresse,sexe) "
                + "values ('{" + obj.getIpp() + "}','" + obj.getNompatient() + "','" + obj.getPrenompatient()
                + "','" + obj.getDateDeNaissance() + "','" + obj.getLocalisation() + "','" + obj.getAdresse()
                + "','" + obj.getSexe() + "')";
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
    public boolean update(Patients obj) {
        String Query;
        Query = "UPDATE patients SET nompatient='" + obj.getNompatient() + "', prenompatient = '" + obj.getPrenompatient() + "', datedenaissance = '" + obj.getDateDeNaissance() + "', localisation ='" + obj.getLocalisation() + "', adresse ='" + obj.getAdresse() + "', sexe ='" + obj.getSexe() + "'  WHERE ipp = '{" + obj.getIpp() + "}'";

        try {
            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);
            return true;

        } catch (SQLException e) {
            return false;
        }

    }

    @Override
    public ArrayList<Patients> findPatientNomPrenom(String nom, String prenom) {
        ArrayList<Patients> pat = new ArrayList<Patients>();
        String Query;

        if (nom.equals("")) {
            Query = "SELECT * FROM patients WHERE patients.prenompatient = '" + prenom + "'";
        } else if (prenom.equals("")) {
            Query = "SELECT * FROM patients WHERE patients.nompatient = '" + nom + "'";
        } else {
            Query = "SELECT * FROM patients WHERE patients.nompatient = '" + nom + "'" + " AND patients.prenompatient = '" + prenom + "'";
        }

        try {

            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);

            while (result.next()) {
                pat.add(new Patients(result.getString("ipp"), result.getString("nompatient"), result.getString("prenompatient"), result.getString("datedenaissance"), result.getString("localisation"), result.getString("adresse"), result.getString("sexe")));
                result.close();
                state.close();
                return pat;
            }

        } catch (SQLException e) {
        }
        return pat;
    }

    @Override
    public ArrayList<Patients> findPatientNomPrenomService(String nom, String prenom, String service) {
        ArrayList<Patients> pat = new ArrayList<Patients>();
        String Query = new String();

        if (nom.equals("")) {
            Query = "SELECT patients.* FROM patients INNER JOIN dossiermedical "
                    + "ON patients.ipp = dossiermedical.ipp "
                    + "WHERE patients.prenompatient = '" + prenom + "' "
                    + "AND (dossiermedical.service = '" + service + "' or dossiermedical.correspondance = '" + service + "' )";
        } else if (prenom.equals("")) {
            Query = "SELECT patients.* FROM patients INNER JOIN dossiermedical "
                    + "ON patients.ipp = dossiermedical.ipp "
                    + "WHERE patients.nompatient = '" + nom + "' "
                    + "AND (dossiermedical.service = '" + service + "' or dossiermedical.correspondance = '" + service + "' )";
        } else {
            Query = "SELECT patients.* FROM patients INNER JOIN dossiermedical "
                    + "ON patients.ipp = dossiermedical.ipp "
                    + "WHERE patients.nompatient = '" + nom + "' "
                    + "AND patients.prenompatient = '" + prenom + "' "
                    + "AND (dossiermedical.service = '" + service + "' or dossiermedical.correspondance = '" + service + "' )";
        }

        try {

            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);

            while (result.next()) {
                pat.add(new Patients(result.getString("ipp"), result.getString("nompatient"), result.getString("prenompatient"), result.getString("datedenaissance"), result.getString("localisation"), result.getString("adresse"), result.getString("sexe")));
                result.close();
                state.close();
                return pat;
            }

        } catch (SQLException e) {
        }
        return pat;
    }

    @Override
    public ArrayList<Patients> findIpp(String ipp) {
        ArrayList<Patients> pat = new ArrayList<Patients>();
        String Query;
        Query = "SELECT * FROM patients WHERE patients.ipp = '{" + ipp + "}' ";

        try {

            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);

            while (result.next()) {
                pat.add(new Patients(result.getString("ipp"), result.getString("nompatient"), result.getString("prenompatient"), result.getString("datedenaissance"), result.getString("localisation"), result.getString("adresse"), result.getString("sexe")));
                result.close();
                state.close();
                return pat;

            }
        } catch (SQLException e) {
        }
        return pat;
    }

    @Override
    public ArrayList<Patients> find(String ipp, String service) {
        ArrayList<Patients> pat = new ArrayList<Patients>();
        String Query = new String();
        Query = "SELECT patients.* FROM patients INNER JOIN dossiermedical "
                + "ON patients.ipp = dossiermedical.ipp  WHERE patients.ipp = '{" + ipp + "}' "
                + "AND (dossiermedical.service = '" + service + "' or dossiermedical.correspondance = '" + service + "' )";

        try {

            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);

            while (result.next()) {
                pat.add(new Patients(result.getString("ipp"), result.getString("nompatient"), result.getString("prenompatient"), result.getString("datedenaissance"), result.getString("localisation"), result.getString("adresse"), result.getString("sexe")));
                result.close();
                state.close();
                return pat;

            }
        } catch (SQLException e) {
        }
        return pat;
    }

    @Override
    public boolean delete(Patients obj) {
        return false;
    }

    @Override
    public boolean updateIpp(String ippremplace, String ipprecherche) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Patients> findSer(String ipp, String nosejour, String service) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
