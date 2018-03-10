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
public class Observations {

    /**
     * ipp
     */
    private String ipp = "";
    /**
     * nosejour
     */
    private String nosejour = "";
    /**
     * service
     */
    private String service = "";
    /**
     * dateObservation
     */
    private String dateObservation = "";
    /**
     * idph
     */
    private String idph = "";
    /**
     * nomacte
     */
    private String nomacte = "";
    /**
     * resume
     */
    private String resume = "";

    public Observations(String ipp, String nosejour, String service, String dateObservation, String idph, String nomacte, String resume) {
        this.ipp = ipp;
        this.service = service;
        this.nosejour = nosejour;
        this.dateObservation = dateObservation;
        this.idph = idph;
        this.nomacte = nomacte;
        this.resume = resume;

    }

    public Observations() {
    }

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
     * @return the nosejour
     */
    public String getNosejour() {
        return nosejour;
    }

    /**
     * @param nosejour the nosejour to set
     */
    public void setNosejour(String nosejour) {
        this.nosejour = nosejour;
    }

    /**
     * @return the service
     */
    public String getService() {
        return service;
    }

    /**
     * @param service the service to set
     */
    public void setService(String service) {
        this.service = service;
    }

    /**
     * @return the dateObservation
     */
    public String getDateObservation() {
        return dateObservation;
    }

    /**
     * @param dateObservation the dateObservation to set
     */
    public void setDateObservation(String dateObservation) {
        this.dateObservation = dateObservation;
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
     * @return the nomacte
     */
    public String getNomacte() {
        return nomacte;
    }

    /**
     * @param nomacte the nomacte to set
     */
    public void setNomacte(String nomacte) {
        this.nomacte = nomacte;
    }

    /**
     * @return the resume
     */
    public String getResume() {
        return resume;
    }

    /**
     * @param resume the resume to set
     */
    public void setResume(String resume) {
        this.resume = resume;
    }

}