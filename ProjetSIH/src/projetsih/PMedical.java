package projetsih;

import java.util.Enumeration;

public class PMedical extends Personnes {

  private String id;
  private String mdp;
  private Fonction fonction;

  private Service service;
  private String nomService;
  
  
  public PMedical(){
      
  }
  public PMedical(String nom, String prenom, String id, String mdp, Service service, Fonction fonction){
      super(nom,prenom);
      this.id= id;
      this.mdp=mdp;
      this.service = service;
      this.fonction= fonction;
      nomService= service.toString();
  }
  public PMedical(String nom, String prenom, Service service, Fonction fonction){
      super(nom,prenom);
      this.service= service;
      this.fonction= fonction;
      nomService= service.toString();
  }
  public PMedical(String nom, String prenom, String nomService, Fonction fonction) {
        super(nom,prenom);
      this.nomService= nomService;
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
    public Service getService() {
        return service;
    }
    
}
