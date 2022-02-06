package NickWhite;

import java.util.LinkedList;
import java.util.List;

public class NaryPostOrder {
        public List<Integer> postorder(Node root) {
            LinkedList<Node> stack = new LinkedList<>();
            LinkedList<Integer> ans= new LinkedList<>();

            if (root == null) return ans;

            stack.add(root);
            while (!stack.isEmpty()){
                Node node = stack.pollLast();
                ans.addFirst(node.val);
                for (Node child: node.children)
                    stack.add(child);
            }
            return ans;
    }
}
