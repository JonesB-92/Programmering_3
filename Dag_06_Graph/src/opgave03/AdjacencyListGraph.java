package opgave03;

import opgave01.Edge;
import opgave01.Graph;

import java.util.*;

public class AdjacencyListGraph<V> implements Graph<V> {
    // List with all the vertices in the graph.
    private List<V> vertices;
    // Map with pairs containing (vertex, list of edges),
    // where list of edges is the incident edges to the vertex.
    // Note: Each edge is in 2 lists of incident edges.
    private Map<V, List<Edge<V>>> edges = new HashMap();

    /**
     * Construct an empty graph
     */
    public AdjacencyListGraph() {
        vertices = new ArrayList<>();
        edges = new LinkedHashMap<>();
    }

    @Override
    /** Return the number of vertices in the graph */
    public int numVertices() {
        return vertices.size();
    }

    @Override
    /** Return the number of edges in the graph */
    public int numEdges() {
        int size = 0;
        for (List<Edge<V>> list : edges.values()) {
            size += list.size();
        }
        return size / 2;
    }

    @Override
    /** Return the vertices in the graph */
    public List<V> vertices() {
        return new ArrayList<>(vertices);
    }

    @Override
    /** Return the edges in the graph */
    public List<Edge<V>> edges() {
       //TODO
        return null;
    }


    @Override
    /** Return the neighbors of the specified vertex */
    public List<V> neighbors(V v) {
       // TODO
        return null;
    }


    @Override
    /** Return the incident edges of vertex v */
    public List<Edge<V>> incidentEdges(V v) {
        //TODO
        return null;
    }

    @Override
    /** Return the degree for a specified vertex */
    public int degree(V v) {
        //TODO
        return -1;
    }

    @Override

    public boolean areAdjacent(V v, V u) {
        //TODO
        return false;
    }


    @Override
    /** Print the edges */
    public void printGraph() {
        for (V v : vertices) {
            List<Edge<V>> incidentEdges = edges.get(v);
            System.out.print("Vertex: " + v);
            System.out.println("\tIncident edges: " + incidentEdges);
        }
    }



    @Override
    /**
     * Add a vertex to the graph.
     * Pre: The vertex is not in the graph before this addition.     */
    public void addVertex(V v) {
        //TODO
    }

    @Override
    /**
     * Add an edge with weight 0 between the specified vertices to the graph.
     * Pre: Before addition, the vertices are in the graph, and the edge is not in the graph.
     */
    public void addEdge(V v, V u) {
        //TODO
    }

    @Override
    /** Add an edge to the graph */
    public void addEdge(V v, V u, int e) {
        //TODO
    }


    @Override
    /**
     * Remove the specified vertex from the graph.
     * Pre: The vertex is in the graph
     */
    public void removeVertex(V v) {
        //TODO
    }

    private void removeVertex(V v, List<Edge<V>> list) {
        //TODO
    }

    @Override
    /**
     * Remove the edge between the specified vertices from the graph.
     * Pre: The vertices are vertices in the graph,
     *   and The graph has an edge between the vertices.
     */
    public void removeEdge(V v, V u) {
        //TODO

    }


}

