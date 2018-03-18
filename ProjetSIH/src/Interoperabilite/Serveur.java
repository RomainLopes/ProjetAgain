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

/**
 *
 * @author HIR
 */
public class Serveur {

    private final Patient ps;
    private final ServeurHL7 serveur = new ServeurHL7();
    private final String messageHL7;
    private final String messageHL7lisible;

    /**
     *
     * @param portEcoute
     */
    public Serveur(int portEcoute) {
        this.serveur.connection(portEcoute);
        
        boolean recp= true;
        String str = "";
        while (recp) {
            
            this.serveur.ecoute();
            str = this.serveur.protocole();
            if (!str.isEmpty()) {
                recp=!recp;
            }
        }
        this.messageHL7 = str;
        
        String messageHL7final = "";
        for (int i = 0; i < messageHL7.length(); i++) {
            char ch = messageHL7.charAt(i);
            if (Character.isWhitespace(ch)) {
                messageHL7final += "\n";
            } else {
                messageHL7final += ch;
            }
        }
        this.messageHL7lisible = messageHL7final;
        
        this.ps = this.serveur.getPatient();
        Date ddn = this.ps.getBirth();
        
        System.out.println("Test : "+ ddn);
        
        Calendar c = Calendar.getInstance();
        c.setTime(ddn);
        
        int annee = c.get(Calendar.YEAR) - 1900;
        int mois = c.get(Calendar.MONTH) - 1;
        int jour = c.get(Calendar.DAY_OF_MONTH);
        c.set(annee, mois, jour);
        this.ps.setBirth(c.getTime());
        System.out.println("date de naissance : " + this.ps.getBirth());
    }

    /**
     *
     * @return
     */
    public Patient getPs() {
        return ps;
    }

    /**
     *
     * @return
     */
    public ServeurHL7 getServeur() {
        return serveur;
    }

    /**
     *
     * @return
     */
    public String getMessageHL7() {
        return messageHL7;
    }

    /**
     *
     * @return
     */
    public String getMessageHL7lisible() {
        return messageHL7lisible;
    }

    /**
     *
     */
    public void fermeture() {
        this.serveur.fermer();
    }
}
