import jdk.swing.interop.SwingInterOpUtils;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class excelColumn {
    public static int titleToNumber(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++)
        {
            result *= 26;
            result += s.charAt(i) - 'A' + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "A";

        System.out.println(titleToNumber(s));
    }
}
