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
     * correspondance
     */
    private String correspondance = "";
    
    /**
     *
     * @param ipp
     * @param nosejour
     * @param service
     * @param correspondance
     */
    public DossierMedical (String ipp, String nosejour, String service, String correspondance ){
        this.ipp = ipp;
        this.nosejour = nosejour;
        this.service = service;
        this.correspondance = correspondance;
    }
    
    /**
     * Constructeur par défaut
     */
    public DossierMedical () {};
    
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
