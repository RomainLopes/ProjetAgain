/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.postgresql.Driver;

public class BDDconnection {

    /**
     * URL de connection
     */
    private static String url = "jdbc:postgres://htdxinqp:l_YgqQRD-oDOxOC9h4732glCwj_tfSzs@horton.elephantsql.com:5432/htdxinqp";
    /**
     * Nom du user
     */
    private static String user = "htdxinqp";
    /**
     * Mot de passe du user
     */
    private static String passwd = "l_YgqQRD-oDOxOC9h4732glCwj_tfSzs";
    /**
     * Objet Connection
     */
    private static Connection connect;

    private BDDconnection() {
        // Nothing to do here
    }

    /**
     * Méthode qui va nous retourner notre instance et la créer si elle n'existe
     * pas...
     *
     * @return
     */
    public static Connection getInstance() {
        if (connect == null) {
            try {
                Class.forName("org.postgresql.Driver");
            } catch (java.lang.ClassNotFoundException e) {
                System.out.println(e.getMessage());
            }
            try {
                System.out.println(" avant essai connexion");
                connect = DriverManager.getConnection(url, user, passwd);
                System.out.println(" après essai connexion");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connect;
    }
}
