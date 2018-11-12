package Lab7;

public class MatrixGraphDriver {
    public static void main(String[] args) {
        MatrixGraph directedGraph = new MatrixGraph(5, true);
        Edge edge = new Edge(0,1);
        directedGraph.insert(edge);

        edge = new Edge(0,2);
        directedGraph.insert(edge);

        edge = new Edge(0,3);
        directedGraph.insert(edge);

        edge = new Edge(1,2);
        directedGraph.insert(edge);

        edge = new Edge(2,4);
        directedGraph.insert(edge);

        MatrixGraph undirectedGraph = new MatrixGraph(5, false);

        edge = new Edge(0,1);
        undirectedGraph.insert(edge);

        edge = new Edge(0,2);
        undirectedGraph.insert(edge);

        edge = new Edge(0,3);
        undirectedGraph.insert(edge);

        edge = new Edge(1,2);
        undirectedGraph.insert(edge);

        edge = new Edge(2,4);
        undirectedGraph.insert(edge);
    }
}
