/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsih;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Test01bdd {

public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/projetSIH";
			String user = "postgres";
			String passwd = "postgres";
			
			Connection conn = DriverManager.getConnection(url, user, passwd);
			Statement state = conn.createStatement();
			
			ResultSet result = state.executeQuery("SELECT * FROM patients");
			ResultSetMetaData resultMeta = result.getMetaData();
			
			System.out.println("- Il y a " + resultMeta.getColumnCount() + " colonnes dans cette table");
			for(int i = 1; i <= resultMeta.getColumnCount(); i++)
				System.out.println("\t *" + resultMeta.getColumnName(i));
			

			System.out.println("Voici les noms et prénoms : ");
			System.out.println("\n---------------------------------");
			
			while(result.next()){
				System.out.print("\t" + result.getString("prof_nom") + "\t |");
				System.out.print("\t" + result.getString("prof_prenom") + "\t |");
				System.out.println("\n---------------------------------");
				
			}

                        result.close();
                        state.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
}
