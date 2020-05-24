package Misc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class pp {
    public static int bfs(int arr[][], boolean visited[][],int si,int sj,int di,int dj)  {
        Queue<m> q = new LinkedList<>();
        q.add(new m(si,sj,0));

        while (!q.isEmpty()) {
            m curr = q.poll();
            if(curr.x == di && curr.y==dj) {
               // System.out.print(curr.d);
                return curr.d;
            }
            else {
                if(isSafe(curr.x+1,curr.y,visited,arr.length)) {
                    visited[curr.x+1][curr.y]=true;
                    q.add(new m(curr.x + 1, curr.y, curr.d + 1));
                }
                if(isSafe(curr.x-1,curr.y,visited,arr.length)) {
                    visited[curr.x-1][curr.y]=true;
                    q.add(new m(curr.x - 1, curr.y, curr.d + 1));
                }

                if(isSafe(curr.x,curr.y+1,visited,arr.length)) {
                    visited[curr.x][curr.y+1]=true;
                    q.add(new m(curr.x, curr.y + 1, curr.d + 1));
                }
                if(isSafe(curr.x,curr.y-1,visited,arr.length)) {
                    visited[curr.x][curr.y-1]=true;
                    q.add(new m(curr.x, curr.y - 1, curr.d + 1));
                }

                /*if(isSafe(curr.x-1,curr.y-1,visited,arr.length))
                    q.add(new Misc.m(curr.x-1,curr.y-1,curr.d+1));

                if(isSafe(curr.x+1,curr.y+1,visited,arr.length))
                    q.add(new Misc.m(curr.x+1,curr.y+1,curr.d+1));

                if(isSafe(curr.x-1,curr.y+1,visited,arr.length))
                    q.add(new Misc.m(curr.x-1,curr.y+1,curr.d+1));

                if(isSafe(curr.x+1,curr.y-1,visited,arr.length))
                    q.add(new Misc.m(curr.x+1,curr.y-1,curr.d+1));*/

            }
        }
       // System.out.println("NF");
        return -1;
    }
    public static boolean isSafe(int x,int y,boolean[][] visited,int n) {
        if( x > n-1 || y < 0 || y > n-1 || x < 0 || visited[x][y] == true)
            return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int test = st.nextInt();
        while (test-- > 0) {
            int n = st.nextInt();
            int[][] arr = new int[n][n];
            for(int i = 0;i<arr.length;i++)
                for (int j = 0;j<arr[0].length;j++)
                    arr[i][j] = st.nextInt();
            boolean[][] visited = new boolean[n][n];
           m src =new m(0,0,0); m dest = new m(0,0,0);
            for (int i = 0; i < visited.length; i++) {
                for (int j = 0; j < visited[0].length; j++) {
                    if (arr[i][j] == 0)
                        visited[i][j] = true;
                    if(arr[i][j] == 1) {
                        src.x = i; src.y = j;
                    }

                    if(arr[i][j]==2) {
                        dest.x = i; dest.y = j;
                    }
                }
            }
          int c =  bfs(arr, visited, src.x, src.y, dest.x,dest.y);
            if(c == -1)
                System.out.println("0");
            else System.out.println("-1");
        }
    }
}

class m {
    int x,y,d;
     m(int x, int y, int d) {
        this.x = x;
        this.y = y;
        this.d = d;
    }
}