package Misc;

import java.util.ArrayList;
import java.util.Arrays;

public class matrix {
                                                                                                                                                /*for(int i = 0;i<arr.length;i++) {
                                                                                                                                                    for (int j = 0;j<arr[0].length;j++)
                                                                                                                                                      System.out.print(arr[i][j]+" ");
                                                                                                                                                    System.out.println();
                                                                                                                                                }*/
        public static void set( int arr[][], ArrayList<ArrayList<Integer>> ans) {
            ArrayList<Integer> temp = null;
            int r = arr.length;  int c = arr[0].length;  boolean flag = false;
            for (int k = 0;k<r;k++){
                temp = new ArrayList<>();
                int i = k,j=0;
                while (i>=0){
                    if(flag)
                       temp.add(0,arr[i][j]);
                    else temp.add(arr[i][j]);
                    i = i-1;
                    j = j+1;
                }
                flag = !flag;
                ans.add(temp);
            }
          for(int k = 1;k<c;k++){
              int i = r-1 ;int j = k;
              temp = new ArrayList<>();
              while (j < c){
                  if(flag)
                      temp.add(0,arr[i][j]);
                  else temp.add(arr[i][j]);
                  j=j+1;
                  i = i-1;
              }
              flag = !flag;
              ans.add(temp);
          }
          System.out.println(ans);
        }

    public static void main(String[] args) {
        int arr[][] ={{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        set(arr,ans);

        for(int i = 0;i<ans.size();i++){
            for(int j = 0;j<ans.get(i).size();j++)
                System.out.println(ans.get(i).get(j));
            System.out.println();
        }
    }
}
