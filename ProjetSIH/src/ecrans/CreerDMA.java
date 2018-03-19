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
public class CreerDMA extends javax.swing.JFrame {

    /**
     * Creates new form CreerDMA
     */
    private static PersonnelHospitalier employe;
    private Patients patient;
    private static ArrayList<String> listMed;
    private String typeSejour;
    private PersonnelHospitalier phRespo;
    String dateDuJour = new SimpleDateFormat("MM-dd-yyyy").format(Calendar.getInstance().getTime());
    private JFrame fenetre;

    /**
     *
     * @param employe
     * @param fenetre
     */
    public CreerDMA(PersonnelHospitalier employe, JFrame fenetre) {
        initComponents();
        this.employe = employe;
        this.fenetre = fenetre;
        DefaultComboBoxModel modele = new DefaultComboBoxModel();
        modele.addElement("Hospitalisation");
        modele.addElement("Consultation");
        jComboBoxTypeSejour.setModel(modele);
        System.out.println(dateDuJour);
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
        jTextField4Prenom = new javax.swing.JTextField();
        jLabel2Adresse = new javax.swing.JLabel();
        jLabel2Localisation = new javax.swing.JLabel();
        jTextFieldadresse = new javax.swing.JTextField();
        jComboBoxSexe = new javax.swing.JComboBox<>();
        jButtonAide = new javax.swing.JButton();
        jTextField4DDN1 = new javax.swing.JFormattedTextField();
        try{
            MaskFormatter tel = new MaskFormatter("U###");
            jTextField4Localisation = new javax.swing.JFormattedTextField(tel);
            jPanel2CreationDMA = new javax.swing.JPanel();
            jLabel3Type = new javax.swing.JLabel();
            jComboBoxTypeSejour = new javax.swing.JComboBox<>();
            jLabel2NomPH = new javax.swing.JLabel();
            jTextFieldNomph = new javax.swing.JTextField();
            jTextFieldPrenomph = new javax.swing.JTextField();
            jButton1 = new javax.swing.JButton();
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

            jLabel2Adresse.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
            jLabel2Adresse.setText("Adresse : ");

            jLabel2Localisation.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
            jLabel2Localisation.setText("Localisation :");

            jTextFieldadresse.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextFieldadresseActionPerformed(evt);
                }
            });

            jComboBoxSexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

            jButtonAide.setText("Détail Sexe");
            jButtonAide.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonAideActionPerformed(evt);
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
                            .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1Nom, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                .addComponent(jTextField4Prenom))
                            .addGap(51, 51, 51)
                            .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                    .addComponent(jLabel2Sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jComboBoxSexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonAide))
                                .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                    .addComponent(jLabel2DateDeNaissance)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField4DDN1)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2Localisation, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2Adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldadresse)
                                .addGroup(jPanel3InfoPatientLayout.createSequentialGroup()
                                    .addComponent(jTextField4Localisation, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addContainerGap())
            );
            jPanel3InfoPatientLayout.setVerticalGroup(
                jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3InfoPatientLayout.createSequentialGroup()
                    .addComponent(jLabel1InfoPatients)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                    .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2Sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2Adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldadresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxSexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAide))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel3InfoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1Prenom)
                        .addComponent(jLabel2DateDeNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField4Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2Localisation, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField4DDN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField4Localisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );

        }
        catch(ParseException e){e.printStackTrace();}

        jPanel2CreationDMA.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3Type.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3Type.setText("Type :");

        jComboBoxTypeSejour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        jComboBoxTypeSejour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTypeSejourActionPerformed(evt);
            }
        });

        jLabel2NomPH.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2NomPH.setText("Praticien Hospitalier responsable :");

        javax.swing.GroupLayout jPanel2CreationDMALayout = new javax.swing.GroupLayout(jPanel2CreationDMA);
        jPanel2CreationDMA.setLayout(jPanel2CreationDMALayout);
        jPanel2CreationDMALayout.setHorizontalGroup(
            jPanel2CreationDMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2CreationDMALayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel3Type)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxTypeSejour, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel2NomPH)
                .addGap(49, 49, 49)
                .addComponent(jTextFieldNomph, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldPrenomph, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2CreationDMALayout.setVerticalGroup(
            jPanel2CreationDMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2CreationDMALayout.createSequentialGroup()
                .addGroup(jPanel2CreationDMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2CreationDMALayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2CreationDMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxTypeSejour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3Type)
                            .addComponent(jLabel2NomPH)))
                    .addGroup(jPanel2CreationDMALayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2CreationDMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNomph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPrenomph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3InfoPatient, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2CreationDMA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(216, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(272, 272, 272))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jPanel3InfoPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jPanel2CreationDMA, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(208, Short.MAX_VALUE))
        );

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldadresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldadresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldadresseActionPerformed

    private void jButtonPrecedent2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrecedent2ActionPerformed
        fenetre.setVisible(true);
        fenetre.setSize(this.getSize());
        fenetre.setLocationRelativeTo(this);
        this.dispose();
    }//GEN-LAST:event_jButtonPrecedent2ActionPerformed

    private void jComboBoxTypeSejourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTypeSejourActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jComboBoxTypeSejourActionPerformed

    private void jButtonAideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAideActionPerformed
        JOptionPane.showMessageDialog(null, "'A': Ambigu; 'F': Féminin; 'M': Masculin; 'O': Autre; 'U': Inconnu");

    }//GEN-LAST:event_jButtonAideActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // creation du patient
        DAO<Patients> pDAO = new PatientsDAO(BDDconnection.getInstance());
        String ipp = pDAO.createIpp(); // (patient.getIpp().substring(1, patient.getIpp().length() - 1));
        //System.out.println(ipp);
        
        this.patient = new Patients(ipp, jTextField1Nom.getText(), jTextField4Prenom.getText(), jTextField4DDN1.getText(), jTextField4Localisation.getText(), jTextFieldadresse.getText(), jComboBoxSexe.getSelectedItem().toString());
        boolean ok = pDAO.create(patient);
        //System.out.println(ok);
        if (ok) {
            JOptionPane.showMessageDialog(null, "Le patient a bien été créé");
// Recherhe du ph responsable 

            PersonnelHospitalierDAO perso = new PersonnelHospitalierDAO(BDDconnection.getInstance());
            
            //System.out.println("taille liste = " + perso.find(jTextFieldNomph.getText(), jTextFieldPrenomph.getText()).size());
            
            phRespo = perso.find(jTextFieldNomph.getText(), jTextFieldPrenomph.getText()).get(0);
            
            //System.out.println(phRespo.getNomph() + "  " + phRespo.getPrenomph());
            
// Creation du numero de sejour 
            DAO<DossierMedicoAdministratif> DossierMedicoAdministratifDAO = new DossierMedicoAdministratifDAO(BDDconnection.getInstance());
            String nosejour = DossierMedicoAdministratifDAO.createNumeroSejour();
            
            //System.out.println(nosejour);
            
            DossierMedicoAdministratif dma;
            //System.out.println(dateDuJour);
//  creation du dma
            dma = new DossierMedicoAdministratif(ipp, nosejour, dateDuJour, phRespo.getId(), jComboBoxTypeSejour.getSelectedItem().toString(), phRespo.getService());
            boolean ok2 = DossierMedicoAdministratifDAO.create(dma);
            if (ok2) {
                JOptionPane.showMessageDialog(null, "Le DMA a bien été créé");

            } else {
                JOptionPane.showMessageDialog(null, "Le DMA n'a pas pu être créé. Veillez recommencer.");

            }

        } else {
            JOptionPane.showMessageDialog(null, "Le patient n'a pas pu être créé. Veillez recommencer.");
        }


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAide;
    private javax.swing.JButton jButtonPrecedent2;
    private javax.swing.JComboBox<String> jComboBoxSexe;
    private javax.swing.JComboBox<String> jComboBoxTypeSejour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1InfoPatients;
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
    private javax.swing.JTextField jTextField1Nom;
    private javax.swing.JFormattedTextField jTextField4DDN1;
    private javax.swing.JFormattedTextField jTextField4Localisation;
    private javax.swing.JTextField jTextField4Prenom;
    private javax.swing.JTextField jTextFieldNomph;
    private javax.swing.JTextField jTextFieldPrenomph;
    private javax.swing.JTextField jTextFieldadresse;
    // End of variables declaration//GEN-END:variables
}
