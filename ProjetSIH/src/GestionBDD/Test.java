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

        //Tests unitaire de création--------------------------------------------------
        /*
        // Creation 
        
        DossierMedical pat = new DossierMedical();
        pat = new DossierMedical("180000006", "180100002","Urologie ","");
        DAO<DossierMedical> DossierMedicalDAO = new DossierMedicalDAO(BDDconnection.getInstance());
        DossierMedicalDAO.create(pat);
         */
 /* 
        DossierMedicoAdministratif pat = new DossierMedicoAdministratif();
        pat = new DossierMedicoAdministratif("180000006", "180100002","01-05-2018","PH0001","Consultation","Cardiologie");
        DAO<DossierMedicoAdministratif> DossierMedicoAdministratifDAO = new DossierMedicoAdministratifDAO(BDDconnection.getInstance());
        DossierMedicoAdministratifDAO.create(pat);
         */
 /*
        LettreDeSortie pat = new LettreDeSortie();
        pat = new LettreDeSortie("180000006", "180100002","PH0001","j autorise ma patiente a sortir...");
        DAO<LettreDeSortie> LettreDeSortieDAO = new LettreDeSortieDAO(BDDconnection.getInstance());
        LettreDeSortieDAO.create(pat);
         */
 /*
        Observations pat = new Observations();
        pat = new Observations("185000002", "180300006","PH0001","03-13-2018","Cardiologie","Consultation classique","Lors de la consultation, ma patiente n a presenté aucun signe clinique inquiétant. ");
        DAO<Observations> ObservationsDAO = new ObservationsDAO(BDDconnection.getInstance());
        ObservationsDAO.create(pat);
         */
 /*
        Operations pat = new Operations();
        pat = new Operations("180000002", "180300006","IN0001","03-13-2018","ECG");
        DAO<Operations> OperationsDAO = new OperationsDAO(BDDconnection.getInstance());
        OperationsDAO.create(pat);
         */
 /*
        Patients pat = new Patients();
        pat = new Patients(  ipp  , "1","2","10-10-1990","4","5","6");
        DAO<Patients> PatientsDAO = new PatientsDAO(BDDconnection.getInstance());
        PatientsDAO.create(pat);
         */
 /*
        PersonnelHospitalier pat = new PersonnelHospitalier();
        pat = new PersonnelHospitalier("Mac", "Arena","PH0008","tchatcha51","Urgence","Praticien Hospitalier");
        DAO<PersonnelHospitalier> PersonnelHospitalierDAO = new PersonnelHospitalierDAO(BDDconnection.getInstance());
        PersonnelHospitalierDAO.create(pat);
         */
 /*
        Prescriptions pat = new Prescriptions();
        pat = new Prescriptions("180000002", "180300006","P180300001","03-13-2018","ECG","Cardiologie");
        DAO<Prescriptions> PrescriptionsDAO = new PrescriptionsDAO(BDDconnection.getInstance());
        PrescriptionsDAO.create(pat);
         */
 /*
        Prestations pat = new Prestations();
        pat = new Prestations("180000006", "180200008", "02-22-2018", "Cardiologie", "Radiologie du coeur");
        DAO<Prestations> PrestationsDAO = new PrestationsDAO(BDDconnection.getInstance());
        PrestationsDAO.create(pat);
         */

 /*
        Resultats pat = new Resultats();
        pat = new Resultats("180000006", "180200008", "02-22-2018", "Cardiologie", "Radiologie du coeur", "02-22-2018","presente une anomalie au niveau de l artere coronaire ");
        DAO<Resultats> ResultatsDAO = new ResultatsDAO(BDDconnection.getInstance());
        ResultatsDAO.create(pat);
         */
 /*
        Tracabilite pat = new Tracabilite();
        pat = new Tracabilite("180000006", "IN0001", "02-22-2018");
        DAO<Tracabilite> TracabiliteDAO = new TracabiliteDAO(BDDconnection.getInstance());
        TracabiliteDAO.create(pat);
         */
        //Tests unitaire de recherche-------------------------------------------------
        /*
        DAO<Patients> PatientsDAO = new PatientsDAO(BDDconnection.getInstance());
        ArrayList<Patients> patients = PatientsDAO.find("180000001", "Cardiologie");
        System.out.println(patients.get(0).getNompatient() +"   " + patients.get(0).getPrenompatient());
         */ //Test find(String ipp, string service) OK
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
        DAO<Patients> PatientsDAO = new PatientsDAO(BDDconnection.getInstance());
        ArrayList<Patients> patients = PatientsDAO.find("180000001", "Cardiologie");
        System.out.println(patients.get(0).getNompatient() +"   " + patients.get(0).getPrenompatient());
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
 /*
        TracabiliteDAO dmadao = new TracabiliteDAO(BDDconnection.getInstance());
        ArrayList<Tracabilite> dm = dmadao.findser("180000001");
        if (!dm.isEmpty()) {
            System.out.println(dm.get(0).getNompatient() + "   " + dm.get(0).getNomph()+ "   " + dm.get(0).getDateconnection());
        } else {
            System.out.println("is empty");
        }
         */
        //Tests unitaire d'update-------------------------------------------------
        /*
        DossierMedicalDAO dmdao = new DossierMedicalDAO(BDDconnection.getInstance());
        dmdao.updateIpp("123456789", "180000001");
        ArrayList<DossierMedical> dm = dmdao.findser("123456789", "180100001", "Cardiologie");
        System.out.println(dm.get(0).getIpp() + "   " + dm.get(0).getService());
        dmdao.updateIpp("180000001", "123456789");
*/
        
        
        DossierMedicoAdministratifDAO dmdao = new DossierMedicoAdministratifDAO(BDDconnection.getInstance());
        dmdao.updateIpp("123456789", "180000001");
        ArrayList<DossierMedicoAdministratif> dm = dmdao.findSer("123456789", "180100001", "Cardiologie");// à modif
        System.out.println(dm.get(0).getIpp() + "   " + dm.get(0).getService());
        dmdao.updateIpp("180000001", "123456789");

        
        LettreDeSortieDAO ldsdao = new LettreDeSortieDAO(BDDconnection.getInstance());
        dmdao.updateIpp("123456789", "180000001");
        ArrayList<LettreDeSortie> lds = ldsdao.find("123456789", "180100001");// a modif
        System.out.println(lds.get(0).getIpp() + "   " + lds.get(0).getLettre());
        dmdao.updateIpp("180000001", "123456789");
        
    }

}
