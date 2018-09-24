// code developed in Lab 2 - 11am group
package LinkedList;
import java.util.NoSuchElementException;

public class CP3LinkedList1<E> {
    private class Node {
        public E data;
        public Node next;

    }

    private Node first;

    public CP3LinkedList1(){
        first = null;
    }

    public void addFirst(E element){
        Node node = new Node();
        node.data = element;
        node.next = null;
//        if (first == null) {
//            first = node;
//        }
//        else {
//            first = node;
//        }
        first = node;
    }

    public E getFirst(){
        if (first == null){
            throw new NoSuchElementException();
        }
        return first.data;
    }

    public E removeFirst(){
        if (first == null) {
            throw new NoSuchElementException();
        }
        E element = first.data;
        first = first.next;
        return element;
    }


}
