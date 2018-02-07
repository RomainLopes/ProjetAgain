package projetsih;

import java.util.Vector;
import java.util.Date;

public class Sejour {

  private int numSejour; // définir le pattern comme il faut 

  private Date date;

  private PHSc pHRespo;

  private String lettreSortie;

      /**
   * 
   * @element-type Prestation
   */
  public Vector <Acte>  myPrestation;
  
  public Sejour (int numSejour, Date date, PHSc pHRespo){
      this.date= date; 
      lettreSortie= pHRespo.lettreDeSortie("");
//récupéer le texte édité par le respo
      this.numSejour= numSejour; 
      this.pHRespo= pHRespo;
     
  }

  public void ajouterPrestation(Prestation p){
      myPrestation.add(p.getActe());
  }
  
  public void formatSejour(){
      String afficher="";
      System.out.println("Séjour N°: " + " "+ numSejour);
      System.out.println("Date: " + date);
      System.out.println("Médecin responsable: " + pHRespo.getNom()+" "+ pHRespo.getPrenom());
  }
}