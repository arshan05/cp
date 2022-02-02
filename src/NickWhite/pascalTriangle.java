package NickWhite;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> sol = new ArrayList<>();

        if (numRows == 0)return sol;

        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        sol.add(first_row);
        for (int i=1; i<numRows; i++){
            List<Integer> prev_row = sol.get(i-1);
            List<Integer> row = new ArrayList<>();

            row.add(1);
            for (int j = 1; j<i;j++){
                row.add(prev_row.get(j-1)+prev_row.get(j));
            }
            row.add(1);
            sol.add(row);
        }

        return sol;
    }

    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows));
    }
}
