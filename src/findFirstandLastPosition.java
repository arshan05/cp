public class findFirstandLastPosition {

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 6;
        int a = first(nums,target);
        int b = last(nums,target);
        System.out.println(a);
        System.out.println(b);
    }

    private static int first(int[] nums, int target) {
        int n = nums.length;
        int low =0;
        int high = n -1;

        while (low <= high){
            int mid = low + (high - low)/2;
            if((mid == 0 || nums[mid-1] <target ) && nums[mid] == target)
                return mid;
            else if(target>nums[mid])
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }

    private static int last(int[] nums, int target) {
        int n = nums.length;
        int low =0;
        int high = n -1;

        while (low <= high){
            int mid = low + (high - low)/2;
            if((mid == n-1 || nums[mid+1] >target ) && nums[mid] == target)
                return mid;
            else if(target<nums[mid])
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
}
