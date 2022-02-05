package NickWhite;


import java.util.ArrayList;
import java.util.List;

public class postorderTraversal {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return ans;

        postorderTraversal(root.left);
        postorderTraversal(root.right);

        ans.add(root.val);

        return ans;
    }
}
