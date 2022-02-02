import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class slidingWindowMax {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int l=0;
        if (nums == null || k <= 0) {
            return new int[0];
        }

        Deque<Integer> q = new ArrayDeque<>();
        int[] ans = new int[n-k+1];

        for (int i = 0; i < n; i++) {
            while (!q.isEmpty() && q.peek() < i - k + 1) {
                q.poll();
            }
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }
            q.offer(i);
            if (i >= k - 1) {
                ans[l++] = nums[q.peek()];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] an = maxSlidingWindow(a,k);
        for (int x : an)
            System.out.print(x + " ");
    }
}
