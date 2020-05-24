package Stack;

import java.util.Arrays;
import java.util.Stack;

public class MaxAreaRECTANGLE {
    public static void nsr(int[] arr,int[] temp1){
        Arrays.fill(temp1,arr.length);
        Stack<Integer>st = new Stack<>();
        for(int i = arr.length-1; i>=0; i--) {
            while (!st.empty() && arr[i] <= arr[st.peek()])
                st.pop();
            if(!st.empty() && arr[i] > arr[st.peek()])
                temp1[i] = st.peek();
            st.push(i);
        }

    }
    public static void nsl(int[] arr,int[] temp2){
        Arrays.fill(temp2,-1);
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<arr.length;i++) {
            while(!st.empty() && arr[i] <= arr[st.peek()])
                st.pop();
            if(!st.empty() && arr[i] > arr[st.peek()])
                temp2[i] = st.peek();
            st.push(i);
        }
       // for (int i = 0;i<temp2.length;i++)
         //   System.out.print(temp2[i] +" ");
    }
    public static int mah(int[] arr){
        int temp1[] = new int[arr.length];
        int temp2[] = new int[arr.length];
        int ans = 0;
        nsr(arr,temp1); nsl(arr,temp2);
        for(int i = 0;i<arr.length;i++) {
            int k = temp1[i] - temp2[i] - 1;
            ans = Math.max(ans, k*arr[i]);
        }
        return ans;
    }

    public static void area(char[][] matrix) {
        int arr[] = new int[matrix[0].length];
        for(int i = 0;i<matrix[0].length;i++)
            arr[i] = matrix[0][i]-'0';
        int ans=mah(arr);
        char[] temp = null;
        for(int i = 0;i<matrix.length;i++) {
            temp = new char[matrix[0].length];
            temp = matrix[i].clone();
            for(int j = 0;j<temp.length;j++) {
                if(temp[j] == '1')
                    arr[j]= arr[j] + temp[j]-'0';
                if(temp[j] == 0)
                    arr[j] = 0;
                ans = Math.max(ans,mah(arr));
            }
        }
        System.out.print(ans);
    }
    public static void main(String[] args) {
        char matrix[][] = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        area(matrix);
    }
}
