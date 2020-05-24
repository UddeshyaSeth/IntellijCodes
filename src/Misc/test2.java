package Misc;

import java.lang.reflect.Array;
import java.util.*;

public class test2 {
    public static void check(int[][] arr,int n,int x,int y) {
        boolean visited[][] = new boolean[arr.length][arr.length];
        arr[x][y] = 1;
          int c =  dfs(arr,visited,x,y,0);
            System.out.print(c);
    }

    public static int dfs(int[][] arr,boolean visited[][],int x,int y,int count ) {
        if(x<-1 || x>arr.length || y<-1 ||  y>arr.length || visited[x][y] == true || arr[x][y]==0){
            return 0;
        }
        visited[x][y] = true;
        count=count+1;
        dfs(arr,visited,x+1,y,count);
        dfs(arr,visited,x-1,y,count);
        dfs(arr,visited,x,y+1,count);
        dfs(arr,visited,x,y-1,count);
        //System.out.print(count);
        return count;
    }


    public static void main(String[] args) {
        int arr[][] = {{0,0,1,0,1,1},{1,0,1,1,1,1},{0,0,0,0,0,1},{0,0,0,0,0,1},{1,1,1,0,1,1},{1,1,1,1,1,1}};
        int n =2;
        int x = 2;int y=3;

      check(arr,n,x,y);
      //  System.out.print(Misc.m);
    }
}