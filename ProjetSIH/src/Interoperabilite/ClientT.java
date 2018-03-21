/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interoperabilite;

import GestionBDD.Patients;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    private Patient patient;

    private final SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
    private String host;
    private int port;
    private int nbr = 0;

    /**
     * Client envoyant un message d'amission du patient entré en paramètre au 
     * port et à l'hote passé en paramètre
     * @param patientbdd
     * @param port
     * @param host
     */
    public ClientT(Patients patientbdd, int port, String host) {
        this.port = port;
        this.host = host;
        
        int ipp = Integer.parseInt(patientbdd.getIpp().substring(1, patientbdd.getIpp().length() - 1));

        Patient pat;
        pat = new Patient(ipp, patientbdd.getNompatient(), 'I');
        pat.setSex(patientbdd.getSexe().charAt(0));
        pat.setFirstName(patientbdd.getPrenompatient());

        Date dateBirth;
        dateBirth = null;
        String s = patientbdd.getDateDeNaissance();
        try {
            if (!s.equals("")) {
                dateBirth = formateur.parse(s);
                pat.setBirth(dateBirth);
            }
        } catch (ParseException ex) {
            //Logger.getLogger(FrameClient.class.getName()).log(Level.SEVERE, null, ex);
        }

        ClientHL7 c = new ClientHL7();
        c.connexion(this.host, this.port); //host = ip machine ; port=port écoute

        c.admit(pat);

        MessageInterface messageAck = c.getMsg();
        System.out.println("ID message : " + messageAck.getId() + " \n \n \n");
        System.out.println(messageAck.getAcknowledgmentCodeString() + " \n \n \n");
        System.out.println("ID Ack: " + messageAck.getIdAck() + " \n \n \n");

    }

    /**
     * crée un patient à l'aide des paramètres renseignés ATTENTION ajouter le
     * sexe pour le test de réception avec le serveur de test de l'API
     *
     * @param nomPat
     * @param ipp
     * @param classePat
     */
    private void creePatient(String nomPat, int ipp, char classePat) {
        this.patient = new Patient(ipp, nomPat, classePat);

    }

    /**
     * Renseigne les valeurs en paramètre pour le patient
     *
     * @param prenomPat
     * @param dateNaissance
     * @param sexe
     * @param dateAdmission
     */
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
                dateAdmit = formateur.parse(d);
                this.patient.setBirth(dateAdmit);
            }
        } catch (ParseException ex) {
            System.out.println("FORMAT DE DATE PAS CORRECT");
        }

    }

}
