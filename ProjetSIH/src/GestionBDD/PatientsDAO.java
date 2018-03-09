/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionBDD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import GestionBDD.Patients.*;
import GestionBDD.Patients;
import GestionBDD.DAO;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author romel
 */
public class PatientsDAO extends DAO<Patients> {

    public PatientsDAO(Connection conn) {
        super(conn);
    }

    public boolean create(Patients obj) {
        Patients pat = new Patients();
        String Query = new String();
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
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
    }

    public boolean delete(Patients obj) {
        return false;
    }

    public Patients find(int ipp){
        Patients pat = new Patients();
        return pat;
    }
    
    public ArrayList<Patients> find(String ipp, String service) {
        ArrayList<Patients> pat = new ArrayList<Patients>();
        String Query = new String();
        Query = "SELECT patients.* FROM patients INNER JOIN dossiermedical "
                + "ON patients.ipp = dossiermedical.ipp  WHERE patients.ipp = '{" + ipp + "}' "
                + "and (dossiermedical.service = '" + service + "' or dossiermedical.correspondance = '" + service + "' )";

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
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pat;
    }


    public boolean update(Patients obj) {
        Patients pat = new Patients();
        String Query = new String();
        Query = "UPDATE patients SET nompatient='" + obj.getNompatient() + "', prenompatient = '" + obj.getPrenompatient() + "', datedenaissance = '" + obj.getDateDeNaissance() + "', localisation ='" + obj.getLocalisation() + "', adresse ='" + obj.getAdresse() + "', sexe ='" + obj.getSexe() + "'  WHERE ipp = '{" + obj.getIpp() + "}'";

        try {
            Connection conn = this.connect;
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = state.executeQuery(Query);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

}
