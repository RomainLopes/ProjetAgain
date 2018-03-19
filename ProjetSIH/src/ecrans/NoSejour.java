/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecrans;

import GestionBDD.*;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author lisad
 */
public class NoSejour extends javax.swing.JFrame {

    private static PersonnelHospitalier employe;
    private static Patients patient;
    private JFrame fenetre;
    private DossierMedicoAdministratif dma;
    private String ipp, noSejour;
    private PersonnelHospitalier phRespo;

    /**
     * Creates new form NoSejour
     * @param personnel
     * @param patient
     * @param fenetre
     * @param sejour
     */
    public NoSejour(PersonnelHospitalier personnel, Patients patient, JFrame fenetre, DossierMedicoAdministratif sejour) {
        initComponents();
        this.patient = patient;
        employe = personnel;
        this.fenetre = fenetre;
        dma = sejour;

        jLabel1Nomp.setText(patient.getNompatient());
        jLabel2PrenomP.setText(patient.getPrenompatient());
        jLabel4DateP.setText(patient.getDateDeNaissance());
        jLabel3Sexep.setText(patient.getSexe());
        // no type nom de ph lettre de sortie liste prescriptions 
        ipp = (patient.getIpp().substring(1, patient.getIpp().length() - 1));

        jLabelNosejor.setText(sejour.getNosejour());
        jLabelType.setText(sejour.getType());
        //lettre 
        LettreDeSortieDAO lettred;
        lettred = new LettreDeSortieDAO(BDDconnection.getInstance());
        ArrayList<LettreDeSortie> lettres = lettred.find(ipp, sejour.getNosejour());
        System.out.println(lettres.size());
     //  jLabel1LettreSortiep.setText(lettres.get(0).getLettre());
        //phRespo
       PersonnelHospitalierDAO ph= new PersonnelHospitalierDAO(BDDconnection.getInstance());
        phRespo= ph.findIpp(dma.getIdph()).get(0);
        System.out.println(phRespo.getNomph()+"  " + phRespo.getPrenomph());
        jLabel1NomPHrespo.setText(phRespo.getNomph()+"  " + phRespo.getPrenomph());
        // prestations medicotechniques 
        
        
        
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
        jLabel1NoSejourP = new javax.swing.JLabel();
        jLabel1NoSejour = new javax.swing.JLabel();
        jLabel3Type = new javax.swing.JLabel();
        jLabel1NomPHrespo = new javax.swing.JLabel();
        jLabel2NomPH = new javax.swing.JLabel();
        jLabel1LettreSortiep = new javax.swing.JLabel();
        jLabel4LettreSortie = new javax.swing.JLabel();
        jScrollPane1ListePrestaMT = new javax.swing.JScrollPane();
        jListPrestations = new javax.swing.JList<>();
        jLabel5PrestaMT = new javax.swing.JLabel();
        jButtonPrecedent = new javax.swing.JButton();
        jLabelNosejor = new javax.swing.JLabel();
        jLabelType = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3Sexep = new javax.swing.JLabel();
        jLabel2Sexe = new javax.swing.JLabel();
        jLabel4DateP = new javax.swing.JLabel();
        jLabel2DateDeNaissance = new javax.swing.JLabel();
        jLabel1Nomp = new javax.swing.JLabel();
        jLabel2Nom = new javax.swing.JLabel();
        jLabel2PrenomP = new javax.swing.JLabel();
        jLabel1Prenom = new javax.swing.JLabel();
        jLabel1InfoPatients = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(200, 200));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1NoSejour.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1NoSejour.setText("Numéro de séjour : ");

        jLabel3Type.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3Type.setText("Type :");

        jLabel1NomPHrespo.setText("jLabel1");

        jLabel2NomPH.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2NomPH.setText("Nom du Praticien Hospitalier responsable :");

        jLabel1LettreSortiep.setText("jLabel1");

        jLabel4LettreSortie.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4LettreSortie.setText("Lettre de sortie ");

        jListPrestations.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1ListePrestaMT.setViewportView(jListPrestations);

        jLabel5PrestaMT.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5PrestaMT.setText("Prestation(s) médico-technique(s)");

        jButtonPrecedent.setBackground(new java.awt.Color(228, 241, 254));
        jButtonPrecedent.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonPrecedent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bouton précedent.PNG"))); // NOI18N
        jButtonPrecedent.setText("Précédent");
        jButtonPrecedent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrecedentActionPerformed(evt);
            }
        });

        jLabelNosejor.setText("jLabel1");

        jLabelType.setText("jLabel1");

        jLabel3Sexep.setText("jLabel1");

        jLabel2Sexe.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2Sexe.setText("Sexe :");

        jLabel4DateP.setText("jLabel1");

        jLabel2DateDeNaissance.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2DateDeNaissance.setText("Date de Naissance : ");

        jLabel1Nomp.setText("jLabel1");

        jLabel2Nom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2Nom.setText("Nom : ");

        jLabel2PrenomP.setText("jLabel1");

        jLabel1Prenom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1Prenom.setText("Prénom : ");

        jLabel1InfoPatients.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel1InfoPatients.setText("Informations du patient ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1InfoPatients)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1Nomp, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2PrenomP, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2Sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3Sexep, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2DateDeNaissance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4DateP, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1InfoPatients)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3Sexep)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2Sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1Nomp)
                        .addComponent(jLabel2Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4DateP)
                    .addComponent(jLabel2DateDeNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2PrenomP)
                    .addComponent(jLabel1Prenom))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(186, 186, 186)
                                    .addComponent(jLabel1NoSejour, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel3Type, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4LettreSortie, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2NomPH, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5PrestaMT, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(147, 147, 147)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1ListePrestaMT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(526, 526, 526)
                                .addComponent(jLabel1NoSejourP, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelType)
                            .addComponent(jLabelNosejor)
                            .addComponent(jLabel1NomPHrespo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1LettreSortiep, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonPrecedent)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonPrecedent)
                .addGap(52, 52, 52)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNosejor)
                    .addComponent(jLabel1NoSejour, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelType)
                    .addComponent(jLabel3Type, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1NomPHrespo)
                    .addComponent(jLabel2NomPH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1NoSejourP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4LettreSortie, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1LettreSortiep, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5PrestaMT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addComponent(jScrollPane1ListePrestaMT, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1050, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPrecedentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrecedentActionPerformed
        fenetre.setVisible(true);
        fenetre.setSize(this.getSize());
        fenetre.setLocationRelativeTo(this);
        this.dispose();
    }//GEN-LAST:event_jButtonPrecedentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPrecedent;
    private javax.swing.JLabel jLabel1InfoPatients;
    private javax.swing.JLabel jLabel1LettreSortiep;
    private javax.swing.JLabel jLabel1NoSejour;
    private javax.swing.JLabel jLabel1NoSejourP;
    private javax.swing.JLabel jLabel1NomPHrespo;
    private javax.swing.JLabel jLabel1Nomp;
    private javax.swing.JLabel jLabel1Prenom;
    private javax.swing.JLabel jLabel2DateDeNaissance;
    private javax.swing.JLabel jLabel2Nom;
    private javax.swing.JLabel jLabel2NomPH;
    private javax.swing.JLabel jLabel2PrenomP;
    private javax.swing.JLabel jLabel2Sexe;
    private javax.swing.JLabel jLabel3Sexep;
    private javax.swing.JLabel jLabel3Type;
    private javax.swing.JLabel jLabel4DateP;
    private javax.swing.JLabel jLabel4LettreSortie;
    private javax.swing.JLabel jLabel5PrestaMT;
    private javax.swing.JLabel jLabelNosejor;
    private javax.swing.JLabel jLabelType;
    private javax.swing.JList<String> jListPrestations;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1ListePrestaMT;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the jListPrestations
     */
    public javax.swing.JList<String> getjListPrestations() {
        return jListPrestations;
    }
}
