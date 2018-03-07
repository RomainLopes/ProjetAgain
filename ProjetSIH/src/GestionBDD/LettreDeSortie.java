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
     * idph
     */
    private String idph = "";
     /**
     * texte
     */
    private String texte = "";

    public LettreDeSortie (String ipp,String idph,String texte){
        this.ipp=ipp;
        this.idph=idph;
        this.texte=texte;
    }
    
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
     * @return the texte
     */
    public String getTexte() {
        return texte;
    }

    /**
     * @param texte the texte to set
     */
    public void setTexte(String texte) {
        this.texte = texte;
    }
    
}
