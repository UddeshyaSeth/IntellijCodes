package Misc;

import java.util.Arrays;
import java.util.HashMap;

public class test3 {
    public static void check(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1); map.put('V',5); map.put('X',10); map.put('L',50); map.put('C',100); map.put('D',500); map.put('M',1000);

      int sum = map.get(s.charAt(n-1));  //System.out.print(sum);

        for(int i = n-2;i>=0;i--){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
                sum = sum - map.get(s.charAt(i));
            else
                sum = sum + map.get(s.charAt(i));
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
     //   int arr[] = {1,2,3,4,5,6,7,8};
     //  System.out.println( check(arr));
        String s = "XCIX" ;
        check(s);
    }
}
