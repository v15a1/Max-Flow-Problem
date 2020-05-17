# Max Flow Problem

The Max Flow problem solution is a program written for an assessment in the **Algorithms: Theory Design and Implementation** module to assess our understanding stated below. The understandings are and not limited to

1. Problem solving capabilities 
2. Understanding of datastructures and leveraging knowledge on them to solve the problem at hand
3. Ability to analyse the performance of the implemented solution

The given solution implements the **Ford-Fulkerson Algorithm** with the implementation of the **Breadth First Traversal** to solve the Max flow problem.

***

## Technologies used

**Built using**

1. Java 1.8

**Built on**

1. IntelliJ IDEA 2019.3 (Ultimate Edition)

***

## Datastructures used

1. **2-dimensional matrix** in the form of **Adjacency matrices** to represent the nodes and edges of a given graph
2. **Queues** were used for traversing nodes using Breadth First search
3. **Arrays** were used to store the residual path, visited states of the nodes of the graph

***

## Classes
The "src" folder contains 3 classes named 
1. ```Main.java``` - Contains the main method
2. ```FordFulkersonAlgorithm.java``` - 
    * Contains the implementation of the Breadth first search algorithm
    * Contains implementation of the Ford Fulkerson Algorithm
    
3. ```Dataset.java``` - Contains the datasets (6, 12, 24, 48 node) in class methods for ease of access
