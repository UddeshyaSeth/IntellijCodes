package Misc;/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class kadane {
    public static void main (String[] args) {
        Scanner st = new Scanner(System.in);
        int test = st.nextInt();
        while(test-- > 0 ) {
            int t = st.nextInt();
            int arr[] = new int[t];
            for(int i = 0;i<arr.length;i++) {
                arr[i] = st.nextInt();
            }
            int max = arr[0];

            int curr = arr[0];
            for(int i = 1;i<arr.length;i++) {
                curr = Math.max(arr[i],curr+arr[i]);
                max = Math.max(curr,max);
            }
            System.out.println(max);
        }
    }
}