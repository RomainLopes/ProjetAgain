/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsih;
import java.sql.*;
import static java.util.Objects.isNull;
/**
 *
 * @author romel
 */
public class ProjetSIH {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/projetSIH";
			String user = "postgres";
			String passwd = "postgres";
			
			Connection conn = DriverManager.getConnection(url, user, passwd);
			System.out.println("Connection effective !");			
			
                        
                        
                        //Création d'un objet Statement
			Statement state = conn.createStatement();
			//L'objet ResultSet contient le résultat de la requête SQL
			ResultSet result = state.executeQuery("SELECT * FROM patients");
			//On récupère les MetaData
			ResultSetMetaData resultMeta = result.getMetaData();
			
			System.out.println("\n**********************************");
			//On affiche le nom des colonnes
			for(int i = 1; i <=  resultMeta.getColumnCount(); i++)
				System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");
			
			System.out.println("\n**********************************");
			
			while(result.next()){			
				for(int i = 1; i <=  resultMeta.getColumnCount(); i++)
                                    	if (isNull(result.getObject(i)) == true ){ 
                                            System.out.println("\t NULL \t |"); 
                                        } 
                                        else{ 
                                            System.out.print("\t" + result.getObject(i).toString() + "\t |"); 
                                        }
				System.out.println("\n---------------------------------");

			}


                        result.close();
                        state.close();

			
                        
                        
                        
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}