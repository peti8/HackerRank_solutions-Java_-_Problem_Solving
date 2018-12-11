import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the kangaroo function below. 0 3 4 2
    static String kangaroo(int x1, int v1, int x2, int v2) {
        String result="NO";
        int prevdistance=Math.abs(x1-x2)+1;
        int distance=0;
        int actx1=x1;
        int actx2=x2;
        while((distance=(Math.abs(actx1-actx2)))<prevdistance){
            if (actx1==actx2){
                result="YES";
                break;
            }
            actx1+=v1;
            actx2+=v2;
            prevdistance=distance;
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}