/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionBDD;

import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author romel
 * @param <T>
 */
public abstract class DAO<T> {

    /**
     *
     */
    protected Connection connect = null;

    /**
     *
     * @param conn
     */
    public DAO(Connection conn) {
        this.connect = conn;
    }

    /**
     * Méthode de création de l'objet
     *
     * @param obj
     * renvoi un booléen pour indiquer si la requête a renvoyé ou non une exception @return
     * @return 
     */
    public abstract boolean create(T obj);

    /**
     * méthode de mise à jour de l'ipp pour la fusion lié à un doublon des
     * urgences
     *
     * @param ippremplace
     * @param ipprecherche
     * @return
     */
    public abstract boolean updateIpp(String ippremplace, String ipprecherche);

    /**
     * Méthode de recherche d'objet(s) contraint sur l'ipp ATTENTION vérifier si
     * la liste n'est pas nulle
     *
     * @param ipp
     * @return
     */
    public abstract ArrayList<T> findIpp(String ipp);

    /**
     * Méthode de recherche d'objet(s) contraint sur l'ipp et le numéro de
     * séjour ATTENTION vérifier si la liste n'est pas nulle
     *
     * @param ipp
     * @param nosejour
     * @return
     */
    public abstract ArrayList<T> find(String ipp, String nosejour);

    /**
     * Méthode de recherche d'objet(s) contraint sur l'ipp et le numéro de
     * séjour et le service ATTENTION vérifier si la liste n'est pas nulle
     *
     * @param ipp
     * @param nosejour
     * @param service
     * @return
     */
    public abstract ArrayList<T> findSer(String ipp, String nosejour, String service);

    /**
     * Méthode pour effacer
     *
     * @param obj
     * @return
     */
    public abstract boolean delete(T obj);

    /**
     * Méthode de recherche de patient(s) contraint sur le nom et le prénom
     * ATTENTION vérifier si la liste n'est pas nulle
     *
     * @param nom
     * @param prenom
     * @return
     */
    public ArrayList<T> findPatientNomPrenom(String nom, String prenom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Méthode de recherche de patient(s) contraint sur le nom et le prénom
     * et le service du dm
     * ATTENTION vérifier si la liste n'est pas nulle
     *
     * @param nom
     * @param prenom
     * @param service
     * @return
     */
    public ArrayList<T> findPatientNomPrenomService(String nom, String prenom, String service) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Méthode d'update de toutes les informations d'un patients sauf l'ipp
     *
     * @param obj
     * @return
     */
    public boolean update(Patients obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Méthode de connexion aux informations d'un unique personnel hospitalier
     * via son identifiant et son mot de passe
     *
     * @param id
     * @param mdp
     * @return
     */
    public PersonnelHospitalier connex(String id, String mdp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Méthode de création automatique de l'ipp via requête sql qui renvoie le
     * plus grand ipp de l'année en cours incrémenté de 1 ou l'ipp dû à l'année
     * en cours
     *
     * @return
     */
    public String createIpp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Méthode de création automatique du numéro de séjour via requête sql qui
     * renvoie le plus grand numéro de séjour de l'année et du mois en cours
     * pour le patient avec l'ipp entrée en paramètre incrémenté de 1 ou le
     * numéro de séjour de l'année et du mois en cours
     *
     * @return
     */
    public String createNumeroSejour() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Méthode de création automatique de l'id de prescription via requête sql
     * qui renvoie le plus grand numéro id de prescription de l'année, du mois
     * et du jour en cours pour le patient avec l'ipp entrée en paramètre
     * incrémenté de 1 ou l'id de prescription de l'année, du mois et du jour en
     * cours
     *
     * @param ipp
     * @return
     */
    public String createIdPrescription(String ipp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Méthode qui renvoit le dernier numéro de séjour du patient identifié par
     * son ipp
     *
     * @param ipp
     * @return
     */
    public String getDernierNumeroSejour(String ipp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Méthode qui change le service de correspondance du patient identifier par
     * l'ipp pour le séjour identifié par le numéro de séjour "nosejour"
     *
     * @param ipp
     * @param nosejour
     * @param correspondance
     * @return
     */
    public boolean updateCorrespondance(String ipp, String nosejour, String correspondance) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Méthode qui permet de rehcercher un dma à l'aide de l'ipp et du service
     *
     * @param ipp
     * @param service
     * @return
     */
    public ArrayList<DossierMedicoAdministratif> findService(String ipp, String service) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Renvoie une liste de patients ayant le nom ou le prenom indiqué dont
     * le dma stipule le service entré en paramètre
     * @param nom
     * @param prenom
     * @param service
     * @return 
     */
    public ArrayList<Patients> findPatientNomPrenomServiceSM(String nom, String prenom, String service) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
