import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

public class topKfrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[k];
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : nums){
            count.put(num,count.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> p = new PriorityQueue<Integer>((a,b) -> count.get(a)- count.get(b));

        for (int num : count.keySet()){
            p.offer(num);

            if (p.size()  > k)
                p.poll();
        }


        for (int i = k-1; i>=0; --i)
            ans[i] = p.poll();

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4,8,52,36,52,41,4,8};
        int k = 2;
        int[] ans = topKFrequent(nums,k);
        for (int x: ans)
            System.out.print(x+" ");
    }
}
