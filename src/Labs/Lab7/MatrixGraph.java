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
        State[] states = new State[getNumVertices()];
        for(int i=0; i < states.length; i++) {
            states[i] = State.NOT_VISITED;
        }
        LinkedList queue = new LinkedList();
        queue.addFirst(start);
        while(!queue.isEmpty()) {
            int vertex = (int)queue.removeLast();
            System.out.print(vertex + " ");
            states[vertex] = State.VISITED;

            for(int i=0; i<states.length; i++) {
                if(isEdge(vertex, i) && states[i] == State.NOT_VISITED) {
                    queue.addFirst(i);
                    states[i] = State.WAITING;
                }
            }
        }
    }

    public void depthFirstTraversal(int start){
        //Output the vertices in depth first order
        State[] states = new State[getNumVertices()];
        for(int i=0; i < states.length; i++) {
            states[i] = State.NOT_VISITED;
        }
        LinkedList stack = new LinkedList();
        stack.push(start);
        while(!stack.isEmpty()) {
            int vertex = (int)stack.pop();
            System.out.print(vertex + " ");
            states[vertex] = State.VISITED;

            for(int i=0; i<states.length; i++) {
                if(isEdge(vertex, i) && states[i] == State.NOT_VISITED) {
                    stack.push(i);
                    states[i] = State.WAITING;
                }
            }
        }
    }
}
