import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long sum = 0;
        long maxsum = 0;
        long minsum = (long) Math.pow(2, 63) - 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                if (i != j)
                    sum += arr[j];
            if (sum > maxsum)
                maxsum = sum;
            if (sum < minsum)
                minsum = sum;
            sum = 0;
        }
        System.out.println(minsum + " " + maxsum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}