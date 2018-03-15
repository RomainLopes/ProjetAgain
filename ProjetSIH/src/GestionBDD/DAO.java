/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionBDD;

import java.sql.Connection;
import java.util.ArrayList;

public abstract class DAO<T> {
        
        protected Connection connect = null;
        /**
         * Constructeur
         * @param conn
         */
        public DAO(Connection conn){
                this.connect = conn;
        }
        
        /**
         * Méthode de création de l'objet
         * @param obj
         * @return
         */
        public abstract boolean create(T obj);
        /**
         * méthode de mise à jour de l'ipp pour la fusion lié à un doublon 
         * des urgences
         * @param ippremplace
         * @param ipprecherche
         * @return 
         */
        public abstract boolean updateIpp(String ippremplace, String ipprecherche); 
        /**
         * Méthode de recherche d'objet(s) contraint sur l'ipp 
         * ATTENTION vérifier si la liste n'est pas nulle 
         * @param ipp
         * @return
         */
        public abstract ArrayList<T> findIpp(String ipp);
        /**
         * Méthode de recherche d'objet(s) contraint sur l'ipp et le numéro de 
         * séjour
         * ATTENTION vérifier si la liste n'est pas nulle 
         * @param ipp
         * @param nosejour
         * @return
         */
        public abstract ArrayList<T> find(String ipp, String nosejour);
        /**
         * Méthode de recherche d'objet(s) contraint sur l'ipp et le numéro de 
         * séjour et le service
         * ATTENTION vérifier si la liste n'est pas nulle 
         * @param ipp
         * @param nosejour
         * @param service
         * @return 
         */
        public abstract ArrayList<T> findSer(String ipp, String nosejour, String service);
        
        /**
         * Méthode pour effacer
         * @param obj
         * @return
         */
        public abstract boolean delete(T obj);

        /**
         * Méthode de recherche de patient(s) contraint sur le nom et le prénom
         * ATTENTION vérifier si la liste n'est pas nulle 
         * @param nom
         * @param prenom
         * @return 
         */
    public ArrayList<T> findPatientNomPrenom(String nom, String prenom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Méthode d'update de toutes les informations d'un patients sauf l'ipp
     * @param obj
     * @return 
     */
    public boolean update(Patients obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Méthode de connexion aux informations d'un unique personnel hospitalier 
     * via son identifiant et son mot de passe
     * @param id
     * @param mdp
     * @return 
     */
    public PersonnelHospitalier connex(String id, String mdp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}