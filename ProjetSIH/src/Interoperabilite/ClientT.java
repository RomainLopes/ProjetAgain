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
public class ClientT {

    private ServeurHL7 serveur;
    private Patient patient;
    private Action action;
    private char sex = 'X';
    private String card = "cardAdmettre";

    private final SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");

    private String host = "192.168.43.123";
    private int port = 4446;
    private int nbr = 0;

    public ClientT() {
        Patient pat;
        pat = new Patient(180000001, "Bouleeetttteeeee", 'E');
       // pat.setSex('F');
        pat.setFirstName("DePapier");
        //pat.setDeath(false);
        
        /*
        Date dateBirth = null;
        String s = "01/01/1990";
        try {
            if (!s.equals("  /  /    ")) {
                dateBirth = formateur.parse(s);
                pat.setBirth(dateBirth);
            }
        } catch (ParseException ex) {
            //Logger.getLogger(FrameClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
        
        
        
        ClientHL7 c = new ClientHL7();
        c.connexion(this.host, this.port); //host = ip machine ; port=port écoute

        c.admit(pat);

        MessageInterface messageAck = c.getMsg();
        System.out.println("ID message : " + messageAck.getId() + " \n \n \n");
        System.out.println(messageAck.getAcknowledgmentCodeString() + " \n \n \n");
        System.out.println("ID Ack: " + messageAck.getIdAck() + " \n \n \n");

    }

    private void creePatient(String nomPat, int ipp, char classePat) { //changer textfield en paramètres
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
        if (sexe == 'A' | sexe == 'M' | sexe == 'F' | sexe == 'O' | sexe == 'U') {
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
