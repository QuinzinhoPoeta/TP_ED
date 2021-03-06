package pt.ipp.estgf.facegraph.Interfaces;

import pt.ipp.estgf.facegraph.exceptions.EmptyCollectionException;
import pt.ipp.estgf.facegraph.exceptions.EmptyQueueException;

/**
 * Work done by:
 * Antonio Magalhaes
 * Pedro Fernandes
 */

/**
 * Interface QueueADT contains the behavior of a queue.
 *
 * @param <T> Indicates that the interface and the generic type.
 */
public interface QueueADT<T> {
    /**
     * Adds a element to the rear of the queue
     *
     * @param element
     */
    public void enqueue(T element);

    /**
     * Removes a element from the front of the queue
     *
     * @return element removed
     * @throws pt.ipp.estgf.facegraph.exceptions.EmptyQueueException
     */
    public T dequeue() throws EmptyQueueException, EmptyCollectionException;

    /**
     * Gets first element of the queue
     *
     * @return first element of the queue
     * @throws pt.ipp.estgf.facegraph.exceptions.EmptyQueueException
     */
    public T first() throws EmptyQueueException, EmptyCollectionException;

    /**
     * Verifies if the queue is empty
     *
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() throws EmptyQueueException;

    /**
     * Obtains size of the queue
     *
     * @return size of queue
     */
    public int size();

    /**
     * Returns a string representation of the queue
     *
     * @return queue elements in a string
     */
    public String toString();


}
