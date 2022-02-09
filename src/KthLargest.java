import java.util.PriorityQueue;

class KthLargest {
    private int k;
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int num : nums)
            heapify(num);
    }

    private void heapify(int val){
        minHeap.offer(val);
        if(minHeap.size() > k)
            minHeap.poll();
    }

    public int add(int val) {
        heapify(val);
        return minHeap.peek();
    }

}
