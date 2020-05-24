package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElementLeft {
    public static void nsl(int[] arr) {
        int temp[] = new int[arr.length];
        Arrays.fill(temp,-1);
        Stack<Integer>st = new Stack<>();
        for(int i = 0;i<arr.length;i++) {
            while (!st.empty() && st.peek() >= arr[i] )
                st.pop();

            if(!st.empty() && st.peek() < arr[i])
                temp[i] = st.peek();

            st.push(arr[i]);
        }

        for(int i : temp)
            System.out.print(i +" ");
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        nsl(arr);
    }
}
