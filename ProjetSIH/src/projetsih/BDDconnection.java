/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsih;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDDconnection{

	/**
	 * URL de connection
	 */
        private static String url = "jdbc:postgresql://192.168.43.123/projetSIH";
	/**
	 * Nom du user
	 */
	private static String user = "postgres";
	/**
	 * Mot de passe du user
	 */
	private static String passwd = "postgres";
	/**
	 * Objet Connection
	 */
	private static Connection connect;
        
        
        private BDDconnection(){
            // Nothing to do here
        }
	
	/**
	 * Méthode qui va nous retourner notre instance
	 * et la créer si elle n'existe pas...
	 * @return
	 */
	public static Connection getInstance(){
		if(connect == null){
			try {
				connect = DriverManager.getConnection(url, user, passwd);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		return connect;	
	}	
}
