package NickWhite;

public class twoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int a =0;
        int b = numbers.length-1;
        while (a<=b){
            int sum = numbers[a]+numbers[b];
            if (sum>target){
                b--;
            }else if(sum <target){
                a++;
            }else{
                return new int[] {a+1,b+1};
            }
        }
        return new int[] {a+1,b+1};
    }

    public static void main(String[] args) {
       int[] numbers = {2,7,11,15};
       int target = 9;

        System.out.println(twoSum(numbers,target));
    }
}
