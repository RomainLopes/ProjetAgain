/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecrans;

import GestionBDD.BDDconnection;
import GestionBDD.DAO;
import GestionBDD.DossierMedicalDAO;
import GestionBDD.DossierMedicoAdministratif;
import GestionBDD.DossierMedicoAdministratifDAO;
import GestionBDD.ObservationsDAO;
import GestionBDD.OperationsDAO;
import GestionBDD.Patients;
import GestionBDD.PatientsDAO;
import GestionBDD.PersonnelHospitalier;
import GestionBDD.PrescriptionsDAO;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import projetsih.PHospitalier;
//import projetsih.Patient;
import GestionBDD.RecherchePatient;
import GestionBDD.ResultatsDAO;
//import projetsih.SAdm;
//import projetsih.SMed;

/**
 *
 * @author lisad
 */
public class RechercherPatient extends javax.swing.JFrame {

    /**
     * Creates new form RechercherPatient
     */
    private static PersonnelHospitalier phr;
    private static ArrayList<String> med;
    private static ArrayList<String> p;
    private static DossierMedicoAdministratif dma;

    private static Patients patient;

    public RechercherPatient(PersonnelHospitalier ph) {
        //RecherchePatient rp = new RecherchePatient();
        //med = nps;
        initComponents();
        phr = ph;

        jLabelNom.setText(ph.getNomph());
        jLabelPrenom.setText(ph.getPrenomph());
        jLabelFonction.setText(ph.getFonction());
        jLabelService.setText(ph.getService());
    }

    /* public RechercherPatient(Identification fenetre) {
        RecherchePatient rp = new RecherchePatient();
        this.fenetrePrePh=fenetre;
        initComponents();
        employe= fenetrePrePh.getEmploye();
        jLabelNom.setText(employe.getNom());
        jLabelPrenom.setText(employe.getPrenom());
        jLabelFonction.setText(employe.getFonction().toString());
        jLabelService.setText(employe.getService().toString()); 
    }
    
     public RechercherPatient(SaAccueil fenetre) {
        RecherchePatient rp = new RecherchePatient();
        this.fenetrePreSa=fenetre;
        initComponents();
        this.sa= fenetrePreSa.getSa();
        jLabelNom.setText(employe.getNom());
        jLabelPrenom.setText(employe.getPrenom());
        jLabelFonction.setText(employe.getFonction().toString());
        jLabelService.setText(employe.getService().toString()); 
    }*/
 /* public RechercherPatient() {
        initComponents();
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelEnTeteMedTech = new javax.swing.JPanel();
        jLabelFonction = new javax.swing.JLabel();
        jLabelNom = new javax.swing.JLabel();
        jLabelPrenom = new javax.swing.JLabel();
        jButtonDeconnexion = new javax.swing.JButton();
        jButtonAccueil = new javax.swing.JButton();
        jLabelService = new javax.swing.JLabel();
        jPanel1RecherchePatient = new javax.swing.JPanel();
        jLabel1RecherchePatient = new javax.swing.JLabel();
        jLabel2Nom = new javax.swing.JLabel();
        jLabel3Prenom = new javax.swing.JLabel();
        jButtonRechercher = new javax.swing.JButton();
        jTextFieldNom = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListpatients = new javax.swing.JList<String>();
        jTextFieldPrenom = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(200, 200));
        setPreferredSize(new java.awt.Dimension(1000, 1000));
        setResizable(false);
        getContentPane().setLayout(null);

        JPanelEnTeteMedTech.setBackground(new java.awt.Color(65, 131, 215));
        JPanelEnTeteMedTech.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelFonction.setFont(new java.awt.Font("Wiggle", 0, 24)); // NOI18N
        jLabelFonction.setText("Fonction");

        jLabelNom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelNom.setText("Nom");

        jLabelPrenom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelPrenom.setText("Prénom");

        jButtonDeconnexion.setBackground(new java.awt.Color(228, 241, 254));
        jButtonDeconnexion.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonDeconnexion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Deconnexion 2.PNG"))); // NOI18N
        jButtonDeconnexion.setText("Déconnexion");
        jButtonDeconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeconnexionActionPerformed(evt);
            }
        });

        jButtonAccueil.setBackground(new java.awt.Color(228, 241, 254));
        jButtonAccueil.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonAccueil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Accueil 2.PNG"))); // NOI18N
        jButtonAccueil.setText("Accueil");
        jButtonAccueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAccueilActionPerformed(evt);
            }
        });

        jLabelService.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelService.setText("Service");

        javax.swing.GroupLayout JPanelEnTeteMedTechLayout = new javax.swing.GroupLayout(JPanelEnTeteMedTech);
        JPanelEnTeteMedTech.setLayout(JPanelEnTeteMedTechLayout);
        JPanelEnTeteMedTechLayout.setHorizontalGroup(
            JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAccueil)
                .addGap(53, 53, 53)
                .addGroup(JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                        .addComponent(jLabelNom)
                        .addGap(104, 104, 104)
                        .addComponent(jLabelFonction))
                    .addComponent(jLabelPrenom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 371, Short.MAX_VALUE)
                .addComponent(jLabelService)
                .addGap(18, 18, 18)
                .addComponent(jButtonDeconnexion)
                .addGap(115, 115, 115))
        );
        JPanelEnTeteMedTechLayout.setVerticalGroup(
            JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                .addGroup(JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabelNom))
                    .addGroup(JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabelFonction, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonDeconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelService))))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(JPanelEnTeteMedTech);
        JPanelEnTeteMedTech.setBounds(0, 0, 1080, 108);

        jPanel1RecherchePatient.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1RecherchePatient.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel1RecherchePatient.setText("Recherche d'un patient :");

        jLabel2Nom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2Nom.setText("Nom : ");

        jLabel3Prenom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3Prenom.setText("Prénom : ");

        jButtonRechercher.setBackground(new java.awt.Color(228, 241, 254));
        jButtonRechercher.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonRechercher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rechercher 2.PNG"))); // NOI18N
        jButtonRechercher.setText("Rechercher");
        jButtonRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRechercherActionPerformed(evt);
            }
        });

        jListpatients.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jListpatients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListpatientsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListpatients);

        jTextFieldPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrenomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1RecherchePatientLayout = new javax.swing.GroupLayout(jPanel1RecherchePatient);
        jPanel1RecherchePatient.setLayout(jPanel1RecherchePatientLayout);
        jPanel1RecherchePatientLayout.setHorizontalGroup(
            jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(179, 179, 179)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1RecherchePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        jPanel1RecherchePatientLayout.setVerticalGroup(
            jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1RecherchePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(132, 132, 132)))
                .addComponent(jButtonRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );

        getContentPane().add(jPanel1RecherchePatient);
        jPanel1RecherchePatient.setBounds(0, 104, 1080, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAccueilActionPerformed
        Identification id = new Identification();
        id.setSize(this.getSize());
        id.setLocationRelativeTo(this);
        this.dispose();
        id.setVisible(true);
    }//GEN-LAST:event_jButtonAccueilActionPerformed

    private void jButtonRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRechercherActionPerformed
        // TODO add your handling code here:
        RecherchePatient rp = new RecherchePatient();
        PatientsDAO patd = new PatientsDAO(BDDconnection.getInstance());

        ArrayList<String> resultatRecherche = new ArrayList<String>();
        ArrayList<String> resultatAffiche = new ArrayList<String>();
        /*
        System.out.println(" avant recheche");
         */
        resultatRecherche = rp.recherchePatientNomPrenom(jTextFieldNom.getText(), jTextFieldPrenom.getText());
        for (int i = 0; i < resultatRecherche.size(); i += 2) {
            resultatAffiche.add(resultatRecherche.get(i));
        }
        System.out.println("test de recherche");
        for (String i : resultatRecherche) {
            System.out.println(i);
        }
        /*
        System.out.println(" après recherche ");
         */
        DefaultListModel modele = new DefaultListModel();
        for (String i : resultatAffiche) {
            modele.addElement(i);
        }
        jListpatients.setModel(modele);

        ArrayList<String> infoPatient = new ArrayList<String>();
        infoPatient = rp.enTetePatient(resultatRecherche.get(1));
        p = infoPatient;
        int ipp = Integer.parseInt(resultatRecherche.get(1).substring(1, resultatRecherche.get(1).length() - 1));
        ArrayList<Patients> listepat = new ArrayList<Patients>();
        listepat = patd.findipp(resultatRecherche.get(1).substring(1, resultatRecherche.get(1).length() - 1));
        System.out.println(listepat.size());

        patient = listepat.get(0);

        /* System.out.println("****************************** TEST *****************");
            System.out.println(phr.getFonction());
                        System.out.println("/n)");

            System.out.println(patient.getNompatient());
                                    System.out.println("/n)");

            System.out.println(patient.getSexe());
                                    System.out.println("/n)");

            System.out.println("****************************** TEST *****************");

         */
        for (int i = 0; i < infoPatient.size(); i++) {
            System.out.println(infoPatient.get(i) + " \t \n");
        }

    }//GEN-LAST:event_jButtonRechercherActionPerformed

    private void jButtonDeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeconnexionActionPerformed
        // TODO add your handling code here:
        Identification iden = new Identification();
        iden.setSize(this.getSize());
        iden.setLocationRelativeTo(this);
        this.dispose();
        iden.setVisible(true);
    }//GEN-LAST:event_jButtonDeconnexionActionPerformed

    private void jTextFieldPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrenomActionPerformed

    private void jListpatientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListpatientsMouseClicked
        // TODO add your handling code here:
        RecherchePatient rp = new RecherchePatient();
        String ipp = patient.getIpp().substring(1, patient.getIpp().length() - 1);
        
        DossierMedicalDAO dms = new DossierMedicalDAO(BDDconnection.getInstance());
        ObservationsDAO obs = new ObservationsDAO(BDDconnection.getInstance());
        PrescriptionsDAO presc = new PrescriptionsDAO(BDDconnection.getInstance());
        OperationsDAO ope = new OperationsDAO(BDDconnection.getInstance());
        ResultatsDAO res = new ResultatsDAO(BDDconnection.getInstance());

        ArrayList<GestionBDD.Resultats> re = new ArrayList<GestionBDD.Resultats>();
        ArrayList<GestionBDD.Observations> ob = new ArrayList<GestionBDD.Observations>();
        ArrayList<GestionBDD.Prescriptions> pr = new ArrayList<GestionBDD.Prescriptions>();
        ArrayList<GestionBDD.Operations> op = new ArrayList<GestionBDD.Operations>();
        
        ArrayList<GestionBDD.DossierMedical> resultat = new ArrayList<GestionBDD.DossierMedical>();
        
        
        // ici on a pas encore de nosejour à ce stade donc réfléchir comment choisir le sejour

        resultat = dms.findser(ipp, "180100001", phr.getService()); // ipp nosejour service
        
        re= res.findipp(ipp);
        ob=obs.findipp(ipp);
        pr=presc.findipp(ipp);
        op=ope.findipp(ipp);

        DefaultListModel prescriptions = new DefaultListModel();
        DefaultListModel observations = new DefaultListModel();
        DefaultListModel operations = new DefaultListModel();
        DefaultListModel result = new DefaultListModel();
        
         for (GestionBDD.Prescriptions i : pr) {
               prescriptions.addElement(i.getIdprescription() + "    " + i.getDateprescription());} // 4 espaces
         
          for (GestionBDD.Operations i : op) {
               operations.addElement(i.getOperation() + "    " + i.getDateoperation());}
          
           for (GestionBDD.Observations i : ob) {
               observations.addElement(i.getNomacte() + "    " + i.getDateObservation());}
           
            for (GestionBDD.Resultats i : re) {
               result.addElement(i.getPrestationmt() + "    " + i.getDateResultat());}
    
            
        boolean x = true;
        System.out.println(phr.getFonction());
        if (x == true && "Secretaire medicale".equals(phr.getFonction())) {
            //JOptionPane.showMessageDialog(null, "Dossier médical existant");


            ConsulterDM sadm = new ConsulterDM(phr, patient);
            sadm.setSize(this.getSize());
            sadm.setLocationRelativeTo(this);
            this.dispose();
            sadm.setVisible(true);
            
            sadm.getjListPrescriptions().setModel(prescriptions);
            sadm.getjListOperations().setModel(operations);
            sadm.getjListObservations().setModel(observations);
            sadm.getjListResultats().setModel(result);


        } else if (x == true && "Administration".equals(phr.getFonction())) {

            DossierMedicoAdministratifDAO phd = new DossierMedicoAdministratifDAO(BDDconnection.getInstance());
            ArrayList<DossierMedicoAdministratif> resultats = new ArrayList <DossierMedicoAdministratif>();

            resultats = phd.findser(ipp, "180100001", "Cardiologie"); // ici utiliser la bonne fonction avec uniquement ipp car la sa n'a pas de service et on veut afficher tous les séjours 

            DefaultListModel num = new DefaultListModel();
            DefaultListModel type = new DefaultListModel();
            DefaultListModel date = new DefaultListModel();

            for (DossierMedicoAdministratif i : resultats) {
                num.addElement(i.getNosejour());
                date.addElement(i.getDateentree());
                type.addElement(i.getType());
            }

            ConsulterDMA sadm = new ConsulterDMA(phr, patient);
            sadm.setSize(this.getSize());
            sadm.setLocationRelativeTo(this);
            this.dispose();
            sadm.setVisible(true);

            sadm.getjListNoSejour().setModel(num);
            sadm.getjListDate().setModel(date);
            sadm.getjListType().setModel(type);

        } else if (x == true && "Interne".equals(phr.getFonction())) {

            InterneAccueil inte = new InterneAccueil(phr, patient);
            inte.setSize(this.getSize());
            inte.setLocationRelativeTo(this);
            this.dispose();
            inte.setVisible(true);
            
            inte.getjListObservations().setModel(observations);


        } else if (x == true && "Infirmier".equals(phr.getFonction())) {

            InfirmierAccueil inte = new InfirmierAccueil(phr, patient);
            inte.setSize(this.getSize());
            inte.setLocationRelativeTo(this);
            this.dispose();
            inte.setVisible(true);
            
            inte.getjListOperations().setModel(operations);
            inte.getjListObservations().setModel(observations);
            
        } else { // pH
            if (x == true && "Clinique".equals(phr.getService())) { // ajouter le .getType()

                MedClinAccueil inte = new MedClinAccueil(phr, patient);
                inte.setSize(this.getSize());
                inte.setLocationRelativeTo(this);
                this.dispose();
                inte.setVisible(true);
                 inte.getjListPrescriptions().setModel(prescriptions);
            inte.getjListObservations().setModel(observations);
            inte.getjListResultats().setModel(result);
                
            } else if (x == true/* pH.service.getNom()=="Radiologie"*/) {

                MedRadioAccueil inte = new MedRadioAccueil(phr, patient);
                inte.setSize(this.getSize());
                inte.setLocationRelativeTo(this);
                this.dispose();
                inte.setVisible(true);
            inte.getjListObservations().setModel(observations);
            inte.getjListResultats().setModel(result);
                
            } else if (x == true/* pH.service.getNom()=="Anesthésie"*/) {

                MedAnestAccueil inte = new MedAnestAccueil(phr, patient);
                inte.setSize(this.getSize());
                inte.setLocationRelativeTo(this);
                this.dispose();
                inte.setVisible(true);
                
                 inte.getjListPrescriptions().setModel(prescriptions);
            inte.getjListObservations().setModel(observations);
            inte.getjListResultats().setModel(result);
            } else if (x == true/* pH.service.getType()=="Médico-technique"*/) {

                MedTechAccueil inte = new MedTechAccueil(phr, patient);
                inte.setSize(this.getSize());
                inte.setLocationRelativeTo(this);
                this.dispose();
                inte.setVisible(true);
                
            inte.getjListObservations().setModel(observations);
            inte.getjListResultats().setModel(result);
            }
        }


    }//GEN-LAST:event_jListpatientsMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RechercherPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RechercherPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RechercherPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RechercherPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RechercherPatient(phr).setVisible(true);
            }
        });
    }

    public ArrayList<String> getP() {
        return this.p;
    }

    public ArrayList<String> getMed() {
        return this.med;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelEnTeteMedTech;
    private javax.swing.JButton jButtonAccueil;
    private javax.swing.JButton jButtonDeconnexion;
    private javax.swing.JButton jButtonRechercher;
    private javax.swing.JLabel jLabel1RecherchePatient;
    private javax.swing.JLabel jLabel2Nom;
    private javax.swing.JLabel jLabel3Prenom;
    private javax.swing.JLabel jLabelFonction;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelPrenom;
    private javax.swing.JLabel jLabelService;
    private javax.swing.JList<String> jListpatients;
    private javax.swing.JPanel jPanel1RecherchePatient;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldPrenom;
    // End of variables declaration//GEN-END:variables
}
