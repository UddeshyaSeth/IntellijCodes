package Misc;

import java.util.Arrays;

public class NextPermutation {
    public static void swap(int[] arr,int temp,int t) {
        int k = -1;
        k = arr[temp];
        arr[temp] = arr[t];
        arr[t] = k;
    }

   public static void check(int[] arr) {
       int n = arr.length;
       int temp = -1;
       for (int i = n-1;i>=1;i--) {
           if (arr[i] > arr[i - 1]) {
               temp = i - 1;
               break;
           }
       }
       int t = -1;
       if(temp!=-1){
           for(int i = n-1;i>temp;i--) {
               if (arr[i] > arr[temp]) {
                   t = i;
                   break;
               }
           }
           swap(arr,temp,t);
           Arrays.sort(arr,temp+1,n);
           for(int i = 0;i<arr.length;i++){
               System.out.print(arr[i] +" ");
           }
           return;
        }
            else{
                Arrays.sort(arr);
                return;
       }

       }

    public static void main(String[] args) {
        int arr[] = {7,6,5};
        check(arr);

    }
}
