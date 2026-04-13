import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.List;

/**
 * Your implementation of Prim's algorithm.
 */
public class GraphAlgorithms {

    /**
     * Runs Prim's algorithm on the given graph and returns the Minimum
     * Spanning Tree (MST) in the form of a set of Edges. If the graph is
     * disconnected and therefore no valid MST exists, return null.
     *
     * You may assume that the passed in graph is undirected. In this framework,
     * this means that if (u, v, 3) is in the graph, then the opposite edge
     * (v, u, 3) will also be in the graph, though as a separate Edge object.
     *
     * The returned set of edges should form an undirected graph. This means
     * that every time you add an edge to your return set, you should add the
     * reverse edge to the set as well. This is for testing purposes. This
     * reverse edge does not need to be the one from the graph itself; you can
     * just make a new edge object representing the reverse edge.
     *
     * You may assume that there will only be one valid MST that can be formed.
     *
     * You should NOT allow self-loops or parallel edges in the MST.
     *
     * You may import/use java.util.PriorityQueue, java.util.Set, and any
     * class that implements the aforementioned interface.
     *
     * DO NOT modify the structure of the graph. The graph should be unmodified
     * after this method terminates.
     *
     * The only instance of java.util.Map that you may use is the adjacency
     * list from graph. DO NOT create new instances of Map for this method
     * (storing the adjacency list in a variable is fine).
     *
     * You may assume that the passed in start vertex and graph will not be null.
     * You may assume that the start vertex exists in the graph.
     *
     * @param <T>   The generic typing of the data.
     * @param start The vertex to begin Prims on.
     * @param graph The graph we are applying Prims to.
     * @return The MST of the graph or null if there is no valid MST.
     */
    public static <T> Set<Edge<T>> prims(Vertex<T> start, Graph<T> graph) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!

        Map<Vertex<T>, List<VertexDistance<T>>> adjList = graph.getAdjList();
        if (adjList.isEmpty()) {
            return new HashSet<>();
        }

        Set<Vertex<T>> visited = new HashSet<>();

        Set<Edge<T>> mst = new HashSet<>();

        // Step 5: PriorityQueue to select the minimum weight edge
        // We store edges with their weight as priority
        PriorityQueue<Edge<T>> pq = new PriorityQueue<>();

        // Step 6: Add all edges from the starting vertex to the PQ
        visited.add(start);
        for (Edge<T> edge : adjList.get(start)) {
            if (!edge.getDistance().(edge.getV())) { // no self-loops
                pq.add(edge.getDistance());
            }
        }

        // Step 7: Run Prim's algorithm
        while (!pq.isEmpty() && visited.size() < adjList.size()) {
            Edge<T> minEdge = pq.poll();

            Vertex<T> u = minEdge.getU();
            Vertex<T> v = minEdge.getV();

            // Skip if both endpoints are already visited (would create cycle)
            if (visited.contains(u) && visited.contains(v)) {
                continue;
            }

            // Determine which vertex is the new one
            Vertex<T> newVertex = visited.contains(u) ? v : u;

            // Add the edge (and its reverse) to the MST
            mst.add(minEdge);
            // Create reverse edge for testing purposes
            Edge<T> reverse = new Edge<>(v, u, minEdge.getWeight());
            mst.add(reverse);

            // Mark the new vertex as visited
            visited.add(newVertex);

            // Add all outgoing edges from the new vertex to the PQ
            for (Edge<T> edge : adjList.get(newVertex)) {
                if (!edge.getU().equals(edge.getV()) && // no self-loops
                        !visited.contains(edge.getV())) {   // only to unvisited vertices
                    pq.add(edge);
                }
            }
        }

        // Step 8: If we didn't visit all vertices, the graph is disconnected → no MST
        if (visited.size() < adjList.size()) {
            return null;
        }

        return mst;
    }
}