public class ValidMountainArray {
    public static boolean validMountainArray(int[] arr) {
        int n = arr.length;
        int left =0;
        int right = n-1;

        while(left< n-1 && arr[left]< arr[left+1]){
            left++;
        }
        while(right>0 && arr[right]<arr[right-1]){
            right--;
        }
        if(left>0 && right == left && right<n-1)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        int[] arr = {3,5,5};

        System.out.println(validMountainArray(arr));
    }
}
