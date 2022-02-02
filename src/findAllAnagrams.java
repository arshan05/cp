import java.util.ArrayList;
import java.util.List;

public class findAllAnagrams {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        if (s == null || s.length() == 0 || p == null || p.length() == 0)
            return null;

        int[] hash = new int[256];

        for (char c: p.toCharArray()){
            hash[c]++;
        }

        int left=0 ,right =0, count =p.length();

        while (right < s.length()){
            if(hash[s.charAt(right++)] -- >= 1)
                count--;
            if (count== 0)
                ans.add(left);

            if (right - left == p.length() && hash[s.charAt(left++)]++ >= 0)
                count++;
        }


        return ans;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        List<Integer> ans = findAnagrams(s,p);
        int a = 4;
        System.out.println(a++);
        for (int x : ans)
            System.out.print(x+" ");
    }
}
