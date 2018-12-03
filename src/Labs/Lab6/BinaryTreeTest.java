package Lab6;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree<String> myTree = new BinaryTree<>();

        myTree.insert("Jan");
        myTree.insertIterative("Feb");
        myTree.insert("Mar");
        myTree.insert("Apr");
        myTree.insertIterative("Jun");
        myTree.insert("May");
        myTree.insertIterative("May");
        myTree.insert("Mar");
        myTree.insertIterative("Jan");
        myTree.insert("Jun");

        System.out.println("");
        System.out.println(myTree.contains("Jan"));
        System.out.println(myTree.contains("Jun"));
        System.out.println(myTree.contains("Jul"));

        System.out.println("");
        System.out.println(myTree.containsRecursion("Jan"));
        System.out.println(myTree.containsRecursion("Jun"));
        System.out.println(myTree.containsRecursion("Jul"));

        System.out.println("\nIn Order Recursion");
        myTree.print();
        System.out.println("\nIn Order Iterative");
        myTree.printIterative();
        System.out.println("\nPre Recursion");
        myTree.printPre();
        System.out.println("\nPre Iterative");
        myTree.printPreIterative();
        System.out.println("\nPost Recursion");
        myTree.printPost();
        System.out.println("\nPost Iterative");
        //myTree.printPostIterative();
    }
}
