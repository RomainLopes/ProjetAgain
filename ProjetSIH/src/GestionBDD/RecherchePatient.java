/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionBDD;

import GestionBDD.BDDconnection.*;
import ecrans.InfirmierAccueil;
import ecrans.RechercherPatient;
import ecrans.essaiEncore;
import java.util.*;
import java.sql.*;

/**
 *
 * @author romel
 */
public class RecherchePatient {
// permet la connexion des employés

    /*
    public boolean connex(String id, String mdp) {
        String QueryId = new String();
        QueryId = "SELECT * FROM personnelhospitalier WHERE personnelhospitalier.id = '" + id + "'"; // WHERE personnelmedical.id = '" + id + "'
        /*
        System.out.println(QueryId);    
         */
    /*
        try {

            Connection conn = BDDconnection.getInstance();
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet result = state.executeQuery(QueryId);

            if (result.next()) {
                /*
                System.out.println("y a au moins un résultat");
                System.out.println("id et mdp du résulat : " + result.getString("id")+result.getString("mdp"));
                 */
/*
                if ((result.getString("id").equals(id)) && (result.getString("mdp").equals(mdp))) {
                    /*
                    System.out.println(result.getString("id")  + result.getString("mdp") );
                    System.out.println("roulement id mdp");
                     */
    /*
                    return true;
                }
            } else {
                /*
                System.out.println("il n'y a pas de résultat");
                 */
    /*
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    */

    // liste des infos de l'employé concerné
    /*
    public ArrayList<String> enTete(String id, String mdp) {
        ArrayList<String> nomPrenonService = new ArrayList<String>();
        String QueryId = new String();
        QueryId = "SELECT nomph,prenomph,service,fonction FROM personnelhospitalier WHERE personnelhospitalier.id = '" + id + "'";
        try {

            Connection conn = BDDconnection.getInstance();
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet result = state.executeQuery(QueryId);
            while (result.next()) {
                nomPrenonService.add(result.getString("nomph"));
                nomPrenonService.add(result.getString("prenomph"));
                nomPrenonService.add(result.getString("service"));
                nomPrenonService.add(result.getString("fonction"));
                return nomPrenonService;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nomPrenonService;
    }*/
    
    //liste des infos du patient concerné
    /*
    public ArrayList<String> enTetePatient(String ipp) {
        ArrayList<String> listeInfo = new ArrayList<String>();
        String QueryId = new String();
        QueryId = "SELECT nompatient,prenompatient,datedenaissance FROM patients WHERE patients.ipp = '{" + ipp + "}'";
        try {

            Connection conn = BDDconnection.getInstance();
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet result = state.executeQuery(QueryId);
            while (result.next()) {
                listeInfo.add(result.getString("nompatient"));
                listeInfo.add(result.getString("prenompatient"));
                listeInfo.add(result.getString("datedenaissance"));
                return listeInfo;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listeInfo;
    }*/

    // liste des patients
    
/*
    public ArrayList<String> creerPatient(String nom, String prenom, String ddn, String localisation, String adresse, int IPP) {
        ArrayList<String> resultatRecherche = new ArrayList<String>();
        String Query = new String();
        Query = "INSERT INTO patients (IPP, nompatient, prenompatient,datedenaissance, localisation,adresse,ipp) ";
        Query+=" VALUES ('" + IPP + "','" + nom +"','" + prenom + "','" + ddn + "','" + localisation + "','" + adresse + "','{" + IPP +"}'" ;
        /*
        if (nom.equals("")) {
            //Query = "SELECT * FROM patients WHERE patients.prenompatient = '" + prenom + "'";
            System.out.println("nom null");
        } else if (prenom.equals("")) {
            System.out.println("prenom null");
            //Query = "SELECT * FROM patients WHERE patients.nompatient = '" + nom + "'";
        } else {
            //System.out.println("rien de null");
            //Query = "SELECT * FROM patients WHERE patients.nompatient = '" + nom + "'" + " AND patients.prenompatient = '" + prenom + "'";
        }*/
/*
        try {

            Connection conn = BDDconnection.getInstance();
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet result = state.executeQuery(Query);

            System.out.println("patient ajouté");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultatRecherche;
    }*/
    
    public static void main(String[] args) {

        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/projetSIH";
            String user = "postgres";
            String passwd = "postgres";

            Connection conn = DriverManager.getConnection(url, user, passwd);
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            String prenom = new String("Marc");

            String Query = new String();
            Query = "SELECT * FROM patients WHERE patients.prenompatient = '" + prenom + "'";

            ResultSet result = state.executeQuery(Query);
            while (result.next()) {
                System.out.println(" while ");
                System.out.println("NOM : " + result.getString("IPP") + " - PRENOM : " + result.getString("nomPatient"));
            }
            if (result.first()) {
                System.out.println(" if ");
                System.out.println("NOM : " + result.getString("IPP") + " - PRENOM : " + result.getString("nomPatient"));

            }
            System.out.println(" passé ");
            result.close();
            state.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
