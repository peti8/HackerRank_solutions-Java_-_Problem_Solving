import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String result = "";
        String tail = s.substring(8, 10);
        int begin = Integer.parseInt(s.substring(0, 2));
        if (begin < 12) {
            if (tail.equals("AM"))
                result = s.substring(0, 8);
            else
                result = Integer.toString(begin + 12) + s.substring(2, 8);
        } else if (tail.equals("AM"))
            result = "00" + s.substring(2, 8);
        else
            result = s.substring(0, 8);
        return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}