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
public class Resultats {
    
    /**
     * ipp
     */
    private String ipp = "";
    /**
     * nosejour
     */
    private String nosejour = "";
    /**
     * idPrescription
     */
    private String idPrescription = "";
    /**
     * service
     */
    private String service = "";
    /**
     * prestationmt
     */
    private String prestationmt = "";
    /**
     * dateResultat
     */
    private String dateResultat = "";
    /**
     * resultat
     */
    private String resultat = "";

    public Resultats (String ipp,String nosejour,String idPrescription,String service,String prestationmt,String dateResultat,String resultat){
        this.ipp=ipp;
        this.nosejour=nosejour;
        this.idPrescription=idPrescription;
        this.service=service;
        this.prestationmt=prestationmt;
        this.dateResultat=dateResultat;
        this.resultat=resultat;
    }
    
    public Resultats (){}
    
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
     * @return the idPrescription
     */
    public String getIdPrescription() {
        return idPrescription;
    }

    /**
     * @param idPrescription the idPrescription to set
     */
    public void setIdPrescription(String idPrescription) {
        this.idPrescription = idPrescription;
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
     * @return the dateResultat
     */
    public String getDateResultat() {
        return dateResultat;
    }

    /**
     * @param dateResultat the dateResultat to set
     */
    public void setDateResultat(String dateResultat) {
        this.dateResultat = dateResultat;
    }

    /**
     * @return the resultat
     */
    public String getResultat() {
        return resultat;
    }

    /**
     * @param resultat the resultat to set
     */
    public void setResultat(String resultat) {
        this.resultat = resultat;
    }

    /**
     * @return the prestationmt
     */
    public String getPrestationmt() {
        return prestationmt;
    }

    /**
     * @param prestationmt the prestationmt to set
     */
    public void setPrestationmt(String prestationmt) {
        this.prestationmt = prestationmt;
    }
    
}
