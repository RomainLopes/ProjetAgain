/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interoperabilite;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import library.interfaces.ClientHL7;
import library.interfaces.MessageInterface;
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

    private String host = "192.168.43.123";
    
    public Client( int port, int nbr) {
        this.serveur = new ServeurHL7();
        serveur.connection(port);
        
        
        String messageHL7 = serveur.protocole();
        System.out.println(messageHL7);
        

        ClientHL7 c = new ClientHL7();
        c.connexion(host, port); //host = ip machine port=port écoute
        switch (this.nbr) {
            case 0: {
                c.admit(patient);
                break;
            }
            case 1: {
                c.transPat(patient);
                break;
            }
            case 2: {
                c.endPat(patient);
                break;
            }
        }
        MessageInterface messageAck = c.getMsg();
        System.out.println("ID message : " + messageAck.getId() + " \n \n \n");
        System.out.println(messageAck.getAcknowledgmentCodeString()  + " \n \n \n" );
        System.out.println("ID Ack: " + messageAck.getIdAck()  + " \n \n \n" );
        
    }
    
    private void creePatient(String nomPat, int ipp,char classePat) { //changer textfield en paramètres
                this.patient = new Patient(ipp, nomPat, classePat);
            
       
    }
    
    private void setValPatient(String prenomPat, String dateNaissance, char sexe, String dateAdmission) { 
        //Prénom patient
        this.patient.setFirstName(prenomPat);


        //Date de naissance
        Date dateBirth = null;
        String s = dateNaissance;
        try {
            if (!s.equals("  /  /    ")) {
                dateBirth = formateur.parse(s);
                this.patient.setBirth(dateBirth);
            }
        } catch (ParseException ex) {
            System.out.println("FORMAT DE DATE PAS CORRECT");
        }

        //sexe
        if (sexe == 'A' |sexe == 'M'|sexe == 'F'|sexe == 'O'|sexe == 'U') {
            this.patient.setSex(sexe);
        }

     //Date Admission
        Date dateAdmit = null;
        String d = dateAdmission;
        try {
            if (!d.equals("  /  /    ")) {
                dateBirth = formateur.parse(d);
                this.patient.setBirth(dateAdmit);
            }
        } catch (ParseException ex) {
            System.out.println("FORMAT DE DATE PAS CORRECT");
        }

    }

   
    
    
    
}
