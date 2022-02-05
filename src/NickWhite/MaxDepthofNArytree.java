package NickWhite;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepthofNArytree {
    public int maxDepth(Node root) {
        if(root == null) return 0;
        int depth = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i=0; i<size; i++){
                Node curNode = queue.poll();
                for (Node child  : curNode.children){
                    queue.offer(child);
                }
            }
            depth++;
        }

        return depth;
    }
}
