import java.io.*;
import java.util.*;

public class Solution{

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int needMore=0;
        boolean haveNum=false;
        boolean haveLo=false;
        boolean haveUp=false;
        boolean haveSp=false;
        for(int i=0; i<n; i++){
            char c=password.charAt(i);
            if ((c >= '0') && (c <= '9'))
                haveNum=true;
            else if ((c>='a')&&(c<='z'))
                haveLo = true;
            else if ((c>='A')&&(c<='Z'))
                haveUp=true;
            else haveSp=true;
        }

        if (haveNum==false)
            needMore++;
        if (haveLo==false)
            needMore++;
        if (haveUp==false)
            needMore++;
        if (haveSp==false)
            needMore++;
        if (n+needMore<6)
            needMore+=6-(n+needMore);
        return needMore;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String password = scanner.nextLine();
        scanner.close();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
    }
}