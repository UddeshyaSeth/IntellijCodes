package Misc;

import java.util.ArrayList;
import java.util.Arrays;

public class aNumberAppearsTwice {
    public static void helper(int arr[]) {
        Arrays.sort(arr);
        if(arr.length <= 2) return;

        int j = 2;
        for(int i= 2;i<arr.length;i++) {
           if(arr[j-2] != arr[i]){
                arr[j] = arr[i];
                j++;
            }
        }
        for(int k = 0;k<j;k++)
            System.out.print(arr[k]+" ");

        System.out.print(Integer.valueOf("100",2));

    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3};
        helper(arr);
    }
}
