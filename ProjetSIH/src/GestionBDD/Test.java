/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionBDD;
import GestionBDD.Patients.*;
import GestionBDD.PatientsDAO.*;
import java.util.Arrays;
/**
 *
 * @author romel
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Patients pat = new Patients();
        /* 
        DAO<Patients> PatientsDAO = new PatientsDAO(BDDconnection.getInstance());
        Patients patients = PatientsDAO.find("180000001", "Cardiologie");
        System.out.println(patients.getNompatient() +"   " + patients.getPrenompatient());
        */ //Test find(String ipp, string service) OK
        
        String ipp = "987654321";
/*
        pat = new Patients(  ipp  , "1","2","10-10-1990","4","5","6");
        DAO<Patients> PatientsDAO = new PatientsDAO(BDDconnection.getInstance());
        PatientsDAO.create(pat);
        */ // test create ça marche !!
    }
    
}
