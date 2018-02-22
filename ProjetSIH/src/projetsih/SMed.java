package projetsih;


public class SMed extends PMedical {

    public SMed(String nom, String prenom, String id, String mdp, Service service) {
        super(nom, prenom, id, mdp, service,Fonction.Secrétaire_Medicale );
        
    }
    public SMed(String nom, String prenom, Service service) {
        super(nom, prenom,service,Fonction.Secrétaire_Medicale );
        
    }

    public SMed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


  /*public void creerDM() { 
      DM dm= new DM(Patient p);
      
  }*/

  public void consulterDM() {
  }

  public void transfertDM() {
  }

}