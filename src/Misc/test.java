package Misc;

import java.util.*;

public class test {
public static int check(String a) {
    String s = "ab";

    String temp = ""; int c = 0;
   for(int i = 0;i<a.length();i++){
        temp = temp + a.charAt(i);
        if(temp.contains(s))
            c++;
             System.out.println(c);
    }


return 0;
}

    public static void main(String[] args) {
    String a ="acb";
    int c = check(a);
    }
}