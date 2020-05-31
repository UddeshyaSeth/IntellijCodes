package Backtracking;

public class SudokuSolve {
    public static boolean canPlace(int[][] arr,int n,int r,int c,int i) {
        for(int j=0;j<n;j++) {
            if ( arr[j][c] == i) return false;
        }
        for(int j=0;j<n;j++)  {
            if( arr[r][j]==i) return false;
        }
        int root = (int)Math.sqrt(n);
       // System.out.print(root);
        int boxStart = r - r%root;
        int boxStartc = c - c%root;

        for(int x = boxStart; x<boxStart+root;x++)
            for(int y = boxStartc;y<boxStartc+root;y++)
                if(arr[x][y] == i) return false;

        return true;
    }

    public static boolean sudokuSolver(int[][] arr,int n) {
        int r = -1;
        int c = -1;
        boolean empty = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] == 0) {
                     r = i; c = j;
                     empty = false;
                     break;
                }
            }
            if(!empty)
                break;
        }
        if(empty) return true;

        for(int i = 1;i<=9;i++) {
            if (canPlace(arr, n, r, c, i)) {
                arr[r][c] = i;
                if (sudokuSolver(arr, n)) return true;
                else arr[r][c] = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int arr[][]= {{5,3,0,0,7,0,0,0,0},
                      {6,0,0,1,9,5,0,0,0},
                      {0,9,8,0,0,0,0,6,0},
                      {8,0,0,0,6,0,0,0,3},
                      {4,0,0,8,0,3,0,0,1},
                      {7,0,0,0,2,0,0,0,6},
                      {0,6,0,0,0,0,2,8,0},
                      {0,0,0,4,1,9,0,0,5},
                      {0,0,0,0,8,0,0,7,9}};

        boolean s = sudokuSolver(arr,arr.length);

        for(int i = 0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
}
