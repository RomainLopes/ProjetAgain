package projetsih;

import java.util.Vector;

public abstract class DMMedical extends DM {

  private Vector <Prescriptions>  myPrescriptions;

  
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