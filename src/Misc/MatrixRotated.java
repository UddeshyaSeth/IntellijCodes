package Misc;

public class MatrixRotated {
    public static void rotate(int arr[][],int temp[][] ) {

        int r = arr.length;  int c = arr[0].length;
        for(int i = 0;i<r;i++){
            for (int j =0;j<c;j++) {
                temp[j][r-i-1]=arr[i][j];
            }
        }
        for(int i = 0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int temp[][] = new int[arr.length][arr[0].length];
        int r = arr.length;  int c = arr[0].length;
        rotate(arr,temp);
        for(int i = 0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = temp[i][j];
            }
            }
        rotate(arr,temp);
        }
}
