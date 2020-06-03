package Misc;

import java.util.Arrays;

public class aNumberAppearsTwice {
    public static void helper(int arr[]) {
        Arrays.sort(arr);
        if(arr.length <= 2) return;

        int j = 3;
        for(int i= 3;i<arr.length;i++) {
           if(arr[j-3] != arr[i]){
                arr[j] = arr[i];
                j++;
            }
        }
        for(int k = 0;k<j;k++)
            System.out.print(arr[k]+" ");

    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3};
        helper(arr);
    }
}
