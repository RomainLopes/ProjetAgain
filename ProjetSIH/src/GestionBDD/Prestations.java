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
public class Prestations {

    /**
     * ipp
     */
    private String ipp = "";
    /**
     * nosejour
     */
    private String nosejour = "";
    /**
     * datePrestation
     */
    private String datePrestation = "";
    /**
     * service
     */
    private String service = "";
    /**
     * prestation
     */
    private String prestation = "";

    public Prestations(String ipp, String nosejour, String datePrestation, String service, String prestation) {
        this.ipp = ipp;
        this.nosejour = nosejour;
        this.datePrestation = datePrestation;
        this.service = service;
        this.prestation = prestation;

    }

    public Prestations() {
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
     * @return the datePrestation
     */
    public String getDatePrestation() {
        return datePrestation;
    }

    /**
     * @param datePrestation the datePrestation to set
     */
    public void setDatePrestation(String datePrestation) {
        this.datePrestation = datePrestation;
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
     * @return the prestation
     */
    public String getPrestation() {
        return prestation;
    }

    /**
     * @param prestation the prestation to set
     */
    public void setPrestation(String prestation) {
        this.prestation = prestation;
    }

}
