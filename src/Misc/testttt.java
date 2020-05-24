package Misc;

import java.math.BigInteger;

public class testttt {
    public static void sqtr(int x) {
        int l = 0;int h = x/2; int ans = 0;
        while(l<=h) {
            int mid = l+(h-l)/2;
           long d = (long)mid*mid;
           if(d==x) {
               System.out.print(mid);
               return;
           }
           if(d < x){
               ans = mid;
               l = mid+1;
           }
               else h = mid-1;

        }
        System.out.print(ans);
    }
    public static void main(String[] args) {
        int x =930675566;
        sqtr(x);
    }
}
