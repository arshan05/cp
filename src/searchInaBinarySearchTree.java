import NickWhite.TreeNode;

public class searchInaBinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null)
            return null;
        if (root.val == val){
            return root;
        }
        else if (val > root.val){
            return searchBST(root.right,val);
        }
        else
            return searchBST(root.left,val);
    }
}
