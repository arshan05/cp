package NickWhite;


public class MaximumDepthOfBinaryTree {
    private static int answer ;
    public static int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        else
            maximum_depth(root,1);
        return answer;
    }
    private static void maximum_depth(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            answer = Math.max(answer, depth);
        }
        maximum_depth(root.left, depth + 1);
        maximum_depth(root.right, depth + 1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(maxDepth(root));
    }
}
