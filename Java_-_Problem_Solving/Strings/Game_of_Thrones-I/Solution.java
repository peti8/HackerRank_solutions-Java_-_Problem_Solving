import java.util.*;
public class Solution {
    static String gameOfThrones(String s) {
        String result="YES";
        if (s.length()==1)
            return result;
        int usedJollyChar=0;
        ArrayList<Character> AL=new ArrayList<Character>();
        for (int i=0; i<s.length(); i++)
            AL.add(s.charAt(i));
        for (int i=0; i<s.length(); i++){
            Character c=s.charAt(i);
            if(AL.contains(c)){
                AL.remove(c);
                if (!AL.contains(c)){
                    if ((s.length()%2==1)&&(usedJollyChar==0)){
                        usedJollyChar=1;
                        continue;
                    }
                    result="NO";
                    break;
                }
                AL.remove(c);
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.nextLine();
        scanner.close();
        String result = gameOfThrones(s);
        System.out.println(result);
    }
}