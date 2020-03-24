package max_flow;

import java.util.Arrays;
import java.util.Random;

//class used to generate random datasets for int[][] > 96 nodes since java compiler doesn't allow it
public class GenerateGraph {
    public static int[][] generateDataset(int nodeCount, int numberOfEdges){
        int count = 0;
        int[][] graph = new int[nodeCount][nodeCount];
        do {
            Random random = new Random();
            int coord1 = random.nextInt(nodeCount);
            int coord2 = random.nextInt(nodeCount);
            graph[coord1][coord2] = random.nextInt(100);
            count++;
        }while (count < numberOfEdges);
        for (int i = 0; i< nodeCount; i++){
            System.out.println(Arrays.toString(graph[i]));
        }
        return graph;
    }


}
