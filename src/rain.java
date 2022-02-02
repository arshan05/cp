public class rain {
    public static int rainTrapped(int height[]){
        int n = height.length;

        if(n<=2){
            return 0;
        }
        int res = 0;
        for (int i =0; i<n; i++){
            int left = height[i];
            for(int j = 0; j < i; j++)
            {
                left = Math.max(left, height[j]);
            }

            int right = height[i];
            for(int j = i + 1; j < n; j++)
            {
                right = Math.max(right, height[j]);
            }

            res += Math.min(left, right) - height[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int water[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(rainTrapped(water));
    }
}
