/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecrans;

import java.util.ArrayList;

/**
 *
 * @author lisad
 */
public class ConsulterObservation extends javax.swing.JFrame {
    private static ArrayList<String> employe;
    private static ArrayList<String> patient;
    private  ArrayList<String> test;

    /**
     * Creates new form ConsulterObservation
     */
    public ConsulterObservation(ArrayList<String> employe , ArrayList<String> patient) {
        initComponents();
        this.employe=employe;
        this.patient=patient;
        // mettre l'indice qui correspond à chaque information
        jLabel3IPP.setText(test.get(0)); 
        jLabelObservationP.setText(test.get(0));
        jLabelNomObservationP.setText(test.get(0)) ;
        jLabelDateP.setText(test.get(0));
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
        jLabel3IPP = new javax.swing.JLabel();
        jLabel4Service = new javax.swing.JLabel();
        jLabelObservationP = new javax.swing.JLabel();
        jLabelNomObservationP = new javax.swing.JLabel();
        jLabelNomObservation = new javax.swing.JLabel();
        jLabelDateP = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jLabelObservation = new javax.swing.JLabel();
        jButtonPrecedent = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3IPP.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3IPP.setText("IPP du patient ");
        jLabel3IPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3IPPMouseClicked(evt);
            }
        });

        jLabel4Service.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4Service.setText("Service");

        jLabelObservationP.setText("jLabel1");

        jLabelNomObservationP.setText("jLabel1");

        jLabelNomObservation.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelNomObservation.setText("Nom de l'observation :  ");

        jLabelDateP.setText("jLabel1");

        jLabelDate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelDate.setText("Date :");

        jLabelObservation.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelObservation.setText("Observations :");

        jButtonPrecedent.setBackground(new java.awt.Color(228, 241, 254));
        jButtonPrecedent.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonPrecedent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bouton précedent.PNG"))); // NOI18N
        jButtonPrecedent.setText("Précédent");
        jButtonPrecedent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrecedentActionPerformed(evt);
            }
        });

        jLabel1.setText("Observations ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelObservation, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate)
                    .addComponent(jLabelNomObservation))
                .addGap(106, 106, 106)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDateP, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomObservationP, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelObservationP, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonPrecedent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(281, 281, 281)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4Service, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3IPP, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPrecedent)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3IPP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4Service, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomObservation, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomObservationP))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDateP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelObservation, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelObservationP, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3IPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3IPPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3IPPMouseClicked

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
            java.util.logging.Logger.getLogger(ConsulterObservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsulterObservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsulterObservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsulterObservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsulterObservation(employe, patient).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPrecedent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3IPP;
    private javax.swing.JLabel jLabel4Service;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelDateP;
    private javax.swing.JLabel jLabelNomObservation;
    private javax.swing.JLabel jLabelNomObservationP;
    private javax.swing.JLabel jLabelObservation;
    private javax.swing.JLabel jLabelObservationP;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
