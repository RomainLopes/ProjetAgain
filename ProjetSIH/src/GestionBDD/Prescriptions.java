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
public class Prescriptions {
    
    /**
     * ipp
     */
    private String ipp = "";
    /**
     * nosejour
     */
    private String nosejour = "";
    /**
     * idprescription
     */
    private String idprescription = "";
    /**
     * dateprescription
     */
    private String dateprescription = "";
    /**
     * prescription
     */
    private String prescription = "";
    /**
     * service
     */
    private String service = "";

    public Prescriptions (String ipp,String nosejour,String idprescription,String dateprescription,String prescription,String service) {
        this.dateprescription=dateprescription;
        this.idprescription=idprescription;
        this.ipp=ipp;
        this.nosejour=nosejour;
        this.prescription=prescription;
        this.service=service;
    }
    
    public Prescriptions () {}
    
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
     * @return the idprescription
     */
    public String getIdprescription() {
        return idprescription;
    }

    /**
     * @param idprescription the idprescription to set
     */
    public void setIdprescription(String idprescription) {
        this.idprescription = idprescription;
    }

    /**
     * @return the dateprescription
     */
    public String getDateprescription() {
        return dateprescription;
    }

    /**
     * @param dateprescription the dateprescription to set
     */
    public void setDateprescription(String dateprescription) {
        this.dateprescription = dateprescription;
    }

    /**
     * @return the prescription
     */
    public String getPrescription() {
        return prescription;
    }

    /**
     * @param prescription the prescription to set
     */
    public void setPrescription(String prescription) {
        this.prescription = prescription;
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
    
}
