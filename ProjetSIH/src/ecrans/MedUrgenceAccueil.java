/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecrans;

import GestionBDD.Patients;
import GestionBDD.PersonnelHospitalier;
import java.util.ArrayList;

/**
 *
 * @author lisad
 */
public class MedUrgenceAccueil extends javax.swing.JFrame {

    /**
     * Creates new form Urgence
     */
     private static PersonnelHospitalier employe;
    private static Patients patient;

    public MedUrgenceAccueil(PersonnelHospitalier employe, Patients patient) {
        initComponents();
        this.employe = employe;
        this.patient = patient;
        jLabelNomPmed.setText(employe.getNomph());
        jLabelPrenomPmed.setText(employe.getPrenomph());
        //jLabelFonction.setText(employe.getFonction());
        jLabelService.setText(employe.getService()); 
        
        jLabel1Nomp.setText(patient.getNompatient());
        jLabel2PrenomP.setText(patient.getPrenompatient());
        jLabel2DateDeNaissance.setText(patient.getDateDeNaissance());
        jLabel2Sexe.setText(patient.getSexe());
    }

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
        jLabelNomPmed = new javax.swing.JLabel();
        jLabelPrenomPmed = new javax.swing.JLabel();
        jButtonDeconnexion = new javax.swing.JButton();
        jButtonAccueil = new javax.swing.JButton();
        jLabelService = new javax.swing.JLabel();
        jPanel3InfoPatient = new javax.swing.JPanel();
        jLabel1Prenom = new javax.swing.JLabel();
        jLabel2Nom = new javax.swing.JLabel();
        jLabel2Sexe = new javax.swing.JLabel();
        jLabel2DateDeNaissance = new javax.swing.JLabel();
        jLabel1InfoPatients = new javax.swing.JLabel();
        ConsulterDM = new javax.swing.JButton();
        ConsulterDMA = new javax.swing.JButton();
        jLabel1Nomp = new javax.swing.JLabel();
        jLabel2PrenomP = new javax.swing.JLabel();
        jLabel3Sexep = new javax.swing.JLabel();
        jLabel4DateP = new javax.swing.JLabel();
        ConsulterDM1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel1Observations = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ajouterObservation1 = new javax.swing.JButton();
        consulterObservation = new javax.swing.JButton();
        jScrollPane1ListeObservations = new javax.swing.JScrollPane();
        Observations = new javax.swing.JLabel();
        jPanel4Prescriptions = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Prescriptio = new javax.swing.JLabel();
        ajouterPrescription = new javax.swing.JButton();
        jScrollPane2ListePrescription = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JPanelEnTeteMedTech.setBackground(new java.awt.Color(65, 131, 215));
        JPanelEnTeteMedTech.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelFonction.setFont(new java.awt.Font("Wiggle", 0, 24)); // NOI18N
        jLabelFonction.setText("Médecin Urgence");

        jLabelNomPmed.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelNomPmed.setText("Nom");

        jLabelPrenomPmed.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelPrenomPmed.setText("Prénom");

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
                        .addComponent(jLabelNomPmed)
                        .addGap(104, 104, 104)
                        .addComponent(jLabelFonction, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 315, Short.MAX_VALUE)
                        .addComponent(jLabelService))
                    .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                        .addComponent(jLabelPrenomPmed)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonDeconnexion)
                .addGap(16, 16, 16))
        );
        JPanelEnTeteMedTechLayout.setVerticalGroup(
            JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelEnTeteMedTechLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                .addGroup(JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                        .addGroup(JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelNomPmed)
                                    .addComponent(jLabelService)))
                            .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelFonction)))
                        .addGap(14, 14, 14)
                        .addComponent(jLabelPrenomPmed, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButtonDeconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(JPanelEnTeteMedTech);
        JPanelEnTeteMedTech.setBounds(0, 0, 1028, 108);

        jPanel3InfoPatient.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3InfoPatient.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1Prenom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1Prenom.setText("Prénom : ");

        jLabel2Nom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2Nom.setText("Nom : ");

        jLabel2Sexe.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2Sexe.setText("Sexe :");

        jLabel2DateDeNaissance.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2DateDeNaissance.setText("Date de Naissance : ");

        jLabel1InfoPatients.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel1InfoPatients.setText("Informations du patient ");

        ConsulterDM.setBackground(new java.awt.Color(228, 241, 254));
        ConsulterDM.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        ConsulterDM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Consulter 2.PNG"))); // NOI18N
        ConsulterDM.setText("Consulter DM");
        ConsulterDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsulterDMActionPerformed(evt);
            }
        });

        ConsulterDMA.setBackground(new java.awt.Color(228, 241, 254));
        ConsulterDMA.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        ConsulterDMA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Consulter 2.PNG"))); // NOI18N
        ConsulterDMA.setText("Consulter DMA");
        ConsulterDMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsulterDMAActionPerformed(evt);
            }
        });

        jLabel1Nomp.setText("jLabel1");

        jLabel2PrenomP.setText("jLabel1");

        jLabel3Sexep.setText("jLabel1");

        jLabel4DateP.setText("jLabel1");

        ConsulterDM1.setBackground(new java.awt.Color(228, 241, 254));
        ConsulterDM1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        ConsulterDM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Consulter 2.PNG"))); // NOI18N
        ConsulterDM1.setText("Création DMA temporaire");
        ConsulterDM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsulterDM1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3InfoPatientLayout = new javax.swing.GroupLayout(jPanel3InfoPatient);
        jPanel3InfoPatient.setLayout(jPanel3InfoPatientLayout);
        jPanel3InfoPatientLayout.setHorizontalGroup(
            jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1InfoPatients)
                    .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                        .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                .addComponent(jLabel2Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1Nomp, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                .addComponent(jLabel1Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2PrenomP, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                .addComponent(jLabel2Sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3Sexep, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                .addComponent(jLabel2DateDeNaissance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4DateP, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addComponent(ConsulterDM1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ConsulterDMA, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(ConsulterDM, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3InfoPatientLayout.setVerticalGroup(
            jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3InfoPatientLayout.createSequentialGroup()
                .addComponent(jLabel1InfoPatients)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2Sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1Nomp)
                    .addComponent(jLabel3Sexep))
                .addGap(18, 18, 18)
                .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1Prenom)
                    .addComponent(jLabel2DateDeNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2PrenomP)
                    .addComponent(jLabel4DateP)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3InfoPatientLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsulterDM, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsulterDMA, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsulterDM1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel3InfoPatient);
        jPanel3InfoPatient.setBounds(0, 109, 1030, 100);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1Observations.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ajouterObservation1.setBackground(new java.awt.Color(135, 211, 124));
        ajouterObservation1.setText("+");
        ajouterObservation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterObservation1ActionPerformed(evt);
            }
        });

        consulterObservation.setBackground(new java.awt.Color(228, 241, 254));
        consulterObservation.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        consulterObservation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Consulter 2.PNG"))); // NOI18N
        consulterObservation.setText("Consulter Observations");
        consulterObservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulterObservationActionPerformed(evt);
            }
        });

        jScrollPane1ListeObservations.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(ajouterObservation1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(consulterObservation))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1ListeObservations)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consulterObservation, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajouterObservation1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1ListeObservations, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );

        Observations.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Observations.setText("Observations");

        javax.swing.GroupLayout jPanel1ObservationsLayout = new javax.swing.GroupLayout(jPanel1Observations);
        jPanel1Observations.setLayout(jPanel1ObservationsLayout);
        jPanel1ObservationsLayout.setHorizontalGroup(
            jPanel1ObservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1ObservationsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1ObservationsLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(Observations, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1ObservationsLayout.setVerticalGroup(
            jPanel1ObservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1ObservationsLayout.createSequentialGroup()
                .addComponent(Observations, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4Prescriptions.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Prescriptio.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Prescriptio.setText("Prescriptions");

        ajouterPrescription.setBackground(new java.awt.Color(135, 211, 124));
        ajouterPrescription.setText("+");
        ajouterPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterPrescriptionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ajouterPrescription))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2ListePrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(Prescriptio, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Prescriptio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ajouterPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2ListePrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(340, 340, 340))
        );

        javax.swing.GroupLayout jPanel4PrescriptionsLayout = new javax.swing.GroupLayout(jPanel4Prescriptions);
        jPanel4Prescriptions.setLayout(jPanel4PrescriptionsLayout);
        jPanel4PrescriptionsLayout.setHorizontalGroup(
            jPanel4PrescriptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4PrescriptionsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel4PrescriptionsLayout.setVerticalGroup(
            jPanel4PrescriptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 424, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jPanel1Observations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(jPanel4Prescriptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1Observations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4Prescriptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-2, 201, 1030, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeconnexionActionPerformed
        // TODO add your handling code here:
        Identification iden = new Identification();
        iden.setSize(this.getSize());
        iden.setLocationRelativeTo(this);
        this.dispose();
        iden.setVisible(true);
    }//GEN-LAST:event_jButtonDeconnexionActionPerformed

    private void jButtonAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAccueilActionPerformed
        RechercherPatient rechercher = new RechercherPatient(employe);
        rechercher.setSize(this.getSize());
        rechercher.setLocationRelativeTo(this);
        this.dispose();
        rechercher.setVisible(true);
    }//GEN-LAST:event_jButtonAccueilActionPerformed

    private void ConsulterDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsulterDMActionPerformed
        // TODO add your handling code here:
        ConsulterDM dm = new ConsulterDM(employe, patient);
        dm.setSize(this.getSize());
        dm.setLocationRelativeTo(this);
        this.dispose();
        dm.setVisible(true);
    }//GEN-LAST:event_ConsulterDMActionPerformed

    private void ConsulterDM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsulterDM1ActionPerformed
        // TODO add your handling code here:
        CreationDMAtemporaire obs = new CreationDMAtemporaire(employe);
        obs.setSize(this.getSize());
        obs.setLocationRelativeTo(this);
        this.dispose();
        obs.setVisible(true);
    }//GEN-LAST:event_ConsulterDM1ActionPerformed

    private void ajouterObservation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterObservation1ActionPerformed
        // TODO add your handling code here:
        NewObservations obs = new NewObservations(employe,patient);
        obs.setSize(this.getSize());
        obs.setLocationRelativeTo(this);
        this.dispose();
        obs.setVisible(true);
    }//GEN-LAST:event_ajouterObservation1ActionPerformed

    private void consulterObservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulterObservationActionPerformed
        // TODO add your handling code here:
        ConsulterObservation obs = new ConsulterObservation(employe,patient);
        obs.setSize(this.getSize());
        obs.setLocationRelativeTo(this);
        this.dispose();
        obs.setVisible(true);
    }//GEN-LAST:event_consulterObservationActionPerformed

    private void ajouterPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterPrescriptionActionPerformed
        // TODO add your handling code here:
        NewPrescription obs = new NewPrescription(employe,patient);
        obs.setSize(this.getSize());
        obs.setLocationRelativeTo(this);
        this.dispose();
        obs.setVisible(true);
    }//GEN-LAST:event_ajouterPrescriptionActionPerformed

    private void ConsulterDMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsulterDMAActionPerformed
        // TODO add your handling code here:
        ConsulterDMA obs = new ConsulterDMA(employe,patient);
        obs.setSize(this.getSize());
        obs.setLocationRelativeTo(this);
        this.dispose();
        obs.setVisible(true);
    }//GEN-LAST:event_ConsulterDMAActionPerformed

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
            java.util.logging.Logger.getLogger(MedUrgenceAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedUrgenceAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedUrgenceAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedUrgenceAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedUrgenceAccueil(employe, patient).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsulterDM;
    private javax.swing.JButton ConsulterDM1;
    private javax.swing.JButton ConsulterDMA;
    private javax.swing.JPanel JPanelEnTeteMedTech;
    private javax.swing.JLabel Observations;
    private javax.swing.JLabel Prescriptio;
    private javax.swing.JButton ajouterObservation1;
    private javax.swing.JButton ajouterPrescription;
    private javax.swing.JButton consulterObservation;
    private javax.swing.JButton jButtonAccueil;
    private javax.swing.JButton jButtonDeconnexion;
    private javax.swing.JLabel jLabel1InfoPatients;
    private javax.swing.JLabel jLabel1Nomp;
    private javax.swing.JLabel jLabel1Prenom;
    private javax.swing.JLabel jLabel2DateDeNaissance;
    private javax.swing.JLabel jLabel2Nom;
    private javax.swing.JLabel jLabel2PrenomP;
    private javax.swing.JLabel jLabel2Sexe;
    private javax.swing.JLabel jLabel3Sexep;
    private javax.swing.JLabel jLabel4DateP;
    private javax.swing.JLabel jLabelFonction;
    private javax.swing.JLabel jLabelNomPmed;
    private javax.swing.JLabel jLabelPrenomPmed;
    private javax.swing.JLabel jLabelService;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel1Observations;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel3InfoPatient;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel4Prescriptions;
    private javax.swing.JScrollPane jScrollPane1ListeObservations;
    private javax.swing.JScrollPane jScrollPane2ListePrescription;
    // End of variables declaration//GEN-END:variables
}