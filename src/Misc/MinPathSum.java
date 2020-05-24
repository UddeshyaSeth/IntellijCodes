package Misc;

import java.util.Scanner;

public class MinPathSum {
    public static void sum(int[][] arr) {
        int sums = 0;

    }
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int test = st.nextInt();
        while (test-- > 0) {
            int n = st.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < arr.length; i++)
                for (int j = 0; j < arr[0].length; j++)
                    arr[i][j] = st.nextInt();
                sum(arr);
        }
    }
}
