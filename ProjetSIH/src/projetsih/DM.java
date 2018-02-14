package projetsih;

import java.util.Vector;

public class DM {

    private Service service;

    private String resultats;// ici il faut redéf le type pour pouvoir y associer un nom car un résultat dépend de l'acte fait 
    private Vector<Observation> observations;

    public Service getService() {
        return service;
    }

    public String getResultats() {
        return resultats;
    }

    public Vector getObservations() {
        return observations;
    }
// ici il faut voir comment sont gérées les bd pour voir comment récupéer les infos avec le DM pour la tracabilité 
    public String consulterDM(Patient p, Service s) { // ici ce sont les medtech
        String afficher = "";
        if (p.getDpi().getMyDM().service == s) {
            afficher += "Résultats des prestations réalisées:" + "\n" + p.getDpi().getMyDM().resultats;
            afficher += "\n \n \n";
            afficher += "Observation: " + "\n" + p.getDpi().getMyDM().observations;
        }
        System.out.println(afficher);
        return afficher;
    }

    public void trierDM() {
    }

}
