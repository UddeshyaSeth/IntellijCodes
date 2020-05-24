package DynamicProgramming;

import java.lang.reflect.Array;

public class MaxRectangleSumInMatrix {
    public static int kadane(int[] temp) {
        int sum = temp[0];
        int ans = temp[0];
        for (int i = 0; i < temp.length; i++) {
            sum = Math.max(sum + temp[i], temp[i]);
        ans = Math.max(ans, sum);
    }
     //   System.out.println(ans);
        return ans;
    }

    public static void sums(int[][] matrix) {
        int dp[][] = new int[matrix.length][matrix[0].length];
        int max = Integer.MIN_VALUE;
        int tempSum=0;
        int k = Integer.MIN_VALUE;
        int c = 0;

        for(int i = 0;i<matrix[0].length;i++) {
            for (int j = 0; j < matrix.length; j++) {
                c = c + matrix[j][i];
            }
                dp[0][i] = c;
                c=0;
        }
        for(int i =1;i<matrix.length;i++) {
            for(int j = 0;j<matrix[0].length;j++)
                dp[i][j] = dp[i-1][j] - matrix[i-1][j];
        }

        for(int i = 0;i<dp.length;i++){
            int temp[] = dp[i].clone();
            k =   kadane(temp);
            tempSum = Math.max(tempSum,k);
         }
       System.out.println(tempSum);


      /*  for(int i =0; i<dp.length;i++) {
            for(int j = 0;j<dp[0].length;j++)
                System.out.print(dp[i][j] +" ");
                System.out.println();
        }*/
    }
    public static void main(String[] args) {
        int matrix[][] =   {{1,0,1},{0,-2,3}};  // {{1,2,-1,-4,-20},{-8,-3,4,2,1},{3,8,10,1,3},{-4,-1,1,7,-6}};
        sums(matrix);

    }
}
