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
public class DossierMedicoAdministratif {
    
    /**
     * ipp
     */
    private int[] ipp = {};
    /**
     * nosejour
     */
    private int[] nosejour = {};
    /**
     * dateentree
     */
    private String dateentree = "";
    /**
     * nomphrespo
     */
    private String nomphrespo = "";
    /**
     * type
     */
    private String type = "";
    /**
     * service
     */
    private String service = "";

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
     * @return the dateentree
     */
    public String getDateentree() {
        return dateentree;
    }

    /**
     * @param dateentree the dateentree to set
     */
    public void setDateentree(String dateentree) {
        this.dateentree = dateentree;
    }

    /**
     * @return the nomphrespo
     */
    public String getNomphrespo() {
        return nomphrespo;
    }

    /**
     * @param nomphrespo the nomphrespo to set
     */
    public void setNomphrespo(String nomphrespo) {
        this.nomphrespo = nomphrespo;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
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
