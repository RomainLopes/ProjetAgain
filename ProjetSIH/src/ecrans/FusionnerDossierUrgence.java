/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecrans;

import GestionBDD.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

/**
 *
 * @author lisad
 */
public class FusionnerDossierUrgence extends javax.swing.JFrame {

    private ArrayList<String> p, infoGarde, infoFusion;
    private static PersonnelHospitalier employe;
    private static Patients patient;
    private ArrayList<Patients> lipat;
    private DAO<Patients> PatientsDAO = new PatientsDAO(BDDconnection.getInstance());
    private final JFrame fenetrePre;
    private int index;
    private String ipp;
    private String lastSejour;

    /**
     * Creates new form FusionnerDossierUrgence
     *
     * @param employe
     * @param fenetre
     */
    public FusionnerDossierUrgence(PersonnelHospitalier employe, JFrame fenetre) {
        initComponents();
        FusionnerDossierUrgence.employe = employe;
        lipat = new ArrayList<>();
        fenetrePre = fenetre;

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
        jPanel1RecherchePatient = new javax.swing.JPanel();
        jLabel1RecherchePatient1 = new javax.swing.JLabel();
        jLabel2Nom1 = new javax.swing.JLabel();
        jLabel3Prenom1 = new javax.swing.JLabel();
        jButtonRechercher = new javax.swing.JButton();
        jTextFieldNom = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListPatients = new javax.swing.JList<>();
        jTextFieldPrenom = new javax.swing.JTextField();
        jButtonDossierGarde = new javax.swing.JButton();
        jButtonDossierUrgence = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButtonFusionner = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListGarde = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListFusion = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(200, 200));

        jPanel1.setBackground(new java.awt.Color(65, 131, 215));

        jLabel1.setFont(new java.awt.Font("Wiggle", 0, 24)); // NOI18N
        jLabel1.setText("Fusion Urgence/Service");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel1RecherchePatient.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1RecherchePatient1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel1RecherchePatient1.setText("Recherche d'un patient :");

        jLabel2Nom1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2Nom1.setText("Nom : ");

        jLabel3Prenom1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3Prenom1.setText("Prénom : ");

        jButtonRechercher.setBackground(new java.awt.Color(228, 241, 254));
        jButtonRechercher.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonRechercher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rechercher 2.PNG"))); // NOI18N
        jButtonRechercher.setText("Rechercher");
        jButtonRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRechercherActionPerformed(evt);
            }
        });

        jListPatients.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListPatients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListPatientsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListPatients);

        jTextFieldPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrenomActionPerformed(evt);
            }
        });

        jButtonDossierGarde.setBackground(new java.awt.Color(228, 241, 254));
        jButtonDossierGarde.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonDossierGarde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ajout.PNG"))); // NOI18N
        jButtonDossierGarde.setText("ajouter dossier à garder");
        jButtonDossierGarde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDossierGardeActionPerformed(evt);
            }
        });

        jButtonDossierUrgence.setBackground(new java.awt.Color(228, 241, 254));
        jButtonDossierUrgence.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonDossierUrgence.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ajout.PNG"))); // NOI18N
        jButtonDossierUrgence.setText("ajouter dossier à fusionner");
        jButtonDossierUrgence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDossierUrgenceActionPerformed(evt);
            }
        });

        jButtonFusionner.setBackground(new java.awt.Color(228, 241, 254));
        jButtonFusionner.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonFusionner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fusion.png"))); // NOI18N
        jButtonFusionner.setText("Fusionner");
        jButtonFusionner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFusionnerActionPerformed(evt);
            }
        });

        jListGarde.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListGarde);

        jLabel2.setText("Informations patients conservées ");

        jLabel3.setText("Informations patients urgences");

        jListFusion.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jListFusion);

        jLabel5.setText("rattache toutes les informations du patients des urgences");

        jLabel6.setText("sur le dossier du patient conservé ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtonFusionner, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3))
                .addGap(18, 18, 18)
                .addComponent(jButtonFusionner, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel1RecherchePatientLayout = new javax.swing.GroupLayout(jPanel1RecherchePatient);
        jPanel1RecherchePatient.setLayout(jPanel1RecherchePatientLayout);
        jPanel1RecherchePatientLayout.setHorizontalGroup(
            jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1RecherchePatientLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButtonDossierUrgence, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1RecherchePatientLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1RecherchePatient1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                                    .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2Nom1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3Prenom1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(47, 47, 47)
                                    .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1RecherchePatientLayout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(jButtonRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1RecherchePatientLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonDossierGarde, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        jPanel1RecherchePatientLayout.setVerticalGroup(
            jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                        .addComponent(jLabel1RecherchePatient1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2Nom1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3Prenom1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonDossierGarde)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonDossierUrgence))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1RecherchePatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1RecherchePatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFusionnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFusionnerActionPerformed
        // TODO add your handling code here:
        DossierMedicoAdministratifDAO dmdao = new DossierMedicoAdministratifDAO(BDDconnection.getInstance());
        dmdao.updateIpp(ipp, "180000001"); //(gardé, suppr)
         ObservationsDAO odao = new ObservationsDAO(BDDconnection.getInstance());
        odao.updateIpp("123456789", "180000003");
        PrescriptionsDAO predao = new PrescriptionsDAO(BDDconnection.getInstance());
        predao.updateIpp("123456789", "180000001");

    }//GEN-LAST:event_jButtonFusionnerActionPerformed

    private void jButtonRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRechercherActionPerformed
        lipat = PatientsDAO.findPatientNomPrenom(jTextFieldNom.getText(), jTextFieldPrenom.getText());
        DossierMedicoAdministratifDAO dmadao = new DossierMedicoAdministratifDAO(BDDconnection.getInstance());
        ArrayList<DossierMedicoAdministratif> dmas = dmadao.findPatientNomPrenomService(jTextFieldNom.getText(), jTextFieldPrenom.getText(), "Urgence");
        for (int i = 0; i < lipat.size(); i++) {
            for (int j = 0; j < dmas.size(); j++) {
                if (lipat.get(i).getIpp() == dmas.get(j).getIpp()) {
                    p.add(lipat.get(i).getNompatient() + "  " + lipat.get(i).getPrenompatient() + "   " + lipat.get(i).getDateDeNaissance() + "   " + dmas.get(j).getService());

                } else {
                    p.add(lipat.get(i).getNompatient() + "  " + lipat.get(i).getPrenompatient() + "   " + lipat.get(i).getDateDeNaissance());
                }
            }
        }
        DefaultListModel modele = new DefaultListModel();
        for (String i : p) {
            modele.addElement(i);
        }
        jListPatients.setModel(modele);

    }//GEN-LAST:event_jButtonRechercherActionPerformed

    private void jListPatientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListPatientsMouseClicked
        index = this.jListPatients.getSelectedIndex();
        patient = lipat.get(index);
        ipp = patient.getIpp().substring(1, 1 - patient.getIpp().length());

    }//GEN-LAST:event_jListPatientsMouseClicked

    private void jTextFieldPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrenomActionPerformed

    private void jButtonDossierGardeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDossierGardeActionPerformed
        DossierMedicoAdministratifDAO dmadao = new DossierMedicoAdministratifDAO(BDDconnection.getInstance());
        lastSejour = dmadao.getDernierNumeroSejour(ipp);
        infoGarde.add("Nom: " + patient.getNompatient());
        infoGarde.add("Prénom: " + patient.getPrenompatient());
        infoGarde.add("Dare de naissance: " + patient.getDateDeNaissance());
        ArrayList<DossierMedicoAdministratif> exist = dmadao.find(ipp, lastSejour);
        infoGarde.add("Dernière admission: " + exist.get(0).getService());
        DefaultListModel modele = new DefaultListModel();
        for (String i : infoGarde) {
            modele.addElement(i);
        }
        jListGarde.setModel(modele);


    }//GEN-LAST:event_jButtonDossierGardeActionPerformed

    private void jButtonDossierUrgenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDossierUrgenceActionPerformed
      //ici c'est à modifier
        DossierMedicoAdministratifDAO dmadao = new DossierMedicoAdministratifDAO(BDDconnection.getInstance());
        lastSejour = dmadao.getDernierNumeroSejour(ipp);
        infoGarde.add("Nom: " + patient.getNompatient());
        infoGarde.add("Prénom: " + patient.getPrenompatient());
        infoGarde.add("Dare de naissance: " + patient.getDateDeNaissance());
        ArrayList<DossierMedicoAdministratif> exist = dmadao.find(ipp, lastSejour);
        infoGarde.add("Dernière admission: " + exist.get(0).getService());
        DefaultListModel modele = new DefaultListModel();
        for (String i : infoGarde) {
            modele.addElement(i);
        }
        jListFusion.setModel(modele);


    }//GEN-LAST:event_jButtonDossierUrgenceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDossierGarde;
    private javax.swing.JButton jButtonDossierUrgence;
    private javax.swing.JButton jButtonFusionner;
    private javax.swing.JButton jButtonRechercher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1RecherchePatient1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2Nom1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel3Prenom1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jListFusion;
    private javax.swing.JList<String> jListGarde;
    private javax.swing.JList<String> jListPatients;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel1RecherchePatient;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldPrenom;
    // End of variables declaration//GEN-END:variables
}
