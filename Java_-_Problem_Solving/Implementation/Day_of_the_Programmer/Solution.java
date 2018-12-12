import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Solution {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int y=Integer.parseInt(br.readLine().trim());
        br.close();
        System.out.println(dayOfProgrammer(y));
    }
    static String dayOfProgrammer(int year){
        String dayAndMonth=(year==1918)?"26.09.":"13.09.";
        if (((year<1918)&&(year%4==0))||((year>=1918)&&(((year%4==0)&&(year%100!=0))||(year%400==0))))
            dayAndMonth="12.09.";
        return dayAndMonth+year;
    }
}