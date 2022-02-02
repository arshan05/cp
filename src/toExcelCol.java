public class toExcelCol {
    public static String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();

        while(columnNumber>0){
            --columnNumber;
            int d = columnNumber%26;
            columnNumber/=26;
            ans.append((char)('A'+d));
        }
        ans.reverse();
        return ans.toString();
    }

    public static void main(String[] args) {
        int a = 1;
        System.out.println(convertToTitle(a));
    }
}
