/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecrans;

import GestionBDD.BDDconnection;
import GestionBDD.DAO;
import GestionBDD.DossierMedicoAdministratif;
import GestionBDD.DossierMedicoAdministratifDAO;
import GestionBDD.Patients;
import GestionBDD.PatientsDAO;
import GestionBDD.PersonnelHospitalier;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import projetsih.PHospitalier;
import projetsih.Patient;
//import projetsih.RecherchePatient;
import projetsih.SAdm;

/**
 *
 * @author lisad
 */
public class CreerDMA extends javax.swing.JFrame {

    /**
     * Creates new form CreerDMA
     */
      private static PersonnelHospitalier employe;
    private  Patients patient;
    private static ArrayList<String> listMed;
    private String typeSejour;


    public CreerDMA(PersonnelHospitalier employe) {
        initComponents();
        this.employe = employe;
        jComboBoxTypeSejour.addItem("Hospitalisation");
        jComboBoxTypeSejour.addItem("Consultation");
       /* for (String j: listMed){
            jComboBoxPH.addItem(j);
        }*/
        

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
        jPanel2 = new javax.swing.JPanel();
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
        jLabel2Adresse = new javax.swing.JLabel();
        jLabel2Localisation = new javax.swing.JLabel();
        jTextFieldadresse = new javax.swing.JTextField();
        jTextField4Localisation = new javax.swing.JTextField();
        jPanel2CreationDMA = new javax.swing.JPanel();
        jLabel1NoSejour = new javax.swing.JLabel();
        jTextField1NoSejour = new javax.swing.JTextField();
        jLabel3Type = new javax.swing.JLabel();
        jComboBoxPH = new javax.swing.JComboBox<>();
        jLabel2NomPH = new javax.swing.JLabel();
        jComboBoxTypeSejour = new javax.swing.JComboBox<>();
        jButtonValider = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonPrecedent2 = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1ListePrestaMT.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(65, 131, 215));
        setMinimumSize(new java.awt.Dimension(200, 200));
        setPreferredSize(new java.awt.Dimension(1000, 1000));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3InfoPatient.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1Prenom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1Prenom.setText("Prénom : ");

        jLabel2Nom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2Nom.setText("Nom : ");

        jLabel2Sexe.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2Sexe.setText("Sexe :");

        jLabel2DateDeNaissance.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2DateDeNaissance.setText("Date de Naissance : ");

        jLabel1InfoPatients.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
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

        jLabel2Adresse.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2Adresse.setText("Adresse : ");

        jLabel2Localisation.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
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
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                        .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addComponent(jLabel2Localisation, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldadresse)
                            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                .addComponent(jTextField4Localisation, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 33, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel3InfoPatientLayout.setVerticalGroup(
            jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3InfoPatientLayout.createSequentialGroup()
                .addComponent(jLabel1InfoPatients)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 15, Short.MAX_VALUE)
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

        jLabel1NoSejour.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1NoSejour.setText("Numéro de séjour : ");
        jPanel2CreationDMA.add(jLabel1NoSejour);

        jTextField1NoSejour.setText("jTextField1");
        jTextField1NoSejour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1NoSejourActionPerformed(evt);
            }
        });
        jPanel2CreationDMA.add(jTextField1NoSejour);

        jLabel3Type.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3Type.setText("Type :");
        jPanel2CreationDMA.add(jLabel3Type);

        jComboBoxPH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxPH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPHActionPerformed(evt);
            }
        });
        jPanel2CreationDMA.add(jComboBoxPH);

        jLabel2NomPH.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2NomPH.setText("Nom du Praticien Hospitalier responsable :");
        jPanel2CreationDMA.add(jLabel2NomPH);

        jComboBoxTypeSejour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxTypeSejour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTypeSejourActionPerformed(evt);
            }
        });
        jPanel2CreationDMA.add(jComboBoxTypeSejour);

        jButtonValider.setBackground(new java.awt.Color(228, 241, 254));
        jButtonValider.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonValider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Valider2.PNG"))); // NOI18N
        jButtonValider.setText("Valider");
        /*
        jButtonValider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonValiderMouseClicked(evt);
            }
        });
        jButtonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValiderActionPerformed(evt);
            }
        });
        */
        jPanel2CreationDMA.add(jButtonValider);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3InfoPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2CreationDMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(152, 152, 152))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jPanel3InfoPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jPanel2CreationDMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 93, 1000, 550);

        jPanel1.setBackground(new java.awt.Color(65, 131, 215));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Wiggle", 0, 24)); // NOI18N
        jLabel1.setText("Création d'un dossier médico-administratif");

        jButtonPrecedent2.setBackground(new java.awt.Color(228, 241, 254));
        jButtonPrecedent2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonPrecedent2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bouton précedent.PNG"))); // NOI18N
        jButtonPrecedent2.setText("Précédent");
        jButtonPrecedent2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrecedent2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonPrecedent2)
                .addGap(107, 107, 107)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(273, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPrecedent2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 100);

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

    private void jButtonPrecedent2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrecedent2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPrecedent2ActionPerformed

    private void jComboBoxPHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPHActionPerformed
        // TODO add your handling code here:
          this.typeSejour = jComboBoxPH.getSelectedItem().toString();
        
        
        
    }//GEN-LAST:event_jComboBoxPHActionPerformed

    private void jButtonValiderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonValiderMouseClicked
        // TODO add your handling code here:
        DossierMedicoAdministratif dma;
        PatientsDAO patd = new PatientsDAO(BDDconnection.getInstance());
        // ici utiliser la fonction qui récupère le dernier ipp pour créer lenouveau et faire patient.setIpp(newIpp)
       this.patient= new Patients(patient.getIpp(), jTextField1Nom.getText(), jTextField4Prenom.getText(),jTextField4DDN1.getText(), jTextField4Localisation.getText(),jTextFieldadresse.getText(),jTextField4Sexe.getText());
       patd.create(patient);
        
        //creer fonction qui crée le num de sejour 
        dma = new DossierMedicoAdministratif(patient.getIpp(), "num de sejour","date du jour",employe.getId() ,"Consultation","Cardiologie");
        DAO<DossierMedicoAdministratif> DossierMedicoAdministratifDAO = new DossierMedicoAdministratifDAO(BDDconnection.getInstance());
        DossierMedicoAdministratifDAO.create(dma);
        
    }//GEN-LAST:event_jButtonValiderMouseClicked

    private void jComboBoxTypeSejourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTypeSejourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTypeSejourActionPerformed

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
                new CreerDMA(employe).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPrecedent2;
    private javax.swing.JButton jButtonValider;
    private javax.swing.JComboBox<String> jComboBoxPH;
    private javax.swing.JComboBox<String> jComboBoxTypeSejour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1InfoPatients;
    private javax.swing.JLabel jLabel1NoSejour;
    private javax.swing.JLabel jLabel1Prenom;
    private javax.swing.JLabel jLabel2Adresse;
    private javax.swing.JLabel jLabel2DateDeNaissance;
    private javax.swing.JLabel jLabel2Localisation;
    private javax.swing.JLabel jLabel2Nom;
    private javax.swing.JLabel jLabel2NomPH;
    private javax.swing.JLabel jLabel2Sexe;
    private javax.swing.JLabel jLabel3Type;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel2CreationDMA;
    private javax.swing.JPanel jPanel3InfoPatient;
    private javax.swing.JScrollPane jScrollPane1ListePrestaMT;
    private javax.swing.JTextField jTextField1NoSejour;
    private javax.swing.JTextField jTextField1Nom;
    private javax.swing.JTextField jTextField4DDN1;
    private javax.swing.JTextField jTextField4Localisation;
    private javax.swing.JTextField jTextField4Prenom;
    private javax.swing.JTextField jTextField4Sexe;
    private javax.swing.JTextField jTextFieldadresse;
    // End of variables declaration//GEN-END:variables
}
