import Interfaces.GraphADT;

/**
 * Created by antoniomagalhaes on 05/01/15.
 */


public class Demo  {

    public static void main(String[] args) {
        GraphADT grafo = new Graph();
        grafo.addVertex("A");
        grafo.addVertex("B");
        grafo.addVertex("C");
        grafo.addVertex("D");
        grafo.addVertex("E");
       grafo.addVertex("F");
        grafo.addVertex("G");
        grafo.addVertex("H");
        grafo.addVertex("I");
        grafo.addVertex("J");
        grafo.addVertex("K");
        grafo.addVertex("L");
        grafo.addEdge("L","J");
        grafo.removeVertex("B");
        grafo.addVertex("M");
        grafo.removeVertex("A");
        grafo.addVertex("Z");
        grafo.addEdge("Z","M");
        grafo.removeVertex("L");
        System.out.println( grafo.tooString());
        grafo.removeVertex("D");
        System.out.println(grafo.isConnected());
    }


}
