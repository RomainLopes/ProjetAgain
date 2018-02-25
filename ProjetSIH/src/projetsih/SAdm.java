package projetsih;

public class SAdm extends PHospitalier {
    String id;
    String mdp;
    Fonction fonction;

    public SAdm(String nom, String prenom, String service) {
        super(nom,prenom,"aucun",Fonction.Secrétaire_Administrative);

    }


    public void consulterDMA() {
        
    }

    public void creerDMA() {
    }

    public void transfererDMA() {
    }

}
