import java.util.PriorityQueue;

public class kClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][2];

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> squared(b) - squared(a));

        for (int[] p : points) {
            maxHeap.offer(p);
            if (maxHeap.size() >k)
                maxHeap.poll();
        }
        int i =k;
        while(!maxHeap.isEmpty())
            ans[--i] = maxHeap.poll();

        return ans;
    }

    private int squared(int[] b) {
        return b[0]*b[0] + b[1]*b[1];
    }

}
