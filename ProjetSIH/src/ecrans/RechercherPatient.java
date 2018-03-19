/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecrans;

import GestionBDD.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author lisad
 */
public class RechercherPatient extends javax.swing.JFrame {

    /**
     * Creates new form RechercherPatient
     */
    private static PersonnelHospitalier phr;
    //private static Patients patient;
    String dateDuJour = new SimpleDateFormat("MM-dd-yyyy").format(Calendar.getInstance().getTime());

    DAO<Patients> PatientsDAO = new PatientsDAO(BDDconnection.getInstance());
    ArrayList<Patients> lipat;

    /**
     *
     * @param ph
     */
    public RechercherPatient(PersonnelHospitalier ph) {
        initComponents();
        phr = ph;

        jLabelNom.setText(ph.getNomph());
        jLabelPrenom.setText(ph.getPrenomph());
        jLabelFonction.setText(ph.getFonction());
        jLabelService.setText(ph.getService());
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
        setMinimumSize(new java.awt.Dimension(200, 200));

        JPanelEnTeteMedTech.setBackground(new java.awt.Color(65, 131, 215));
        JPanelEnTeteMedTech.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelFonction.setFont(new java.awt.Font("Wiggle", 0, 24)); // NOI18N
        jLabelFonction.setText("Fonction");

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

        jLabelService.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelService.setText("Service");

        javax.swing.GroupLayout JPanelEnTeteMedTechLayout = new javax.swing.GroupLayout(JPanelEnTeteMedTech);
        JPanelEnTeteMedTech.setLayout(JPanelEnTeteMedTechLayout);
        JPanelEnTeteMedTechLayout.setHorizontalGroup(
            JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAccueil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPrenom)
                    .addComponent(jLabelNom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelFonction)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelService)
                .addGap(39, 39, 39)
                .addComponent(jButtonDeconnexion)
                .addContainerGap())
        );
        JPanelEnTeteMedTechLayout.setVerticalGroup(
            JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                .addGroup(JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelNom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jLabelPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonDeconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelService)
                        .addComponent(jLabelFonction, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        jPanel1RecherchePatient.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1RecherchePatient.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel1RecherchePatient.setText("Recherche d'un patient :");

        jLabel2Nom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2Nom.setText("Nom : ");

        jLabel3Prenom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3Prenom.setText("Prénom : ");

        jButtonRechercher.setBackground(new java.awt.Color(228, 241, 254));
        jButtonRechercher.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonRechercher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rechercher 2.PNG"))); // NOI18N
        jButtonRechercher.setText("Rechercher");
        jButtonRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRechercherActionPerformed(evt);
            }
        });

        jListpatients.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListpatients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListpatientsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListpatients);

        javax.swing.GroupLayout jPanel1RecherchePatientLayout = new javax.swing.GroupLayout(jPanel1RecherchePatient);
        jPanel1RecherchePatient.setLayout(jPanel1RecherchePatientLayout);
        jPanel1RecherchePatientLayout.setHorizontalGroup(
            jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                                .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                                        .addComponent(jLabel2Nom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                                        .addComponent(jLabel3Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)))
                                .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel1RecherchePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1RecherchePatientLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addGap(90, 90, 90))
        );
        jPanel1RecherchePatientLayout.setVerticalGroup(
            jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                        .addComponent(jLabel1RecherchePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2Nom, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addComponent(jButtonRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(76, 76, 76))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanelEnTeteMedTech, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1RecherchePatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanelEnTeteMedTech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel1RecherchePatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAccueilActionPerformed
        Identification id = new Identification();
        id.setSize(this.getSize());
        id.setLocationRelativeTo(this);
        this.dispose();
        id.setVisible(true);
    }//GEN-LAST:event_jButtonAccueilActionPerformed

    private void jButtonRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRechercherActionPerformed
        ArrayList<String> resultatAffiche = new ArrayList<>();

        if ("Administration".equals(phr.getFonction())) {
            lipat = PatientsDAO.findPatientNomPrenom(jTextFieldNom.getText(), jTextFieldPrenom.getText());

        } else {
            lipat = PatientsDAO.findPatientNomPrenomService(jTextFieldNom.getText(), jTextFieldPrenom.getText(), jLabelService.getText());
        }
        if (lipat.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Aucun patient trouvé");

        } else {
            for (int i = 0; i < lipat.size(); i++) {
                resultatAffiche.add(lipat.get(i).getNompatient() + "  " + lipat.get(i).getPrenompatient() + "   " + lipat.get(i).getDateDeNaissance());
            }
            DefaultListModel modele = new DefaultListModel();
            resultatAffiche.stream().map((i) -> {
                modele.addElement(i);
                return i;
            }).forEachOrdered((_item) -> {
            });
            jListpatients.setModel(modele);
        }
        //int ipp = Integer.parseInt(resultatRecherche.get(1).substring(1, resultatRecherche.get(1).length() - 1));
    }//GEN-LAST:event_jButtonRechercherActionPerformed

    private void jButtonDeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeconnexionActionPerformed
        Identification iden = new Identification();
        iden.setSize(this.getSize());
        iden.setLocationRelativeTo(this);
        this.dispose();
        iden.setVisible(true);
    }//GEN-LAST:event_jButtonDeconnexionActionPerformed

    private void jListpatientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListpatientsMouseClicked
        int index = jListpatients.getSelectedIndex();
        String ipp = lipat.get(index).getIpp().substring(1, lipat.get(index).getIpp().length() - 1);

        // Creation en mémoire de la tracabilité 
        Tracabilite pat;
        pat = new Tracabilite(ipp, phr.getId(), dateDuJour);
        DAO<Tracabilite> TracabiliteDAO = new TracabiliteDAO(BDDconnection.getInstance());
        TracabiliteDAO.create(pat);

        //Déclaration variables -----
        DossierMedicoAdministratifDAO dmad = new DossierMedicoAdministratifDAO(BDDconnection.getInstance());
        ArrayList<DossierMedicoAdministratif> allDMA = new ArrayList<>();

        DossierMedicalDAO dms = new DossierMedicalDAO(BDDconnection.getInstance());
        ArrayList<DossierMedical> dm;

        ObservationsDAO obs = new ObservationsDAO(BDDconnection.getInstance());
        ArrayList<Observations> ob;
        ob = obs.findIpp(ipp);
        DefaultListModel observations = new DefaultListModel();
        ob.forEach((i) -> {
            observations.addElement(i.getNomacte() + "    " + i.getDateObservation());
        });

        PrescriptionsDAO presc = new PrescriptionsDAO(BDDconnection.getInstance());
        ArrayList<Prescriptions> pr;
        pr = presc.findIpp(ipp);
        DefaultListModel prescriptions = new DefaultListModel();
        pr.forEach((i) -> {
            prescriptions.addElement(i.getIdprescription() + "    " + i.getDateprescription());
        }); // 4 espaces

        OperationsDAO ope = new OperationsDAO(BDDconnection.getInstance());
        ArrayList<Operations> op;
        op = ope.findIpp(ipp);
        DefaultListModel operations = new DefaultListModel();
        op.forEach((i) -> {
            operations.addElement(i.getOperation() + "    " + i.getDateoperation());
        });

        ResultatsDAO res = new ResultatsDAO(BDDconnection.getInstance());
        ArrayList<Resultats> re;
        re = res.findIpp(ipp);
        DefaultListModel result = new DefaultListModel();
        re.forEach((i) -> {
            result.addElement(i.getPrestationmt() + "    " + i.getDateResultat());
        });

        //Instanciation des listes d'objet -----
        boolean x = true;

        if (x == true && "Secretaire medicale".equals(phr.getFonction())) {
            //JOptionPane.showMessageDialog(null, "Dossier médical existant");

            SmAccueil rechercher = new SmAccueil(phr,lipat.get(index));
        rechercher.setSize(this.getSize());
        rechercher.setLocationRelativeTo(this);
        this.dispose();
        rechercher.setVisible(true);
           /* sadm.getjListPrescriptions().setModel(prescriptions);
            sadm.getjListOperations().setModel(operations);
            sadm.getjListObservations().setModel(observations);
            sadm.getjListResultats().setModel(result);*/

        } else if (x == true && "Administration".equals(phr.getFonction())) {

            DossierMedicoAdministratifDAO phd = new DossierMedicoAdministratifDAO(BDDconnection.getInstance());
            ArrayList<DossierMedicoAdministratif> resultats = new ArrayList<>();

            CreerNosejour sadm = new CreerNosejour(phr, lipat.get(index), this);
            sadm.setSize(this.getSize());
            sadm.setLocationRelativeTo(this);
            this.dispose();
            sadm.setVisible(true);

        } else if (x == true && "Interne".equals(phr.getFonction())) {

            InterneAccueil inte = new InterneAccueil(phr, lipat.get(index), ob);
            inte.setSize(this.getSize());
            inte.setLocationRelativeTo(this);
            this.dispose();
            inte.setVisible(true);

            inte.getjListObservations().setModel(observations);

        } else if (x == true && "Infirmier".equals(phr.getFonction())) {

            InfirmierAccueil inte = new InfirmierAccueil(phr, lipat.get(index), ob, op);
            inte.setSize(this.getSize());
            inte.setLocationRelativeTo(this);
            this.dispose();
            inte.setVisible(true);

            inte.getjListOperations().setModel(operations);
            inte.getjListObservations().setModel(observations);

        } else {
            if (x == true && "Urgence".equals(phr.getService())) {

                MedUrgenceAccueil inte = new MedUrgenceAccueil(phr, lipat.get(index), ob);
                inte.setSize(this.getSize());
                inte.setLocationRelativeTo(this);
                this.dispose();
                inte.setVisible(true);
                inte.getjListPrescriptions().setModel(prescriptions);
                inte.getjListObservations().setModel(observations);
            } else if (x == true && "Radiologie".equals(phr.getService())) {

                MedRadioAccueil inte = new MedRadioAccueil(phr, lipat.get(index), ob, re, pr);
                inte.setSize(this.getSize());
                inte.setLocationRelativeTo(this);
                this.dispose();
                inte.setVisible(true);
                inte.getjListObservations().setModel(observations);
                inte.getjListResultats().setModel(result);

            } else if (x == true && "Anesthesie".equals(phr.getService())) {

                MedAnestAccueil inte = new MedAnestAccueil(phr, lipat.get(index), ob, re, pr);
                inte.setSize(this.getSize());
                inte.setLocationRelativeTo(this);
                this.dispose();
                inte.setVisible(true);

                inte.getjListPrescriptions().setModel(prescriptions);
                inte.getjListObservations().setModel(observations);
                inte.getjListResultats().setModel(result);
            } else if (x == true && "Laboratoire d'analyse".equals(phr.getService()) || "Hematologie".equals(phr.getService()) || "Anapathologie".equals(phr.getService())) {

                MedTechAccueil inte = new MedTechAccueil(phr, lipat.get(index), ob, re, pr);
                inte.setSize(this.getSize());
                inte.setLocationRelativeTo(this);
                this.dispose();
                inte.setVisible(true);

                inte.getjListPrescriptions().setModel(prescriptions);
                inte.getjListObservations().setModel(observations);
                inte.getjListResultats().setModel(result);
            } else {
                MedClinAccueil inte = new MedClinAccueil(phr, lipat.get(index), ob, re);
                inte.setSize(this.getSize());
                inte.setLocationRelativeTo(this);
                this.dispose();
                inte.setVisible(true);
                inte.getjListPrescriptions().setModel(prescriptions);
                inte.getjListObservations().setModel(observations);
                inte.getjListResultats().setModel(result);

            }
        }


    }//GEN-LAST:event_jListpatientsMouseClicked

    /**
     *
     * @return phr
     */
    public static PersonnelHospitalier getEmploye() {
        return phr;
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
