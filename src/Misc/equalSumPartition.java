package Misc;

import java.util.Arrays;

public class equalSumPartition {
    public static void check(int[] arr){
        int total = 0;
        for (int i =0;i<arr.length;i++)
            total+=arr[i];
        if(total%2 != 0) {
            System.out.println("false");
            return;
        }
        total=total/2;
        boolean dp[][] = new boolean[arr.length+1][total+1];
        for (int i = 1;i<=arr.length;i++){
            for (int j = 1;j<=total;j++) {
                if(arr[i-1] == j)
                    dp[i][j] = true;
                else if(arr[i-1] > j)
                    dp[i][j] = dp[i-1][j];
                else {
                    dp[i][j] = dp[i-1][j] || dp[i-1][j - arr[i-1]];
                }
            }
        }

        for (int i = 0;i<dp.length;i++) {
            for (int j = 0;j<dp[0].length;j++)
                System.out.print(dp[i][j]+" ");
            System.out.println();
        }


    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        Arrays.sort(arr);
        check(arr);
    }
}
