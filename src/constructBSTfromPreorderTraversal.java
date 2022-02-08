import NickWhite.TreeNode;

public class constructBSTfromPreorderTraversal {
    public TreeNode bstFromPreorder(int[] preorder) {
        int n = preorder.length;

        if (n<0) return null;

        if (n == 1) return new TreeNode(preorder[0]);

        return helper(preorder, 0, n-1);
    }

    private TreeNode helper(int[] preorder, int l, int r) {
        if (l>r)
            return null;

        TreeNode node = new TreeNode(preorder[l]);

        int i = l;
        for (i=l+1;i<=r;i++){
            if (preorder[i] >= preorder[l]) break;
        }

        node.left = helper(preorder,l+1,i-1);
        node.right = helper(preorder,i,r);
        return node;
    }
}
