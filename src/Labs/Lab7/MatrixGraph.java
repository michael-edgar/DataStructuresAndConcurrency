package Lab7;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MatrixGraph extends AbstractGraph {
    //entries in matrix are 1.0 or 0.0
    //1.0 indicates an edge.
    //0.0 indicates no edge

    private double[][] matrix;
    private State vertexState;

    public MatrixGraph(int nV, boolean direct){
        super(nV, direct);
        matrix = new double[nV][nV];
        for (int row = 0; row < nV; row++)
            for (int col = 0; col < nV; col++)
                matrix[row][col] = 0.0;
    }

    public boolean isEdge(int source, int dest) {
        //complete this method
        if(matrix[source][dest] == 1.0)
        {
            return true;
        }
        else{
            return false;
        }
    }

    public void insert(Edge edge) {
        //complete this method
        // if graph is undirected, insert two edges
        // otherwise, insert just one edge
        matrix[edge.getSource()][edge.getDestination()] = 1.0;

        if(!isDirected()) {
            matrix[edge.getDestination()][edge.getSource()] = 1.0;
        }
    }

    public void remove(Edge edge) {
        //complete this method
        // as for insert method
        matrix[edge.getSource()][edge.getDestination()] = 0.0;

        if(!isDirected())
        {
            matrix[edge.getDestination()][edge.getSource()] = 0.0;
        }
    }

    public void breadthFirstTraversal(int start){
        //Output the vertices in breadth first order
        Queue<Integer> graphQueue = new LinkedList();
        ((LinkedList<Integer>) graphQueue).addLast(start);
        System.out.println(start);
        for(int i = 0; i <= (matrix.length-1); i++)
        {
            if(isEdge(start, i))
            {
                ((LinkedList<Integer>) graphQueue).addLast(i);
            }
        }
        ((LinkedList<Integer>) graphQueue).removeFirst();
        if(!graphQueue.isEmpty())
        {
            breadthFirstTraversal(((LinkedList<Integer>) graphQueue).getFirst());
        }
    }

    public void depthFirstTraversal(int start){
        //Output the vertices in depth first order
    }
}
