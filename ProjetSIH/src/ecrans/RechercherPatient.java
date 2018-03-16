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
public class RechercherPatient extends javax.swing.JFrame {

    /**
     * Creates new form RechercherPatient
     */
    private static PersonnelHospitalier phr;
    //private static Patients patient;

    DAO<Patients> PatientsDAO = new PatientsDAO(BDDconnection.getInstance());
    ArrayList<Patients> lipat;

    public RechercherPatient(PersonnelHospitalier ph) {
        initComponents();
        phr = ph;
        lipat = new ArrayList<Patients>();

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
                .addGap(53, 53, 53)
                .addGroup(JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                        .addComponent(jLabelNom)
                        .addGap(104, 104, 104)
                        .addComponent(jLabelFonction))
                    .addComponent(jLabelPrenom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 373, Short.MAX_VALUE)
                .addComponent(jLabelService)
                .addGap(18, 18, 18)
                .addComponent(jButtonDeconnexion)
                .addGap(115, 115, 115))
        );
        JPanelEnTeteMedTechLayout.setVerticalGroup(
            JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                .addGroup(JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabelNom))
                    .addGroup(JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(JPanelEnTeteMedTechLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabelFonction, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JPanelEnTeteMedTechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonDeconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelService))))
                .addContainerGap(40, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel1RecherchePatientLayout = new javax.swing.GroupLayout(jPanel1RecherchePatient);
        jPanel1RecherchePatient.setLayout(jPanel1RecherchePatientLayout);
        jPanel1RecherchePatientLayout.setHorizontalGroup(
            jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(179, 179, 179)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1RecherchePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        jPanel1RecherchePatientLayout.setVerticalGroup(
            jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1RecherchePatientLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1RecherchePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1RecherchePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(132, 132, 132)))
                .addComponent(jButtonRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelEnTeteMedTech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1RecherchePatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelEnTeteMedTech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jPanel1RecherchePatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        ArrayList<String> resultatAffiche = new ArrayList<String>();

        if (phr.getService() == "Administration") {
            lipat = PatientsDAO.findPatientNomPrenom(jTextFieldNom.getText(), jTextFieldPrenom.getText());

        } else {
            lipat = PatientsDAO.findPatientNomPrenomService(jTextFieldNom.getText(), jTextFieldPrenom.getText(), jLabelService.getText());
        }
        for (int i = 0; i < lipat.size(); i++) {
            resultatAffiche.add(lipat.get(i).getNompatient() + "  " + lipat.get(i).getPrenompatient() + "   " + lipat.get(i).getDateDeNaissance());
        }

        DefaultListModel modele = new DefaultListModel();
        for (String i : resultatAffiche) {
            modele.addElement(i);
        }
        jListpatients.setModel(modele);

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
        String idPh = phr.getId().substring(1, phr.getId().length() - 1);

        // Creation en mémoire de la tracabilité 
        Tracabilite pat = new Tracabilite();
        pat = new Tracabilite(ipp, idPh , "02-22-2018"); // date du jour
        DAO<Tracabilite> TracabiliteDAO = new TracabiliteDAO(BDDconnection.getInstance());
        TracabiliteDAO.create(pat);

        //Déclaration variables -----
        DossierMedicoAdministratifDAO dmad = new DossierMedicoAdministratifDAO(BDDconnection.getInstance());
        ArrayList<DossierMedicoAdministratif> allDMA = new ArrayList<DossierMedicoAdministratif>();

        DossierMedicalDAO dms = new DossierMedicalDAO(BDDconnection.getInstance());
        ArrayList<DossierMedical> dm;

        ObservationsDAO obs = new ObservationsDAO(BDDconnection.getInstance());
        ArrayList<Observations> ob;
        ob = obs.findIpp(ipp);
        DefaultListModel observations = new DefaultListModel();
        for (Observations i : ob) {
            observations.addElement(i.getNomacte() + "    " + i.getDateObservation());
        }

        PrescriptionsDAO presc = new PrescriptionsDAO(BDDconnection.getInstance());
        ArrayList<Prescriptions> pr;
        pr = presc.findIpp(ipp);
        DefaultListModel prescriptions = new DefaultListModel();
        for (GestionBDD.Prescriptions i : pr) {
            prescriptions.addElement(i.getIdprescription() + "    " + i.getDateprescription());
        } // 4 espaces

        OperationsDAO ope = new OperationsDAO(BDDconnection.getInstance());
        ArrayList<Operations> op;
        op = ope.findIpp(ipp);
        DefaultListModel operations = new DefaultListModel();
        for (GestionBDD.Operations i : op) {
            operations.addElement(i.getOperation() + "    " + i.getDateoperation());
        }

        ResultatsDAO res = new ResultatsDAO(BDDconnection.getInstance());
        ArrayList<Resultats> re;
        re = res.findIpp(ipp);
        DefaultListModel result = new DefaultListModel();
        for (GestionBDD.Resultats i : re) {
            result.addElement(i.getPrestationmt() + "    " + i.getDateResultat());
        }

        //Instanciation des listes d'objet -----
        allDMA = dmad.findSer(lipat.get(index).getIpp(), "nosejour", "service"); // remplacer par la fonction findlast(ipp)
        // et on aura dmaCurrent= dmad.findlast(ipp)

        boolean x = true;
        System.out.println(phr.getFonction());
        if (x == true && "Secretaire medicale".equals(phr.getFonction())) {
            //JOptionPane.showMessageDialog(null, "Dossier médical existant");

            ConsulterDM sadm = new ConsulterDM(phr, lipat.get(index));
            sadm.setSize(this.getSize());
            sadm.setLocationRelativeTo(this);
            this.dispose();
            sadm.setVisible(true);

            sadm.getjListPrescriptions().setModel(prescriptions);
            sadm.getjListOperations().setModel(operations);
            sadm.getjListObservations().setModel(observations);
            sadm.getjListResultats().setModel(result);

        } else if (x == true && "Administration".equals(phr.getFonction())) {

            DossierMedicoAdministratifDAO phd = new DossierMedicoAdministratifDAO(BDDconnection.getInstance());
            ArrayList<DossierMedicoAdministratif> resultats = new ArrayList<DossierMedicoAdministratif>();

            /*  resultats = phd.findser(ipp, "180100001", "Cardiologie"); // ici utiliser la bonne fonction avec uniquement ipp car la sa n'a pas de service et on veut afficher tous les séjours 

            DefaultListModel num = new DefaultListModel();
            DefaultListModel type = new DefaultListModel();
            DefaultListModel date = new DefaultListModel();

            for (DossierMedicoAdministratif i : resultats) {
                num.addElement(i.getNosejour());
                date.addElement(i.getDateentree());
                type.addElement(i.getType());
          
            }*/
            CreerNosejour sadm = new CreerNosejour(phr, lipat.get(index));
            sadm.setSize(this.getSize());
            sadm.setLocationRelativeTo(this);
            this.dispose();
            sadm.setVisible(true);

            /* sadm.getjListNoSejour().setModel(num);
            sadm.getjListDate().setModel(date);
            sadm.getjListType().setModel(type);*/
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

        } else { // pH
            if (x == true && "Urgence".equals(phr.getService())) { // ajouter le .getType()

                MedUrgenceAccueil inte = new MedUrgenceAccueil(phr, lipat.get(index), ob);
                inte.setSize(this.getSize());
                inte.setLocationRelativeTo(this);
                this.dispose();
                inte.setVisible(true);
                inte.getjListPrescriptions().setModel(prescriptions);
                inte.getjListObservations().setModel(observations);
            } else if (x == true && "Radiologie".equals(phr.getService())) {

                MedRadioAccueil inte = new MedRadioAccueil(phr, lipat.get(index), ob, re);
                inte.setSize(this.getSize());
                inte.setLocationRelativeTo(this);
                this.dispose();
                inte.setVisible(true);
                inte.getjListObservations().setModel(observations);
                inte.getjListResultats().setModel(result);

            } else if (x == true && "Anesthesie".equals(phr.getService())) {

                MedAnestAccueil inte = new MedAnestAccueil(phr, lipat.get(index), ob, re);
                inte.setSize(this.getSize());
                inte.setLocationRelativeTo(this);
                this.dispose();
                inte.setVisible(true);

                inte.getjListPrescriptions().setModel(prescriptions);
                inte.getjListObservations().setModel(observations);
                inte.getjListResultats().setModel(result);
            } else if (x == true && phr.getService() == "Laboratoire d'analyse" || phr.getService() == "Hematologie" || phr.getService() == "Anapathologie") {

                MedTechAccueil inte = new MedTechAccueil(phr, lipat.get(index), ob, re);
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
