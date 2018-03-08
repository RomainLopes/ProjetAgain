/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecrans;

import GestionBDD.Patients;
import GestionBDD.PersonnelHospitalier;
import java.util.ArrayList;
import projetsih.PHospitalier;
import projetsih.Patient;

/**
 *
 * @author romel
 */
public class MedRadioAccueil extends javax.swing.JFrame {

    /**
     * Creates new form MedRadioAccueil
     */
   private static PersonnelHospitalier employe;
    private static Patients patient;
    
    public MedRadioAccueil(PersonnelHospitalier personnel, Patients patient ) {
        initComponents();
        employe=personnel;
        this.patient=patient;
        jLabelNom.setText(personnel.getNomph());
        jLabelPrenom.setText(personnel.getPrenomph());
        //jLabelFonction.setText(personnel.getFonction());
        jLabelService.setText(personnel.getService()); 
        
        jLabel1Nomp.setText(patient.getNompatient());
        jLabel2PrenomP.setText(patient.getPrenompatient());
        jLabel4DateP.setText(patient.getDateDeNaissance());
        jLabel3Sexep.setText(patient.getSexe());
        
        
       /* jLabelPrenom.setText(employe.getPrenom());
        jLabelNom.setText(employe.getNom());
        jLabelService.setText(employe.getService().toString());

        jTextField1Nom.setText(((RechercherPatient) fenetrePrecedente).getP().getNom());
        jTextField2Prenom.setText(((RechercherPatient) fenetrePrecedente).getP().getPrenom());
        jTextField3Sexe.setText(((RechercherPatient) fenetrePrecedente).getP().getSexe());
        jTextField4DDN.setText(((RechercherPatient) fenetrePrecedente).getP().getDateNaissance().toString());*/
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
        jLabelNom = new javax.swing.JLabel();
        jLabelPrenom = new javax.swing.JLabel();
        jButtonDeconnexion = new javax.swing.JButton();
        jButtonAccueil = new javax.swing.JButton();
        jLabelService = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3InfoPatient = new javax.swing.JPanel();
        jLabel1Prenom = new javax.swing.JLabel();
        jLabel2Nom = new javax.swing.JLabel();
        jLabel2Sexe = new javax.swing.JLabel();
        jLabel2DateDeNaissance = new javax.swing.JLabel();
        jLabel1InfoPatients = new javax.swing.JLabel();
        ConsulterDM = new javax.swing.JButton();
        jLabel1Nomp = new javax.swing.JLabel();
        jLabel2PrenomP = new javax.swing.JLabel();
        jLabel3Sexep = new javax.swing.JLabel();
        jLabel4DateP = new javax.swing.JLabel();
        ConsulterDMA = new javax.swing.JButton();
        jPanel1Observations = new javax.swing.JPanel();
        jPanel7Resultat = new javax.swing.JPanel();
        jScrollPane3ListeResultats = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        Prescriptio2 = new javax.swing.JLabel();
        ajouterResultat = new javax.swing.JButton();
        consulterResultat = new javax.swing.JButton();
        jPanel1Observations1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Observations1 = new javax.swing.JLabel();
        ajouterObservation1 = new javax.swing.JButton();
        consulterObservation3 = new javax.swing.JButton();
        jScrollPane1ListeObservations1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JPanelEnTeteMedTech.setBackground(new java.awt.Color(65, 131, 215));
        JPanelEnTeteMedTech.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelFonction.setFont(new java.awt.Font("Wiggle", 0, 24)); // NOI18N
        jLabelFonction.setText("Médecin radiologiste");

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
                .addGap(18, 18, 18)
                .addComponent(jButtonAccueil)
                .addGap(45, 45, 45)
                .addGroup(JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                        .addComponent(jLabelNom)
                        .addGap(205, 205, 205)
                        .addComponent(jLabelFonction)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(jLabelService))
                    .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                        .addComponent(jLabelPrenom)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jButtonDeconnexion)
                .addGap(8, 8, 8))
        );
        JPanelEnTeteMedTechLayout.setVerticalGroup(
            JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                .addGroup(JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNom)
                            .addComponent(jLabelService)))
                    .addGroup(JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabelFonction, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonDeconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(JPanelEnTeteMedTech);
        JPanelEnTeteMedTech.setBounds(1, 0, 900, 108);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

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

        jLabel1Nomp.setText("jLabel1");

        jLabel2PrenomP.setText("jLabel1");

        jLabel3Sexep.setText("jLabel1");

        jLabel4DateP.setText("jLabel1");

        ConsulterDMA.setBackground(new java.awt.Color(228, 241, 254));
        ConsulterDMA.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        ConsulterDMA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Consulter 2.PNG"))); // NOI18N
        ConsulterDMA.setText("Consulter DMA");
        ConsulterDMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsulterDMAActionPerformed(evt);
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
                        .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                .addComponent(jLabel1Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2PrenomP, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                .addComponent(jLabel2Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1Nomp, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                .addComponent(jLabel2Sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3Sexep, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                .addComponent(jLabel2DateDeNaissance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4DateP, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53)
                        .addComponent(ConsulterDMA, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ConsulterDM, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(298, Short.MAX_VALUE))
        );
        jPanel3InfoPatientLayout.setVerticalGroup(
            jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3InfoPatientLayout.createSequentialGroup()
                .addComponent(jLabel1InfoPatients)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 26, Short.MAX_VALUE)
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
                    .addComponent(jLabel4DateP))
                .addGap(7, 7, 7))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3InfoPatientLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsulterDM, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsulterDMA, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel3InfoPatient);
        jPanel3InfoPatient.setBounds(2, 3, 1150, 120);

        jPanel1Observations.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1Observations.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel7Resultat.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Prescriptio2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Prescriptio2.setText("Résultats");

        ajouterResultat.setBackground(new java.awt.Color(135, 211, 124));
        ajouterResultat.setText("+");
        ajouterResultat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterResultatActionPerformed(evt);
            }
        });

        consulterResultat.setBackground(new java.awt.Color(228, 241, 254));
        consulterResultat.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        consulterResultat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Consulter 2.PNG"))); // NOI18N
        consulterResultat.setText("Consulter Résultats");
        consulterResultat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulterResultatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ajouterResultat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(consulterResultat))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(Prescriptio2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(Prescriptio2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouterResultat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consulterResultat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7ResultatLayout = new javax.swing.GroupLayout(jPanel7Resultat);
        jPanel7Resultat.setLayout(jPanel7ResultatLayout);
        jPanel7ResultatLayout.setHorizontalGroup(
            jPanel7ResultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7ResultatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7ResultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7ResultatLayout.createSequentialGroup()
                        .addComponent(jScrollPane3ListeResultats, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7ResultatLayout.setVerticalGroup(
            jPanel7ResultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7ResultatLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jScrollPane3ListeResultats, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Observations1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Observations1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Observations1.setText("Observations");

        ajouterObservation1.setBackground(new java.awt.Color(135, 211, 124));
        ajouterObservation1.setText("+");
        ajouterObservation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterObservation1ActionPerformed(evt);
            }
        });

        consulterObservation3.setBackground(new java.awt.Color(228, 241, 254));
        consulterObservation3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        consulterObservation3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Consulter 2.PNG"))); // NOI18N
        consulterObservation3.setText("Consulter Observations");
        consulterObservation3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulterObservation3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Observations1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ajouterObservation1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(consulterObservation3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(Observations1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouterObservation1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consulterObservation3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jScrollPane1ListeObservations1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Observations1Layout = new javax.swing.GroupLayout(jPanel1Observations1);
        jPanel1Observations1.setLayout(jPanel1Observations1Layout);
        jPanel1Observations1Layout.setHorizontalGroup(
            jPanel1Observations1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Observations1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Observations1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Observations1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1ListeObservations1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Observations1Layout.setVerticalGroup(
            jPanel1Observations1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Observations1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1ListeObservations1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel1ObservationsLayout = new javax.swing.GroupLayout(jPanel1Observations);
        jPanel1Observations.setLayout(jPanel1ObservationsLayout);
        jPanel1ObservationsLayout.setHorizontalGroup(
            jPanel1ObservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1ObservationsLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jPanel1Observations1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148)
                .addComponent(jPanel7Resultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(289, Short.MAX_VALUE))
        );
        jPanel1ObservationsLayout.setVerticalGroup(
            jPanel1ObservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1ObservationsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1ObservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7Resultat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1Observations1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel1Observations);
        jPanel1Observations.setBounds(2, 122, 1150, 560);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(1, 102, 1160, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAccueilActionPerformed
        RechercherPatient rechercher = new RechercherPatient(employe);
                    rechercher.setSize(this.getSize());
                    rechercher.setLocationRelativeTo(this);
                    this.dispose();
                    rechercher.setVisible(true);
    }//GEN-LAST:event_jButtonAccueilActionPerformed

    private void ConsulterDMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsulterDMAActionPerformed
        // TODO add your handling code here:
         ConsulterDMA obs = new ConsulterDMA(employe,patient);
        obs.setSize(this.getSize());
        obs.setLocationRelativeTo(this);
        this.dispose();
        obs.setVisible(true);
    }//GEN-LAST:event_ConsulterDMAActionPerformed

    private void ConsulterDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsulterDMActionPerformed
        // TODO add your handling code here:
         ConsulterDM obs = new ConsulterDM(employe,patient);
        obs.setSize(this.getSize());
        obs.setLocationRelativeTo(this);
        this.dispose();
        obs.setVisible(true);
    }//GEN-LAST:event_ConsulterDMActionPerformed

    private void ajouterResultatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterResultatActionPerformed
        // TODO add your handling code here:
         NewPrescription obs = new NewPrescription(employe,patient);
        obs.setSize(this.getSize());
        obs.setLocationRelativeTo(this);
        this.dispose();
        obs.setVisible(true);
    }//GEN-LAST:event_ajouterResultatActionPerformed

    private void ajouterObservation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterObservation1ActionPerformed
        // TODO add your handling code here:
         NewObservations obs = new NewObservations(employe,patient);
        obs.setSize(this.getSize());
        obs.setLocationRelativeTo(this);
        this.dispose();
        obs.setVisible(true);
    }//GEN-LAST:event_ajouterObservation1ActionPerformed

    private void jButtonDeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeconnexionActionPerformed
        // TODO add your handling code here: 
        Identification iden = new Identification();
                    iden.setSize(this.getSize());
                    iden.setLocationRelativeTo(this);
                    this.dispose();
                    iden.setVisible(true);
    }//GEN-LAST:event_jButtonDeconnexionActionPerformed

    private void consulterObservation3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulterObservation3ActionPerformed
        // TODO add your handling code here:
         ConsulterObservation obs = new ConsulterObservation(employe,patient);
        obs.setSize(this.getSize());
        obs.setLocationRelativeTo(this);
        this.dispose();
        obs.setVisible(true);
    }//GEN-LAST:event_consulterObservation3ActionPerformed

    private void consulterResultatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulterResultatActionPerformed
        // TODO add your handling code here:
         ConsulterResultat obs = new ConsulterResultat(employe,patient);
        obs.setSize(this.getSize());
        obs.setLocationRelativeTo(this);
        this.dispose();
        obs.setVisible(true);
    }//GEN-LAST:event_consulterResultatActionPerformed

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
            java.util.logging.Logger.getLogger(MedRadioAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedRadioAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedRadioAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedRadioAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedRadioAccueil(employe,patient).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsulterDM;
    private javax.swing.JButton ConsulterDMA;
    private javax.swing.JPanel JPanelEnTeteMedTech;
    private javax.swing.JLabel Observations1;
    private javax.swing.JLabel Prescriptio2;
    private javax.swing.JButton ajouterObservation1;
    private javax.swing.JButton ajouterResultat;
    private javax.swing.JButton consulterObservation3;
    private javax.swing.JButton consulterResultat;
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
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelPrenom;
    private javax.swing.JLabel jLabelService;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel1Observations;
    private javax.swing.JPanel jPanel1Observations1;
    private javax.swing.JPanel jPanel3InfoPatient;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7Resultat;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1ListeObservations1;
    private javax.swing.JScrollPane jScrollPane3ListeResultats;
    // End of variables declaration//GEN-END:variables
}
