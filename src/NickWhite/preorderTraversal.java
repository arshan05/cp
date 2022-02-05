package NickWhite;

import java.util.ArrayList;
import java.util.List;

public class preorderTraversal {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return ans;

        ans.add(root.val);

        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return ans;
    }
}
