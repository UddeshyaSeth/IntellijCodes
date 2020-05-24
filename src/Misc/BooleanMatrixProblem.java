package Misc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BooleanMatrixProblem {
    public static void correct(int[][] arr,int i , int j , int[][] temp) {
            for(int x = 0;x<arr[0].length;x++)
                temp[i][x] = 1;
            for(int x = 0;x<arr.length;x++)
                temp[x][j] = 1;
    }
    public static void solve(int[][] arr) {
        int temp[][] = new int[arr.length][arr[0].length];
        for(int i = 0;i<arr.length;i++)
            for(int j = 0;j<arr[0].length;j++)
                if(arr[i][j] == 1) {
                    correct(arr,i,j,temp);
                }
        for(int i = 0;i<arr.length;i++) {
            for (int j = 0; j < arr[0].length; j++)
            System.out.print(temp[i][j]+" ");
                System.out.println();
        }
        Queue<Integer>q = new LinkedList<>();
        ArrayList<Integer>ans  = new ArrayList<>();
        ans.addAll(q);
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 0, 0}
                ,{1 ,0 ,0}
                ,{1 ,0, 0}
                ,{0 ,0 ,0}};
        solve(arr);
    }
}
