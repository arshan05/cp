import java.util.*;
public class spiralMatrix {

    List<Integer> ans = new ArrayList<Integer>();

    private List<Integer> recursiveSpiral(int mat[][], int top, int bottom,
                                          int left, int right)

    {
        // base case
        if (mat == null || mat.length == 0 || left > right) {
            return ans;
        }

        // print top row
        for (int i = left; i <= right; i++) {
            System.out.print(mat[top][i] + " ");
            ans.add(mat[top][i]);
        }
        top++;

        if (top > bottom) {
            return ans;
        }
        // print right column
        for (int i = top; i <= bottom; i++) {
            System.out.print(mat[i][right] + " ");
            ans.add(mat[i][right]);
        }
        right--;

        if (left > right) {
            return ans;
        }
        // print bottom row
        for (int i = right; i >= left; i--) {
            System.out.print(mat[bottom][i] + " ");
            ans.add(mat[bottom][i]);
        }
        bottom--;

        if (top > bottom) {
            return ans;
        }
        // print left column
        for (int i = bottom; i >= top; i--) {
            System.out.print(mat[i][left] + " ");
            ans.add(mat[i][left]);
        }
        left++;

        recursiveSpiral(mat, top, bottom, left, right);
        return ans;
    }

    public void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int m = matrix.length;
        int n = matrix[0].length;
        int rowStart = 0;
        int rowEnd = m-1;
        int colStart = 0;
        int colEnd = n-1;
        recursiveSpiral(matrix,rowStart, rowEnd, colStart, colEnd);
//        for (int i =0; i<ans.length;i++) {
//            System.out.println(ans[i]);
//        }

    }
}
