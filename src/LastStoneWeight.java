import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class LastStoneWeight {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> p = new PriorityQueue<>((a,b) -> b-a);
        for (int x : stones)
            p.add(x);

        while (p.size()>1){
            int a = p.poll();
            int b = p.poll();

            if (a>b)
                p.offer(a-b);
        }
        return p.size() == 1 ? p.poll(): 0;

    }

    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));
    }
}
