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
    Urgence("Urgence","Clinique")
    ;

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
    
    private String nom;
    private String type;
    Service(String name, String type){
        this.nom =name;
        this.type=type;
    }
    @Override
    public String toString(){
        return nom;
    }
}
