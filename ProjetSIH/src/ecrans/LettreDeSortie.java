/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecrans;

import GestionBDD.*;
import javax.swing.JOptionPane;

/**
 *
 * @author vodou
 */
public class LettreDeSortie extends javax.swing.JFrame {
      private static PersonnelHospitalier employe;
    private static Patients patient;
        private DossierMedicoAdministratif dma;



    /**
     * Creates new form exemple
     */
    public LettreDeSortie(PersonnelHospitalier personnel,Patients patient) {
        initComponents();
        employe=personnel;
        this.patient=patient;
       // JScrollPane je=new JScrollPane();
  
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaLettre = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButtonPrecedent = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel3Sexep4 = new javax.swing.JLabel();
        jLabel2Sexe4 = new javax.swing.JLabel();
        jLabel4DateP4 = new javax.swing.JLabel();
        jLabel2DateDeNaissance4 = new javax.swing.JLabel();
        jLabel1Nomp4 = new javax.swing.JLabel();
        jLabel2Nom4 = new javax.swing.JLabel();
        jLabel2PrenomP4 = new javax.swing.JLabel();
        jLabel1Prenom4 = new javax.swing.JLabel();
        jLabel1InfoPatients4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(200, 200));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel1.setText("Editer la lettre de sortie");

        jTextAreaLettre.setColumns(20);
        jTextAreaLettre.setRows(5);
        jScrollPane1.setViewportView(jTextAreaLettre);

        jButton1.setBackground(new java.awt.Color(228, 241, 254));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/enregistrer.PNG"))); // NOI18N
        jButton1.setText("Enregistrer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonPrecedent.setBackground(new java.awt.Color(228, 241, 254));
        jButtonPrecedent.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonPrecedent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bouton précedent.PNG"))); // NOI18N
        jButtonPrecedent.setText("Précédent");

        jLabel3Sexep4.setText("jLabel1");

        jLabel2Sexe4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2Sexe4.setText("Sexe :");

        jLabel4DateP4.setText("jLabel1");

        jLabel2DateDeNaissance4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2DateDeNaissance4.setText("Date de Naissance : ");

        jLabel1Nomp4.setText("jLabel1");

        jLabel2Nom4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2Nom4.setText("Nom : ");

        jLabel2PrenomP4.setText("jLabel1");

        jLabel1Prenom4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1Prenom4.setText("Prénom : ");

        jLabel1InfoPatients4.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel1InfoPatients4.setText("Informations du patient ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1InfoPatients4)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel2Nom4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1Nomp4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel1Prenom4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2PrenomP4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel2Sexe4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3Sexep4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel2DateDeNaissance4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4DateP4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1InfoPatients4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3Sexep4)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2Sexe4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1Nomp4)
                        .addComponent(jLabel2Nom4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4DateP4)
                    .addComponent(jLabel2DateDeNaissance4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2PrenomP4)
                    .addComponent(jLabel1Prenom4)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButtonPrecedent))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(324, 324, 324)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jButtonPrecedent)
                .addGap(14, 14, 14)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// (String ipp,String nosejour,String idph,String lettre)   

 DAO<DossierMedicoAdministratif> DossierMedicoAdministratifDAO = new DossierMedicoAdministratifDAO(BDDconnection.getInstance());
      String noSejour=DossierMedicoAdministratifDAO.getDernierNumeroSejour(patient.getIpp());

        dma = DossierMedicoAdministratifDAO.findSer(patient.getIpp(), noSejour, employe.getService()).get(0); 
         GestionBDD.LettreDeSortie lettre;
         
        lettre = new GestionBDD.LettreDeSortie(patient.getIpp(), noSejour,dma.getIdph(),jTextAreaLettre.getText());
          LettreDeSortieDAO lettred = new LettreDeSortieDAO(BDDconnection.getInstance());
        boolean ok = lettred.create(lettre);
         if (ok){
                               JOptionPane.showMessageDialog(null, "La lettre de sortie a bien été créée");
       }else {
            JOptionPane.showMessageDialog(null, " La lettre de sortie n'a pas pu être créée. Veillez recommencer.");
       }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonPrecedent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1InfoPatients;
    private javax.swing.JLabel jLabel1InfoPatients1;
    private javax.swing.JLabel jLabel1InfoPatients2;
    private javax.swing.JLabel jLabel1InfoPatients3;
    private javax.swing.JLabel jLabel1InfoPatients4;
    private javax.swing.JLabel jLabel1Nomp;
    private javax.swing.JLabel jLabel1Nomp1;
    private javax.swing.JLabel jLabel1Nomp2;
    private javax.swing.JLabel jLabel1Nomp3;
    private javax.swing.JLabel jLabel1Nomp4;
    private javax.swing.JLabel jLabel1Prenom;
    private javax.swing.JLabel jLabel1Prenom1;
    private javax.swing.JLabel jLabel1Prenom2;
    private javax.swing.JLabel jLabel1Prenom3;
    private javax.swing.JLabel jLabel1Prenom4;
    private javax.swing.JLabel jLabel2DateDeNaissance;
    private javax.swing.JLabel jLabel2DateDeNaissance1;
    private javax.swing.JLabel jLabel2DateDeNaissance2;
    private javax.swing.JLabel jLabel2DateDeNaissance3;
    private javax.swing.JLabel jLabel2DateDeNaissance4;
    private javax.swing.JLabel jLabel2Nom;
    private javax.swing.JLabel jLabel2Nom1;
    private javax.swing.JLabel jLabel2Nom2;
    private javax.swing.JLabel jLabel2Nom3;
    private javax.swing.JLabel jLabel2Nom4;
    private javax.swing.JLabel jLabel2PrenomP;
    private javax.swing.JLabel jLabel2PrenomP1;
    private javax.swing.JLabel jLabel2PrenomP2;
    private javax.swing.JLabel jLabel2PrenomP3;
    private javax.swing.JLabel jLabel2PrenomP4;
    private javax.swing.JLabel jLabel2Sexe;
    private javax.swing.JLabel jLabel2Sexe1;
    private javax.swing.JLabel jLabel2Sexe2;
    private javax.swing.JLabel jLabel2Sexe3;
    private javax.swing.JLabel jLabel2Sexe4;
    private javax.swing.JLabel jLabel3Sexep;
    private javax.swing.JLabel jLabel3Sexep1;
    private javax.swing.JLabel jLabel3Sexep2;
    private javax.swing.JLabel jLabel3Sexep3;
    private javax.swing.JLabel jLabel3Sexep4;
    private javax.swing.JLabel jLabel4DateP;
    private javax.swing.JLabel jLabel4DateP1;
    private javax.swing.JLabel jLabel4DateP2;
    private javax.swing.JLabel jLabel4DateP3;
    private javax.swing.JLabel jLabel4DateP4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaLettre;
    // End of variables declaration//GEN-END:variables
}
