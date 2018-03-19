/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecrans;

import GestionBDD.*;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import GestionBDD.DossierMedical;
import GestionBDD.DossierMedicoAdministratif;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;

/**
 *
 * @author lisad
 */
public class CreerDM extends javax.swing.JFrame {

    private static PersonnelHospitalier employe;
    private static Patients patient;
    private PersonnelHospitalier phRespo;
    private static DossierMedicoAdministratif dma;
    String dateDuJour = new SimpleDateFormat("MM-dd-yyyy").format(Calendar.getInstance().getTime());
    private final JFrame fenetrePre;

    /**
     * Creates new form CreerDM
     *
     * @param employe
     * @param patient
     * @param previous
     */
    public CreerDM(PersonnelHospitalier employe, Patients patient, JFrame previous) {
        initComponents();
        this.patient = patient;
        this.employe = employe;
        fenetrePre = previous;

        jLabelNomp.setText(patient.getNompatient());
        jLabelPrenomp.setText(patient.getPrenompatient());
        jLabelDDNp.setText(patient.getDateDeNaissance());
        jLabelSexep.setText(patient.getSexe());
        jLabelLocalisationp.setText(patient.getLocalisation());
        jLabelAdressep.setText(patient.getAdresse());

        System.out.println("avant ok");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1CreationDM = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonPrecedent2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel3InfoPatient = new javax.swing.JPanel();
        jTextField1Service = new javax.swing.JTextField();
        jButtonValider = new javax.swing.JButton();
        jLabelService = new javax.swing.JLabel();
        jPanel3InfoPatient1 = new javax.swing.JPanel();
        jLabel1Prenom = new javax.swing.JLabel();
        jLabel2Nom = new javax.swing.JLabel();
        jLabel2Sexe = new javax.swing.JLabel();
        jLabel2DateDeNaissance = new javax.swing.JLabel();
        jLabel2Adresse = new javax.swing.JLabel();
        jLabel2Localisation = new javax.swing.JLabel();
        jLabel1InfoPatients = new javax.swing.JLabel();
        jLabelAdressep = new javax.swing.JLabel();
        jLabelLocalisationp = new javax.swing.JLabel();
        jLabelSexep = new javax.swing.JLabel();
        jLabelDDNp = new javax.swing.JLabel();
        jLabelNomp = new javax.swing.JLabel();
        jLabelPrenomp = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(200, 200));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1CreationDM.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(65, 131, 215));

        jLabel1.setBackground(new java.awt.Color(65, 131, 215));
        jLabel1.setFont(new java.awt.Font("Wiggle", 0, 24)); // NOI18N
        jLabel1.setText("Création d'un dossier médical");

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
                .addGap(24, 24, 24)
                .addComponent(jButtonPrecedent2)
                .addGap(206, 206, 206)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(370, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPrecedent2))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1CreationDM.add(jPanel1);
        jPanel1.setBounds(-10, 0, 1060, 100);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3InfoPatient.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonValider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Valider2.PNG"))); // NOI18N
        jButtonValider.setText("Valider");
        jButtonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValiderActionPerformed(evt);
            }
        });

        jLabelService.setText("Service : ");

        jPanel3InfoPatient1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1Prenom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1Prenom.setText("Prénom : ");

        jLabel2Nom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2Nom.setText("Nom : ");

        jLabel2Sexe.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2Sexe.setText("Sexe :");

        jLabel2DateDeNaissance.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2DateDeNaissance.setText("Date de Naissance : ");

        jLabel2Adresse.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2Adresse.setText("Adresse : ");

        jLabel2Localisation.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2Localisation.setText("Localisation :");

        jLabel1InfoPatients.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel1InfoPatients.setText("Informations générales du patient ");

        jLabelAdressep.setText("jLabel3");

        jLabelLocalisationp.setText("jLabel4");

        jLabelSexep.setText("jLabel5");

        jLabelDDNp.setText("jLabel6");

        jLabelNomp.setText("jLabel7");

        jLabelPrenomp.setText("jLabel8");

        javax.swing.GroupLayout jPanel3InfoPatient1Layout = new javax.swing.GroupLayout(jPanel3InfoPatient1);
        jPanel3InfoPatient1.setLayout(jPanel3InfoPatient1Layout);
        jPanel3InfoPatient1Layout.setHorizontalGroup(
            jPanel3InfoPatient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3InfoPatient1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3InfoPatient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3InfoPatient1Layout.createSequentialGroup()
                        .addComponent(jLabel2Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNomp, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3InfoPatient1Layout.createSequentialGroup()
                        .addComponent(jLabel1Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelPrenomp, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(jPanel3InfoPatient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3InfoPatient1Layout.createSequentialGroup()
                        .addComponent(jLabel2Sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabelSexep))
                    .addGroup(jPanel3InfoPatient1Layout.createSequentialGroup()
                        .addComponent(jLabel2DateDeNaissance)
                        .addGap(38, 38, 38)
                        .addComponent(jLabelDDNp)))
                .addGap(21, 92, Short.MAX_VALUE)
                .addGroup(jPanel3InfoPatient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3InfoPatient1Layout.createSequentialGroup()
                        .addComponent(jLabel2Localisation, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jLabelLocalisationp))
                    .addGroup(jPanel3InfoPatient1Layout.createSequentialGroup()
                        .addComponent(jLabel2Adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jLabelAdressep)))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(jPanel3InfoPatient1Layout.createSequentialGroup()
                .addComponent(jLabel1InfoPatients)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3InfoPatient1Layout.setVerticalGroup(
            jPanel3InfoPatient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3InfoPatient1Layout.createSequentialGroup()
                .addComponent(jLabel1InfoPatients)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel3InfoPatient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2Sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2Adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAdressep)
                    .addComponent(jLabelSexep)
                    .addComponent(jLabelNomp))
                .addGap(18, 18, 18)
                .addGroup(jPanel3InfoPatient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1Prenom)
                    .addComponent(jLabel2DateDeNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2Localisation, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDDNp)
                    .addComponent(jLabelPrenomp)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3InfoPatient1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLocalisationp)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3InfoPatientLayout = new javax.swing.GroupLayout(jPanel3InfoPatient);
        jPanel3InfoPatient.setLayout(jPanel3InfoPatientLayout);
        jPanel3InfoPatientLayout.setHorizontalGroup(
            jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3InfoPatientLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonValider)
                .addGap(196, 196, 196))
            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelService, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1Service, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jPanel3InfoPatient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3InfoPatientLayout.setVerticalGroup(
            jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3InfoPatientLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel3InfoPatient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1Service, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelService))
                .addGap(13, 13, 13)
                .addComponent(jButtonValider)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3InfoPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jPanel3InfoPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        jPanel1CreationDM.add(jPanel3);
        jPanel3.setBounds(0, 100, 1050, 520);

        getContentPane().add(jPanel1CreationDM);
        jPanel1CreationDM.setBounds(0, 0, 1050, 616);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPrecedent2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrecedent2ActionPerformed
        fenetrePre.setVisible(true);
        fenetrePre.setSize(this.getSize());
        fenetrePre.setLocationRelativeTo(this);
        this.dispose();
    }//GEN-LAST:event_jButtonPrecedent2ActionPerformed

    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed
        System.out.println("apres ok");
        /* SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        String s = jFormattedTextFieldDateDeNaissance.getText();*/
        String ipp = (patient.getIpp().substring(1, patient.getIpp().length() - 1));
        System.out.println(ipp);
        DAO<DossierMedicoAdministratif> DossierMedicoAdministratifDAO = new DossierMedicoAdministratifDAO(BDDconnection.getInstance());
        String nosejour = (DossierMedicoAdministratifDAO.getDernierNumeroSejour(ipp).substring(1, DossierMedicoAdministratifDAO.getDernierNumeroSejour(ipp).length() - 1));
        System.out.println(nosejour);

        /*  Date d = new Date();
        try {
            d = sdf.parse(s);
            String t = sdf.format(d);
            if (t.compareTo(s) != 0) {
                JOptionPane.showMessageDialog(null, "Date non valide");
            } else {*/
        DossierMedical dm = new DossierMedical(ipp, nosejour, jTextField1Service.getText(), "");

        DAO<DossierMedical> dmDAO = new DossierMedicalDAO(BDDconnection.getInstance());
        if (dmDAO.create(dm)) {
            JOptionPane.showMessageDialog(null, "Le dossier médical a bien été créé");
            SmAccueil smed = new SmAccueil(employe, patient);
            smed.setVisible(true);
            smed.setSize(this.getSize());
            smed.setLocationRelativeTo(this);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, " Le dossier médical n'a pas pu être créé. Veillez recommencer.");
        }

        /* }
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Exception");
        }*/
    }//GEN-LAST:event_jButtonValiderActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPrecedent2;
    private javax.swing.JButton jButtonValider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1InfoPatients;
    private javax.swing.JLabel jLabel1Prenom;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2Adresse;
    private javax.swing.JLabel jLabel2DateDeNaissance;
    private javax.swing.JLabel jLabel2Localisation;
    private javax.swing.JLabel jLabel2Nom;
    private javax.swing.JLabel jLabel2Sexe;
    private javax.swing.JLabel jLabelAdressep;
    private javax.swing.JLabel jLabelDDNp;
    private javax.swing.JLabel jLabelLocalisationp;
    private javax.swing.JLabel jLabelNomp;
    private javax.swing.JLabel jLabelPrenomp;
    private javax.swing.JLabel jLabelService;
    private javax.swing.JLabel jLabelSexep;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel1CreationDM;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel3InfoPatient;
    private javax.swing.JPanel jPanel3InfoPatient1;
    private javax.swing.JTextField jTextField1Service;
    // End of variables declaration//GEN-END:variables
}
