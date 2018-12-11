import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void plusMinus(int[] arr) {
        float pos=0;
        float neg=0;
        float zer=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>0)
                pos++;
            else if(arr[i]<0)
                neg++;
            else
                zer++;
        }
        System.out.printf("%.6f\n",pos/arr.length);
        System.out.printf("%.6f\n",neg/arr.length);
        System.out.printf("%.6f\n",zer/arr.length);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}