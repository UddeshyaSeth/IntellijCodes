package Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static void ngr(int[] arr) {
        int n = arr.length;
        int temp[] = new int[arr.length];
        Arrays.fill(temp, -1);
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            // IF THE CURRENT ELEMENT IS GREATER THAN THE TOP ELEMENT
            while (!st.empty() && st.peek() < arr[i])
                st.pop();
            // IF THE CURRENT ELEMENT IS SMALLER THAN THE TOP ELEMENT
            if (!st.empty() && st.peek() >= arr[i])
                temp[i] = st.peek();
            // IN ANY CASE THE ELEMENT HAVE TO BE PUSHED
            st.push(arr[i]);
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    public static void main(String[] args) {
        //int arr[] = {4,3,2,1};
        Scanner st = new Scanner(System.in);
        int test = st.nextInt();
        while (test-- > 0) {
            int t = st.nextInt();
            int arr[] = new int[t];
            for (int i = 0; i < arr.length; i++)
                arr[i] = st.nextInt();
            ngr(arr);
        }
    }
}
