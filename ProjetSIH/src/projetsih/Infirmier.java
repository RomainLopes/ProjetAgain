package projetsih;

public class Infirmier extends PMedical {

    public Infirmier(String nom, String prenom, String id, String mdp, Service service, Fonction fonction) {
        super(nom, prenom, id, mdp, service, fonction);
    }

    public Infirmier() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


  public void ajouterOperation() {
  }

}