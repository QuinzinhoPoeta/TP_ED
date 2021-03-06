package pt.ipp.estgf.facegraph.Interfaces;

/**
 * Work done by:
 * Antonio Magalhaes
 * Pedro Fernandes
 */


import pt.ipp.estgf.facegraph.exceptions.IlegalArgumentException;

/**
 * Interface UnorderedListADT contains the behaviors of pt.ipp.estgf.facegraph.FaceNetwork.
 * @param <T> Indicates that the interface and the generic type.
 */
public interface NetworkADT<T> extends GraphADT<T> {


    /**
     * Inserts an edge between two vertices of the graph
.     * @param vertex1 the first vertex
     * @param vertex2 the second vertex
     * @param weight the weight
     */
    public void addEdge(T vertex1, T vertex2, double weight) throws IlegalArgumentException;


    /**
     * Returns the weight of the shortest path of the network
     * @param vertex1 the first vertex
     * @param vertex2 the second vertex
     * @return
     */
    public  double shortestPathWeight(T vertex1, T vertex2);




}
