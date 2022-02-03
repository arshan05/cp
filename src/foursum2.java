import java.util.HashMap;

public class foursum2 {

    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int x : nums1){
            for (int y: nums2){
                hashMap.put(x+y,hashMap.getOrDefault(x+y,0)+1);
            }
        }
        int count =0;
        for(int x : nums3){
            for (int y: nums4){
                count += hashMap.getOrDefault(-x-y,0);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {-2,-1};
        int[] nums3 = {-1,2};
        int[] nums4 = {0,2};

        System.out.println(fourSumCount(nums1,nums2,nums3,nums4));
    }
}
