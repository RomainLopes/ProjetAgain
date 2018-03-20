/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interoperabilite;

import GestionBDD.BDDconnection;
import GestionBDD.DAO;
import GestionBDD.Patients;
import GestionBDD.PatientsDAO;
import java.util.ArrayList;

/**
 *
 * @author romel
 */
public class TestClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DAO<Patients> PatientsDAO = new PatientsDAO(BDDconnection.getInstance());
        ArrayList<Patients> pat = PatientsDAO.findPatientNomPrenom("Lopes", "Marc");
        
        int port = 4446;
        String host = "localhost";
        
        interoperabilite.ClientT s = new interoperabilite.ClientT(pat.get(0),port,host);
    }
    
}
