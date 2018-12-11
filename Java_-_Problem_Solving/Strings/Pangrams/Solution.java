import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;

public class Solution{

    // Complete the pangrams function below.
    static String pangrams(String s) {
        char[] allPosChars="abcdefghijklmnopqrstuvwxyz ".toCharArray();
        ArrayList<Character> AL=new ArrayList<Character>();
        for (char c:allPosChars)
            AL.add(c);
        for (int i=0; i<s.length(); i++)
            if (AL.indexOf(s.toLowerCase().charAt(i))>=0)
                AL.remove(AL.indexOf(s.toLowerCase().charAt(i)));

        String result="not pangram";
        if (AL.size()==0)
            result="pangram";
        return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scan.nextLine();
        scan.close();
        String result = pangrams(s);
        System.out.println(result);
    }
}