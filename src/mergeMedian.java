import java.util.ArrayList;
import java.util.List;

public class mergeMedian {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,z=0;
        int n=nums1.length,m=nums2.length;
        int a=n+m;
        int arr[]=new int[a];
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                arr[z++]=nums1[i++];
            }else{
                arr[z++]=nums2[j++];
            }
        }
        while(i<n){
            arr[z++]=nums1[i++];
        }
        while(j<m){
            arr[z++]=nums2[j++];
        }

        if(arr.length%2 != 0){
            return ((double)arr[arr.length / 2]);
        }
        else{
            return ((double)(arr[(arr.length - 1) / 2] + arr[arr.length / 2]) / 2.0);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b = {3,4};

        System.out.println(findMedianSortedArrays(a,b));
        //int[] mergeA =merge(a,2,b,2);
//        for (int x:mergeA)
//            System.out.print(x + " ");
    }
}

