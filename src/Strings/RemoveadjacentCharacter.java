package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RemoveadjacentCharacter {
    public static void solve(String s,int k) {
        Stack<pair> st = new Stack<>();

        for(int i = 0;i<s.length();i++) {
            char x = s.charAt(i);
            if (!st.empty() && st.peek().f == k) {
                char  curr = st.peek().c;
                while (!st.empty() && st.peek().c == curr)
                    st.pop();
            }
            if (!st.empty() && st.peek().c == x) {
                pair top = new pair(x, st.peek().f + 1);
                st.push(top);
            } else {
                pair top = new pair(x, 1);
                st.push(top);
            }
        }
        if (!st.empty() && st.peek().f == k) {
            char  curr = st.peek().c;
            while (!st.empty() && st.peek().c == curr)
                st.pop();
        }
        String temp = "";
      while(!st.empty()) {
          temp = temp + st.pop().c;
      }
        String n = "";
      for(int i = temp.length()-1;i>=0;i--)
          n = n+temp.charAt(i);

      System.out.print(n);

    }
    public static void main(String args[]) {
        String s = "deeedbbcccbdaa";
        int k = 3;
        solve(s,k);

    }
}

class pair {
    char c;
    int f;
    public pair(char c, int f) {
        this.c = c;
        this.f = f;
    }
}

