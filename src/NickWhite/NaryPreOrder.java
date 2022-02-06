package NickWhite;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class NaryPreOrder {
    public List<Integer> preorder(Node root) {

        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> ans= new LinkedList<>();

        if (root == null) return ans;

        stack.add(root);
        while (!stack.isEmpty()){
            Node node = stack.pollLast();
            ans.add(node.val);
            Collections.reverse(node.children);
            for (Node child : node.children)
                stack.add(child);
        }
        return ans;
    }
}
