package projetsih;

public class SAdm extends Personnes {
    String id;
    String mdp;
    Fonction fonction;

    public SAdm(String nom, String prenom, String id, String mdp){
    super(nom,prenom);
    this.id=id;
    this.mdp=mdp;
    }
    public SAdm(String nom, String prenom) {
        super(nom,prenom);
      this.fonction= Fonction.Secrétaire_Medicale;
    }
    /*public SAdm(String nom, String prenom, String service) {
        super(nom,prenom,service,Fonction.Secrétaire_Medicale);

    }*/


    public void consulterDMA() {
        
    }

    public void creerDMA() {
    }

    public void transfererDMA() {
    }

}
