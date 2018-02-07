package projetsih;

public class Patient extends Personnes {

  private int ipp;

  private int ddw; 
  
  private DPI dpi;

  private String localisation;
  
   public Patient(String nom, String prenom, int ipp, String localisation, DPI dpi){
       super(nom, prenom);
       this.ipp=ipp;
       this.localisation=localisation;
       this.dpi=dpi;
   }

}