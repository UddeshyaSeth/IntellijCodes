package Misc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RemoveKDigits {
    public static void helper(String s,int k ) {
        StringBuilder st = new StringBuilder();
        for(int i = 0;i<s.length();i++) {
            st.append(s.charAt(i));
        }
        if (k >= s.length())
            return;

        for(int j = 0;j<k;j++) {
            int i = 0;
            while(i<st.length()-1 && st.charAt(i) <= st.charAt(i+1)){
                i++;
            }
            st.delete(i,i+1);
        }

        System.out.println(st);
    }


    public static void main(String[] args) {
        String s = "1432219";
        int k = 3;
        helper(s,k);
    }
}
