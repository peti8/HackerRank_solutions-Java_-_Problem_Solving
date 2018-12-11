import java.util.*;
public class Solution{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();
        int result = alternate(s);
        System.out.println(result);
    }

    static int alternate(String s){
        int n=s.length();
        ArrayList<Character> diffCh=new ArrayList<Character>();
        for (int i=0; i<n; i++)
            if (!diffCh.contains(s.charAt(i)))
            diffCh.add(s.charAt(i));
        String stToCheck="";
        String longestSt="";
//            System.out.println(diffCh);
        for (int i=0; i<diffCh.size()-1; i++)
            for (int j=i+1; j<diffCh.size(); j++){
                for (int k=0; k<n; k++)
                    if ((s.charAt(k)==diffCh.get(i))||s.charAt(k)==diffCh.get(j))
                        stToCheck+=s.charAt(k);
//                System.out.println(stToCheck);
                boolean alternate=true;
                for (int l=0; l<stToCheck.length()-1; l++)
                    if (stToCheck.charAt(l)==stToCheck.charAt(l+1))
                        alternate=false;
                if (alternate)
                    if (stToCheck.length()>longestSt.length()){
                        longestSt=stToCheck;
                    }
                stToCheck="";
            }
        return longestSt.length();
    }
}