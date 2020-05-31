package Backtracking;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Stack;

public class Subsets {
    public static void subset(int[] arr,ArrayList<ArrayList<Integer>> temp,ArrayList<Integer> curr,int start) {

       temp.add(new ArrayList<>(curr));

        for(int i = start;i<arr.length;i++) {
           curr.add(arr[i]);
            System.out.println(curr);
            subset(arr,temp,curr,i+1);

            curr.remove(curr.size()-1);
        }
        return;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        Stack<ArrayList> st = new Stack<>();
        ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> curr= new ArrayList<>();
        subset(arr,temp,curr,0);
      //  System.out.println(temp);
    }
}
