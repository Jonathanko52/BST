import org.w3c.dom.Node;

//Node for Binary Search Tree Class
class TreeNode {
    int data, count;
    TreeNode left, right;

    public TreeNode(int value){
        data = value;
        count = 1;
        left = null;
        right = null;
    }

}

//Binary Search Tree Class
class Tree{

    TreeNode root;

    //Constructor for Tree
    public Tree(){
        root = null;
    }

    public void insertNode(int inputValue){
        this.root = insertNodeHelper(this.root, inputValue);
    }

    public TreeNode insertNodeHelper(TreeNode curNode, int inputValue){
        if(curNode == null){
            curNode = new TreeNode(inputValue);
            return curNode ;
        }


        if(curNode.data == inputValue){
            curNode.count += 1;

        } else if (curNode.data < inputValue){
            curNode.right =  insertNodeHelper(curNode.right, inputValue);
        } else {
           curNode.left = insertNodeHelper(curNode.left, inputValue);
        }
        return curNode;
    }

    public TreeNode searchNode(int searchValue){
        return searchNodeHelper(this.root, searchValue);
    }

    public TreeNode searchNodeHelper(TreeNode curNode, int inputValue){
        if(curNode == null){
            return null;
        }

        if(curNode.data == inputValue){
            return curNode;
        } else if (curNode.data < inputValue){
            searchNodeHelper(curNode.right, inputValue);
        } else {
            searchNodeHelper(curNode.left, inputValue);
        }
        return null;
    }

    public void inorderTraversal(){
        inorderTraversalHelper(this.root);
    }

    public void inorderTraversalHelper(TreeNode curNode){
        if(curNode == null){
            return;
        }

        inorderTraversalHelper(curNode.left);
        System.out.println(curNode.data);
        inorderTraversalHelper(curNode.right);

    }


}