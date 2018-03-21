/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interoperabilite;

/**
 *
 * @author romel
 */
public class TestServeur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int port = 4445;
        interoperabilite.ServeurT s = new interoperabilite.ServeurT(port);
    }
    
}
