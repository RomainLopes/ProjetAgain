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
public class PersonnelHospitalier {

    /**
     * nomph
     */
    private String nomph = "";
    /**
     * prenomph
     */
    private String prenomph = "";
    /**
     * id
     */
    private String id = "";
    /**
     * mdp
     */
    private String mdp = "";
    /**
     * service
     */
    private String service = "";
    /**
     * fonction
     */
    private String fonction = "";

    public PersonnelHospitalier(String nomph, String prenomph, String id, String mdp, String service, String fonction) {
        this.nomph = nomph;
        this.prenomph = prenomph;
        this.id = id;
        this.mdp = mdp;
        this.service = service;
        this.fonction = fonction;
    }

    public PersonnelHospitalier() {
    }

    /**
     * @return the nomph
     */
    public String getNomph() {
        return nomph;
    }

    /**
     * @param nomph the nomph to set
     */
    public void setNomph(String nomph) {
        this.nomph = nomph;
    }

    /**
     * @return the prenomph
     */
    public String getPrenomph() {
        return prenomph;
    }

    /**
     * @param prenomph the prenomph to set
     */
    public void setPrenomph(String prenomph) {
        this.prenomph = prenomph;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the mdp
     */
    public String getMdp() {
        return mdp;
    }

    /**
     * @param mdp the mdp to set
     */
    public void setMdp(String mdp) {
        this.mdp = mdp;
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
     * @return the fonction
     */
    public String getFonction() {
        return fonction;
    }

    /**
     * @param fonction the fonction to set
     */
    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

}
