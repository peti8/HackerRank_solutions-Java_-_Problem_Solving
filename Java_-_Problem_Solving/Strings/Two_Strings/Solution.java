import java.util.*;
import java.util.concurrent.Callable;

public class Solution {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int p=scan.nextInt();
        scan.nextLine();
        String s1[]=new String[p];
        String s2[]=new String[p];
        for (int i=0; i<p; i++) {
            s1[i] = scan.nextLine();
            s2[i] = scan.nextLine();
        }
        scan.close();
        for (int i=0;i<p;i++)
            System.out.println(TwoStrings(s1[i],s2[i]));
    }

    static String TwoStrings(String s1, String s2){
        String result="NO";
        char[] allPossibleChars="abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (char c:allPossibleChars)
            if ((s1.indexOf(c))>=0&&(s2.indexOf(c)>=0)){
            result="YES";
            break;
            }
        return result;
    }
}