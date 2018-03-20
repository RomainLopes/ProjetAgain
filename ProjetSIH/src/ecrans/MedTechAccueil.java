/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecrans;

import GestionBDD.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author romel
 */
public class MedTechAccueil extends javax.swing.JFrame {

    /**
     * Creates new form MedAccueil
     */
    private static PersonnelHospitalier employe;
    private static Patients patient;
    private ArrayList<Observations> observation;
    private ArrayList<Resultats> resultat;
    private ArrayList<Prescriptions> prescription;
    private ArrayList<DossierMedicoAdministratif> dmas;
    private String ipp;

    /**
     *
     * @param personnel
     * @param patient
     * @param obs
     * @param res
     * @param prescription
     */
    public MedTechAccueil(PersonnelHospitalier personnel, Patients patient, ArrayList<Observations> obs, ArrayList<Resultats> res, ArrayList<Prescriptions> prescription) {
        initComponents();
        employe = personnel;
        this.patient = patient;
        jLabelNom.setText(personnel.getNomph());
        jLabelPrenom.setText(personnel.getPrenomph());
        //jLabelFonction.setText(personnel.getFonction());
        jLabelService.setText(personnel.getService());

        jLabel3NomPatient.setText(patient.getNompatient());
        jLabel4PrenomPatient.setText(patient.getPrenompatient());
        jLabel2DateDeNaissance.setText(patient.getDateDeNaissance());
        jLabel2Sexe.setText(patient.getSexe());

        observation = obs;
        resultat = res;
        this.prescription = prescription;
        ipp = (patient.getIpp().substring(1, patient.getIpp().length() - 1));

        DossierMedicoAdministratifDAO dmadao = new DossierMedicoAdministratifDAO(BDDconnection.getInstance());
        dmas = dmadao.findService(ipp, employe.getService());
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
        Sa = new javax.swing.JLabel();
        jLabelNom = new javax.swing.JLabel();
        jLabelPrenom = new javax.swing.JLabel();
        jButtonDeconnexion = new javax.swing.JButton();
        jButtonAccueil = new javax.swing.JButton();
        jLabelService = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1Observations = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ajouterObservation1 = new javax.swing.JButton();
        jScrollPane1ListeObservations = new javax.swing.JScrollPane();
        jListObservations = new javax.swing.JList<>();
        Observations = new javax.swing.JLabel();
        jPanel7Resultat = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        Prescriptio2 = new javax.swing.JLabel();
        ajouterResultat = new javax.swing.JButton();
        jScrollPane3ListeResultats = new javax.swing.JScrollPane();
        jListResultats = new javax.swing.JList<>();
        jPanel3InfoPatient = new javax.swing.JPanel();
        jLabel1Prenom = new javax.swing.JLabel();
        jLabel2Nom = new javax.swing.JLabel();
        jLabel3NomPatient = new javax.swing.JLabel();
        jLabel4PrenomPatient = new javax.swing.JLabel();
        jLabel2Sexe = new javax.swing.JLabel();
        jLabel2DateDeNaissance = new javax.swing.JLabel();
        jLabelSexePatient = new javax.swing.JLabel();
        jLabel2dateDeNAissancePatient = new javax.swing.JLabel();
        jLabel1InfoPatients = new javax.swing.JLabel();
        jPanel4Prescriptions3 = new javax.swing.JPanel();
        jScrollPane2ListePrescription3 = new javax.swing.JScrollPane();
        jListPrescriptions = new javax.swing.JList<>();
        jPanel9 = new javax.swing.JPanel();
        Prescriptio4 = new javax.swing.JLabel();
        jButtonaffichernosejours = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JPanelEnTeteMedTech.setBackground(new java.awt.Color(65, 131, 215));
        JPanelEnTeteMedTech.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Sa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Sa.setText("Médecin médico-technique");

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
                        .addComponent(jLabelPrenom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(Sa)
                        .addGap(215, 215, 215))
                    .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                        .addComponent(jLabelNom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelService)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDeconnexion)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        JPanelEnTeteMedTechLayout.setVerticalGroup(
            JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                .addGroup(JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNom)
                            .addComponent(jLabelService)
                            .addComponent(jButtonDeconnexion)))
                    .addComponent(Sa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabelPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonAccueil)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel1Observations.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ajouterObservation1.setBackground(new java.awt.Color(135, 211, 124));
        ajouterObservation1.setText("+");
        ajouterObservation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterObservation1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(ajouterObservation1)
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ajouterObservation1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1ListeObservations.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jListObservations.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListObservations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListObservationsMouseClicked(evt);
            }
        });
        jScrollPane1ListeObservations.setViewportView(jListObservations);

        Observations.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Observations.setText("Observations");

        javax.swing.GroupLayout jPanel1ObservationsLayout = new javax.swing.GroupLayout(jPanel1Observations);
        jPanel1Observations.setLayout(jPanel1ObservationsLayout);
        jPanel1ObservationsLayout.setHorizontalGroup(
            jPanel1ObservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1ObservationsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1ObservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1ObservationsLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1ListeObservations, javax.swing.GroupLayout.Alignment.TRAILING))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1ListeObservations, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207))
        );

        jPanel2.add(jPanel1Observations);
        jPanel1Observations.setBounds(390, 215, 307, 239);

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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ajouterResultat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Prescriptio2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Prescriptio2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(ajouterResultat, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
        );

        jListResultats.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListResultats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListResultatsMouseClicked(evt);
            }
        });
        jScrollPane3ListeResultats.setViewportView(jListResultats);

        javax.swing.GroupLayout jPanel7ResultatLayout = new javax.swing.GroupLayout(jPanel7Resultat);
        jPanel7Resultat.setLayout(jPanel7ResultatLayout);
        jPanel7ResultatLayout.setHorizontalGroup(
            jPanel7ResultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7ResultatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7ResultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3ListeResultats)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7ResultatLayout.setVerticalGroup(
            jPanel7ResultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7ResultatLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3ListeResultats, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel7Resultat);
        jPanel7Resultat.setBounds(703, 214, 270, 240);

        jPanel3InfoPatient.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1Prenom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1Prenom.setText("Prénom : ");

        jLabel2Nom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2Nom.setText("Nom : ");

        jLabel3NomPatient.setText("jLabel3");

        jLabel4PrenomPatient.setText("jLabel4");

        jLabel2Sexe.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2Sexe.setText("Sexe :");

        jLabel2DateDeNaissance.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2DateDeNaissance.setText("Date de Naissance : ");

        jLabelSexePatient.setText("jLabel");

        jLabel2dateDeNAissancePatient.setText("Jlabel");

        jLabel1InfoPatients.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel1InfoPatients.setText("Informations du patient ");

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
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3NomPatient))
                            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                .addComponent(jLabel1Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4PrenomPatient)))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                .addComponent(jLabel2Sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(jLabelSexePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                .addComponent(jLabel2DateDeNaissance)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2dateDeNAissancePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel3InfoPatientLayout.setVerticalGroup(
            jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3InfoPatientLayout.createSequentialGroup()
                .addComponent(jLabel1InfoPatients)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3NomPatient)
                    .addComponent(jLabel2Sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSexePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1Prenom)
                        .addComponent(jLabel4PrenomPatient))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2DateDeNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2dateDeNAissancePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel2.add(jPanel3InfoPatient);
        jPanel3InfoPatient.setBounds(50, 50, 437, 93);

        jPanel4Prescriptions3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jListPrescriptions.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2ListePrescription3.setViewportView(jListPrescriptions);

        Prescriptio4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Prescriptio4.setText("Prescriptions");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(Prescriptio4)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Prescriptio4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Prescriptions3Layout = new javax.swing.GroupLayout(jPanel4Prescriptions3);
        jPanel4Prescriptions3.setLayout(jPanel4Prescriptions3Layout);
        jPanel4Prescriptions3Layout.setHorizontalGroup(
            jPanel4Prescriptions3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Prescriptions3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Prescriptions3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2ListePrescription3, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Prescriptions3Layout.setVerticalGroup(
            jPanel4Prescriptions3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Prescriptions3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane2ListePrescription3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        jPanel2.add(jPanel4Prescriptions3);
        jPanel4Prescriptions3.setBounds(50, 218, 309, 230);

        jButtonaffichernosejours.setText("Afficher les séjours précédents");
        jButtonaffichernosejours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonaffichernosejoursActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonaffichernosejours);
        jButtonaffichernosejours.setBounds(590, 50, 270, 90);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(-10, 0, 1010, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(JPanelEnTeteMedTech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(JPanelEnTeteMedTech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAccueilActionPerformed
        RechercherPatient rechercher = new RechercherPatient(employe);
        rechercher.setSize(this.getSize());
        rechercher.setLocationRelativeTo(this);
        this.dispose();
        rechercher.setVisible(true);
    }//GEN-LAST:event_jButtonAccueilActionPerformed

    private void ajouterResultatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterResultatActionPerformed
        int taille = prescription.size();
        String idPrescription = prescription.get(taille).getIdprescription();
        NewResultat obs = new NewResultat(employe, patient, prescription, this);
        obs.setSize(this.getSize());
        obs.setLocationRelativeTo(this);
        this.dispose();
        obs.setVisible(true);
    }//GEN-LAST:event_ajouterResultatActionPerformed

    private void ajouterObservation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterObservation1ActionPerformed
        // TODO add your handling code here:
        NewObservations obs = new NewObservations(employe, patient, this);
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

    private void jListObservationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListObservationsMouseClicked
        int index = jListObservations.getSelectedIndex();
        ConsulterObservation obs = new ConsulterObservation(employe, patient, this, observation.get(index));
        obs.setSize(this.getSize());
        obs.setLocationRelativeTo(this);
        this.dispose();
        obs.setVisible(true);
    }//GEN-LAST:event_jListObservationsMouseClicked

    private void jListResultatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListResultatsMouseClicked
        // TODO add your handling code here:
        int index = jListResultats.getSelectedIndex();
        ConsulterResultat obs = new ConsulterResultat(employe, patient, this, resultat.get(index));
        obs.setSize(this.getSize());
        obs.setLocationRelativeTo(this);
        this.dispose();
        obs.setVisible(true);
    }//GEN-LAST:event_jListResultatsMouseClicked

    private void jButtonaffichernosejoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaffichernosejoursActionPerformed
        ObservationsDAO obs = new ObservationsDAO(BDDconnection.getInstance());
        ArrayList<Observations> ob;

        PrescriptionsDAO presc = new PrescriptionsDAO(BDDconnection.getInstance());
        ArrayList<Prescriptions> pr;

        ResultatsDAO res = new ResultatsDAO(BDDconnection.getInstance());
        ArrayList<Resultats> re;
        DefaultListModel observations = new DefaultListModel();
        DefaultListModel prescriptions = new DefaultListModel();
        DefaultListModel result = new DefaultListModel();
        for (DossierMedicoAdministratif d : dmas) {
            String nosejour = d.getNosejour();
            ob = obs.findSer(ipp, nosejour, employe.getService());
            pr = presc.findSer(ipp, nosejour, employe.getService());
            re = res.findSer(ipp, nosejour, employe.getService());

            ob.forEach((i) -> {
                observations.addElement(i.getNomacte() + "    " + i.getDateObservation()+ "    "+ nosejour);
            });

            pr.forEach((i) -> {
                prescriptions.addElement(i.getIdprescription() + "    " + i.getDateprescription()+ "    "+ nosejour);
            }); // 4 espaces

            re.forEach((i) -> {
                result.addElement(i.getPrestationmt() + "    " + i.getDateResultat()+ "    "+ nosejour);
            });
        }
jListPrescriptions.setModel(prescriptions);
jListObservations.setModel(observations);
jListResultats.setModel(result);

    }//GEN-LAST:event_jButtonaffichernosejoursActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelEnTeteMedTech;
    private javax.swing.JLabel Observations;
    private javax.swing.JLabel Prescriptio2;
    private javax.swing.JLabel Prescriptio4;
    private javax.swing.JLabel Sa;
    private javax.swing.JButton ajouterObservation1;
    private javax.swing.JButton ajouterResultat;
    private javax.swing.JButton jButtonAccueil;
    private javax.swing.JButton jButtonDeconnexion;
    private javax.swing.JButton jButtonaffichernosejours;
    private javax.swing.JLabel jLabel1InfoPatients;
    private javax.swing.JLabel jLabel1Prenom;
    private javax.swing.JLabel jLabel2DateDeNaissance;
    private javax.swing.JLabel jLabel2Nom;
    private javax.swing.JLabel jLabel2Sexe;
    private javax.swing.JLabel jLabel2dateDeNAissancePatient;
    private javax.swing.JLabel jLabel3NomPatient;
    private javax.swing.JLabel jLabel4PrenomPatient;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelPrenom;
    private javax.swing.JLabel jLabelService;
    private javax.swing.JLabel jLabelSexePatient;
    private javax.swing.JList<String> jListObservations;
    private javax.swing.JList<String> jListPrescriptions;
    private javax.swing.JList<String> jListResultats;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel1Observations;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel3InfoPatient;
    private javax.swing.JPanel jPanel4Prescriptions3;
    private javax.swing.JPanel jPanel7Resultat;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1ListeObservations;
    private javax.swing.JScrollPane jScrollPane2ListePrescription3;
    private javax.swing.JScrollPane jScrollPane3ListeResultats;
    // End of variables declaration//GEN-END:variables
    /**
     * @return the jListObservations
     */
    public javax.swing.JList<String> getjListObservations() {
        return jListObservations;
    }

    /**
     * @return the jListResultats
     */
    public javax.swing.JList<String> getjListResultats() {
        return jListResultats;
    }

    /**
     * @return the jListPrescriptions
     */
    public javax.swing.JList<String> getjListPrescriptions() {
        return jListPrescriptions;
    }
}
