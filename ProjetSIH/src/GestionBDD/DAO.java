/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionBDD;

import java.sql.Connection;
import GestionBDD.BDDconnection.*;
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
         * Méthode de création
         * @param obj
         * @return
         */
        public abstract boolean create(T obj);
        /**
         * Méthode pour effacer
         * @param obj
         * @return
         */
        public abstract boolean delete(T obj);
        /**
         * Méthode de mise à jour
         * @param obj
         * @return
         */
        public abstract boolean update(T obj);
        /**
         * Méthode de recherche des informations
         * @param id
         * @param service
         * @return
         */
        public abstract ArrayList<T> find(String id, String service);
}