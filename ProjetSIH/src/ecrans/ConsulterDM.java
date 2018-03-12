/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecrans;

import GestionBDD.Patients;
import GestionBDD.PersonnelHospitalier;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import projetsih.DM;
import projetsih.DMMedical;
import projetsih.PHospitalier;
import projetsih.Patient;

/**
 *
 * @author lisad
 */
public class ConsulterDM extends javax.swing.JFrame {

    private static PersonnelHospitalier employe;
    private static Patients patient;
    private  ArrayList<String> test; // ici ce sont les infos du patient


    /* public ConsulterDM() {
        initComponents();
        // test 
        ArrayList<String> pat = new ArrayList();// liste des infos que je récupère qui sera
        pat.add("Rdio du poumon gauche");
        pat.add("Echographiede l'abdomen");

        jScrollPane2ListePrescription.setBounds(0, 0, 930, 610);
        jPanel4Prescriptions.setLayout(new GridLayout(50, 1));

        for (int i = 0; i <= 10; i++) {
            for (String j : pat) {
                jPanel4Prescriptions.add(new JLabel(j));
            }
        }

//jPanel4Prescriptions.setVisible(true);jScrollPane2ListePrescription
       // DM dmPat =p.getDpi().getMyDM();
       // dmPat.getResultats().toString();
    }*/
    public ConsulterDM(PersonnelHospitalier employe, Patients patient) {
        initComponents();
        this.patient = patient;
        this.employe = employe;

        jLabel1Nomp.setText(patient.getNompatient());
        jLabel2PrenomP.setText(patient.getPrenompatient());
        jLabel4DateP.setText(patient.getDateDeNaissance());
        jLabel3Sexep.setText(patient.getSexe());

        /*test.add("Rdio du poumon gauche");
        test.add("Echographiede l'abdomen");
        DefaultListModel modele = new DefaultListModel();
        for (String i : test) {
                modele.addElement(i);
            }
         jListObservation.setModel(modele);
         jListPrescription.setModel(modele);*/

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3InfoPatient = new javax.swing.JPanel();
        jLabel1Prenom = new javax.swing.JLabel();
        jLabel2Nom = new javax.swing.JLabel();
        jLabel2Sexe = new javax.swing.JLabel();
        jLabel2DateDeNaissance = new javax.swing.JLabel();
        jLabel1InfoPatients = new javax.swing.JLabel();
        jLabel2Service = new javax.swing.JLabel();
        jLabel1Nomp = new javax.swing.JLabel();
        jLabel2PrenomP = new javax.swing.JLabel();
        jLabel3Sexep = new javax.swing.JLabel();
        jLabel4DateP = new javax.swing.JLabel();
        jLabel5ServiceP = new javax.swing.JLabel();
        jButtonPrecedent = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanelOperations = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        Operations = new javax.swing.JLabel();
        jScrollPane1ListeOperations = new javax.swing.JScrollPane();
        jPanel7Resultat = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        Prescriptio2 = new javax.swing.JLabel();
        jScrollPane3ListeResultats = new javax.swing.JScrollPane();
        jPanel1Observations = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Observations = new javax.swing.JLabel();
        jScrollPane1ListeObservations = new javax.swing.JScrollPane();
        jListObservation = new javax.swing.JList<String>();
        jPanel4Prescriptions = new javax.swing.JPanel();
        jScrollPane2ListePrescription = new javax.swing.JScrollPane();
        jListPrescription = new javax.swing.JList<String>();
        jPanel4 = new javax.swing.JPanel();
        Prescriptio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel3InfoPatient.setBackground(new java.awt.Color(65, 131, 215));
        jPanel3InfoPatient.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1Prenom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1Prenom.setText("Prénom : ");

        jLabel2Nom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2Nom.setText("Nom : ");

        jLabel2Sexe.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2Sexe.setText("Sexe :");

        jLabel2DateDeNaissance.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2DateDeNaissance.setText("Date de Naissance : ");

        jLabel1InfoPatients.setFont(new java.awt.Font("Wiggle", 0, 24)); // NOI18N
        jLabel1InfoPatients.setText("Dossier médical du patient ");

        jLabel2Service.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2Service.setText("Service :");

        jLabel1Nomp.setText("jLabel1");

        jLabel2PrenomP.setText("jLabel1");

        jLabel3Sexep.setText("jLabel1");

        jLabel4DateP.setText("jLabel1");

        jLabel5ServiceP.setText("jLabel1");

        jButtonPrecedent.setBackground(new java.awt.Color(228, 241, 254));
        jButtonPrecedent.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonPrecedent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bouton précedent.PNG"))); // NOI18N
        jButtonPrecedent.setText("Précédent");
        jButtonPrecedent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrecedentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3InfoPatientLayout = new javax.swing.GroupLayout(jPanel3InfoPatient);
        jPanel3InfoPatient.setLayout(jPanel3InfoPatientLayout);
        jPanel3InfoPatientLayout.setHorizontalGroup(
            jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                .addComponent(jLabel2Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1Nomp, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                .addComponent(jLabel1Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2PrenomP, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                .addComponent(jLabel2DateDeNaissance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4DateP, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                .addComponent(jLabel2Sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jLabel3Sexep, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2Service, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5ServiceP, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonPrecedent)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1InfoPatients)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel3InfoPatientLayout.setVerticalGroup(
            jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3InfoPatientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1InfoPatients, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPrecedent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1Nomp)
                    .addComponent(jLabel2Sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3Sexep)
                    .addComponent(jLabel2Service, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5ServiceP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1Prenom)
                    .addComponent(jLabel2PrenomP)
                    .addComponent(jLabel2DateDeNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4DateP))
                .addGap(5, 5, 5))
        );

        getContentPane().add(jPanel3InfoPatient);
        jPanel3InfoPatient.setBounds(0, 0, 700, 113);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelOperations.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Operations.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Operations.setText("Opérations");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(Operations, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 43, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(Operations, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelOperationsLayout = new javax.swing.GroupLayout(jPanelOperations);
        jPanelOperations.setLayout(jPanelOperationsLayout);
        jPanelOperationsLayout.setHorizontalGroup(
            jPanelOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperationsLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanelOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1ListeOperations)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelOperationsLayout.setVerticalGroup(
            jPanelOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperationsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1ListeOperations)
                .addContainerGap())
        );

        jPanel7Resultat.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Prescriptio2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Prescriptio2.setText("Résultats");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(Prescriptio2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Prescriptio2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7ResultatLayout = new javax.swing.GroupLayout(jPanel7Resultat);
        jPanel7Resultat.setLayout(jPanel7ResultatLayout);
        jPanel7ResultatLayout.setHorizontalGroup(
            jPanel7ResultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7ResultatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7ResultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3ListeResultats, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jPanel7ResultatLayout.setVerticalGroup(
            jPanel7ResultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7ResultatLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3ListeResultats)
                .addGap(20, 20, 20))
        );

        jPanel1Observations.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Observations.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Observations.setText("Observations");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Observations)
                .addGap(0, 44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Observations, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jScrollPane1ListeObservations.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1ListeObservations.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jListObservation.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1ListeObservations.setViewportView(jListObservation);

        javax.swing.GroupLayout jPanel1ObservationsLayout = new javax.swing.GroupLayout(jPanel1Observations);
        jPanel1Observations.setLayout(jPanel1ObservationsLayout);
        jPanel1ObservationsLayout.setHorizontalGroup(
            jPanel1ObservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1ObservationsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1ObservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1ListeObservations, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1ObservationsLayout.setVerticalGroup(
            jPanel1ObservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1ObservationsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1ListeObservations, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel4Prescriptions.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jListPrescription.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2ListePrescription.setViewportView(jListPrescription);

        Prescriptio.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Prescriptio.setText("Prescriptions");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(Prescriptio, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(Prescriptio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4PrescriptionsLayout = new javax.swing.GroupLayout(jPanel4Prescriptions);
        jPanel4Prescriptions.setLayout(jPanel4PrescriptionsLayout);
        jPanel4PrescriptionsLayout.setHorizontalGroup(
            jPanel4PrescriptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4PrescriptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4PrescriptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2ListePrescription))
                .addContainerGap())
        );
        jPanel4PrescriptionsLayout.setVerticalGroup(
            jPanel4PrescriptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4PrescriptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2ListePrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel4Prescriptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1Observations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelOperations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7Resultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelOperations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1Observations, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4Prescriptions, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7Resultat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 100, 700, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPrecedentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrecedentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPrecedentActionPerformed

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
            java.util.logging.Logger.getLogger(ConsulterDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsulterDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsulterDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsulterDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsulterDM(employe, patient).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Observations;
    private javax.swing.JLabel Operations;
    private javax.swing.JLabel Prescriptio;
    private javax.swing.JLabel Prescriptio2;
    private javax.swing.JButton jButtonPrecedent;
    private javax.swing.JLabel jLabel1InfoPatients;
    private javax.swing.JLabel jLabel1Nomp;
    private javax.swing.JLabel jLabel1Prenom;
    private javax.swing.JLabel jLabel2DateDeNaissance;
    private javax.swing.JLabel jLabel2Nom;
    private javax.swing.JLabel jLabel2PrenomP;
    private javax.swing.JLabel jLabel2Service;
    private javax.swing.JLabel jLabel2Sexe;
    private javax.swing.JLabel jLabel3Sexep;
    private javax.swing.JLabel jLabel4DateP;
    private javax.swing.JLabel jLabel5ServiceP;
    private javax.swing.JList<String> jListObservation;
    private javax.swing.JList<String> jListPrescription;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel1Observations;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel3InfoPatient;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel4Prescriptions;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7Resultat;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelOperations;
    private javax.swing.JScrollPane jScrollPane1ListeObservations;
    private javax.swing.JScrollPane jScrollPane1ListeOperations;
    private javax.swing.JScrollPane jScrollPane2ListePrescription;
    private javax.swing.JScrollPane jScrollPane3ListeResultats;
    // End of variables declaration//GEN-END:variables
}
