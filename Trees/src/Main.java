//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Tree newTree = new Tree();

        newTree.insertNode(15);
        newTree.insertNode(10);
        newTree.insertNode(25);
        newTree.searchNode(10);
        newTree.inorderTraversal();

    }
}