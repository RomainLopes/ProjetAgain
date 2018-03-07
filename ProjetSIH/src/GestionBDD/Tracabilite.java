/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionBDD;

/**
 *
 * @author romel
 */
public class Tracabilite {

    /**
     * ipp
     */
    private String ipp = "";
    /**
     * nosejour
     */
    private String idph = "";
    /**
     * idph
     */
    private String dateconnection = "";
/**
 * 
 * @param ipp
 * @param idph
 * @param dateconnection 
 */
    public Tracabilite(String ipp, String idph, String dateconnection) {
        this.ipp = ipp;
        this.idph = idph;
        this.dateconnection = dateconnection;
    }

    public Tracabilite(){}
    
    /**
     * @return the ipp
     */
    public String getIpp() {
        return ipp;
    }

    /**
     * @param ipp the ipp to set
     */
    public void setIpp(String ipp) {
        this.ipp = ipp;
    }

    /**
     * @return the idph
     */
    public String getIdph() {
        return idph;
    }

    /**
     * @param idph the idph to set
     */
    public void setIdph(String idph) {
        this.idph = idph;
    }

    /**
     * @return the dateconnection
     */
    public String getDateconnection() {
        return dateconnection;
    }

    /**
     * @param dateconnection the dateconnection to set
     */
    public void setDateconnection(String dateconnection) {
        this.dateconnection = dateconnection;
    }
    /**
     * dateconnection
     */

}
