/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsih;

/**
 *
 * @author vodou
 */
public enum Service { // jepense que c'est mieux de les définir ici
    Cardiologie("Cardiologie","Clinique"),
    Urologie("Urologie","Clinique"),
    Gériatrie("Gériatrie","Clinique"),
    Neurochirurgie("Neurochirurgie","Clinique"),
    Pneumologie("Pneumologie","Clinique"),
    Radiologie("Radiologie","Médico-technique"),
    Hématologie("Hématologie","Médico-technique"),
    Anapathologie("Anapathologie","Médico-technique"),
    Anesthésie("Anesthésie","Médico-technique"),
    Urgence("Urgence","Urgence")
    ;
    
    private String nom;
    private String type;
    Service(String name, String type){
        this.nom =nom;
        this.type=type;
    }
}
