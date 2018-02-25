package projetsih;


public class SMed extends PHospitalier {

    public SMed(String nom, String prenom, String id, String mdp, Service service) {
        super(nom, prenom, id, mdp, service,Fonction.Secrétaire_Medicale );
        
    }
    public SMed(String nom, String prenom, Service service) {
        super(nom, prenom,service,Fonction.Secrétaire_Medicale );
        
    }
     public SMed(String nom, String prenom, String service) {
        super(nom,prenom,service,Fonction.Secrétaire_Medicale);

    }

    public SMed() {
    }


  /*public void creerDM() { 
      DM dm= new DM(Patient p);
      
  }*/

  public void consulterDM(Patient patient) { // elle recherche juste
      
  }

  public void transfertDM() {
  }
  
  public void creerDM(Patient p){
      DM dm= new DM(p);
     
  }

}