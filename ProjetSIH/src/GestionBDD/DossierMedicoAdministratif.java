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
    private String ipp = "";
    /**
     * nosejour
     */
    private String nosejour = "";
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

    public DossierMedicoAdministratif (String ipp,String nosejour,String dateentree,String nomphrespo,String type,String service ){
        this.ipp=ipp;
        this.nosejour=nosejour;
        this.dateentree=dateentree;
        this.nomphrespo=nomphrespo;
        this.service=service;
        this.type=type;
    }
    
     public DossierMedicoAdministratif (){}
    
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
