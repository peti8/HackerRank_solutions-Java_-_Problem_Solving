import java.io.*;
import java.util.*;

public class Solution {

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        int goodRouts = 0;
        int sum = 0;
        for (int i = 0; i <= s.size() - m; i++){
            for (int j = 0; j < m; j++) {
                sum += s.get(j + i);
            }
            if (sum == d)
                goodRouts++;
            sum = 0;
        }
        return goodRouts;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String[] sItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        List<Integer> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sItem = Integer.parseInt(sItems[i]);
            s.add(sItem);
        }
        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int d = Integer.parseInt(dm[0]);
        int m = Integer.parseInt(dm[1]);
        bufferedReader.close();
        int result = birthday(s, d, m);
        System.out.println(result);
    }
}