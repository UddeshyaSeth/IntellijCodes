package Strings;

import java.math.BigInteger;

public class MulitplyStrings {
    public static void solve(String s1,String s2) {
        int m[] = new int[s1.length()+s2.length()];
      for(int i= 0;i<s1.length();i++)
          for (int j = 0;j<s2.length();j++)
              m[i+j] = m[i+j] + (s1.charAt(i)-'0') * (s2.charAt(j)-'0');
       //   for (int i = 0;i<m.length;i++)
       //       System.out.print(m[i]+" ");
        StringBuilder temp =new StringBuilder();
        int c = 0;
        for(int i =m.length-1;i>=0;i--) {
            int d = m[i]%10;
            c = m[i]/10;
            if(i-1>=0)
                m[i-1] += c;
        //    System.out.println(c);
            temp = temp.append(d);
        }
        if(c!=0)
        temp.append(c);
        if(temp.charAt(0)=='0'){
            temp = new StringBuilder(temp.deleteCharAt(0));
        }
        System.out.print(temp);
        String s = new String(temp.reverse());
       //System.out.print(s);

    }
    public static void main(String[] args) {
        String s1 ="408";
        String s2 = "5";
        solve(s1,s2);
    }
}
