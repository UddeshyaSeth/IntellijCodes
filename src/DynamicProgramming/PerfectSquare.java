package DynamicProgramming;

import java.util.ArrayList;

public class PerfectSquare {
    public static void square(int n,ArrayList<Integer> a) {
        int dp[][] = new int[a.size()+1][n+1];
        for (int i = 0;i<dp[0].length;i++)
            dp[1][i] = i;
        for(int i = 2;i<dp.length;i++) {
            for(int j = 1;j<dp[0].length;j++) {
                if(j >= a.get(i-1)) {
                    int c = dp[i][j % a.get(i - 1)] + j / a.get(i - 1);
                    dp[i][j] = Math.min(dp[i - 1][j], c);
                }
                else dp[i][j] = dp[i-1][j];
            }
        }
        for(int i = 0;i<dp.length;i++) {
            for (int j = 0; j < dp[0].length; j++)
                System.out.print(dp[i][j] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 13;
        ArrayList<Integer> a = new ArrayList<>();
        int  i = 1;
        while(true) {
            if(i*i <= n) {
                a.add(i * i);
                i++;
            }
            else break;
        }
        square(n,a);
    }
}
