package DynamicProgramming;

import java.util.Arrays;

public class SubsetSum {
    public static void subset(int[] arr,int k) {
        int n = arr.length;
        boolean t[][] = new boolean[n+1][k+1];
        for (int i =1;i<=n;i++) {
            for (int j = 1;j<=k;j++) {
                if(arr[i-1] == j)
                    t[i][j] = true;
                if(arr[i-1] > j)
                    t[i][j] = t[i-1][j];
                if(arr[i-1] < j)
                    t[i][j] = t[i-1][j] || t[i-1][j-arr[i-1]];
            }
        }

        for(int i = 0;i<t.length;i++) {
            for(int j =0;j<t[0].length;j++)
                System.out.print(t[i][j]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {3, 34, 4, 12, 5, 2};
        int k = 9;
        Arrays.sort(arr);
        subset(arr,k);
    }
}
