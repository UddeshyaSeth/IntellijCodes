package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class LongestCommonPrefix {
    public static void solve(String[] arr) {

        int min = 1000000;
        for (int i = 0; i < arr.length; i++)
            min = Math.min(min, arr[i].length());

        String temp = "";
        for (int i = 0; i < min; i++)
            for (int j = 1; j < arr.length; j++) {
                if (arr[0].charAt(i) != arr[j].charAt(i)) {
                    temp = temp + arr[0].substring(0, i);
                    System.out.println(temp);
                    return;
                }
            }

    }
    public static void main(String[] args) {
        String arr[] = {"flower","flow","flight"};
        Arrays.sort(arr);
        //for (int i = 0;i<arr.length;i++)
          //  System.out.println(arr[i]);
        solve(arr);
    }
}
