//UOW ID - w1742117
//IIT ID - 2018418
//Name - Visal Rajapakse
package max_flow;

public class Main {

    public static void main(String[] args) {
        //passing datasets to execute
        executeGraph(Dataset.adjacencyMatrix6x6());
    }

    public static void executeGraph(int[][] graph){
        // graph implementation by adjacency matrix with a 2 dimensional array
        FordFulkersonAlgorithm ff = new FordFulkersonAlgorithm();
        int arrSize = graph.length;
        ff.setNumberOfVertices(arrSize);    //setting the number of vertices

        //sinkNodeValues
        int targetNode = 5;
        //timing the algorithm
        long startTime = System.nanoTime();
        double maxFlow = ff.fordFulkerson(graph, targetNode);       //getting maximum-flow
        long endTime = System.nanoTime();

        System.out.println("The MAX FLOW of "+arrSize+"x"+arrSize+" is : " + maxFlow);
        long totalDuration = (endTime - startTime);     //calculating time taken for the algorithm execution
        System.out.println("Total duration in nano seconds : " + totalDuration);
        System.out.println("The final graph is ...");
        ff.printFinalGraph();//method to print the final graph


    }
}
