/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecrans;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import projetsih.PMedical;
import projetsih.Patient;
import projetsih.RecherchePatient;
import projetsih.SAdm;
import projetsih.SMed;

/**
 *
 * @author lisad
 */
public class RechercherPatient extends javax.swing.JFrame {

    /**
     * Creates new form RechercherPatient
     */
     private Patient p;
    private PMedical employe;
    private SAdm sa;
    private SmAccueil fenetrePreSm;
    private SaAccueil fenetrePreSa;
    private Identification fenetrePrePh;
    
    public RechercherPatient(ArrayList<String> nps) {
        RecherchePatient rp = new RecherchePatient();
        
        initComponents();
        //employe= fenetrePreSm.getEmploye();
        jLabelNom.setText(nps.get(0));
        jLabelPrenom.setText(nps.get(1));
        jLabelFonction.setText(nps.get(2));
        jLabelService.setText(nps.get(3)); 
    }
    
    public RechercherPatient(Identification fenetre) {
        RecherchePatient rp = new RecherchePatient();
        this.fenetrePrePh=fenetre;
        initComponents();
        employe= fenetrePrePh.getEmploye();
        jLabelNom.setText(employe.getNom());
        jLabelPrenom.setText(employe.getPrenom());
        jLabelFonction.setText(employe.getFonction().toString());
        jLabelService.setText(employe.getService().toString()); 
    }
    
     public RechercherPatient(SaAccueil fenetre) {
        RecherchePatient rp = new RecherchePatient();
        this.fenetrePreSa=fenetre;
        initComponents();
        this.sa= fenetrePreSa.getSa();
        jLabelNom.setText(employe.getNom());
        jLabelPrenom.setText(employe.getPrenom());
        jLabelFonction.setText(employe.getFonction().toString());
        jLabelService.setText(employe.getService().toString()); 
    }

    public RechercherPatient() {
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

        JPanelEnTeteMedTech = new javax.swing.JPanel();
        jLabelFonction = new javax.swing.JLabel();
        jLabelNom = new javax.swing.JLabel();
        jLabelPrenom = new javax.swing.JLabel();
        jButtonDeconnexion = new javax.swing.JButton();
        jButtonAccueil = new javax.swing.JButton();
        jLabelService = new javax.swing.JLabel();
        jPanel1RecherchePatient = new javax.swing.JPanel();
        jLabel1RecherchePatient = new javax.swing.JLabel();
        jLabel2Nom = new javax.swing.JLabel();
        jLabel3Prenom = new javax.swing.JLabel();
        jButtonRechercher = new javax.swing.JButton();
        jTextFieldNom = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListpatients = new javax.swing.JList<>();
        jTextFieldPrenom = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanelEnTeteMedTech.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelFonction.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFonction.setText("Fonction");

        jLabelNom.setText("Nom");

        jLabelPrenom.setText("Prénom");

        jButtonDeconnexion.setText("Déconnexion");
        jButtonDeconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeconnexionActionPerformed(evt);
            }
        });

        jButtonAccueil.setText("Accueil");
        jButtonAccueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAccueilActionPerformed(evt);
            }
        });

        jLabelService.setText("Service");

        javax.swing.GroupLayout JPanelEnTeteMedTechLayout = new javax.swing.GroupLayout(JPanelEnTeteMedTech);
        JPanelEnTeteMedTech.setLayout(JPanelEnTeteMedTechLayout);
        JPanelEnTeteMedTechLayout.setHorizontalGroup(
            JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addGroup(JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                        .addComponent(jLabelNom)
                        .addGap(104, 104, 104)
                        .addComponent(jLabelFonction))
                    .addComponent(jLabelPrenom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(jLabelService)
                .addGap(18, 18, 18)
                .addComponent(jButtonDeconnexion)
                .addGap(8, 8, 8))
        );
        JPanelEnTeteMedTechLayout.setVerticalGroup(
            JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                .addGroup(JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNom)
                            .addComponent(jLabelService)))
                    .addComponent(jButtonAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabelFonction, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButtonDeconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1RecherchePatient.setText("Recherche d'un patient :");

        jLabel2Nom.setText("Nom : ");

        jLabel3Prenom.setText("Prénom : ");

        jButtonRechercher.setText("Rechercher");
        jButtonRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRechercherActionPerformed(evt);
            }
        });

        jListpatients.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListpatients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListpatientsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListpatients);

        jTextFieldPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrenomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1RecherchePatientLayout = new javax.swing.GroupLayout(jPanel1RecherchePatient);
        jPanel1RecherchePatient.setLayout(jPanel1RecherchePatientLayout);
        jPanel1RecherchePatientLayout.setHorizontalGroup(
            jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jButtonRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(363, Short.MAX_VALUE))
            .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1RecherchePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                        .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNom, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(jTextFieldPrenom))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanel1RecherchePatientLayout.setVerticalGroup(
            jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1RecherchePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(jButtonRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelEnTeteMedTech, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1RecherchePatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanelEnTeteMedTech, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1RecherchePatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAccueilActionPerformed
        Identification id = new Identification();
        id.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonAccueilActionPerformed

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
        jListpatients.setModel(modele);

        ArrayList<String> infoPatient = new ArrayList<String>();
        infoPatient = rp.enTetePatient(resultatRecherche.get(1));
        this.p= new Patient(infoPatient.get(0),infoPatient.get(1),infoPatient.get(2));

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
            Identification f= new Identification();
             //this.fenetrePrecedente= new SmAccueil(f);

            //SMed smed= new SMed(nPS.get(0), nPS.get(1), nPS.get(2));
            //SMed employe= new SMed(fenetrePrecedente.getEmploye().getNom(),fenetrePrecedente.getEmploye().getPrenom(),fenetrePrecedente.getEmploye().getService())
                 //  this.employe= fenetrePrecedente.getEmploye();

            JOptionPane.showMessageDialog(null, "Dossier médical existant");
            ConsulterDM sadm = new ConsulterDM();
            sadm.setSize(this.getSize());
            sadm.setLocationRelativeTo(this);
            this.dispose();
            sadm.setVisible(true);

        } else if (x == true/* fonction == Fonction.Secretaire_admin*/) {

            ConsulterDMA sadm = new ConsulterDMA(this);
            sadm.setSize(this.getSize());
            sadm.setLocationRelativeTo(this);
            this.dispose();
            sadm.setVisible(true);

        } else if (x == true/* fonction == Fonction.Interne*/) {

            InterneAccueil inte = new InterneAccueil(this);
            inte.setSize(this.getSize());
            inte.setLocationRelativeTo(this);
            this.dispose();
            inte.setVisible(true);

        } else if (x == true/* fonction == Fonction.Infirmier*/) {

            InfirmierAccueil inte = new InfirmierAccueil(this);
            inte.setSize(this.getSize());
            inte.setLocationRelativeTo(this);
            this.dispose();
            inte.setVisible(true);
        } else { // pH
            if (x == true/* pH.service.getType()=="Clinique"*/) {

                MedClinAccueil inte = new MedClinAccueil(this);
                inte.setSize(this.getSize());
                inte.setLocationRelativeTo(this);
                this.dispose();
                inte.setVisible(true);
            } else if (x == true/* pH.service.getNom()=="Radiologie"*/) {

                MedRadioAccueil inte = new MedRadioAccueil();
                inte.setSize(this.getSize());
                inte.setLocationRelativeTo(this);
                this.dispose();
                inte.setVisible(true);
            } else if (x == true/* pH.service.getNom()=="Anesthésie"*/) {

                MedAnestAccueil inte = new MedAnestAccueil(this);
                inte.setSize(this.getSize());
                inte.setLocationRelativeTo(this);
                this.dispose();
                inte.setVisible(true);
            } else if (x == true/* pH.service.getType()=="Médico-technique"*/) {

                MedTechAccueil inte = new MedTechAccueil();
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

    private void jTextFieldPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrenomActionPerformed

    private void jListpatientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListpatientsMouseClicked
        // TODO add your handling code here:
        DossierMedical dm = new DossierMedical();
        dm.setSize(this.getSize());
        dm.setLocationRelativeTo(this);
        this.dispose();
        dm.setVisible(true);
    }//GEN-LAST:event_jListpatientsMouseClicked

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
            java.util.logging.Logger.getLogger(RechercherPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RechercherPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RechercherPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RechercherPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame fenetre= new JFrame();
                new RechercherPatient().setVisible(true);
            }
        });
    }
    public Patient getP(){
        return this.p;
    }
    public PMedical getEmploye(){
        return this.employe;
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
    private javax.swing.JLabel jLabelService;
    private javax.swing.JList<String> jListpatients;
    private javax.swing.JPanel jPanel1RecherchePatient;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldPrenom;
    // End of variables declaration//GEN-END:variables
}
