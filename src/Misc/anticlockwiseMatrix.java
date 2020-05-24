package Misc;

public class anticlockwiseMatrix {
    public static void rotate( int arr[][]) {
        int n = arr.length;int m =arr[0].length;
        int[][] temp = new int[n][m];
        for(int i = 0;i<n;i++){
            for (int j = 0;j<m;j++) {
               temp[m-j-1][i] = arr[i][j];
            }
        }
        for(int i = 0;i<n;i++){
            for (int j = 0;j<m;j++)
                System.out.print(temp[i][j]+" ");
           System.out.println();
            }


    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);

    }
}
