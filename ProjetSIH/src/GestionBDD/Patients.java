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
public class Patients {
    
    /**
     * ipp
     */
    private int[] ipp = {};
    /**
     * nompatient
     */
    private String nompatient ="";
    /**
     * prenompatient
     */
    private String prenompatient ="";
    /**
     * dateDeNaissance
     */
    private String dateDeNaissance ="";
    /**
     * localisation
     */
    private String localisation ="";
    /**
     * adresse
     */
    private String adresse ="";

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
     * @return the nompatient
     */
    public String getNompatient() {
        return nompatient;
    }

    /**
     * @param nompatient the nompatient to set
     */
    public void setNompatient(String nompatient) {
        this.nompatient = nompatient;
    }

    /**
     * @return the prenompatient
     */
    public String getPrenompatient() {
        return prenompatient;
    }

    /**
     * @param prenompatient the prenompatient to set
     */
    public void setPrenompatient(String prenompatient) {
        this.prenompatient = prenompatient;
    }

    /**
     * @return the dateDeNaissance
     */
    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    /**
     * @param dateDeNaissance the dateDeNaissance to set
     */
    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    /**
     * @return the localisation
     */
    public String getLocalisation() {
        return localisation;
    }

    /**
     * @param localisation the localisation to set
     */
    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
}
