package max_flow;

public class Main {
    private static final int TO_MILLIS = 1000000;

    public static void main(String[] args) {
        run6NodeGraph();
        run12NodeGraph();
    }

    public static void run6NodeGraph(){
        // graph implementation by adjacency matrix with a 2 dimensional array
        int[][] graph = Dataset.adjacencyMatrix6x6();

        long startTime = System.nanoTime();
        FordFulkersonAlgorithm m = new FordFulkersonAlgorithm();
        m.setNumberOfVertices(graph.length);
        int targetNode = m.numberOfVertices - 1;      //value of the sink node
        System.out.println("The MAX FLOW of 6x6 is : " + m.fordFulkerson(graph, targetNode));
        long endTime = System.nanoTime();
        long totalDuration = (endTime - startTime);     //calculating time taken for the algorithm execution
        System.out.println("Total duration in nano seconds for the 6x6 : " + totalDuration);
    }

    public static void run12NodeGraph(){
        // graph implementation by adjacency matrix with a 2 dimensional array
        int[][] graph = Dataset.adjacencyMatrix12x12();

        long startTime = System.nanoTime();
        FordFulkersonAlgorithm m = new FordFulkersonAlgorithm();
        m.setNumberOfVertices(graph.length);
        int targetNode = m.numberOfVertices - 1;      //value of the sink node
        System.out.println("The MAX FLOW of 12x12 is : " + m.fordFulkerson(graph, targetNode));
        long endTime = System.nanoTime();
        long totalDuration = (endTime - startTime);     //calculating time taken for the algorithm execution
        System.out.println("Total duration in nano seconds for the 12x12 : " + totalDuration);
    }



}
