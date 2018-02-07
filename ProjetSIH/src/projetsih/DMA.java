package projetsih;

import java.util.Vector;

public class DMA {

      /**
   * 
   * @element-type Sejour
   */
  private Vector  mySejour;

  public void consulterDMA() {
      
  }

  public void trierDMA() {
      
  }
  
public void addSejour( Sejour newSejour){
        getMySejour().add(newSejour);
}

    /**
     * @return the mySejour
     */
    public Vector getMySejour() {
        return mySejour;
    }
}