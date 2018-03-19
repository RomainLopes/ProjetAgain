/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interoperabilite;

import java.util.Calendar;
import java.util.Date;
import library.interfaces.Patient;
import library.interfaces.ServeurHL7;
import library.structure.groupe.messages.Message;

/**
 *
 * @author HIR
 */
public class Serveur {

    private Patient patient;
    private Message message;
    private ServeurHL7 c;
    private int port = 4445;

    /**
     *
     * @param portEcoute
     */
    public Serveur(int portEcoute) {
        this.patient = null;
        this.message = null;

        c = new ServeurHL7();
        c.connection(port);
        c.ecoute();
        String messageHL7 = c.protocole();

        System.out.println("Reçu :" + messageHL7);
        this.patient = c.getPatient();
        this.message = c.getMessage();
        
        
    }
}
