/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecrans;

import projetsih.RecherchePatient;
import projetsih.RecherchePatient.*;
import java.awt.Dimension;
import java.util.ArrayList;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import projetsih.Fonction;
import projetsih.PHospitalier;
import projetsih.Patient;
import projetsih.SAdm;
import projetsih.SMed;

/**
 *
 * @author romel
 */
public class Identification extends javax.swing.JFrame {

    private ArrayList<String> p;
    private ArrayList<String> employe;

    /**
     * Creates new form Connexion
     */
    public Identification() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //this.setPreferredSize(new Dimension(639, 473));
        //this.setResizable(false);

        pack();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelEnTete = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jTextFieldIdentifiant = new javax.swing.JTextField();
        jTextFieldMdp = new javax.swing.JTextField();
        jLabelIdentifiant = new javax.swing.JLabel();
        jLabelMdp = new javax.swing.JLabel();
        jButtonValider = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelEnTete.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelTitle.setText("Identification");

        javax.swing.GroupLayout jPanelEnTeteLayout = new javax.swing.GroupLayout(jPanelEnTete);
        jPanelEnTete.setLayout(jPanelEnTeteLayout);
        jPanelEnTeteLayout.setHorizontalGroup(
            jPanelEnTeteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEnTeteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(289, 289, 289))
        );
        jPanelEnTeteLayout.setVerticalGroup(
            jPanelEnTeteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnTeteLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTextFieldIdentifiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdentifiantActionPerformed(evt);
            }
        });

        jLabelIdentifiant.setText("Identifiant : ");

        jLabelMdp.setText("Mot de passe :");

        jButtonValider.setText("Valider");
        jButtonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValiderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEnTete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(281, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelIdentifiant)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldIdentifiant))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelMdp)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(266, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(jButtonValider)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelEnTete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIdentifiant))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMdp))
                .addGap(53, 53, 53)
                .addComponent(jButtonValider)
                .addGap(0, 147, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldIdentifiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdentifiantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdentifiantActionPerformed

    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed
        RecherchePatient rp = new RecherchePatient();

        if (jTextFieldIdentifiant.getText().equals("") | jTextFieldMdp.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Identifiant et/ou mot de passe non renseigné");

        } else {
            if (rp.connex(jTextFieldIdentifiant.getText(), jTextFieldMdp.getText())) {

                ArrayList<String> nPS = new ArrayList<String>();
                nPS = rp.enTete(jTextFieldIdentifiant.getText(), jTextFieldMdp.getText());
                // nPS est une liste de string renvoyant en indice 0 le nom, en indice 1 le prénom et 
                // en indice 2 le service, en 3 la fonction du personnel se connectant
                
                employe=nPS; // pour garder en mémoire les infos du personnel
                
                boolean x = false;
                if (x == true && nPS.get(3) == "Secretaire_Médicale" ) {

                    //employe = new SMed(nPS.get(0), nPS.get(1), nPS.get(2),nPS.get(2) );
                    SmAccueil smed = new SmAccueil(nPS);
                    smed.setSize(this.getSize());
                    smed.setLocationRelativeTo(this);
                    this.dispose();
                    smed.setVisible(true);
                } else if (x == true && nPS.get(3) == "Secretaire_Admin" ) {

                    //sa = new SAdm(nPS.get(0), nPS.get(1));
                    SaAccueil sadm = new SaAccueil(nPS);
                    sadm.setSize(this.getSize());
                    sadm.setLocationRelativeTo(this);
                    this.dispose();
                    sadm.setVisible(true);
                } else {
                    //Fonction fonction=  Fonction.Interne; // remplacer fonction par nPS.get(3)

                    //employe = new PMedical( nPS.get(0), nPS.get(1), nPS.get(2), nPS.get(3));
                    RechercherPatient rechercher = new RechercherPatient(nPS);
                    rechercher.setSize(this.getSize());
                    rechercher.setLocationRelativeTo(this);
                    this.dispose();
                    rechercher.setVisible(true);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Identifiant et/ou mot de passe incorrect");
            }
        }
        //rp.connex(jTextFieldIdentifiant.getText(), jTextFieldMdp.getText());
    }//GEN-LAST:event_jButtonValiderActionPerformed

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
            java.util.logging.Logger.getLogger(Identification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Identification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Identification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Identification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Identification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonValider;
    private javax.swing.JLabel jLabelIdentifiant;
    private javax.swing.JLabel jLabelMdp;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelEnTete;
    private javax.swing.JTextField jTextFieldIdentifiant;
    private javax.swing.JTextField jTextFieldMdp;
    // End of variables declaration//GEN-END:variables

    public ArrayList<String> getEmploye() {
        return this.employe;
    }

}

/*if(jTextFieldIdentifiant.getText()=="" && jTextFieldMdp.getText() == ""){// bien prendre les bonnes valeurs  pour la sadmin
                 MedAnestAccueil accueilAnest = new MedAnestAccueil();

                accueilAnest.setSize(this.getSize());
                accueilAnest.setLocationRelativeTo(this);

                this.dispose();
                accueilAnest.setVisible(true);
            }*/
