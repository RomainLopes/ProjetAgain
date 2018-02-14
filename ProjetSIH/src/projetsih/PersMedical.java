package projetsih;

import java.util.Enumeration;

public class PersMedical extends Personnes {

  private String id;
  private String mdp;
  private Fonction fonction;

  private Services service;
  
  
  
  public PersMedical(String nom, String prenom, String id, String mdp, Services service, Fonction fonction){
      super(nom,prenom);
      this.id= id;
      this.mdp=mdp;
      this.service= service;
      this.fonction= fonction;
  }
  
  public void modifierMDP(String ancien, String nouveau) {
        if (this.getMdp().equals(ancien)) {
            setMdp(nouveau);
        }

}

    /**
     * @return the mdp
     */
    public String getMdp() {
        return mdp;
    }

    /**
     * @param mdp the mdp to set
     */
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the fonction
     */
    public Fonction getFonction() {
        return fonction;
    }

    /**
     * @return the service
     */
    public Services getService() {
        return service;
    }
}
