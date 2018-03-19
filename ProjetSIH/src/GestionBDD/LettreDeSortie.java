/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionBDD;

/**
 *
 * @author romel
 */
public class LettreDeSortie {
    
    /**
     * ipp
     */
    private String ipp = "";
     /**
     * nosejour
     */
    private String nosejour;
    /**
     * idph
     */
    private String idph = "";
     /**
     * texte
     */
    private String lettre = "";

    /**
     *
     * @param ipp
     * @param nosejour
     * @param idph
     * @param lettre
     */
    public LettreDeSortie (String ipp,String nosejour,String idph,String lettre){
        this.ipp=ipp;
        this.nosejour=nosejour;
        this.idph=idph;
        this.lettre=lettre;
    }
    
    /**
     * Constructeur par défaut
     */
    public LettreDeSortie () {}
    
    /**
     * @return the ipp
     */
    public String getIpp() {
        return ipp;
    }

    /**
     * @param ipp the ipp to set
     */
    public void setIpp(String ipp) {
        this.ipp = ipp;
    }

    /**
     * @return the idph
     */
    public String getIdph() {
        return idph;
    }

    /**
     * @param idph the idph to set
     */
    public void setIdph(String idph) {
        this.idph = idph;
    }

    /**
     * @return the nosejour
     */
    public String getNosejour() {
        return nosejour;
    }

    /**
     * @param nosejour the nosejour to set
     */
    public void setNosejour(String nosejour) {
        this.nosejour = nosejour;
    }

    /**
     * @return the lettre
     */
    public String getLettre() {
        return lettre;
    }

    /**
     * @param lettre the lettre to set
     */
    public void setLettre(String lettre) {
        this.lettre = lettre;
    }

}
