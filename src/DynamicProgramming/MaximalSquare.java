package DynamicProgramming;

public class MaximalSquare {
    public static void solve(int[][] matrix) {
        int dp[][] = new int[matrix.length][matrix[0].length];
        for(int i =0;i<matrix.length;i++)
            dp[i][0] = matrix[i][0];

        for(int i =0;i<matrix[0].length;i++)
            dp[0][i] = matrix[0][i];

        int max = 0;
        for (int i = 1;i<matrix.length;i++) {
            for (int j = 1;j<matrix[0].length;j++) {
                if(matrix[i][j] == 1) {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        for(int i = 0;i<dp.length;i++) {
            for(int j = 0;j<dp[0].length;j++)
                max = Math.max(max,dp[i][j]);
        }
        System.out.println(max);
        for (int i = 0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++)
                System.out.print(dp[i][j] +" ");
                System.out.println();
        }



    }
    public static void main(String[] args) {
        int[][] matrix =
                {
                        {}
                };
        solve(matrix);
    }
}
