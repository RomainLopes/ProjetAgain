package projetsih;

public class Personnes {

    /**
     * @return the nom
     */
    public Personnes(){
        
    }
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

  private String nom;

  private String prenom;
  public Personnes(String nom, String prenom){
      this.nom=nom;
      this.prenom=prenom;
  }

}