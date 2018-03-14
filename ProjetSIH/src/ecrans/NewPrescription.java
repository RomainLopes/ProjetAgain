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
public class NewPrescription extends javax.swing.JFrame {
   private static PersonnelHospitalier employe;
    private static Patients patient;


    /**
     * Creates new form NewPrescription
     */
    public NewPrescription(PersonnelHospitalier personnel, Patients patient) {
        initComponents();
        this.patient=patient;
        employe= personnel;
        jLabel3IPP.setText(patient.getIpp());
        jLabel4Service.setText(personnel.getService());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3Date = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1Titre = new javax.swing.JLabel();
        jLabel3IPP = new javax.swing.JLabel();
        jLabel4Service = new javax.swing.JLabel();
        jButtonPrecedent = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1Date = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2Prescription = new javax.swing.JLabel();
        jButton1Creer = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3Sexep = new javax.swing.JLabel();
        jLabel2Sexe = new javax.swing.JLabel();
        jLabel4DateP = new javax.swing.JLabel();
        jLabel2DateDeNaissance = new javax.swing.JLabel();
        jLabel1Nomp = new javax.swing.JLabel();
        jLabel2Nom = new javax.swing.JLabel();
        jLabel2PrenomP = new javax.swing.JLabel();
        jLabel1Prenom = new javax.swing.JLabel();
        jLabel1InfoPatients = new javax.swing.JLabel();

        jLabel3Date.setText("Date :");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(200, 200));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(65, 131, 215));

        jLabel1Titre.setFont(new java.awt.Font("Wiggle", 0, 24)); // NOI18N
        jLabel1Titre.setText("Création Prescription");

        jLabel3IPP.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3IPP.setText("IPP du patient ");

        jLabel4Service.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4Service.setText("Service");

        jButtonPrecedent.setBackground(new java.awt.Color(228, 241, 254));
        jButtonPrecedent.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonPrecedent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bouton précedent.PNG"))); // NOI18N
        jButtonPrecedent.setText("Précédent");
        jButtonPrecedent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrecedentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonPrecedent)
                .addGap(132, 132, 132)
                .addComponent(jLabel1Titre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3IPP, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4Service, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3IPP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4Service, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonPrecedent)
                            .addComponent(jLabel1Titre, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1030, 100);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setText("jTextField1");

        jLabel1Date.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1Date.setText("Date : ");

        jTextField2.setText("jTextField2");

        jLabel2Prescription.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2Prescription.setText("Prescription : ");

        jButton1Creer.setBackground(new java.awt.Color(228, 241, 254));
        jButton1Creer.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButton1Creer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CreerDossier2.PNG"))); // NOI18N
        jButton1Creer.setText("Créer");
        jButton1Creer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CreerActionPerformed(evt);
            }
        });

        jLabel3Sexep.setText("jLabel1");

        jLabel2Sexe.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2Sexe.setText("Sexe :");

        jLabel4DateP.setText("jLabel1");

        jLabel2DateDeNaissance.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2DateDeNaissance.setText("Date de Naissance : ");

        jLabel1Nomp.setText("jLabel1");

        jLabel2Nom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2Nom.setText("Nom : ");

        jLabel2PrenomP.setText("jLabel1");

        jLabel1Prenom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1Prenom.setText("Prénom : ");

        jLabel1InfoPatients.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel1InfoPatients.setText("Informations du patient ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1InfoPatients)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1Nomp, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2PrenomP, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2Sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3Sexep, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2DateDeNaissance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4DateP, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1InfoPatients)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3Sexep)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2Sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1Nomp)
                        .addComponent(jLabel2Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4DateP)
                    .addComponent(jLabel2DateDeNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2PrenomP)
                    .addComponent(jLabel1Prenom))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1Creer, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2Prescription)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1Date, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(76, 76, 76)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(428, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1Date, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2Prescription))
                .addGap(46, 46, 46)
                .addComponent(jButton1Creer, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 95, 1030, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1CreerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CreerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1CreerActionPerformed

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
            java.util.logging.Logger.getLogger(NewPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewPrescription(employe,patient).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Creer;
    private javax.swing.JButton jButtonPrecedent;
    private javax.swing.JLabel jLabel1Date;
    private javax.swing.JLabel jLabel1InfoPatients;
    private javax.swing.JLabel jLabel1Nomp;
    private javax.swing.JLabel jLabel1Prenom;
    private javax.swing.JLabel jLabel1Titre;
    private javax.swing.JLabel jLabel2DateDeNaissance;
    private javax.swing.JLabel jLabel2Nom;
    private javax.swing.JLabel jLabel2PrenomP;
    private javax.swing.JLabel jLabel2Prescription;
    private javax.swing.JLabel jLabel2Sexe;
    private javax.swing.JLabel jLabel3Date;
    private javax.swing.JLabel jLabel3IPP;
    private javax.swing.JLabel jLabel3Sexep;
    private javax.swing.JLabel jLabel4DateP;
    private javax.swing.JLabel jLabel4Service;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
