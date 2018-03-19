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
public class SaAccueil extends javax.swing.JFrame {

    private static PersonnelHospitalier employe;
    private static Patients patient;

    /**
     * Creates new form SaAccueil
     *
     * @param employe
     */
    public SaAccueil(PersonnelHospitalier employe) {
        this.employe = employe;
        initComponents();
        jLabelNom.setText(employe.getNomph());
        jLabelPrenom.setText(employe.getPrenomph());
        //jLabelFonction.setText(employe.getFonction());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelEnTeteSa = new javax.swing.JPanel();
        Sa = new javax.swing.JLabel();
        jLabelNom = new javax.swing.JLabel();
        jLabelPrenom = new javax.swing.JLabel();
        jButtonDeconnexion = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonConsulterDMA = new javax.swing.JButton();
        jButtonCreeDMA = new javax.swing.JButton();
        jButtonFusionnerDMA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(200, 200));

        JPanelEnTeteSa.setBackground(new java.awt.Color(65, 131, 215));
        JPanelEnTeteSa.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Sa.setFont(new java.awt.Font("Wiggle", 0, 24)); // NOI18N
        Sa.setText("Secrétaire Adminstrative");

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

        javax.swing.GroupLayout JPanelEnTeteSaLayout = new javax.swing.GroupLayout(JPanelEnTeteSa);
        JPanelEnTeteSa.setLayout(JPanelEnTeteSaLayout);
        JPanelEnTeteSaLayout.setHorizontalGroup(
            JPanelEnTeteSaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelEnTeteSaLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addGroup(JPanelEnTeteSaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelEnTeteSaLayout.createSequentialGroup()
                        .addComponent(jLabelPrenom)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(JPanelEnTeteSaLayout.createSequentialGroup()
                        .addComponent(jLabelNom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                        .addComponent(Sa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                        .addComponent(jButtonDeconnexion)))
                .addContainerGap())
        );
        JPanelEnTeteSaLayout.setVerticalGroup(
            JPanelEnTeteSaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelEnTeteSaLayout.createSequentialGroup()
                .addGroup(JPanelEnTeteSaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelEnTeteSaLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(JPanelEnTeteSaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNom)
                            .addComponent(jButtonDeconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JPanelEnTeteSaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Sa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabelPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonConsulterDMA.setBackground(new java.awt.Color(228, 241, 254));
        jButtonConsulterDMA.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonConsulterDMA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Consulter 2.PNG"))); // NOI18N
        jButtonConsulterDMA.setText("Créer un séjour");
        jButtonConsulterDMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsulterDMAActionPerformed(evt);
            }
        });

        jButtonCreeDMA.setBackground(new java.awt.Color(228, 241, 254));
        jButtonCreeDMA.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonCreeDMA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CreerDossier2.PNG"))); // NOI18N
        jButtonCreeDMA.setText("Créer DMA");
        jButtonCreeDMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreeDMAActionPerformed(evt);
            }
        });

        jButtonFusionnerDMA.setBackground(new java.awt.Color(228, 241, 254));
        jButtonFusionnerDMA.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonFusionnerDMA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fusion.png"))); // NOI18N
        jButtonFusionnerDMA.setText("Fusion Service Urgence / Service Clinique");
        jButtonFusionnerDMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFusionnerDMAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonConsulterDMA, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCreeDMA, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFusionnerDMA, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonConsulterDMA, jButtonCreeDMA});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(jButtonConsulterDMA, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(jButtonCreeDMA, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(jButtonFusionnerDMA, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonConsulterDMA, jButtonCreeDMA});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JPanelEnTeteSa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanelEnTeteSa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsulterDMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsulterDMAActionPerformed
        // TODO add your handling code here:
        RechercherPatient rechercher = new RechercherPatient(employe);
        rechercher.setSize(this.getSize());
        rechercher.setLocationRelativeTo(this);
        this.dispose();
        rechercher.setVisible(true);
    }//GEN-LAST:event_jButtonConsulterDMAActionPerformed

    private void jButtonCreeDMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreeDMAActionPerformed
        // TODO add your handling code here:

        CreerDMA dma = new CreerDMA(employe, this);
        dma.setSize(this.getSize());
        dma.setLocationRelativeTo(this);
        this.dispose();
        dma.setVisible(true);

    }//GEN-LAST:event_jButtonCreeDMAActionPerformed

    private void jButtonDeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeconnexionActionPerformed
        // TODO add your handling code here:
        Identification iden = new Identification();
        iden.setSize(this.getSize());
        iden.setLocationRelativeTo(this);
        this.dispose();
        iden.setVisible(true);
    }//GEN-LAST:event_jButtonDeconnexionActionPerformed

    private void jButtonFusionnerDMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFusionnerDMAActionPerformed
        // TODO add your handling code here:
        FusionnerDossierUrgence fusion = new FusionnerDossierUrgence(employe, this);
        fusion.setSize(this.getSize());
        fusion.setLocationRelativeTo(this);
        this.dispose();
        fusion.setVisible(true);
    }//GEN-LAST:event_jButtonFusionnerDMAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelEnTeteSa;
    private javax.swing.JLabel Sa;
    private javax.swing.JButton jButtonConsulterDMA;
    private javax.swing.JButton jButtonCreeDMA;
    private javax.swing.JButton jButtonDeconnexion;
    private javax.swing.JButton jButtonFusionnerDMA;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelPrenom;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
