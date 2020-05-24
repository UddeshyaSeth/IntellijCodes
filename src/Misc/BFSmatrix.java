package Misc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSmatrix {
    public static void bfs(int[][] arr,boolean visited[][],Pair src,Pair dst ) {
        int n = arr.length;
        int m = arr[0].length;
       int paths =  path(arr,visited,src);
       System.out.println(paths);
    }
//  HERE THE VALUES ARE ADDED IN THE QUEUE
    public static int path(int[][] arr, boolean visited[][], Pair src) {
        Pair node = new Pair(src.x,src.y,src.d);
        Queue<Pair>q = new LinkedList<Pair>();
        q.add(node);
        while (!q.isEmpty()) {
            Pair temp = q.poll();
            if(arr[temp.x][temp.y] == 2){
              //  System.out.println(temp.d);
                return temp.d;
            }
            else {
                ArrayList<Pair> curr = route(temp,arr,visited);
                q.addAll(curr);
            }
        }
        return -1;
    }
// THE NEIGHBOURING NODES IN THE MATRIX WITH VALID POINTS
    public static ArrayList<Pair> route(Pair temp,int[][] arr,boolean visited[][] ) {
        ArrayList<Pair> curr = new ArrayList<>();
        int n = arr.length; int m = arr[0].length;

            // THE MATRIX IS TRAVERSE IN UPWARDS DIRECTION
        if(((temp.x - 1) >= 0) && (visited[temp.x - 1][temp.y] != true) && arr[temp.x-1][temp.y] != 0){
            visited[temp.x-1][temp.y] = true;
            curr.add(new Pair(temp.x-1,temp.y,temp.d+1));
        }
            // THE MATRIX IS TRAVERSED IN DOWNWARDS DIRECTION
        if(((temp.x+1) < n) && (visited[temp.x+1][temp.y]!=true) && arr[temp.x+1][temp.y] != 0){
            visited[temp.x+1][temp.y] = true;
            curr.add(new Pair(temp.x+1,temp.y,temp.d+1));
        }
            // THE MATRIX IS TRAVERSED IN LEFT SIDE DIRECTION
        if(((temp.y-1) >= 0 ) && (visited[temp.x][temp.y-1]!=true) && arr[temp.x][temp.y-1] != 0){
            visited[temp.x][temp.y-1] = true;
            curr.add(new Pair(temp.x,temp.y-1,temp.d+1));
        }
            // THE MATRIX IS TRAVERSED IN RIGHT SIDE DIRECTION
        if(((temp.y+1) < m ) && (visited[temp.x][temp.y+1]!=true) && arr[temp.x][temp.y+1] != 0){
            visited[temp.x][temp.y+1] = true;
            curr.add(new Pair(temp.x,temp.y+1,temp.d+1));
        }
        return curr;
    }

    public static void main(String[] args) {
        int arr[][] = {{0,3,2},{3,0,0},{1,0,0}};
        Pair src = null;
        Pair dst= null;
        boolean visited[][] = new boolean[arr.length][arr[0].length];
        for(int i =0;i<arr.length;i++)
            for (int j = 0;j<arr[0].length;j++) {
                if (arr[i][j] == 0)
                    visited[i][j] = true;
                if(arr[i][j] ==1)
                    src = new Pair(i,j,0);
                if(arr[i][j] ==2)
                    dst = new Pair(i, j,0);
            }
         bfs(arr,visited,src,dst);
    }
}

class Pair {
    int x, y;
    int d;

    public Pair(int x, int y, int d) {
        this.x = x;
        this.y = y;
        this.d = d;
    }

}