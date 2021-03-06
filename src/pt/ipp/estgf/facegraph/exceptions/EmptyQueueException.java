package pt.ipp.estgf.facegraph.exceptions;

/**
 * Work done by:
 * Antonio Magalhaes
 * Pedro Fernandes
 */

public class EmptyQueueException extends Exception {
    /**
     * Creates a new instance of <code>EmptyQueueException</code> without
     * detail message.
     */
    public EmptyQueueException() {
    }

    /**
     * Constructs an instance of <code>EmptyQueueException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EmptyQueueException(String msg) {

        super(msg);
    }
}