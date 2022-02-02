import java.util.*;

public class mergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length ==0){
            return null;
        }

        Arrays.sort(intervals, (arr1 , arr2)-> Integer.compare(arr1[0],arr2[0]));

        Stack<int[]> s = new Stack<>();

        s.push(intervals[0]);

        for (int[] x : intervals){
            int[] top = s.peek();
            if (top[1] < x[0]){
                s.push(x);
            }
            else if(top[1]<x[1])
            {
                top[1]=x[1];
                s.pop();
                s.push(top);
            }
        }
        return s.toArray(new int[s.size()][2]);
    }


    public static void main(String[] args) {
        int[][] intervals = {{1,4},{4,5}};
        int[][] ans = merge(intervals);
        for(int[] x : ans){
            for (int y: x){
                System.out.print(y + " ");
            }
        }

    }
}
