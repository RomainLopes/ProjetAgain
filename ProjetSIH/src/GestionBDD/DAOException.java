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
public class DAOException extends RuntimeException {
    /*
     * Constructeurs
     */

    /**
     *
     * @param message
     */

    public DAOException( String message ) {
        super( message );
    }

    /**
     *
     * @param message
     * @param cause
     */
    public DAOException( String message, Throwable cause ) {
        super( message, cause );
    }

    /**
     *
     * @param cause
     */
    public DAOException( Throwable cause ) {
        super( cause );
    }
}
