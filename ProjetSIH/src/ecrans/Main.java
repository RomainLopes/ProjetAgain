/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecrans;

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

        
       SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Identification pageDeCo = new Identification();

            }
        });
    }
    
}
