/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsih;

import projetsih.BDDconnection.*;
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

    public boolean connex (String id, String mdp){
        String QueryId = new String();
        QueryId = "SELECT * FROM personnelmedical WHERE personnelmedical.id = '" + id + "'"; // WHERE personnelmedical.id = '" + id + "'
        /*
        System.out.println(QueryId);    
        */
        try {   
 
        Connection conn = BDDconnection.getInstance();
        Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet result = state.executeQuery(QueryId);
        
            if (result.next()){
                /*
                System.out.println("y a au moins un résultat");
                System.out.println("id et mdp du résulat : " + result.getString("id")+result.getString("mdp"));
                */
            
                if( (result.getString("id").equals(id) )&& (result.getString("mdp").equals(mdp))){
                    /*
                    System.out.println(result.getString("id")  + result.getString("mdp") );
                    System.out.println("roulement id mdp");
                    */
                    return true;
                }
            }
            else {
                /*
                System.out.println("il n'y a pas de résultat");
                */
                return false;     
            }
  
        } 
        catch (Exception e) {
            e.printStackTrace();
	}
        return false;
    }
    
    public ArrayList<String> enTete(String id, String mdp){
        ArrayList<String> nomPrenonService = new ArrayList<String>();
        String QueryId = new String();
        QueryId = "SELECT nommed,prenommed,service FROM personnelmedical WHERE personnelmedical.id = '" + id + "'";
        try {   
 
            Connection conn = BDDconnection.getInstance();
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet result = state.executeQuery(QueryId);
        
            nomPrenonService.add(result.getString("nommed")) ;
            nomPrenonService.add(result.getString("prenommed")) ;
            nomPrenonService.add(result.getString("service")) ;
            return nomPrenonService;
        }  
        catch (Exception e) {
            e.printStackTrace();
	}
        return nomPrenonService;
        }
    
    
    public ArrayList<String> douille(){
        try {
			Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/projetSIH";
			String user = "postgres";
			String passwd = "postgres";
			
			Connection conn = DriverManager.getConnection(url, user, passwd);
			Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			
			ResultSet result = state.executeQuery("SELECT * FROM patients ");
                        
                        ArrayList<String> l1 = new ArrayList<String>() ;
                        
                        System.out.println(" \t \n");
                        while (result.next()){
			l1.add( result.getString("nompatient") +"   -   " + result.getString("prenompatient") + "   -   " + result.getString("datedenaissance"));

                        }
                        /*
                        System.out.println(" passé ");
                        System.out.println(listeprenom);
                        
*/                      
                        result.close();
                        state.close();
                        return (l1);
			
		} catch (Exception e) {
			e.printStackTrace();
                        ArrayList<String> l1 = new ArrayList<String>() ;
                        return (l1);
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
    

