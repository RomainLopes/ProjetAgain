package projetsih;

import java.util.Date;

public class Prestation {

  private Service service;

  private String nomPH;

  private Date date;

  private Acte acte;
  
  public Prestation(Service service, String nom, Date date, Acte acte ){
      this.acte= acte;
      this.date= date;
      this.nomPH= nom; 
      this.service= service;
  }

  
 /** ont été remplacé par les getters 
  * public void lireService() {
  }

  public void lireNom() {
  }

  public void lireActe() {
  }

    /**
     * @return the service
     */
    public Service getService() {
        return service;
    }

    /**
     * @return the nom
     */
    public String getNomph() {
        return nomPH;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @return the acte
     */
    public Acte getActe() {
        return acte;
    }

}