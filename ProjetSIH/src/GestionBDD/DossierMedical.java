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
public class DossierMedical {

    /**
     * ipp
     */
    private int[] ipp = {};
    /**
     * nosejour
     */
    private int[] nosejour = {};
    /**
     * service
     */
    private String service = "";
    /**
     * correspondance
     */
    private String correspondance = "";
    
    public DossierMedical (int[] ipp, int[] nosejour, String service, String correspondance ){
        this.ipp = ipp;
        this.nosejour = nosejour;
        this.service = service;
        this.correspondance = correspondance;
    }
    
    public DossierMedical () {};
    
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
     * @return the correspondance
     */
    public String getCorrespondance() {
        return correspondance;
    }

    /**
     * @param correspondance the correspondance to set
     */
    public void setCorrespondance(String correspondance) {
        this.correspondance = correspondance;
    }
    
    
    
    
}
