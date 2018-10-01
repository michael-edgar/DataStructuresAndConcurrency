package LinkedList;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CP3LinkedListTest {

    CP3LinkedList test;

    @BeforeEach
    void start()
    {
        test = new CP3LinkedList();
    }
    @Test
    public void addFirst() {
        test.addFirst("Bob");
        assertEquals("Bob", test.getFirst());
    }

    @Test
    public void getFirst() {
        test.addFirst("Bob");
        assertEquals("Bob", test.getFirst());

        test.addFirst("Jim");
        assertEquals("Jim", test.getFirst());
    }

    @Test
    public void getFirstMultiple() {
        test.addFirst("Bob");
        test.addFirst("Jim");
        assertEquals("Jim", test.getFirst());
    }

    @Test
    public void removeFirst() {
        test.addFirst("Bob");
        test.removeFirst();
        assertTrue(test.isEmpty());
    }

    @Test
    public void removeFirstMultiple()
    {
        test.addFirst("Bob");
        test.addFirst("Jim");
        assertEquals("Jim", test.removeFirst());
    }

    @Test
    public void isEmpty() {
        test.addFirst("Bob");
        test.removeFirst();
        assertTrue(test.isEmpty());
    }

    @Test
    public void print() {
        test.addFirst("Bob");
        test.addFirst("Jim");
        test.print();

    }

    @Test
    public void sizeEmpty() {
        assertEquals(0, test.size());
    }

    @Test
    public void sizeOne() {
        test.addFirst("Bob");
        assertEquals(1, test.size());
    }

    @Test
    public void sizeMany(){
        test.addFirst("Bob");
        test.addFirst("Jim");
        test.addFirst("Joe");
        test.addFirst("Sarah");
        assertEquals(4, test.size());
    }

    @Test
    public void addLAstEmpty(){
        test.addLast("Bob");

    }
}