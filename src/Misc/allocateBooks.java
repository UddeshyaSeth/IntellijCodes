package Misc;

import java.util.Arrays;
import java.util.Scanner;


public class allocateBooks {
    public static long sum (long[]arr,long start,long end) {
        long sums = 0;
        for (long i =start;i<=end;i++)
            sums+=arr[(int) i];
        return sums;
    }
    public static long allocation(long[] arr,long k){
        long l  = 0;
        long ans = 0;
        long h = sum(arr,0,arr.length-1);
        while(l<=h) {

            long mid = l + (h-l)/2;
            long sum=0;
            long parts= 1;
            for(long i = 0;i<arr.length;i++) {
                if(sum+arr[(int) i] > mid) {
                    parts+=1;
                    sum = arr[(int) i];
                }
                else sum +=arr[(int) i];
            }
            if(parts > k) {
                l = mid+1;
            }
            else {
                h = mid - 1;
                ans = mid;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        long test= st.nextInt();
        while(test-- > 0) {
            long n = st.nextLong();
            long arr[] = new long[(int) n];
            for (long i = 0;i<n;i++)
                arr[(int) i] = st.nextInt();
            long k =st.nextInt();
            //Arrays.sort(arr);
           long c = allocation(arr,k);
           for(long i = 0;i<arr.length;i++)
               c = Math.max(c,arr[(int) i]);
           System.out.println(c);
        }
    }

}
