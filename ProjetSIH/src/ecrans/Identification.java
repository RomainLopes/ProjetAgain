/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecrans;

import GestionBDD.BDDconnection;
import GestionBDD.PersonnelHospitalier;
import GestionBDD.PersonnelHospitalierDAO;
import GestionBDD.RecherchePatient;
import java.awt.Dimension;
import java.util.ArrayList;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;

/**
 *
 * @author romel
 */
public class Identification extends javax.swing.JFrame {

    private PersonnelHospitalier ph;

    private ArrayList<String> p;
    private ArrayList<String> phs;

    /**
     * Creates new form Connexion
     */
    public Identification() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //this.setPreferredSize(new Dimension(639, 473));
        //this.setResizable(false);
        PersonnelHospitalier ph = new PersonnelHospitalier();
        jTextFieldMdp.setText("");
        

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
        jPanel1 = new javax.swing.JPanel();
        logoHopital = new javax.swing.JLabel();
        jTextFieldIdentifiant = new javax.swing.JTextField();
        jLabelMdp = new javax.swing.JLabel();
        logoHIR = new javax.swing.JLabel();
        jLabelIdentifiant = new javax.swing.JLabel();
        jButtonValider = new javax.swing.JButton();
        jTextFieldMdp = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(250, 250));

        jPanelEnTete.setBackground(new java.awt.Color(65, 131, 215));
        jPanelEnTete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEnTete.setAlignmentX(0.0F);
        jPanelEnTete.setAlignmentY(0.0F);

        jLabelTitle.setFont(new java.awt.Font("Wiggle", 0, 24)); // NOI18N
        jLabelTitle.setText("Identification");

        javax.swing.GroupLayout jPanelEnTeteLayout = new javax.swing.GroupLayout(jPanelEnTete);
        jPanelEnTete.setLayout(jPanelEnTeteLayout);
        jPanelEnTeteLayout.setHorizontalGroup(
            jPanelEnTeteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEnTeteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEnTeteLayout.setVerticalGroup(
            jPanelEnTeteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnTeteLayout.createSequentialGroup()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 1000));

        logoHopital.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plainsboro blanc.PNG"))); // NOI18N

        jTextFieldIdentifiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdentifiantActionPerformed(evt);
            }
        });

        jLabelMdp.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelMdp.setText("Mot de passe :");

        logoHIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N

        jLabelIdentifiant.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelIdentifiant.setText("Identifiant : ");

        jButtonValider.setBackground(new java.awt.Color(228, 241, 254));
        jButtonValider.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonValider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Valider2.PNG"))); // NOI18N
        jButtonValider.setText("Valider");
        jButtonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValiderActionPerformed(evt);
            }
        });

        jTextFieldMdp.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoHopital)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelIdentifiant)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelMdp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonValider)
                                    .addComponent(jTextFieldMdp))))
                        .addContainerGap(144, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoHIR)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoHopital))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelIdentifiant)
                            .addComponent(jTextFieldIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelMdp)
                            .addComponent(jTextFieldMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jButtonValider))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logoHIR)))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
                    .addComponent(jPanelEnTete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelEnTete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldIdentifiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdentifiantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdentifiantActionPerformed

    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed
        RecherchePatient rp = new RecherchePatient();
        PersonnelHospitalierDAO phd = new PersonnelHospitalierDAO(BDDconnection.getInstance());

        if (jTextFieldIdentifiant.getText().equals("") | jTextFieldMdp.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Identifiant et/ou mot de passe non renseigné");

        } else {
            if (rp.connex(jTextFieldIdentifiant.getText(), jTextFieldMdp.getText())) {

                ph = phd.connex(jTextFieldIdentifiant.getText(), jTextFieldMdp.getText());
                //ArrayList<String> nPS = new ArrayList<String>();
                //nPS = rp.enTete(jTextFieldIdentifiant.getText(), jTextFieldMdp.getText());
                // nPS est une liste de string renvoyant en indice 0 le nom, en indice 1 le prénom et 
                // en indice 2 le service, en 3 la fonction du personnel se connectant
                //phs = nPS; // pour garder en mémoire les infos du personnel nom prenom service fonction

                boolean x = true;
               // System.out.println(ph.getFonction());
                
                if (x == true && "Secretaire medicale".equals(ph.getFonction())) {

                    //employe = new SMed(nPS.get(0), nPS.get(1), nPS.get(2),nPS.get(2) );
                    SmAccueil smed = new SmAccueil(ph);
                    smed.setSize(this.getSize());
                    smed.setLocationRelativeTo(this);
                    this.dispose();
                    smed.setVisible(true);
                } else if (x == true && "Administration".equals(ph.getFonction())) {

                    //sa = new SAdm(nPS.get(0), nPS.get(1));
                    SaAccueil sadm = new SaAccueil(ph);
                    
                    sadm.setSize(this.getSize());
                    sadm.setLocationRelativeTo(this);
                    this.dispose();
                    sadm.setVisible(true);
                } else {
                    //Fonction fonction=  Fonction.Interne; // remplacer fonction par nPS.get(3)

                    //employe = new PMedical( nPS.get(0), nPS.get(1), nPS.get(2), nPS.get(3));
                    RechercherPatient rechercher = new RechercherPatient(ph);
                    rechercher.setSize(this.getSize());
                    rechercher.setLocationRelativeTo(this);
                    this.dispose();
                    rechercher.setVisible(true);
                }

            }
            /*else {
                JOptionPane.showMessageDialog(null, "Identifiant et/ou mot de passe incorrect");
            }*/
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelEnTete;
    private javax.swing.JTextField jTextFieldIdentifiant;
    private javax.swing.JPasswordField jTextFieldMdp;
    private javax.swing.JLabel logoHIR;
    private javax.swing.JLabel logoHopital;
    // End of variables declaration//GEN-END:variables

    public ArrayList<String> getEmploye() {
        return this.phs;
    }

}

/*if(jTextFieldIdentifiant.getText()=="" && jTextFieldMdp.getText() == ""){// bien prendre les bonnes valeurs  pour la sadmin
                 MedAnestAccueil accueilAnest = new MedAnestAccueil();

                accueilAnest.setSize(this.getSize());
                accueilAnest.setLocationRelativeTo(this);

                this.dispose();
                accueilAnest.setVisible(true);
            }*/
