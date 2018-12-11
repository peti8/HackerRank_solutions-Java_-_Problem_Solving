import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int anagram(String s) {
        if (s.length()%2==1)
            return -1;
        String s1=s.substring(0, s.length()/2);
        String s2=s.substring(s.length()/2, s.length());
        ArrayList<Character> AL=new ArrayList<Character>();
        for (int i=0; i<s1.length(); i++)
            AL.add(s1.charAt(i));
        for (int j=0; j<s2.length(); j++){
            Character c=s2.charAt(j);
            if (AL.contains(c))
                AL.remove(c);
        }
        return AL.size();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = anagram(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}