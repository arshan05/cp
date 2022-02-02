import java.util.ArrayList;
import java.util.List;

public class combinations {
    static List<List<Integer>> res = new ArrayList<List<Integer>>();

    public static List<List<Integer>> combine(int n, int k) {
        ArrayList<Integer> cur  = new ArrayList<Integer>();
        rec(1,k,n,cur);
        return res;
    }

    private static void rec(int i, int k, int n, ArrayList<Integer> cur) {
        if(cur.size() == k){
            res.add(new ArrayList<>(cur));
        }
        else{
            for (int j=i; j<=n; j++){
                cur.add(j);
                rec(j+1,k,n,cur);
                cur.remove(cur.size()-1);
            }
        }
    }


    public static void main(String[] args) {
        System.out.println(combine(1,1));
    }


}
