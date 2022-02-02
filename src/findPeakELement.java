public class findPeakELement {

    public static int findPeak(int[] nums){
        int idx = 0;
        int max = nums[0];
        for (int i =0; i<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
                idx = i;
            }
        }

        return idx;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(findPeak(nums));
    }
}
