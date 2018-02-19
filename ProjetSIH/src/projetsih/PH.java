package projetsih;

public class PH extends PMedical {

  public boolean chefService;

    public PH(String nom, String prenom, String id, String mdp, Service service) {
        super(nom, prenom, id, mdp, service,Fonction.Practicien_Hospitalier );
    }

    

}