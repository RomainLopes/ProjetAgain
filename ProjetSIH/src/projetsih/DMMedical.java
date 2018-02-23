package projetsih;

import java.util.Vector;

public class DMMedical extends DM {

  private Vector <Prescriptions>  myPrescriptions;

    public DMMedical(Patient p) {
        super(p);
    }

  
    public Vector <Prescriptions> getMyPrescriptions() {
        return myPrescriptions;
    }

    public void setMyPrescriptions(Vector <Prescriptions> myPrescriptions) {
        this.myPrescriptions = myPrescriptions;
    }
    
    public String consulterDM(Patient p, Service s){
      String afficher= super.consulterDM(p, s);
      afficher+= "Prescriptions: " + "\n \n "; 
      for (Prescriptions pr: myPrescriptions){
        
    }
      
      return afficher;
  }

}