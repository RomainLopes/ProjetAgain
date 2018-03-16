package GestionBDD;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Date implements Comparable {
    private int jour;
    private int mois;
    private int annee;
    private int heure;
    private int minute;
    
    public Date(int jour, int mois, int annee, int heure, int min) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
        this.heure= heure;
        this.minute=min;
        }
    
    public Date(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
        }
    
    public String toString() {
        NumberFormat formatter = new DecimalFormat("00");
        return getJour() + "/" + getMois() + "/" + getAnnee() + " à "+formatter.format(getHeure())+":"+formatter.format(getMinute());
        }
    
    public boolean equals(Object o) {
        if (o instanceof Date) {
            Date d = (Date)o;
            return (getAnnee() == d.getAnnee()) && (getMois() == d.getMois()) && (getJour() == d.getJour());
            }
        else
            return false;
        }
    
    // precondition : 'o' est une instance de 'Date' :
    public int compareTo(Object o) {
        Date d = (Date)o;
        if (getAnnee() != d.getAnnee()){
            return getAnnee() - d.getAnnee();
        }
        // ici on a forcement annee == d.annee :
        if (getMois() != d.getMois()){
            return getMois()  - d.getMois();
        }
        // ici on a forcement annee == d.annee et mois == d.mois :
        if (getJour() != d.getJour()) {
            return getJour() - d.getJour();
        } // ici on a forcement annee == d.annee et mois == d.mois et jour == d.jour :
        else {
            return getMinute() - d.getMinute();
        }
    }
    
    public int getJour() { return jour; }
    public int getMois() { return mois; }
    public int getAnnee() { return annee;}
    public int getHeure() { return heure; }
    public int getMinute() { return minute;}
    
    
    
    }
