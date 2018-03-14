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
    private String ipp = "";
    /**
     * nom du patient
     */
    private String nompatient ="";
    /**
     * prenomdu patient
     */
    private String prenompatient ="";
    /**
     * date De Naissance
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
     * Sexe
     */
    private String sexe ="";
    /**
     * 
     * @param ipp
     * @param nompatient
     * @param prenompatient
     * @param dateDeNaissance
     * @param localisation
     * @param adresse 
     * @param sexe
     */
    public Patients (String ipp, String nompatient, String prenompatient,String dateDeNaissance,String localisation,String adresse,String sexe ){
        this.ipp=ipp;
        this.nompatient=nompatient;
        this.prenompatient=prenompatient;
        this.dateDeNaissance=dateDeNaissance;
        this.localisation=localisation;
        this.adresse=adresse;
        this.sexe=sexe;
    }
    
    public Patients ( String nompatient, String prenompatient,String dateDeNaissance,String localisation,String adresse,String sexe ){
        this.nompatient=nompatient;
        this.prenompatient=prenompatient;
        this.dateDeNaissance=dateDeNaissance;
        this.localisation=localisation;
        this.adresse=adresse;
        this.sexe=sexe;
    }
    
    
    public Patients () {}
    
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

    /**
     * @return the sexe
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * @param sexe the sexe to set
     */
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
    
}
