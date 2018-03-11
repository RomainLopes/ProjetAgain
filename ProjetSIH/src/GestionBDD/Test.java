/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionBDD;

import GestionBDD.Patients.*;
import GestionBDD.PatientsDAO.*;
import java.util.ArrayList;
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

        /*
        DAO<Patients> PatientsDAO = new PatientsDAO(BDDconnection.getInstance());
        ArrayList<Patients> patients = PatientsDAO.find("180000001", "Cardiologie");
        System.out.println(patients.get(0).getNompatient() +"   " + patients.get(0).getPrenompatient());
         */ //Test find(String ipp, string service) OK
        /*
        Patients pat = new Patients();
        pat = new Patients(  ipp  , "1","2","10-10-1990","4","5","6");
        DAO<Patients> PatientsDAO = new PatientsDAO(BDDconnection.getInstance());
        PatientsDAO.create(pat);
         */ // test create ça marche !!
        /*
        DossierMedicalDAO dmdao = new DossierMedicalDAO(BDDconnection.getInstance());
        ArrayList<DossierMedical> dm = dmdao.findser("180000001", "180100001", "Cardiologie");
        System.out.println(dm.get(0).getIpp() + "   " + dm.get(0).getService());
         */
 /*
        DossierMedicoAdministratifDAO dmadao = new DossierMedicoAdministratifDAO(BDDconnection.getInstance());
        ArrayList<DossierMedicoAdministratif> dm = dmadao.findser("180000001", "180100001", "Cardiologie");
        System.out.println(dm.get(0).getIpp() + "   " + dm.get(0).getService());
         */
 /*
        LettreDeSortieDAO dmadao = new LettreDeSortieDAO(BDDconnection.getInstance());
        ArrayList<LettreDeSortie> dm = dmadao.find("180000001","180100001");
        if (!dm.isEmpty()){
            System.out.println(dm.get(0).getIpp() + "   " + dm.get(0).getLettre());
        }else{
        System.out.println("is empty");
         */
 /*
        ObservationsDAO dmadao = new ObservationsDAO(BDDconnection.getInstance());
        ArrayList<Observations> dm = dmadao.findser("180000003","180200003","Urologie");
        if (!dm.isEmpty()){
            System.out.println(dm.get(0).getIpp() + "   " + dm.get(0).getResume());
        } else{
        System.out.println("is empty");
        } 
         */
 /*
        OperationsDAO dmadao = new OperationsDAO(BDDconnection.getInstance());
        ArrayList<Operations> dm = dmadao.find("180000003","180200002");
        if (!dm.isEmpty()){
            System.out.println(dm.get(0).getIpp() + "   " + dm.get(0).getOperation());
        } else{
        System.out.println("is empty");
        }
         */
 /*
        PrescriptionsDAO dmadao = new PrescriptionsDAO(BDDconnection.getInstance());
        ArrayList<Prescriptions> dm = dmadao.findser("180000005","180200005","Urologie");
        if (!dm.isEmpty()){
            System.out.println(dm.get(0).getIpp() + "   " + dm.get(0).getPrescription());
        } else{
        System.out.println("is empty");
        }
         */
 /*
        PrestationsDAO dmadao = new PrestationsDAO(BDDconnection.getInstance());
        ArrayList<Prestations> dm = dmadao.find("180000001","180100001");
        if (!dm.isEmpty()){
            System.out.println(dm.get(0).getIpp() + "   " + dm.get(0).getPrestation());
        } else{
        System.out.println("is empty");
        }
         */
 /*
        ResultatsDAO dmadao = new ResultatsDAO(BDDconnection.getInstance());
        ArrayList<Resultats> dm = dmadao.find("180000003","180200003");
        if (!dm.isEmpty()){
            System.out.println(dm.get(0).getIpp() + "   " + dm.get(0).getResultat());
        } else{
        System.out.println("is empty");
        }
         */
        TracabiliteDAO dmadao = new TracabiliteDAO(BDDconnection.getInstance());
        ArrayList<Tracabilite> dm = dmadao.findser("180000001");
        if (!dm.isEmpty()) {
            System.out.println(dm.get(0).getIpp() + "   " + dm.get(0).getDateconnection());
        } else {
            System.out.println("is empty");
        }

        /*
        DossierMedical pat = new DossierMedical();
        pat = new DossierMedical("", "1","2","10-10-1990");
        DAO<DossierMedical> DossierMedicalDAO = new DossierMedicalDAO(BDDconnection.getInstance());
        DossierMedicalDAO.create(pat);
         */
    }

}
