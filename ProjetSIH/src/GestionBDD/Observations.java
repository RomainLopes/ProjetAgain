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
    private String idph = "";
    /**
     * nomacte
     */
    private String dateObservation = "";
    /**
     * idph
     */
    private String service = "";
    /**
     * dateObservation
     */
    private String nomacte = "";
    /**
     * resume
     */
    private String resume = "";

    /**
     *
     * @param ipp
     * @param nosejour
     * @param idph
     * @param dateObservation
     * @param service
     * @param nomacte
     * @param resume
     */
    public Observations(String ipp, String nosejour, String idph, String dateObservation, String service, String nomacte, String resume) {
        this.ipp = ipp;
        this.nosejour = nosejour;
        this.idph = idph;
        this.dateObservation = dateObservation;
        this.service = service;
        this.nomacte = nomacte;
        this.resume = resume;

    }

    /**
     * Constructeur par défaut
     */
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
