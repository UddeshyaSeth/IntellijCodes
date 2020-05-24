package Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class AmazingSubstrings {
    public static void check(String s) {
       // HashSet<String> ans = new HashSet<>();
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0;i<s.length();i++) {
            for (int j = i+1;j<=s.length();j++) {
                String temp = new String(s.substring(i,j));
                ans.add(temp);
            }
        }
        int c = (solve(ans));//%100000007)%100000007;
        System.out.println(c);
    //    System.out.println(ans);
    }
    public static int solve(ArrayList<String>ans) {
        int k = 0;
        Iterator<String> i = ans.iterator() ;
        while(i.hasNext()) {
            String temp = i.next();
            if(temp.charAt(0) == 'a' ||temp.charAt(0) == 'e' || temp.charAt(0) == 'i' || temp.charAt(0) == 'o' || temp.charAt(0) == 'u' || temp.charAt(0) == 'A' ||temp.charAt(0) == 'E' || temp.charAt(0) == 'I' || temp.charAt(0) == 'O' || temp.charAt(0) == 'U')
                k = k+1;
        }
        return k;
    }
    public static void main(String[] args) {
        String s = "pGpEusuCSWEaPOJmamlFAnIBgAJGtcJaMPFTLfUfkQKXeymydQsdWCTyEFjFgbSmknAmKYFHopWceEyCSumTyAFwhrLqQXbWnXSn" ;
        check(s);
    }
}
