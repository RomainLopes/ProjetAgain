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
 * @author HIR
 */
public class Client {
    private final ClientHL7 client = new ClientHL7();

    private final Patient p;

    public Client( String adresse, int portEnvoie) {
        client.connexion(adresse, portEnvoie);
        client.admit(p);
    }

    public ClientHL7 getClient() {
        return client;
    }


    public Patient getP() {
        return p;
    }
    
    
    
}
