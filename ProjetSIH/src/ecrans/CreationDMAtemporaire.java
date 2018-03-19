/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecrans;

import GestionBDD.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author lisad
 */
public class CreationDMAtemporaire extends javax.swing.JFrame {

    /**
     * Creates new form CreationDMAtemporaire
     */
    String dateDuJour = new SimpleDateFormat("MM-dd-yyyy").format(Calendar.getInstance().getTime());

    private static PersonnelHospitalier employe;
    private static Patients patient;
    private final JFrame fenetrePrecedente;
        private PersonnelHospitalier phRespo; 

    
    /**
     *
     * @param employe
     * @param previous
     */
    public CreationDMAtemporaire(PersonnelHospitalier employe, JFrame previous) {
        initComponents();
        this.employe = employe;
        fenetrePrecedente = previous;
        DefaultComboBoxModel sexModele = new DefaultComboBoxModel();
        sexModele.addElement("A");
        sexModele.addElement("F");
        sexModele.addElement("M");
        sexModele.addElement("O");
        sexModele.addElement("U");

        jComboBoxSexe.setModel(sexModele);
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
        jPanel3InfoPatient = new javax.swing.JPanel();
        jLabel1InfoPatients = new javax.swing.JLabel();
        jLabel2Nom = new javax.swing.JLabel();
        jTextField1Nom = new javax.swing.JTextField();
        jLabel1Prenom = new javax.swing.JLabel();
        jTextField4Prenom = new javax.swing.JTextField();
        jLabel2Sexe = new javax.swing.JLabel();
        jLabel2DateDeNaissance = new javax.swing.JLabel();
        jLabel2Adresse = new javax.swing.JLabel();
        jLabel2Localisation = new javax.swing.JLabel();
        jTextFieldadresse = new javax.swing.JTextField();
        jTextField4Localisation = new javax.swing.JTextField();
        jButtonPrecedent = new javax.swing.JButton();
        jComboBoxSexe = new javax.swing.JComboBox<>();
        jButtonAide = new javax.swing.JButton();
        try{

            MaskFormatter tel2 = new MaskFormatter("##-##-####");
            jTextField4DDN1 = new javax.swing.JFormattedTextField(tel2);
            jButtonValider = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setAlwaysOnTop(true);
            setBackground(new java.awt.Color(255, 255, 255));
            setMinimumSize(new java.awt.Dimension(200, 200));
            setPreferredSize(new java.awt.Dimension(1000, 1000));
            setResizable(false);
            getContentPane().setLayout(null);

            jPanel1.setBackground(new java.awt.Color(255, 255, 255));
            jPanel1.setMinimumSize(new java.awt.Dimension(200, 200));
            jPanel1.setPreferredSize(new java.awt.Dimension(1000, 1000));

            jPanel3InfoPatient.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            jLabel1InfoPatients.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
            jLabel1InfoPatients.setText("Informations générales du patient ");

            jLabel2Nom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
            jLabel2Nom.setText("Nom : ");

            jTextField1Nom.setText("jTextField1");

            jLabel1Prenom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
            jLabel1Prenom.setText("Prénom : ");

            jTextField4Prenom.setText("jTextField1");

            jLabel2Sexe.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
            jLabel2Sexe.setText("Sexe :");

            jLabel2DateDeNaissance.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
            jLabel2DateDeNaissance.setText("Date de Naissance : ");

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

            jButtonPrecedent.setBackground(new java.awt.Color(228, 241, 254));
            jButtonPrecedent.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
            jButtonPrecedent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bouton précedent.PNG"))); // NOI18N
            jButtonPrecedent.setText("Précédent");
            jButtonPrecedent.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonPrecedentActionPerformed(evt);
                }
            });

            jComboBoxSexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

            jButtonAide.setText("Détail Sexe");
            jButtonAide.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonAideActionPerformed(evt);
                }
            });

        }
        catch(ParseException e){e.printStackTrace();}

        jButtonValider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Valider2.PNG"))); // NOI18N
        jButtonValider.setText("Valider");
        jButtonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValiderActionPerformed(evt);
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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                        .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                .addComponent(jLabel2Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jTextField1Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                .addComponent(jLabel1Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2DateDeNaissance)
                            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                .addComponent(jLabel2Sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxSexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonAide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField4DDN1))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                .addComponent(jLabel2Localisation, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField4Localisation, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
                            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                .addComponent(jLabel2Adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldadresse)))
                        .addGap(43, 43, 43))))
            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonPrecedent)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3InfoPatientLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonValider)
                .addGap(65, 65, 65))
        );
        jPanel3InfoPatientLayout.setVerticalGroup(
            jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3InfoPatientLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButtonPrecedent)
                .addGap(18, 18, 18)
                .addComponent(jLabel1InfoPatients)
                .addGap(27, 27, 27)
                .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2Sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2Adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldadresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAide))
                .addGap(18, 18, 18)
                .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1Prenom)
                    .addComponent(jTextField4Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2DateDeNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2Localisation, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4Localisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4DDN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jButtonValider)
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jPanel3InfoPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jPanel3InfoPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(342, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 970, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldadresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldadresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldadresseActionPerformed

    private void jTextField4LocalisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4LocalisationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4LocalisationActionPerformed

    private void jButtonPrecedentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrecedentActionPerformed
        // TODO add your handling code here:
        fenetrePrecedente.setVisible(true);
        fenetrePrecedente.setSize(this.getSize());
        fenetrePrecedente.setLocationRelativeTo(this);
        this.dispose();
    }//GEN-LAST:event_jButtonPrecedentActionPerformed

    private void jButtonAideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAideActionPerformed
        JOptionPane.showMessageDialog(null, "'A': Ambigu; 'F': Féminin; 'M': Masculin; 'O': Autre; 'U': Inconnu");
    }//GEN-LAST:event_jButtonAideActionPerformed

    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed
        // creation du patient
        DAO<Patients> pDAO = new PatientsDAO(BDDconnection.getInstance());
        String ipp = pDAO.createIpp(); // (patient.getIpp().substring(1, patient.getIpp().length() - 1));
        System.out.println(ipp);
        this.patient = new Patients(ipp, jTextField1Nom.getText(), jTextField4Prenom.getText(), jTextField4DDN1.getText(), jTextField4Localisation.getText(), jTextFieldadresse.getText(), jComboBoxSexe.getSelectedItem().toString());
        boolean ok = pDAO.create(patient);
        System.out.println(ok);
        if (ok) {
            JOptionPane.showMessageDialog(null, "Le patient a bien été créé");
// Recherhe du ph responsable 

            PersonnelHospitalierDAO perso = new PersonnelHospitalierDAO(BDDconnection.getInstance());
            System.out.println("taille liste = " + perso.find(employe.getNomph(), employe.getPrenomph()).size());
            phRespo = perso.find(employe.getNomph(), employe.getPrenomph()).get(0);           

// Creation du numero de sejour 
            DAO<DossierMedicoAdministratif> DossierMedicoAdministratifDAO = new DossierMedicoAdministratifDAO(BDDconnection.getInstance());
  String nosejour = DossierMedicoAdministratifDAO.createNumeroSejour();
            System.out.println(nosejour);
            DossierMedicoAdministratif dma;
            System.out.println(dateDuJour);
//  creation du dma
            dma = new DossierMedicoAdministratif(ipp, nosejour, dateDuJour, phRespo.getId(), "Consultation", phRespo.getService());
            boolean ok2 = DossierMedicoAdministratifDAO.create(dma);
            if (ok2) {
                JOptionPane.showMessageDialog(null, "Le DMA a bien été créé");

            } else {
                JOptionPane.showMessageDialog(null, "Le DMA n'a pas pu être créé. Veillez recommencer.");

            }

        } else {
            JOptionPane.showMessageDialog(null, "Le patient n'a pas pu être créé. Veillez recommencer.");
        }
    }//GEN-LAST:event_jButtonValiderActionPerformed
 



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAide;
    private javax.swing.JButton jButtonPrecedent;
    private javax.swing.JButton jButtonValider;
    private javax.swing.JComboBox<String> jComboBoxSexe;
    private javax.swing.JLabel jLabel1InfoPatients;
    private javax.swing.JLabel jLabel1Prenom;
    private javax.swing.JLabel jLabel2Adresse;
    private javax.swing.JLabel jLabel2DateDeNaissance;
    private javax.swing.JLabel jLabel2Localisation;
    private javax.swing.JLabel jLabel2Nom;
    private javax.swing.JLabel jLabel2Sexe;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3InfoPatient;
    private javax.swing.JTextField jTextField1Nom;
    private javax.swing.JFormattedTextField jTextField4DDN1;
    private javax.swing.JTextField jTextField4Localisation;
    private javax.swing.JTextField jTextField4Prenom;
    private javax.swing.JTextField jTextFieldadresse;
    // End of variables declaration//GEN-END:variables
}
