import java.util.HashMap;
import java.util.Stack;

public class nextGreatestElement1 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> nextInt = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (Integer x : nums2) {
            while (!stack.isEmpty() && stack.peek() < x) {
                nextInt.put(stack.pop(), x);
            }
            stack.push(x);
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = nextInt.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] ans = nextGreaterElement(nums1, nums2);

        for (int x : ans)
            System.out.print(x + " ");
    }
}
