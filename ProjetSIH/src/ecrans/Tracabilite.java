/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecrans;

import GestionBDD.Patients;
import GestionBDD.PersonnelHospitalier;
import GestionBDD.RecherchePatient;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author lisad
 */
public class Tracabilite extends javax.swing.JFrame {
     private static PersonnelHospitalier employe;
    private static Patients patient;
    ArrayList<String> p;

    /**
     * Creates new form Tracabilite
     */
    public Tracabilite() {
        initComponents();
        p=new ArrayList<String>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1RecherchePatient = new javax.swing.JLabel();
        jLabel2Nom = new javax.swing.JLabel();
        jLabel3Prenom = new javax.swing.JLabel();
        jTextFieldNom = new javax.swing.JTextField();
        jTextFieldPrenom = new javax.swing.JTextField();
        jButtonRechercher = new javax.swing.JButton();
        JPanelEnTeteMedTech = new javax.swing.JPanel();
        jLabelFonction = new javax.swing.JLabel();
        jLabelNom = new javax.swing.JLabel();
        jLabelPrenom = new javax.swing.JLabel();
        jButtonDeconnexion = new javax.swing.JButton();
        jButtonAccueil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1RecherchePatient.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel1RecherchePatient.setText("Recherche d'un patient :");

        jLabel2Nom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2Nom.setText("Nom : ");

        jLabel3Prenom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3Prenom.setText("Prénom : ");

        jTextFieldPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrenomActionPerformed(evt);
            }
        });

        jButtonRechercher.setBackground(new java.awt.Color(228, 241, 254));
        jButtonRechercher.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonRechercher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rechercher 2.PNG"))); // NOI18N
        jButtonRechercher.setText("Rechercher");
        jButtonRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRechercherActionPerformed(evt);
            }
        });

        JPanelEnTeteMedTech.setBackground(new java.awt.Color(65, 131, 215));
        JPanelEnTeteMedTech.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelFonction.setFont(new java.awt.Font("Wiggle", 0, 24)); // NOI18N
        jLabelFonction.setText("Gérant CHU");

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
                        .addGap(129, 129, 129)
                        .addComponent(jLabelFonction))
                    .addComponent(jLabelPrenom)
                    .addComponent(jLabelNom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(jButtonDeconnexion)
                .addGap(8, 8, 8))
        );
        JPanelEnTeteMedTechLayout.setVerticalGroup(
            JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                .addGroup(JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabelNom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelEnTeteMedTechLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabelFonction, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 31, Short.MAX_VALUE))
                        .addGroup(JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonDeconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JPanelEnTeteMedTech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPrenom))
                            .addComponent(jLabel1RecherchePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jButtonRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanelEnTeteMedTech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel1RecherchePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jButtonRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrenomActionPerformed

    private void jButtonRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRechercherActionPerformed
        // TODO add your handling code here:
        RecherchePatient rp = new RecherchePatient();

        ArrayList<String> resultatRecherche = new ArrayList<String>();
        ArrayList<String> resultatAffiche = new ArrayList<String>();
        /*
        System.out.println(" avant recheche");
        */
        resultatRecherche = rp.recherchePatientNomPrenom(jTextFieldNom.getText(), jTextFieldPrenom.getText());
        for (int i = 0; i < resultatRecherche.size(); i += 2) {
            resultatAffiche.add(resultatRecherche.get(i));
        }
        /*
        System.out.println(" après recherche ");
        */
        DefaultListModel modele = new DefaultListModel();
        for (String i : resultatAffiche) {
            modele.addElement(i);
        }
        JList jListpatients= new JList();
        jListpatients.setModel(modele);

        ArrayList<String> infoPatient = new ArrayList<String>();
        infoPatient = rp.enTetePatient(resultatRecherche.get(1));
        p = infoPatient;
        //this.p= new Patient(infoPatient.get(0),infoPatient.get(1),infoPatient.get(2));

        for (int i = 0; i < infoPatient.size(); i++) {
            System.out.println(infoPatient.get(i) + " \t \n");
        }
        //ArrayList<String> nPS = new ArrayList<String>();
        /*nPS = rp.douille(jTextFieldIdentifiant.getText(), jTextFieldMdp.getText());
        for (int i = 1; i <= nPS.size(); i++) {
            System.out.println(nPS.get(i) + " \t \n");
        }*/
        boolean x = false;
        if (x == true/* fonction == Fonction.Secretaire_Médicale*/) {
            Identification f = new Identification();
            //this.fenetrePrecedente= new SmAccueil(f);

            //SMed smed= new SMed(nPS.get(0), nPS.get(1), nPS.get(2));
            //SMed employe= new SMed(fenetrePrecedente.getEmploye().getNom(),fenetrePrecedente.getEmploye().getPrenom(),fenetrePrecedente.getEmploye().getService())
            //  this.employe= fenetrePrecedente.getEmploye();
            JOptionPane.showMessageDialog(null, "Dossier médical existant");
            ConsulterDM sadm = new ConsulterDM(employe,patient);
            sadm.setSize(this.getSize());
            sadm.setLocationRelativeTo(this);
            this.dispose();
            sadm.setVisible(true);

        } else if (x == true/* fonction == Fonction.Secretaire_admin*/) {

            ConsulterDMA sadm = new ConsulterDMA(employe,patient);
            sadm.setSize(this.getSize());
            sadm.setLocationRelativeTo(this);
            this.dispose();
            sadm.setVisible(true);

        } else if (x == true/* fonction == Fonction.Interne*/) {

            InterneAccueil inte = new InterneAccueil(employe,patient);
            inte.setSize(this.getSize());
            inte.setLocationRelativeTo(this);
            this.dispose();
            inte.setVisible(true);

        } else if (x == true/* fonction == Fonction.Infirmier*/) {

            InfirmierAccueil inte = new InfirmierAccueil(employe,patient);
            inte.setSize(this.getSize());
            inte.setLocationRelativeTo(this);
            this.dispose();
            inte.setVisible(true);
        } else { // pH
            if (x == true/* pH.service.getType()=="Clinique"*/) {

                MedClinAccueil inte = new MedClinAccueil(employe,patient);
                inte.setSize(this.getSize());
                inte.setLocationRelativeTo(this);
                this.dispose();
                inte.setVisible(true);
            } else if (x == true/* pH.service.getNom()=="Radiologie"*/) {

                MedRadioAccueil inte = new MedRadioAccueil(employe,patient);
                inte.setSize(this.getSize());
                inte.setLocationRelativeTo(this);
                this.dispose();
                inte.setVisible(true);
            } else if (x == true/* pH.service.getNom()=="Anesthésie"*/) {

                MedAnestAccueil inte = new MedAnestAccueil(employe,patient);
                inte.setSize(this.getSize());
                inte.setLocationRelativeTo(this);
                this.dispose();
                inte.setVisible(true);
            } else if (x == true/* pH.service.getType()=="Médico-technique"*/) {

                MedTechAccueil inte = new MedTechAccueil(employe,patient);
                inte.setSize(this.getSize());
                inte.setLocationRelativeTo(this);
                this.dispose();
                inte.setVisible(true);
            }
        }
    }//GEN-LAST:event_jButtonRechercherActionPerformed

    private void jButtonDeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeconnexionActionPerformed
        // TODO add your handling code here:
        Identification iden = new Identification();
        iden.setSize(this.getSize());
        iden.setLocationRelativeTo(this);
        this.dispose();
        iden.setVisible(true);
    }//GEN-LAST:event_jButtonDeconnexionActionPerformed

    private void jButtonAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAccueilActionPerformed
        Identification id = new Identification();
        id.setSize(this.getSize());
        id.setLocationRelativeTo(this);
        this.dispose();
        id.setVisible(true);
    }//GEN-LAST:event_jButtonAccueilActionPerformed

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
            java.util.logging.Logger.getLogger(Tracabilite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tracabilite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tracabilite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tracabilite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tracabilite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelEnTeteMedTech;
    private javax.swing.JButton jButtonAccueil;
    private javax.swing.JButton jButtonDeconnexion;
    private javax.swing.JButton jButtonRechercher;
    private javax.swing.JLabel jLabel1RecherchePatient;
    private javax.swing.JLabel jLabel2Nom;
    private javax.swing.JLabel jLabel3Prenom;
    private javax.swing.JLabel jLabelFonction;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelPrenom;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldPrenom;
    // End of variables declaration//GEN-END:variables
}
