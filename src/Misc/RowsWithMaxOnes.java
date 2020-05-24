package Misc;

import java.util.Scanner;

public class RowsWithMaxOnes {
    public static int search(int temp[]) {
         int l = 0;int h = temp.length-1;
         int ans = -1;
         while (l <= h) {
             int m = (l+h)/2;
             if(temp[m] == 1 ) {
                 ans = m;
                 h = m - 1;
             }
             if(temp[m] < 1)
                 l = m +1;
             if(temp[m] > 1)
                 h = m - 1;
         //System.out.println(m+" ");
         }

         if(ans != -1)
        return temp.length - ans;
         return 0;
    }
    public static void solve(int[][] arr) {
        int temp[] = new int[arr[0].length];
        int max = 0; int r = -1;
        for(int i =0;i<arr.length;i++) {
            temp = arr[i].clone();
            int c =  search(temp);
        //System.out.println(c);
            if(max < c) {
                max = c;
                r = i;
            }
        }
       System.out.println(r);
    }
    public static void main(String[] args) {
       int arr[][] = {};
       solve(arr);
        }
    }

