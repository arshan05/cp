import java.util.Arrays;
import java.util.Scanner;

public class radiator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] x = new int[n];

        for (int i = 0 ; i<n;i++){
            x[i] = in.nextInt();
        }
        Arrays.sort(x);

        int left=0;
        int right =0;
        int mid =0;
        int ans =0;
        int end;

        while(left<n){
            right = left;
            end = left;
            ans++;

            while(mid<n && x[mid]-x[left] <= k){
                mid++;
            }
            mid--;
            end= x[mid]+k;
            right = mid+1;
            while(left<n && x[right]<=end){
                right++;
            }
            left=right;
        }
        System.out.println(ans);

    }
}
