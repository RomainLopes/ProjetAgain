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
    private int[] ipp = {};
    /**
     * nosejour
     */
    private int[] nosejour = {};
    /**
     * idph
     */
    private String idph = "";
    /**
     * dateOperation
     */
    private String dateOperation = "";
    /**
     * operation
     */
    private String operation = "";

    public Operations (int[] ipp,int[] nosejour,String idph,String dateOperation,String operation){
        this.ipp=ipp;
        this.idph=idph;
        this.dateOperation=dateOperation;
        this.nosejour=nosejour;
        this.operation=operation;
    }
    
    public Operations (){}
    
    /**
     * @return the ipp
     */
    public int[] getIpp() {
        return ipp;
    }

    /**
     * @param ipp the ipp to set
     */
    public void setIpp(int[] ipp) {
        this.ipp = ipp;
    }

    /**
     * @return the nosejour
     */
    public int[] getNosejour() {
        return nosejour;
    }

    /**
     * @param nosejour the nosejour to set
     */
    public void setNosejour(int[] nosejour) {
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
    public String getDateOperation() {
        return dateOperation;
    }

    /**
     * @param dateOperation the dateOperation to set
     */
    public void setDateOperation(String dateOperation) {
        this.dateOperation = dateOperation;
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
