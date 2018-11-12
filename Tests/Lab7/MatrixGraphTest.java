package Lab7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixGraphTest {

    private Graph graph;

    @BeforeEach
    public void setUp() {
        graph = new MatrixGraph(5, false);
    }

    @Test
    void insert() {
        Edge edge = new Edge(2,4);
        graph.insert(edge);
        assertTrue(graph.isEdge(2,4));
        assertTrue(graph.isEdge(4,2));
    }

    @Test
    void remove() {
        Edge edge = new Edge(2,4);

        graph.insert(edge);
        graph.remove(edge);
        assertFalse(graph.isEdge(2,4));
        assertFalse(graph.isEdge(4,2));
    }
}