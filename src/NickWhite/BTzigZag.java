package NickWhite;

import java.util.*;

public class BTzigZag {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        zigzagLevelOrder(root,res,0);
        return res;
    }

    private void zigzagLevelOrder(TreeNode root, List<List<Integer>> res, int level) {
        if (root != null){
            if (res.size() <= level)
                res.add(new ArrayList<>());
            if (level%2 == 0)
                res.get(level).add(root.val);
            else
                res.get(level).add(0,root.val);

            zigzagLevelOrder(root.left, res, level+1);
            zigzagLevelOrder(root.right, res, level+1);

        }
    }
}
