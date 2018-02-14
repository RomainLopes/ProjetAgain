package projetsih;

public class PHSc extends PersMedical {

    public PHSc(String nom, String prenom, String id, String mdp, Service service, Fonction fonction) {
        super(nom, prenom, id, mdp, service, fonction);
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