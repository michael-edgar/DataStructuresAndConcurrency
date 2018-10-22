package Lab6;

import java.util.Deque;

public class BinaryTree <E extends Comparable<E>> {
    private class Node {
        public E data;
        public Node left;
        public Node right;
    }

    private Node root;

    public BinaryTree () {
        root = null;
    }

    public void insert(E element) {
        Node newNode = new Node();
        newNode.data = element;

        //next two lines are redundant
        newNode.left = null;
        newNode.right = null;

        if(root == null) {
            root = newNode;
        }
        else {
            insertRecursion(newNode, root);
        }
    }

    private void insertRecursion(Node newNode,Node node) {
        int result = node.data.compareTo(newNode.data);

        if(result > 0) {
            //Go Left
            if(node.left == null) {
                node.left = newNode;
            }
            else {
                insertRecursion(newNode, node.left);
            }
        }
        else if (result < 0) {
            //Go Right
            if(node.right == null){
                node.right = newNode;
            }
            else {
                insertRecursion(newNode, node.right);
            }
        }
        else {
            System.out.println("Duplicate Value");
        }
    }

    public void insertIterative(E element) {
        Node newNode = new Node();
        newNode.data = element;
        boolean done = false;
        int result;

        if(root == null) {
            root = newNode;
        }
        else {
            Node currentNode = root;

            while(!done) {
                result = currentNode.data.compareTo(newNode.data);

                if(result > 0) {
                    //Go Left
                    if(currentNode.left == null) {
                        currentNode.left = newNode;
                        done = true;
                    }
                    else {
                        currentNode = currentNode.left;
                    }
                }
                else if (result < 0) {
                    //Go Right
                    if(currentNode.right == null){
                        currentNode.right = newNode;
                        done = true;
                    }
                    else {
                        currentNode = currentNode.right;
                    }
                }
                else {
                    System.out.println("Duplicate Value");
                    done = true;
                }
            }
        }
    }

    public boolean contains (E element) {
        Node newNode = new Node();
        newNode.data = element;
        boolean results = false;
        int result;

        if(root != null) {
            Node currentNode = root;

            while(currentNode != null) {
                result = currentNode.data.compareTo(newNode.data);

                if(result > 0) {
                    //Go Left
                    if(currentNode.left == null) {
                        currentNode = null;
                    }
                    else {
                        currentNode = currentNode.left;
                    }
                }
                else if (result < 0) {
                    //Go Right
                    if(currentNode.right == null){
                        currentNode = null;
                    }
                    else {
                        currentNode = currentNode.right;
                    }
                }

                else {
                    results = true;
                    currentNode = null;
                }
            }
        }
        return results;
    }

    public boolean containsRecursion(E element) {
        Node newNode = new Node();
        newNode.data = element;
        boolean returnResult = false;

        if(root != null)
        {
            returnResult = containsSub(newNode, root);
        }

        return returnResult;
    }

    private boolean containsSub (Node newNode, Node currentNode) {
        int result = currentNode.data.compareTo(newNode.data);
        boolean returnResult = false;
        if(result > 0) {
            if(currentNode.left == null) {
                return false;
            }
            else {
                containsSub(newNode, currentNode.left);
            }
        }
        else if (result < 0) {
            if(currentNode.right == null) {
                return false;
            }
            else {
                containsSub(newNode, currentNode.right);
            }
        }

        else {
            returnResult = true;
        }

        return returnResult;
    }

    //code from Cathryn's BinarySearchTree class
    public void print() {
        if (root != null)
            printSub(root);
    }

    private void printSub(Node node) {
        if (node != null) {
            printSub(node.left);
            System.out.println(node.data);
            printSub(node.right);
        }
    }

    //my code

    public void printPre() {
        if (root != null)
            printSubPre(root);
    }

    private void printSubPre(Node node) {
        if (node != null) {
            System.out.println(node.data);
            printSubPre(node.left);
            printSubPre(node.right);
        }
    }

    public void printPost() {
        if (root != null)
            printSubPost(root);
    }

    private void printSubPost(Node node) {
        if (node != null) {
            printSubPost(node.left);
            printSubPost(node.right);
            System.out.println(node.data);
        }
    }

    public void printNonRecursive() {
        Node currentNode = root;

        Deque<Node> queue = null;

        while(currentNode != null) {
            queue.add(currentNode);
            if(currentNode.left != null) {
                currentNode = currentNode.left;
            }
            else if(currentNode.right != null) {
                currentNode = currentNode.right;
            }
            else
            {
                System.out.println(currentNode.data);
                queue.removeLast();
            }
        }
    }
}
