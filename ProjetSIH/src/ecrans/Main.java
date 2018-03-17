/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecrans;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.SwingUtilities;

/**
 *
 * @author vodou
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date c= new Date();
      // System.out.println(c.getMonth() +"-"+c.getDate()+"-"+c.getYear()); 
       String dateDuJour = new SimpleDateFormat("MM-dd-yyyy").format(Calendar.getInstance().getTime());
System.out.println(dateDuJour);
        
      /* SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Identification pageDeCo = new Identification();

            }
        });*/
    }
    
}
