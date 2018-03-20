/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interoperabilite;

import GestionBDD.BDDconnection;
import GestionBDD.DAO;
import GestionBDD.Patients;
import GestionBDD.PatientsDAO;
import java.util.Calendar;
import library.interfaces.Patient;
import library.interfaces.ServeurHL7;
import library.structure.groupe.messages.Message;

/**
 *
 * @author HIR
 */
public class ServeurT {

    private Patient patient;
    private Message message;
    private final ServeurHL7 c;
    private final int port;

    /**
     * serveur écoutant sur le port entré en paramètre et recevant les messages
     * d'admission de patient et les ajoutes à la base de donnée
     * @param port
     */
    public ServeurT(int port) {
        this.patient = null;
        this.message = null;
        this.port = port;
        
        c = new ServeurHL7();
        c.connection(this.port);
        c.ecoute();
        String messageHL7 = c.protocole();

        System.out.println("Reçu :" + messageHL7);
        this.patient = c.getPatient();
        this.message = c.getMessage();

        System.out.println(patient.getFamillyName());
        System.out.println(patient.getFirstName());
        System.out.println(patient.getID());
        String sexe = String.valueOf(patient.getCharSex());
        System.out.println(sexe);
        System.out.println(patient.getBirth());
        System.out.println(message.getType());

        Calendar cal = Calendar.getInstance();
        cal.setTime(patient.getBirth());

        int annee = cal.get(Calendar.YEAR);
        String anneestr = String.valueOf(annee).substring(2, 4);

        int mois = cal.get(Calendar.MONTH);
        String moisstr;
        if (String.valueOf(mois).length() == 1) {
            moisstr = "0" + String.valueOf(mois);
        } else {
            moisstr = String.valueOf(mois);
        }

        int day = cal.get(Calendar.DAY_OF_MONTH);
        String daystr;
        if (String.valueOf(day).length() == 1) {
            daystr = "0" + String.valueOf(day);
        } else {
            daystr = String.valueOf(day);
        }

        String dateNaissance = moisstr + "-" + daystr + "-" + anneestr;

        DAO<Patients> pDAO = new PatientsDAO(BDDconnection.getInstance());
        Patients pat = new Patients(patient.getID().toString(), patient.getFamillyName(), patient.getFirstName(), dateNaissance, "", "", sexe);
        pDAO.create(pat);
    }
}
