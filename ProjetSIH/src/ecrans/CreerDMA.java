/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecrans;

/**
 *
 * @author lisad
 */
public class CreerDMA extends javax.swing.JFrame {

    /**
     * Creates new form CreerDMA
     */
    public CreerDMA() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1ListePrestaMT = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3InfoPatient = new javax.swing.JPanel();
        jLabel1Prenom = new javax.swing.JLabel();
        jLabel2Nom = new javax.swing.JLabel();
        jLabel2Sexe = new javax.swing.JLabel();
        jLabel2DateDeNaissance = new javax.swing.JLabel();
        jLabel1InfoPatients = new javax.swing.JLabel();
        jTextField1Nom = new javax.swing.JTextField();
        jTextField4Sexe = new javax.swing.JTextField();
        jTextField4DDN1 = new javax.swing.JTextField();
        jTextField4Prenom = new javax.swing.JTextField();
        jLabel2IPP = new javax.swing.JLabel();
        jTextField1IPP = new javax.swing.JTextField();
        jLabel2Adresse = new javax.swing.JLabel();
        jLabel2Localisation = new javax.swing.JLabel();
        jTextFieldadresse = new javax.swing.JTextField();
        jTextField4Localisation = new javax.swing.JTextField();
        jPanel2CreationDMA = new javax.swing.JPanel();
        jLabel1NoSejour = new javax.swing.JLabel();
        jTextField1NoSejour = new javax.swing.JTextField();
        jLabel3Type = new javax.swing.JLabel();
        jTextField2Type = new javax.swing.JTextField();
        jLabel2NomPH = new javax.swing.JLabel();
        jTextField3NomPH = new javax.swing.JTextField();
        jLabel4LettreSortie = new javax.swing.JLabel();
        jTextField4LettreSortie = new javax.swing.JTextField();
        jLabel5PrestaMT = new javax.swing.JLabel();
        jScrollPane1ListePrestaMT1 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1ListePrestaMT.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Création d'un dossier médico-administratif");

        jPanel3InfoPatient.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1Prenom.setText("Prénom : ");

        jLabel2Nom.setText("Nom : ");

        jLabel2Sexe.setText("Sexe :");

        jLabel2DateDeNaissance.setText("Date de Naissance : ");

        jLabel1InfoPatients.setText("Informations générales du patient ");

        jTextField1Nom.setText("jTextField1");

        jTextField4Sexe.setText("jTextField1");
        jTextField4Sexe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4SexeActionPerformed(evt);
            }
        });

        jTextField4DDN1.setText("jTextField1");

        jTextField4Prenom.setText("jTextField1");

        jLabel2IPP.setText("IPP :");

        jTextField1IPP.setText("jTextField1");

        jLabel2Adresse.setText("Adresse : ");

        jLabel2Localisation.setText("Localisation :");

        jTextFieldadresse.setText("jTextField1");
        jTextFieldadresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldadresseActionPerformed(evt);
            }
        });

        jTextField4Localisation.setText("jTextField1");
        jTextField4Localisation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4LocalisationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3InfoPatientLayout = new javax.swing.GroupLayout(jPanel3InfoPatient);
        jPanel3InfoPatient.setLayout(jPanel3InfoPatientLayout);
        jPanel3InfoPatientLayout.setHorizontalGroup(
            jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                        .addComponent(jLabel1InfoPatients)
                        .addGap(96, 96, 96)
                        .addComponent(jLabel2IPP, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1IPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                        .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                .addComponent(jLabel2Sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4Sexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(jLabel2Adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                .addComponent(jLabel2DateDeNaissance)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4DDN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2Localisation, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldadresse)
                            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                .addComponent(jTextField4Localisation, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel3InfoPatientLayout.setVerticalGroup(
            jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3InfoPatientLayout.createSequentialGroup()
                .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1InfoPatients)
                    .addComponent(jLabel2IPP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1IPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2Sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4Sexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2Adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldadresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1Prenom)
                    .addComponent(jLabel2DateDeNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4DDN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2Localisation, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4Localisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2CreationDMA.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1NoSejour.setText("Numéro de séjour : ");

        jTextField1NoSejour.setText("jTextField1");
        jTextField1NoSejour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1NoSejourActionPerformed(evt);
            }
        });

        jLabel3Type.setText("Type :");

        jTextField2Type.setText("jTextField1");
        jTextField2Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2TypeActionPerformed(evt);
            }
        });

        jLabel2NomPH.setText("Nom du Praticien Hospitalier responsable :");

        jTextField3NomPH.setText("jTextField1");

        jLabel4LettreSortie.setText("Lettre de sortie ");

        jTextField4LettreSortie.setText("jTextField1");

        jLabel5PrestaMT.setText("Prestation(s) médico-technique(s)");

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1ListePrestaMT1.setViewportView(jList2);

        javax.swing.GroupLayout jPanel2CreationDMALayout = new javax.swing.GroupLayout(jPanel2CreationDMA);
        jPanel2CreationDMA.setLayout(jPanel2CreationDMALayout);
        jPanel2CreationDMALayout.setHorizontalGroup(
            jPanel2CreationDMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2CreationDMALayout.createSequentialGroup()
                .addGroup(jPanel2CreationDMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2CreationDMALayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2CreationDMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2CreationDMALayout.createSequentialGroup()
                                .addComponent(jLabel4LettreSortie, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4LettreSortie, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2CreationDMALayout.createSequentialGroup()
                                .addComponent(jLabel2NomPH, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3NomPH, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2CreationDMALayout.createSequentialGroup()
                                .addGroup(jPanel2CreationDMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3Type, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1NoSejour, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2CreationDMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1NoSejour, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2Type, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2CreationDMALayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5PrestaMT, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1ListePrestaMT1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2CreationDMALayout.setVerticalGroup(
            jPanel2CreationDMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2CreationDMALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2CreationDMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1NoSejour, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1NoSejour))
                .addGap(18, 18, 18)
                .addGroup(jPanel2CreationDMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3Type, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2Type))
                .addGap(18, 18, 18)
                .addGroup(jPanel2CreationDMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2NomPH, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jTextField3NomPH))
                .addGroup(jPanel2CreationDMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2CreationDMALayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4LettreSortie, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2CreationDMALayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jTextField4LettreSortie, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2CreationDMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5PrestaMT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1ListePrestaMT1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3InfoPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2CreationDMA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3InfoPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2CreationDMA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(356, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4SexeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4SexeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4SexeActionPerformed

    private void jTextFieldadresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldadresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldadresseActionPerformed

    private void jTextField4LocalisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4LocalisationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4LocalisationActionPerformed

    private void jTextField1NoSejourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1NoSejourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1NoSejourActionPerformed

    private void jTextField2TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2TypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2TypeActionPerformed

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
            java.util.logging.Logger.getLogger(CreerDMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreerDMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreerDMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreerDMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreerDMA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1InfoPatients;
    private javax.swing.JLabel jLabel1NoSejour;
    private javax.swing.JLabel jLabel1Prenom;
    private javax.swing.JLabel jLabel2Adresse;
    private javax.swing.JLabel jLabel2DateDeNaissance;
    private javax.swing.JLabel jLabel2IPP;
    private javax.swing.JLabel jLabel2Localisation;
    private javax.swing.JLabel jLabel2Nom;
    private javax.swing.JLabel jLabel2NomPH;
    private javax.swing.JLabel jLabel2Sexe;
    private javax.swing.JLabel jLabel3Type;
    private javax.swing.JLabel jLabel4LettreSortie;
    private javax.swing.JLabel jLabel5PrestaMT;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2CreationDMA;
    private javax.swing.JPanel jPanel3InfoPatient;
    private javax.swing.JScrollPane jScrollPane1ListePrestaMT;
    private javax.swing.JScrollPane jScrollPane1ListePrestaMT1;
    private javax.swing.JTextField jTextField1IPP;
    private javax.swing.JTextField jTextField1NoSejour;
    private javax.swing.JTextField jTextField1Nom;
    private javax.swing.JTextField jTextField2Type;
    private javax.swing.JTextField jTextField3NomPH;
    private javax.swing.JTextField jTextField4DDN1;
    private javax.swing.JTextField jTextField4LettreSortie;
    private javax.swing.JTextField jTextField4Localisation;
    private javax.swing.JTextField jTextField4Prenom;
    private javax.swing.JTextField jTextField4Sexe;
    private javax.swing.JTextField jTextFieldadresse;
    // End of variables declaration//GEN-END:variables
}
