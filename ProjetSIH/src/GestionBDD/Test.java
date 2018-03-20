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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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
        // Creation 
        /*
        DossierMedical pat = new DossierMedical();
        pat = new DossierMedical("180005444", "180100002","Urologie","");
        DAO<DossierMedical> DossierMedicalDAO = new DossierMedicalDAO(BDDconnection.getInstance());
        DossierMedicalDAO.create(pat);
         */
 /*
        DossierMedicoAdministratif pat = new DossierMedicoAdministratif();
        pat = new DossierMedicoAdministratif("180005444", "180100002","01-05-2018","PH0001","Consultation","Cardiologie");
        DAO<DossierMedicoAdministratif> DossierMedicoAdministratifDAO = new DossierMedicoAdministratifDAO(BDDconnection.getInstance());
        System.out.println(DossierMedicoAdministratifDAO.create(pat));
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
        ArrayList<Patients> pat1 = PatientsDAO.findIpp("180000001");
        System.out.println(pat1.get(0).getNompatient() +"   " + pat1.get(0).getPrenompatient());
        ArrayList<Patients> pat2 = PatientsDAO.find("180000001", "Cardiologie");
        System.out.println(pat2.get(0).getNompatient() +"   " + pat2.get(0).getPrenompatient());
        ArrayList<Patients> pat3 = PatientsDAO.findPatientNomPrenom("Lopes", "Marc");
        System.out.println(pat3.size() + "  " +pat3.get(0).getNompatient() +"   " + pat3.get(0).getPrenompatient());
        ArrayList<Patients> pat4 = PatientsDAO.findPatientNomPrenomService("Djeco", "", "Pneumologie");
        System.out.println(pat4.size() + "  " +pat4.get(0).getNompatient() +"   " + pat4.get(0).getPrenompatient());
         */
 /*DossierMedicalDAO dmdao = new DossierMedicalDAO(BDDconnection.getInstance());
        ArrayList<DossierMedical> dm1 = dmdao.findSer("180000001", "180100001", "Cardiologie");
        System.out.println(dm1.get(0).getIpp() + "   " + dm1.get(0).getService());
        ArrayList<DossierMedical> dm2 = dmdao.find("180000001", "Cardiologie");
        System.out.println(dm2.get(0).getIpp() + "   " + dm2.get(0).getService());
         */
 /* DossierMedicoAdministratifDAO dmadao = new DossierMedicoAdministratifDAO(BDDconnection.getInstance());
        ArrayList<DossierMedicoAdministratif> dm = dmadao.findSer("180000001", "180100001", "Cardiologie");
        System.out.println(dm.get(0).getIpp() + "   " + dm.get(0).getService());
        System.out.println(dm.size());
         
        ArrayList<DossierMedicoAdministratif> dm2 = dmadao.findService("180000001", "Cardiologie");
        System.out.println(dm2.get(0).getIpp() + "   " + dm.get(0).getService());
        System.out.println(dm2.size());
        
        ArrayList<DossierMedicoAdministratif> dm3 = dmadao.find("180000001", "180100001");
        System.out.println(dm3.get(0).getIpp() + "   " + dm.get(0).getService());
        System.out.println(dm3.size()); */
      /*  LettreDeSortieDAO dmadao = new LettreDeSortieDAO(BDDconnection.getInstance());
        ArrayList<LettreDeSortie> dm = dmadao.find("180000001", "180100001");
        if (!dm.isEmpty()) {
            System.out.println(dm.get(0).getIpp() + "   " + dm.get(0).getLettre());
        } else {
            System.out.println("is empty");}*/

          
        ObservationsDAO dmadao = new ObservationsDAO(BDDconnection.getInstance());
        ArrayList<Observations> dm = dmadao.findSer("180000003","180200003","Urologie");
        if (!dm.isEmpty()){
            System.out.println(dm.get(0).getIpp() + "   " + dm.get(0).getResume());
        } else{
        System.out.println("is empty");
        } 
        ArrayList<Observations> dm2 = dmadao.findIpp("180000003");
        if (!dm2.isEmpty()){
            for(Observations i:dm2){
            System.out.println(i.getIpp() + "   " + i.getResume());
        } }else{
        System.out.println("is empty");
        } 
             
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
        ArrayList<Patients> patients = PatientsDAO.find("180000006", "Cardiologie");
        System.out.println(patients.get(0).getIpp() + patients.get(0).getPrenompatient());
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
        ArrayList<Tracabilite> dm = dmadao.findIpp("180000006");
        if (!dm.isEmpty()) {
            System.out.println(dm.size());
            System.out.println(dm.get(2).getNompatient() + "   " + dm.get(2).getNomph()+ "   " + dm.get(2).getDateconnection());
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
 /*
        DossierMedicoAdministratifDAO dmdao = new DossierMedicoAdministratifDAO(BDDconnection.getInstance());
        dmdao.updateIpp("123456789", "180000001");
        ArrayList<DossierMedicoAdministratif> dm = dmdao.findSer("123456789", "180100001", "Cardiologie");
        System.out.println(dm.get(0).getIpp() + "   " + dm.get(0).getService());
        dmdao.updateIpp("180000001", "123456789");
             */
 /*
        LettreDeSortieDAO ldsdao = new LettreDeSortieDAO(BDDconnection.getInstance());
        ldsdao.updateIpp("123456789", "180000001");
        ArrayList<LettreDeSortie> lds = ldsdao.find("123456789", "180100001");
        System.out.println(lds.get(0).getIpp() + "   " + lds.get(0).getLettre());
        ldsdao.updateIpp("180000001", "123456789");
             */
 /*
        ObservationsDAO odao = new ObservationsDAO(BDDconnection.getInstance());
        odao.updateIpp("123456789", "180000003");
        ArrayList<Observations> obs = odao.findIpp("123456789");
        System.out.println(obs.get(0).getIpp() + "   " + obs.get(0).getNomacte());
        odao.updateIpp("180000003", "123456789");
             */
 /*
        PrescriptionsDAO predao = new PrescriptionsDAO(BDDconnection.getInstance());
        predao.updateIpp("123456789", "180000001");
        ArrayList<Prescriptions> press = predao.findIpp("123456789");
        System.out.println(press.get(0).getIpp() + "   " + press.get(0).getPrescription());
        predao.updateIpp("180000001", "123456789");
             */
 /*
        PrestationsDAO presdao = new PrestationsDAO(BDDconnection.getInstance());
        presdao.updateIpp("123456789", "181000003");
        ArrayList<Prestations> prest = presdao.find("123456789", "180200003");
        System.out.println(prest.get(0).getIpp() + "   " + prest.get(0).getPrestation());
        presdao.updateIpp("181000003", "123456789");
             */

 /*
        ResultatsDAO redao = new ResultatsDAO(BDDconnection.getInstance());
        redao.updateIpp("123456789", "180000003");
        ArrayList<Resultats> reds = redao.find("123456789", "180200003");
        System.out.println(reds.get(0).getIpp() + "   " + reds.get(0).getResultat());
        redao.updateIpp("180000003", "123456789");
             */
 /*
        TracabiliteDAO tdao = new TracabiliteDAO(BDDconnection.getInstance()); // à tester ---------------
        tdao.updateIpp("123456789", "180000001");
        ArrayList<Tracabilite> t = tdao.findIpp("123456789");
        System.out.println(t.get(0).getNomph() + "   " + t.get(0).getDateconnection());
        tdao.updateIpp("180000001", "123456789");
/*
        //Tests création d'ipp, numéro de séjour, idprescription et getDernierNumeroSejour-------------------------------------------------
        /*
        DAO<Patients> PatientsDAO = new PatientsDAO(BDDconnection.getInstance());
        System.out.println(PatientsDAO.createIpp());
             */
 /*     
 DAO<DossierMedicoAdministratif> DossierMedicoAdministratifDAO = new DossierMedicoAdministratifDAO(BDDconnection.getInstance());
             */
            //Tests création d'ipp, numéro de séjour, et idprescription -------------------------------------------------
            /*
        DAO<Patients> PatientsDAO = new PatientsDAO(BDDconnection.getInstance());
        System.out.println(PatientsDAO.createIpp());
             */
 /*
      DAO<DossierMedicoAdministratif> DossierMedicoAdministratifDAO = new DossierMedicoAdministratifDAO(BDDconnection.getInstance());
        System.out.println(DossierMedicoAdministratifDAO.createNumeroSejour());
             */
 /*
        DAO<DossierMedicoAdministratif> nosejour = new DossierMedicoAdministratifDAO(BDDconnection.getInstance());
        System.out.println(nosejour.getDernierNumeroSejour("180000001"));
             */
 /*
        DAO<Prescriptions> PrescriptionsDAO = new PrescriptionsDAO(BDDconnection.getInstance());
        System.out.println(PrescriptionsDAO.createIdPrescription("180000003"));
             */
 /*  
        DAO<Prescriptions> PrescriptionsDAO = new PrescriptionsDAO(BDDconnection.getInstance());
        System.out.println(PrescriptionsDAO.createIdPrescription("180000003"));
             */
        }

    }
