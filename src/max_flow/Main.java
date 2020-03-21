package max_flow;

public class Main {
    public static void main(String[] args) {
        // graph implementation by adjacency matrix with a 2 dimensional array
        int[][] graph = sixBySixAdjacencyMatrixCW();

        MaxFlow m = new MaxFlow();
        m.setNumberOfVertices(graph.length);
        int targetNode = m.numberOfVertices-1;      //value of the sink node
        System.out.println("The MAX FLOW is : " + m.fordFulkerson(graph, targetNode));
    }

    public static int[][] sixBySixAdjacencyMatrixGFG() {
        return new int[][]{
                {0, 16, 13, 0, 0, 0},
                {0, 0, 10, 12, 0, 0},
                {0, 4, 0, 0, 14, 0},
                {0, 0, 9, 0, 0, 20},
                {0, 0, 0, 7, 0, 4},
                {0, 0, 0, 0, 0, 0}
        };
    }

    public static int[][] sixBySixAdjacencyMatrixCW() {
        return new int[][]{
                {0, 10, 8, 0, 0, 0},
                {0, 0, 5, 5, 0, 0},
                {0, 4, 0, 0, 10, 0},
                {0, 0, 7, 0, 6, 3},
                {0, 0, 0, 10, 0, 14},
                {0, 0, 0, 0, 0, 0}
        };
    }

    public static int[][] sixBySixAdjacencyMatrixYT() {
        return new int[][]{
                {0, 10, 10, 0, 0, 0},
                {0, 0, 2, 4, 8, 0},
                {0, 0, 0, 0, 9, 0},
                {0, 0, 0, 0, 0, 10},
                {0, 0, 0, 6, 0, 10},
                {0, 0, 0, 0, 0, 0}
        };
    }
}
