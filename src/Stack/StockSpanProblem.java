package Stack;

// this problem is the variation of Nearest Greater to left

import java.io.BufferedReader;
import java.util.*;


public class StockSpanProblem {
    public static void stock(int[] arr,ArrayList<Integer> e ) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> k = new ArrayList<>();
        for (int i=0;i<arr.length;i++)
            k.add(-1);
        for (int i = 0; i < arr.length; i++) {
            while (!st.empty() && arr[st.peek()] <= arr[i])
                st.pop();
            if (!st.empty() && arr[st.peek()] > arr[i]) {
                k.set(i,st.peek());
            }
            st.push(i);
        }
        System.out.println(k);
        for(int i = 0;i<arr.length;i++) {
            System.out.print(i-k.get(i)+" ");

        }

    }
    public static void main(String[] args) {
        int[]  arr = {100,80,60,70,60,75,85};
        ArrayList<Integer> e = new ArrayList<>();
        for(int i = 0;i<arr.length;i++)
            e.add(arr[i]);
        stock(arr,e);
    }
}
