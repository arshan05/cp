public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int total = 0;
        int tank = 0;

        int n = gas.length;
        int m = cost.length;

        for(int i =0; i<n;i++){
            tank = tank + gas[i] - cost[i];
            if(tank < 0){
                start = i+1;
                total += tank;
                tank =0;
            }
        }
        if (total + tank < 0)
            return -1;
        else
            return start;


    }

    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas,cost));
    }
}
