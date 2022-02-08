import java.util.PriorityQueue;

public class kthLArgestElementInArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>();

        for (int val: nums){
            p.offer(val);
            if (p.size()> k){
                p.poll();
            }
        }
        return p.peek();
    }
}
