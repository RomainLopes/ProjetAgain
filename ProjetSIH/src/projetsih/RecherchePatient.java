/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsih;

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

    public void connex (String id, String mdp){
        String QueryId = new String();
        QueryId = "SELECT * FROM PersonnelMedical WHERE PersonnelMedical.id = 'nommed'"; //WHERE PersonnelMedical.id = 'in0003'

        
        System.out.println(QueryId);
        
        
        Boolean test = new Boolean("false");
        
        try {
            
            
            System.out.println("av connexion");
           
            
        Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/projetSIH";
			String user = "postgres";
			String passwd = "postgres";
        Connection conn = DriverManager.getConnection(url, user, passwd);
        Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet result = state.executeQuery(QueryId);
        
        
        System.out.println("apres connexion");
        
        
         while ( result.next()){
             System.out.println("result.next  ok");
            while ( (result.getString("id") != id) && (result.getString("mdp") != mdp)){
                System.out.println(result.getString("id")  + result.getString("mdp") );
             System.out.println("roulement id mdp");
             if (result.next()){
             }
             else {
                    essaiEncore ecran = new essaiEncore();
                 ecran.setVisible(true);
                 //this.dispose();
             }
          }
        }
            System.out.println("pas à ce nom");
        if (result.next() && result.getString("fonction") == "Gériatrie" ){
            RechercherPatient ecran = new RechercherPatient();
            ecran.setVisible(true);
                //this.dispose();
        }
        
        } catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    
    public String  recherchePatientPrenom (String prenom){
        String informations = new String("pas de patient à ce prénom");
        String Query = new String();
        Query = "SELECT * FROM patients WHERE patients.prenompatient = '" + prenom + "'";
        
        try {
        Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/projetSIH";
			String user = "postgres";
			String passwd = "postgres";
        Connection conn = DriverManager.getConnection(url, user, passwd);
        Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet result = state.executeQuery(Query);
        
        while(result.next()){
                            informations = "NOM : " + result.getString("nompatient") + " - PRENOM : " + result.getString("penomPatient") + " - LOCALISATION : " + result.getString("localisation") + " - ADRESSE : " + result.getString("adresse") ;
                        }

        return informations;
        
        
        } catch (Exception e) {
			e.printStackTrace();
		}
        return informations;
    }
    
     public String  recherchePatientNom (String nom){
        String informations = new String("pas de patient à ce nom");
        String Query = new String();
        Query = "SELECT * FROM patients WHERE patients.nompatient = '" + nom + "'";
        
        try {
        Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/projetSIH";
			String user = "postgres";
			String passwd = "postgres";
        Connection conn = DriverManager.getConnection(url, user, passwd);
        Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet result = state.executeQuery(Query);
        
        while (result.next()){
                            informations = "NOM : " + result.getString("nompatient") + " - PRENOM : " + result.getString("penomPatient") + " - LOCALISATION : " + result.getString("localisation") + " - ADRESSE : " + result.getString("adresse") ;
                        }
        return informations;
        
        } catch (Exception e) {
			e.printStackTrace();
		}
        return informations;
    }
    
    
    
    
    
    

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
                        while (result.next()){
                            System.out.println(" while ");
                            System.out.println("NOM : " + result.getString("IPP") + " - PRENOM : " + result.getString("nomPatient"));
                        }
                        if (result.first()){
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
    

