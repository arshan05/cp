import java.util.Arrays;
import java.util.stream.IntStream;

public class theKweakestRows {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ans = new int[k];
        int[][] soldiers = new int[mat.length][2];

        for (int i =0; i<mat.length; i++) {
            soldiers[i][0] = IntStream.of(mat[i]).sum();
            soldiers[i][1] = i;
        }

            Arrays.sort(soldiers, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

            for (int i = 0; i < k; ++i)
                ans[i] = soldiers[i][1];

            return ans;

    }
}
