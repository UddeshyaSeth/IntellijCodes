package Misc;

public class DungeonGame {
    public static void game(int[][] arr) {
        int m = arr.length;  int n = arr[0].length;
        boolean visited[][] = new boolean[m][n];
        int health = arr[0][0]; visited[0][0] = true;
        for(int i = 0;i<m;i++){
            for (int j = 0;j<n;j++) {
                if (i != m - 1 && j != n - 1) {
                    if (visited[i][j] == true) {
                        health = health + Math.max(arr[i][j + 1], arr[i + 1][j]);
                        if (arr[i][j + 1] < arr[i + 1][j]) visited[i + 1][j] = true;
                        if (arr[i][j + 1] > arr[i + 1][j]) visited[i][j + 1] = true;
                    }
                }
                if(i==m-1 && j<n-1){
                    if(visited[i][j] == true){
                        health = health + arr[i][j+1];
                        visited[i][j+1] = true;
                    }
                }
                if(j == n-1 && i<m-1){
                    if(visited[i][j] == true) {
                        health = health+arr[i+1][j];
                        visited[i+1][j] = true;
                    }
                }
            }
           // System.out.println(health+1);
        }
        for(int i=0;i<m;i++){
            for(int j = 0;j<n;j++)
                System.out.print(visited[i][j]+" ");
            System.out.println();
        }
        System.out.println(health);
    }
    public static void main(String[] args) {
        int arr[][] ={{2,10,3},{1,30,-5},{-5,10,-3}};
        game(arr);
    }
}
