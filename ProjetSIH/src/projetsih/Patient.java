package projetsih;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Patient extends Personnes {

    private int ipp;
    private String adresse;
    private DPI dpi;
    private String localisation;
    private Date dateNaissance;
    private String sexe;
    private String dateString;

    public Patient(String nom, String prenom, int ipp, String localisation, DPI dpi, String adresse, Date date, String sexe) {
        super(nom, prenom);
        this.ipp = ipp;
        this.localisation = localisation;
        this.dpi = dpi;
        this.adresse = adresse;
        this.dateNaissance = date;
        this.sexe = sexe;;
        dateString = this.dateNaissance.toString();
    }

    public Patient(String nom, String prenom, String date) {
        super(nom, prenom);
        dateString = date;
    }

    public DPI getDpi() {
        return dpi;
    }

    public String getLocalisation() {
        return localisation;
    }

    /**
     * @param localisation the localisation to set
     */
    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    ArrayList<String> pat = new ArrayList(); // ca représente ta liste on pourra la mettre en paramètre

    public void afficher(ArrayList<String> pat) { // afficher sur une jlist 
        JList maJList = null; // là c'est juste pour enlever l'erreur en bas car jai pas trouvé la JList 

        DefaultListModel modele = new DefaultListModel();
        for (String i : pat) {
            modele.addElement(i);
        }
        maJList.setModel(modele);

    }

    public void afficher2() { // afficher sur un jpanel avec jscrollbar

        JPanel panEvent = new JPanel(); //Panel où on place tous les événements
        JScrollPane scroll = new JScrollPane(panEvent, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setBounds(0, 0, 930, 610);
        //this.add(scroll);//ajout du panel qui contient tous les panel/event
//on a donc un panel avec dedans des panels/event et une scrollbar sur la gauche

//j'ajoute quelques boutons pour remplir le jpanel chaque boutton correspond à un nom de patient
        panEvent.setLayout(new GridLayout(50, 1));
        for (int i = 0; i < 50; i++) {
            for (String j : pat) {
                panEvent.add(new JButton(j));
            }
        }
        //setSize(930, 610);//je redimensionne la fenetre
        //setVisible(true);
    }

    /**
     * @return the ipp
     */
    public int getIpp() {
        return ipp;
    }

    /**
     * @return the dateNaissance
     */
    public Date getDateNaissance() {
        return dateNaissance;
    }

    /**
     * @param dateNaissance the dateNaissance to set
     */
    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    /**
     * @return the sexe
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * @param sexe the sexe to set
     */
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
}
