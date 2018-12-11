import java.util.*;
public class Solution {
    static int makingAnagrams(String s1, String s2) {
        ArrayList<Character> AL=new ArrayList<Character>();
        for (int i=0; i<s1.length(); i++)
            AL.add(s1.charAt(i));
        for (int i=0; i<s2.length(); i++){
            Character c=s2.charAt(i);
            if (AL.contains(c))
                AL.remove(c);
        }
        int commonChars=s1.length()-AL.size();
        int toRemove=s1.length()-commonChars+s2.length()-commonChars;
        return toRemove;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        scanner.close();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
        scanner.close();
    }
}