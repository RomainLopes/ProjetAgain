package projetsih;

public class PersHospitalier extends Personnes {

  public String id;

  private String mdp;
  
  public PersHospitalier(String nom, String prenom, String id, String mdp){
      super(nom,prenom);
      this.id= id;
      this.mdp=mdp;
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
}
