package projetsih;

public class DMAnesthesie extends DMMedical {

    private Service correspondance; // service qui demande l'exam 

    public DMAnesthesie(Patient p) {
        super(p);

    }

    public String consulterDM(Patient p, Service s) {
        super.consulterDM(p, s);
        String h="";// a enlever
        return (h);

    }
}
