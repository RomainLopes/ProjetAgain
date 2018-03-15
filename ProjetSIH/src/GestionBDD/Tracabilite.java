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
     * nompatient
     */
    private String nompatient = "";
    /**
     * prenompatient
     */
    private String prenompatient = "";
    /**
     * nomph
     */
    private String nomph = "";
    /**
     * prenomph
     */
    private String prenomph = "";
    /**
     * fonction
     */
    private String fonction = "";

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
    
    public Tracabilite(String nompatient, String prenompatient, String nomph,String prenomph, String fonction, String dateconnection) {
        this.nompatient = nompatient;
        this.prenompatient = prenompatient;
        this.nomph = nomph;
        this.prenomph = prenomph;
        this.fonction = fonction;
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
     * @return the nompatient
     */
    public String getNompatient() {
        return nompatient;
    }

    /**
     * @param nompatient the nompatient to set
     */
    public void setNompatient(String nompatient) {
        this.nompatient = nompatient;
    }

    /**
     * @return the prenompatient
     */
    public String getPrenompatient() {
        return prenompatient;
    }

    /**
     * @param prenompatient the prenompatient to set
     */
    public void setPrenompatient(String prenompatient) {
        this.prenompatient = prenompatient;
    }

    /**
     * @return the nomph
     */
    public String getNomph() {
        return nomph;
    }

    /**
     * @param nomph the nomph to set
     */
    public void setNomph(String nomph) {
        this.nomph = nomph;
    }

    /**
     * @return the prenomph
     */
    public String getPrenomph() {
        return prenomph;
    }

    /**
     * @param prenomph the prenomph to set
     */
    public void setPrenomph(String prenomph) {
        this.prenomph = prenomph;
    }

    /**
     * @return the fonction
     */
    public String getFonction() {
        return fonction;
    }

    /**
     * @param fonction the fonction to set
     */
    public void setFonction(String fonction) {
        this.fonction = fonction;
    }
    /**
     * dateconnection
     */

}
