package Interfaces;

import exceptions.EmptyCollectionException;
import exceptions.IlegalArgumentException;

import java.util.Iterator;

/**
 * Created by antoniomagalhaes on 03/01/15.
 */
public interface GraphADT<T> {
    /**
     * Adds a vertex to this graph, associating object with vertex.
     */

    /**
     *
     * Adds a vertex to this graph, associating object with vertex.
     * @param vertex the vertex to be added to this graph
     */
    public void addVertex(T vertex);


    /**
     * removes a single vertex with the given value from this graph.
     * @param vertex the vertex to be removed from this graph
     */
    public  void  removeVertex (T vertex);


    /**
     * Inserts an edge between two vertes from the graph
     * @param vertex1 the first vertex
     * @param vertex2 the second vertex
     */
    public  void addEdge(T vertex1, T vertex2);

    /**
     *Removes an edge between two vertex in this graph
     * @param vertex1 the first vertex
     * @param vertex2 the second vertex
     */
    public  void removeEdge(T vertex1, T vertex2);


    /**
     * Returns a breadth first iterator starting with the given vertex
     * @param startVertex he starting vertex
     * @return a bredth first iterator beginning at the given vertex
     */
    public Iterator iterartorBFS(T startVertex);

    /**
     * Returns a depth first iterator starting with the given vertex
     * @param startVertex the starting vertex
     * @return a depth first iterator starting at the given vertex
     */
    public Iterator iterartorDFS(T startVertex) throws EmptyCollectionException;


    /**
     * Returns an iterator that contains the shortest path between the two vertices
     * @param startVertex the starting vertex
     * @param targetVertex the ending vertex
     * @return
     */
    public Iterator iteratorShortestPath(T startVertex, T targetVertex);


    /**
     * Returns true if the graph is empty, false otherwise.
     * @return true if the graph is empty
     */
    public boolean isempty();


    /**
     * Returns true if the graph is connected, false otherwise.
     * @return true if the graph is connected
     */
    public boolean isConnected();


    /**
     * Return the number of vertices in this graph.
     * @return the integer number of vertices in this graph
     */
    public  int size();


    /**
     * Returns a string representation of the adjacent matrix
     * @return a string representation of the adjacent matrix
     */
    public String tooString();
}
