package max_flow;

// Java program for implementation of Ford Fulkerson algorithm

import java.util.*;
import java.lang.*;
import java.util.LinkedList;

public class FordFulkersonAlgorithm {
    //instance variable to hold the number of vertices
    int numberOfVertices;

    /*
     * method which implements the Breadth First Search to traverse the graph
     * @params residual[][] is a 2 dimensional residual graph
     * @params source is the source node
     * @params target is the sink node
     */
    public boolean breadthFirstSearch(int[][] residualGraph, int source, int target, int[] residualPath) {

        //boolean array to check if the BFS algorithm has reached a node or not
        boolean[] visited = new boolean[numberOfVertices];

        //setting visited of all nodes to false
        for (int i = 0; i < numberOfVertices; ++i)
            visited[i] = false;

        //Declaring and instantiating a queue to enqueue a node when it is reached
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(source);              //adding the source node to the queue
        visited[source] = true;         //setting the source node visited to true
        residualPath[source] = 0;

        //traversing the graph
        while (queue.size() != 0) {
            int u = queue.poll();
            for (int v = 0; v < numberOfVertices; v++) {
                if (!visited[v] && residualGraph[u][v] > 0) {
                    queue.add(v);       //adding values to the queue
                    residualPath[v] = u;
                    visited[v] = true;  //setting visited of the respective node to true
                }
            }
        }
        // If we reached sink in BFS starting from source, then the true is returned
        //will return true until BFS can find an augmented path
        return (visited[target]);
    }

    //method that implements the the Ford Fulkerson algorithm which returns an integer value
    public int fordFulkerson(int[][] graph, int t) {
        int x;
        int y;
        int maxFlow = 0; //initial flow == 0

        //2 dimensional array which stores the final values of the graph to display
        int[][] outputGraph = new int[numberOfVertices][numberOfVertices];
        //a 2 dimensional array which stores the residual edges of the graph
        //if the residualGraph[x][y] = 0, there is no edge between the 2 nodes that can be used to draw an augmented graph
        int[][] residualGraph = new int[numberOfVertices][numberOfVertices];
        //array to store the residual path by Breadth first search
        int[] residualPath = new int[numberOfVertices];

        //setting the residual graph values to match the graph given as a parameter
        for (x = 0; x < numberOfVertices; x++)
            for (y = 0; y < numberOfVertices; y++)
                residualGraph[x][y] = graph[x][y];

        //augmenting the path from source to sink
        while (breadthFirstSearch(residualGraph, 0, t, residualPath)) {
            //finding bottleneck capacity of a certain path
            int bottleneck = Integer.MAX_VALUE;
            for (y = t; y != 0; y = residualPath[y]) {
                x = residualPath[y];
                bottleneck = Math.min(bottleneck, residualGraph[x][y]);
            }

            // update residual capacities of the edges and
            // reverse edges along the path
            for (y = t; y != 0; y = residualPath[y]) {
                x = residualPath[y];
                residualGraph[x][y] -= bottleneck;
                outputGraph[x][y] = graph[x][y] - residualGraph[x][y];      //adding values into the graph to display
                residualGraph[y][x] += bottleneck;
            }
//            printFinalGraph(outputGraph);   //printing output graph
            maxFlow += bottleneck;
        }


        return maxFlow;
    }

    //setter method to set the number of vertices/nodes
    public void setNumberOfVertices(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
    }

    //method to print final graph
    public void printFinalGraph(int[][] graph) {
        System.out.println("\n");
        for (int x = 0; x < numberOfVertices; x++) {
            System.out.println(Arrays.toString(graph[x]));
        }
    }


}

