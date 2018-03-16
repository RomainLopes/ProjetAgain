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
 * @author romel
 */
public class SmAccueil extends javax.swing.JFrame {
     private static PersonnelHospitalier employe;
    private static Patients patient;


    /**
     * Creates new form SmAccueil
     */
    public SmAccueil(PersonnelHospitalier personnel) {
        // service get(2) fonction get(3)
        initComponents();
        employe=personnel;
        jLabelNom.setText(personnel.getNomph());
        jLabelPrenom.setText(personnel.getPrenomph());
       // jLabelFonction.setText(personnel.getFonction());
        jLabelService.setText(personnel.getService()); 
        
      /*  jLabelNom.setText(((Identification) fenetrePrecedente).getEmploye().getNom());
        jLabelPrenom.setText(((Identification) fenetrePrecedente).getEmploye().getPrenom());
        jLabelService.setText(((Identification) fenetrePrecedente).getEmploye().getService().toString());*/
 
    }

    SmAccueil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelEnTeteSm = new javax.swing.JPanel();
        jLabelSm = new javax.swing.JLabel();
        jLabelNom = new javax.swing.JLabel();
        jLabelPrenom = new javax.swing.JLabel();
        jButtonDeconnexion = new javax.swing.JButton();
        jButtonAccueil = new javax.swing.JButton();
        jLabelService = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonConsulterDM = new javax.swing.JButton();
        jButtonCreeDM = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(200, 200));
        setPreferredSize(new java.awt.Dimension(1000, 1000));
        setResizable(false);
        getContentPane().setLayout(null);

        JPanelEnTeteSm.setBackground(new java.awt.Color(65, 131, 215));
        JPanelEnTeteSm.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelSm.setFont(new java.awt.Font("Wiggle", 0, 24)); // NOI18N
        jLabelSm.setText("Secrétaire Médicale");

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

        javax.swing.GroupLayout JPanelEnTeteSmLayout = new javax.swing.GroupLayout(JPanelEnTeteSm);
        JPanelEnTeteSm.setLayout(JPanelEnTeteSmLayout);
        JPanelEnTeteSmLayout.setHorizontalGroup(
            JPanelEnTeteSmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelEnTeteSmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAccueil)
                .addGroup(JPanelEnTeteSmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelEnTeteSmLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(JPanelEnTeteSmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPrenom)
                            .addComponent(jLabelNom)))
                    .addGroup(JPanelEnTeteSmLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabelSm)
                        .addGap(160, 160, 160)
                        .addComponent(jLabelService)
                        .addGap(53, 53, 53)
                        .addComponent(jButtonDeconnexion)))
                .addGap(22, 218, Short.MAX_VALUE))
        );
        JPanelEnTeteSmLayout.setVerticalGroup(
            JPanelEnTeteSmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelEnTeteSmLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelEnTeteSmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPanelEnTeteSmLayout.createSequentialGroup()
                        .addGroup(JPanelEnTeteSmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelSm, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPanelEnTeteSmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelService)
                                .addComponent(jButtonDeconnexion)))
                        .addGap(4, 4, 4)
                        .addComponent(jLabelNom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(JPanelEnTeteSm);
        JPanelEnTeteSm.setBounds(0, 0, 1170, 113);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonConsulterDM.setBackground(new java.awt.Color(228, 241, 254));
        jButtonConsulterDM.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonConsulterDM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Consulter 2.PNG"))); // NOI18N
        jButtonConsulterDM.setText("Consulter DM");
        jButtonConsulterDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsulterDMActionPerformed(evt);
            }
        });

        jButtonCreeDM.setBackground(new java.awt.Color(228, 241, 254));
        jButtonCreeDM.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonCreeDM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CreerDossier2.PNG"))); // NOI18N
        jButtonCreeDM.setText("Créer DM");
        jButtonCreeDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreeDMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonConsulterDM, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCreeDM, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(481, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jButtonConsulterDM, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addComponent(jButtonCreeDM, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(323, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 106, 1180, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAccueilActionPerformed
     
    }//GEN-LAST:event_jButtonAccueilActionPerformed

    private void jButtonConsulterDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsulterDMActionPerformed
        // TODO add your handling code here:
        RechercherPatient rechercher = new RechercherPatient(employe);
                    rechercher.setSize(this.getSize());
                    rechercher.setLocationRelativeTo(this);
                    this.dispose();
                    rechercher.setVisible(true);
    }//GEN-LAST:event_jButtonConsulterDMActionPerformed

    private void jButtonCreeDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreeDMActionPerformed
        // TODO add your handling code here:
        CreerDM rechercher = new CreerDM(employe,patient);
                    rechercher.setSize(this.getSize());
                    rechercher.setLocationRelativeTo(this);
                    this.dispose();
                    rechercher.setVisible(true);
    }//GEN-LAST:event_jButtonCreeDMActionPerformed

    private void jButtonDeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeconnexionActionPerformed
        // TODO add your handling code here:
        Identification iden = new Identification();
                    iden.setSize(this.getSize());
                    iden.setLocationRelativeTo(this);
                    this.dispose();
                    iden.setVisible(true);
    }//GEN-LAST:event_jButtonDeconnexionActionPerformed

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
            java.util.logging.Logger.getLogger(SmAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SmAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SmAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SmAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                
                try {
                    new SaAccueil(employe).setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelEnTeteSm;
    private javax.swing.JButton jButtonAccueil;
    private javax.swing.JButton jButtonConsulterDM;
    private javax.swing.JButton jButtonCreeDM;
    private javax.swing.JButton jButtonDeconnexion;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelPrenom;
    private javax.swing.JLabel jLabelService;
    private javax.swing.JLabel jLabelSm;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the p
     */
}
