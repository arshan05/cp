public class missingNumber {

    public static int missing(int[] nums){
        int sum = 0;
        for(int num: nums)
            sum += num;

        return (nums.length * (nums.length + 1) )/ 2 - sum;
    }

    public static void main(String[] args) {
        int[] a = { 3,0,1};
        System.out.println(missing(a));
    }
}
