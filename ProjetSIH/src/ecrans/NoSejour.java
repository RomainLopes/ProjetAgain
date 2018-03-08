/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecrans;

import GestionBDD.Patients;
import GestionBDD.PersonnelHospitalier;

/**
 *
 * @author lisad
 */
public class NoSejour extends javax.swing.JFrame {
      private static PersonnelHospitalier employe;
    private static Patients patient;

    /**
     * Creates new form NoSejour
     */
    public NoSejour(PersonnelHospitalier personnel, Patients patient) {
        initComponents();
        this.patient= patient;
        employe=personnel;
        
          jLabel1Nomp.setText(patient.getNompatient());
        jLabel2PrenomP.setText(patient.getPrenompatient());
        jLabel4DateP.setText(patient.getDateDeNaissance());
        jLabel3Sexep.setText(patient.getSexe());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1NoSejourP = new javax.swing.JLabel();
        jLabel1NoSejour = new javax.swing.JLabel();
        jLabel3Type = new javax.swing.JLabel();
        jLabel1NomPHrespo = new javax.swing.JLabel();
        jLabel2NomPH = new javax.swing.JLabel();
        jLabel1LettreSortiep = new javax.swing.JLabel();
        jLabel4LettreSortie = new javax.swing.JLabel();
        jScrollPane1ListePrestaMT = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel5PrestaMT = new javax.swing.JLabel();
        jPanel3InfoPatient = new javax.swing.JPanel();
        jLabel1Prenom = new javax.swing.JLabel();
        jLabel2Nom = new javax.swing.JLabel();
        jLabel2Sexe = new javax.swing.JLabel();
        jLabel2DateDeNaissance = new javax.swing.JLabel();
        jLabel1InfoPatients = new javax.swing.JLabel();
        jLabel1Nomp = new javax.swing.JLabel();
        jLabel2PrenomP = new javax.swing.JLabel();
        jLabel3Sexep = new javax.swing.JLabel();
        jLabel4DateP = new javax.swing.JLabel();
        jButtonPrecedent = new javax.swing.JButton();
        jLabelNosejor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1NoSejourP.setText("jLabel1");

        jLabel1NoSejour.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1NoSejour.setText("Numéro de séjour : ");

        jLabel3Type.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3Type.setText("Type :");

        jLabel1NomPHrespo.setText("jLabel1");

        jLabel2NomPH.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2NomPH.setText("Nom du Praticien Hospitalier responsable :");

        jLabel1LettreSortiep.setText("jLabel1");

        jLabel4LettreSortie.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4LettreSortie.setText("Lettre de sortie ");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1ListePrestaMT.setViewportView(jList1);

        jLabel5PrestaMT.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5PrestaMT.setText("Prestation(s) médico-technique(s)");

        jPanel3InfoPatient.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1Prenom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1Prenom.setText("Prénom : ");

        jLabel2Nom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2Nom.setText("Nom : ");

        jLabel2Sexe.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2Sexe.setText("Sexe :");

        jLabel2DateDeNaissance.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2DateDeNaissance.setText("Date de Naissance : ");

        jLabel1InfoPatients.setText("Informations du patient ");

        jLabel1Nomp.setText("jLabel1");

        jLabel2PrenomP.setText("jLabel1");

        jLabel3Sexep.setText("jLabel1");

        jLabel4DateP.setText("jLabel1");

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
                            .addComponent(jLabel2Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2PrenomP, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1Nomp, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                .addComponent(jLabel2Sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3Sexep, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                .addComponent(jLabel2DateDeNaissance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4DateP, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(278, Short.MAX_VALUE))
        );
        jPanel3InfoPatientLayout.setVerticalGroup(
            jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3InfoPatientLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1InfoPatients)
                .addGap(29, 29, 29)
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
        );

        jButtonPrecedent.setBackground(new java.awt.Color(228, 241, 254));
        jButtonPrecedent.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonPrecedent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bouton précedent.PNG"))); // NOI18N
        jButtonPrecedent.setText("Précédent");
        jButtonPrecedent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrecedentActionPerformed(evt);
            }
        });

        jLabelNosejor.setText("jLabel1");

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1NoSejour, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3Type, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2NomPH, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4LettreSortie, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5PrestaMT, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelNosejor)
                                .addGap(635, 635, 635)
                                .addComponent(jLabel1NoSejourP, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1ListePrestaMT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1LettreSortiep, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1NomPHrespo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel3InfoPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonPrecedent)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonPrecedent)
                .addGap(9, 9, 9)
                .addComponent(jPanel3InfoPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1NoSejour, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1NoSejourP)
                    .addComponent(jLabelNosejor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3Type, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2NomPH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1NomPHrespo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1LettreSortiep, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4LettreSortie, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1ListePrestaMT, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5PrestaMT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 761, 500);

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
            java.util.logging.Logger.getLogger(NoSejour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NoSejour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NoSejour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NoSejour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NoSejour(employe,patient).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPrecedent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1InfoPatients;
    private javax.swing.JLabel jLabel1LettreSortiep;
    private javax.swing.JLabel jLabel1NoSejour;
    private javax.swing.JLabel jLabel1NoSejourP;
    private javax.swing.JLabel jLabel1NomPHrespo;
    private javax.swing.JLabel jLabel1Nomp;
    private javax.swing.JLabel jLabel1Prenom;
    private javax.swing.JLabel jLabel2DateDeNaissance;
    private javax.swing.JLabel jLabel2Nom;
    private javax.swing.JLabel jLabel2NomPH;
    private javax.swing.JLabel jLabel2PrenomP;
    private javax.swing.JLabel jLabel2Sexe;
    private javax.swing.JLabel jLabel3Sexep;
    private javax.swing.JLabel jLabel3Type;
    private javax.swing.JLabel jLabel4DateP;
    private javax.swing.JLabel jLabel4LettreSortie;
    private javax.swing.JLabel jLabel5PrestaMT;
    private javax.swing.JLabel jLabelNosejor;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3InfoPatient;
    private javax.swing.JScrollPane jScrollPane1ListePrestaMT;
    // End of variables declaration//GEN-END:variables
}
