/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsih;

import java.util.*;
import java.sql.*;

/**
 *
 * @author romel
 */
public class RecherchePatient {

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
        
        while (result.next()){
                            informations = "NOM : " + result.getString("nompatient") + " - PRENOM : " + result.getString("penomPatient");
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
                            informations = "NOM : " + result.getString("nompatient") + " - PRENOM : " + result.getString("penomPatient");
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
    

