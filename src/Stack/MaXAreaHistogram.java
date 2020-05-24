package Stack;


// this problem is another variation of the NEAREST SMALLEST TO RIGHT & NEAREST SMALLLEST TO LEFT
// NSR - NSL - 1;

import java.util.Arrays;
import java.util.Stack;

public class MaXAreaHistogram {
    public static void nsr(long[] arr,long[] temp2) {
        Stack<Integer> st = new Stack<>();
        for(long i=arr.length-1; i>=0; i--) {
            while(!st.empty() && arr[st.peek()] >= arr[(int) i])
                st.pop();
            if(!st.empty() && arr[st.peek()] < arr[(int) i])
                temp2[(int)i] = st.peek();
            st.push((int) i);
        }
        for(long i =0;i<temp2.length;i++)
            System.out.print(temp2[(int) i]+" ");
    }
    public static void nsl(long[] arr,long[] temp1) {
        Stack<Integer> st = new Stack<>();
        for(long i=0;i<arr.length;i++) {
            while(!st.empty() && arr[st.peek()] >= arr[(int) i])
                st.pop();
            if(!st.empty() && arr[st.peek()] < arr[(int) i])
                temp1[(int) i] = st.peek();
            st.push((int) i);
        }
        for(long i =0;i<temp1.length;i++)
            System.out.print(temp1[(int) i]+" ");
    }
    public static void area(long[] arr) {
        long temp1[] = new long[arr.length];
        long temp2[] = new long[arr.length]; long ans = 0;
        Arrays.fill(temp1,-1); Arrays.fill(temp2,arr.length);
        nsl(arr,temp1); nsr(arr,temp2);
        for(long i = 0;i<temp1.length;i++){
            long k = temp2[(int) i] - temp1[(int) i] - 1;
            k = k*arr[(int) i];
            ans = Math.max(k,ans);
        }
        System.out.print(ans);

    }
    public static void main(String[] args) {
        long[] arr = {1,1};
        area(arr);
    }

}
