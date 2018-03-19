/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interoperabilite;

import java.text.SimpleDateFormat;
import javax.swing.Action;
import library.interfaces.ClientHL7;
import library.interfaces.Patient;
import library.interfaces.ServeurHL7;


/**
 *
 * @author SIHop coding team
 */
public class Client {
    private ServeurHL7 serveur;
    private Patient patient;
    private Action action;
    private char sex = 'X';
    private String card = "cardAdmettre";
    private int nbr;
    private final SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");

    
    public Client( int port) {
        this.serveur = new ServeurHL7();
        serveur.connection(port);
        
        serveur.ecoute();
        
        String messageHL7 = serveur.protocole();
        System.out.println(messageHL7);
        
    }

   
    
    
    
}
