/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interoperabilite;
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
    private ServeurHL7 c;
    private int port = 4445;

    /**
     *
     * @param portEcoute
     */
    public ServeurT(int portEcoute) {
        this.patient = null;
        this.message = null;

        c = new ServeurHL7();
        c.connection(port);
        c.ecoute();
        String messageHL7 = c.protocole();

        System.out.println("Reçu :" + messageHL7);
        this.patient = c.getPatient();
        this.message = c.getMessage();
        
        System.out.println(patient.getFamillyName());
        System.out.println(patient.getFirstName());
        System.out.println(patient.getID());
        System.out.println(patient.getCharSex());
        System.out.println(patient.getBirth());   
    }
    
    
    public ServeurT() {
        this.patient = null;
        this.message = null;

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
    }
}
