import java.io.*;
import java.lang.*;
import java.util.*;

public class GenerateParentheses {


    public static void main(String[] args) {
        int n =3;

        ArrayList<String> arr = genPar(n);
        for (String x: arr) {
            System.out.println(x);
        }
    }

    private static ArrayList<String> genPar(int n) {
        ArrayList<String> combinations = new ArrayList<String>();
        int open =0;
        int close =0;

        backtrack(combinations, "", open, close, n);
        return combinations;
    }

    public static void backtrack(ArrayList<String> combinations, String current, int open, int close, int n){
        if(current.length() == n*2){
            combinations.add(current);
        }
        if(open < n){
            backtrack(combinations, current+"(", open+1,close,n);
        }
        if (close<open){
            backtrack(combinations, current+")", open,close+1,n);
        }
    }

}
