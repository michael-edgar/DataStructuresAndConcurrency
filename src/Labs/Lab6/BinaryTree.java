package Lab6;

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

    public boolean contains (E element)
    {
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
}
