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
    private int[] ipp = {};
    /**
     * nosejour
     */
    private int[] nosejour = {};
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

    public Prestations (int[] ipp,int[] nosejour,String datePrestation,String service,String prestation){
        this.datePrestation=datePrestation;
        this.ipp=ipp;
        this.nosejour=nosejour;
        this.prestation=prestation;
        this.service=service;
    }
    
    public Prestations (){}
    
    /**
     * @return the ipp
     */
    public int[] getIpp() {
        return ipp;
    }

    /**
     * @param ipp the ipp to set
     */
    public void setIpp(int[] ipp) {
        this.ipp = ipp;
    }

    /**
     * @return the nosejour
     */
    public int[] getNosejour() {
        return nosejour;
    }

    /**
     * @param nosejour the nosejour to set
     */
    public void setNosejour(int[] nosejour) {
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
