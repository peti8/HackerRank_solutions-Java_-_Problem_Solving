import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the superReducedString function below.
    static String superReducedString(String s) {
        ArrayList<Character> AL=new ArrayList<Character>();
        for (int i=0; i<s.length(); i++) 
            AL.add(s.charAt(i));
        int prevlth=s.length()+1;
        int actlth=AL.size();
        lab0:while (actlth<prevlth) {
            int i=0;
            while (i<actlth-1){
                if (AL.get(i)==AL.get(i+1)) {
                    AL.remove(i);
                    AL.remove(i);
                    prevlth=actlth;
                    actlth=AL.size();
                    continue lab0;
                }
                else i++;
            }
            prevlth=actlth;
            actlth=AL.size();
        }
        String result="";
        if (AL.size()>0){
            for(char c:AL)
                result+=c;
            }
        else result="Empty String";
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}