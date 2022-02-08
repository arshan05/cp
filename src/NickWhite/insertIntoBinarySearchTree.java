package NickWhite;

public class insertIntoBinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null)
            return new TreeNode(val);

        TreeNode curNode = root;
        while (true){
            if (curNode.val <= val){
                if (curNode.right != null){
                    curNode = curNode.right;
                }
                else{
                    curNode.right = new TreeNode(val);
                    break;
                }
            }
            else {
                if (curNode.left != null){
                    curNode = curNode.left;
                }
                else{
                    curNode.left = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }
}
