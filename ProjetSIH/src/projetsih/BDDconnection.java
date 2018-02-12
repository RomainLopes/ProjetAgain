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
	private String url = "jdbc:postgresql://localhost:5432/Ecole";
	/**
	 * Nom du user
	 */
	private String user = "postgres";
	/**
	 * Mot de passe du user
	 */
	private String passwd = "postgres";
	/**
	 * Objet Connection
	 */
	private static Connection connect;
	
	/**
	 * Constructeur privé
	 */
	private BDDconnection(){
		try {
			connect = DriverManager.getConnection(url, user, passwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Méthode qui va nous retourner notre instance
	 * et la créer si elle n'existe pas...
	 * @return
	 */
	public static Connection getInstance(){
		if(connect == null){
			new BDDconnection();
		}
		return connect;	
	}	
}
