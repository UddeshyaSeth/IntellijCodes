package Misc;

import java.util.*;

public class zigzagWords {
    public static void check(String s,int k ) {
        String arr[] = new String[k];
        char c[] = s.toCharArray();
        Arrays.fill(arr,"");
        int r = 0;
        boolean flag = true;
        for (int i = 0;i<s.length();i++) {
            arr[r] += c[i];
            if(r==k-1)
                flag = false;
            else if(r==0) flag = true;
            if(flag) r++;
            else  r--;
        }
        for (int i = 0;i<arr.length;i++)
            System.out.print(arr[i]);

    }
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int k = 3;
        check(s,k);
    }
}
