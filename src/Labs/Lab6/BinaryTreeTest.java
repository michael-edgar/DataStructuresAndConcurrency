package Lab6;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree<String> myTree = new BinaryTree<>();

        myTree.insert("Juliet");
        myTree.insertIterative("Romeo");
        myTree.insert("Eve");
        myTree.insert("Adam");
        myTree.insertIterative("Harry");
        myTree.insert("Tom");
        myTree.insertIterative("Kay");
        myTree.insert("Sean");
        myTree.insertIterative("Juliet");
        myTree.insert("Eve");

        myTree.contains("Juliet");
        myTree.contains("Adam");
        myTree.contains("Jim");

        myTree.containsRecursion("Juliet");
        myTree.containsRecursion("Adam");
        myTree.containsRecursion("Jim");

        //myTree.print();
        myTree.printPre();
        //myTree.printPost();
        myTree.printNonRecursive();
    }
}
