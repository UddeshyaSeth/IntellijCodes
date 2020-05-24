package Misc;

import java.util.*;
import java.lang.*;
import java.io.*;

class FirstReaptingCharacter {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
//        int Misc.test = st.nextInt();
       //while (Misc.test-- > 0) {
           // int Misc.t = st.nextInt();
            String s = st.next();
            HashSet<Character> set = new HashSet<>();
            Queue<Character> q = new LinkedList<>();
            String temp = "";
            for (int i = 0; i < s.length(); i++) {
                if (!set.contains(s.charAt(i))) {
                    q.add(s.charAt(i));
                    set.add(s.charAt(i));
                    if (!q.isEmpty())
                        temp = temp + q.peek();
                    else temp = temp + s.charAt(i);
                }
                else {
                    q.remove(s.charAt(i));
                    if (q.isEmpty())
                    temp = temp + "-1";
                    else temp = temp+q.peek();

                }
            }
            for(int i = 0;i<temp.length();i++)
            System.out.print(temp.charAt(i)+" ");
     //   }
    }
}
