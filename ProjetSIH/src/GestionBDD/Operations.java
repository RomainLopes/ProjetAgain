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
public class Operations {
    
    /**
     * ipp
     */
    private String ipp = "";
    /**
     * nosejour
     */
    private String nosejour = "";
    /**
     * idph
     */
    private String idph = "";
    /**
     * dateoperation
     */
    private String dateoperation = "";
    /**
     * operation
     */
    private String operation = "";

    /**
     *
     * @param ipp
     * @param nosejour
     * @param idph
     * @param dateoperation
     * @param operation
     */
    public Operations (String ipp,String nosejour,String idph,String dateoperation,String operation){
        this.ipp=ipp;
        this.nosejour=nosejour;
        this.idph=idph;
        this.dateoperation=dateoperation;
        this.operation=operation;
    }
    
    /**
     * Constructeur par défaut
     */
    public Operations (){}
    
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
     * @return the dateOperation
     */
    public String getDateoperation() {
        return dateoperation;
    }

    /**
     * @param dateoperation the dateOperation to set
     */
    public void setDateoperation(String dateoperation) {
        this.dateoperation = dateoperation;
    }

    /**
     * @return the operation
     */
    public String getOperation() {
        return operation;
    }

    /**
     * @param operation the operation to set
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }
    
}
