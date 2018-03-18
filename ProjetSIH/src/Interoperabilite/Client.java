/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interoperabilite;

import library.interfaces.ClientHL7;
import library.interfaces.Patient;


/**
 *
 * @author SIHop coding team
 */
public class Client {
    private final ClientHL7 client = new ClientHL7();
 
    private final Patient p;

    /**
     *
     * @param p
     * @param adresse
     * @param portEnvoie
     */
    public Client(Patient p, String adresse, int portEnvoie) {
 
        this.p = p;
        client.connexion(adresse, portEnvoie);
        client.admit(p);
        
    }

    /**
     *
     * @return
     */
    public ClientHL7 getClient() {
        return client;
    }

    /**
     *
     * @return
     */
    public Patient getP() {
        return p;
    }
    
    
    
}
