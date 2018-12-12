import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nk =br.readLine().replaceAll("\\s+$", "").split(" ");
        int n=Integer.parseInt(nk[0]);
        int k=Integer.parseInt(nk[1]);
        String[] items=(br.readLine().replaceAll("\\s+$", "").split(" "));
        int[] bill=new int[n];
        for (int i=0; i<n; i++)
            bill[i]=Integer.parseInt(items[i]);
        int b=Integer.parseInt(br.readLine().replaceAll("\\s+$","").trim());
        System.out.println(bonApp(bill, k, b));
    }
    static String bonApp(int[] bill, int k, int b){
        String result="Bon Appetit";
        int chargeA = 0;
        for (int i=0; i<bill.length; i++)
            if (i!=k)
                chargeA += bill[i];
        chargeA=chargeA/2;
        if(b-chargeA!=0)
            result=String.valueOf(b-chargeA);
        return result;
    }
}