package Strings;

import java.math.BigInteger;

public class ATOI {
    public static void main(String[] args) {
        String s = "9223372036854775808";

        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String s) {

        s= s.trim();
        if(s.length() ==  0) return 0;

        long sum = 0;
        boolean flag= false;
        if(s.charAt(0) == '-' )
            flag = true;
        else if(s.charAt(0) == '+')
            sum=0;

        else if(!Character.isDigit(s.charAt(0)))
            return 0;

        else if(Character.isDigit(s.charAt(0)))
            sum = s.charAt(0) - '0';

        for(int i = 1;i<s.length();i++) {
            if(!Character.isDigit(s.charAt(i)))
                break;

            if(Character.isDigit(s.charAt(i)))
                sum = sum*10+s.charAt(i)-'0';
        }

        if(Math.abs(sum) > Integer.MAX_VALUE && flag )  {
           //// System.out.println(Integer.MIN_VALUE);
            return Integer.MIN_VALUE;
        }
        if(Math.abs(sum) > Integer.MAX_VALUE && !flag )  {
            //System.out.println(Integer.MAX_VALUE);
            return Integer.MAX_VALUE;
        }

        if(flag) {
            //System.out.println(0 - sum);
            return (int)(0-sum);
        }
            else System.out.println(sum);
        return (int)sum;
    }
}
