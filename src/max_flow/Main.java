//UOW ID - w1742117
//IIT ID - 2018418
//Name - Visal Rajapakse
package max_flow;

public class Main {

    public static void main(String[] args) {
        executeGraph(Dataset.adjacencyMatrix96x96());
//        executeGraph(GenerateGraph.generateDataset(6, 11));
    }

    public static void executeGraph(int[][] graph){
        // graph implementation by adjacency matrix with a 2 dimensional array
        FordFulkersonAlgorithm ff = new FordFulkersonAlgorithm();
        int arrSize = graph.length;
        ff.setNumberOfVertices(graph.length);    //setting the number of vertices
        int targetNode = ff.numberOfVertices - 1;      //value of the sink node

        long startTime = System.nanoTime();     //start time
        double maxFlow = ff.fordFulkerson(graph, targetNode);       //getting maximum-flow
        long endTime = System.nanoTime();

        System.out.println("The MAX FLOW of "+arrSize+"x"+arrSize+" is : " + maxFlow);
        long totalDuration = (endTime - startTime);     //calculating time taken for the algorithm execution
        System.out.println("Total duration in nano seconds : " + totalDuration);
//        ff.printFinalGraph();


    }
}
