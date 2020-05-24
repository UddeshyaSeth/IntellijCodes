package DynamicProgramming;

import java.util.Arrays;

public class MinimumJumpArray {
     public static void jumps(int[] arr) {
         int n = arr.length;
         if(n==0 || arr[0] ==0) {
             System.out.print("-1");
             return;
         }

         int t[] = new int[n];
        t[0] = 0;
      ///  Arrays.fill(t,1,n-1,Integer.MAX_VALUE);
         for(int i = 1;i<arr.length;i++) {
             t[i] = Integer.MAX_VALUE;
             for(int j = 0;j<i;j++) {
                 if(arr[j]+j >= i && t[j] != Integer.MAX_VALUE)
                     t[i] = Math.min(t[j]+1,t[i]);
             }
         }

         for(int i = 0;i<t.length;i++)
             if(t[i] == Integer.MAX_VALUE)
                 t[i] = -1;
         for(int i = 0;i<t.length;i++)
             System.out.print(t[i]+" ");

     }
    public static void main(String[] args) {
        int[] arr = {1 ,3 ,5 ,8 ,9 ,2 ,6 ,7 ,6 ,8 ,9};
        jumps(arr);
    }
}
