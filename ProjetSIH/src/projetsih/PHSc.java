package projetsih;

public class PHSc extends PMedical {


    public PHSc(String nom, String prenom, String id, String mdp, Service service) {
        super(nom, prenom, id, mdp, service,Fonction.Practicien_Hospitalier );
        
    }

  public void prescrire() {
  }

  public void demanderResultat() {
  }

  public String editerLettreDeSortie(String lettre) { 
      // à remplir comment éditer la lettre de sortie et l'imprimer
      return lettre;
  }

}