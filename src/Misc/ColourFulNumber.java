package Misc;

import java.util.HashSet;

public class ColourFulNumber {
    public static void color(String s) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<s.length();i++){
            int result = 1;
            for (int j = i;j<s.length();j++) {
                int c = s.charAt(j)-'0';
                result = result * c;
                if(set.contains(result)) {
                    System.out.print("YES");
                    return;
                }
                else set.add(result);
            }
        }
        System.out.print(set);
    }
    public static void main(String[] args) {
        int A = 3245;
        String s = String.valueOf(A);
        color(s);
    }
}
