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
    }
}
