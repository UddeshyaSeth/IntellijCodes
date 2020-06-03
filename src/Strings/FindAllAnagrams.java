package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class FindAllAnagrams {
    public static boolean compare(int[] arr1,int[]arr2) {
        for(int i = 0;i<256;i++){
            if(arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
    public static void helper(String s, String t) {
        int max = 256;
       int arr1[] = new int[max];
       int arr2[] = new int[max];
        int m=t.length();
        int n = s.length();
        ArrayList<Integer>a = new ArrayList<>();
        for(int i = 0;i<t.length();i++) {
            arr1[s.charAt(i)-'a']++;
            arr2[t.charAt(i)-'a']++;
        }

        for(int i =m;i<n;i++ ) {
            if (compare(arr1, arr2))
                a.add(i - m);
            arr1[s.charAt(i) - 'a']++;
            arr1[s.charAt(i - m) - 'a']--;
        }
        for(int i = 0;i<10;i++)
            System.out.print(arr1[i]+" " );
        if(compare(arr1,arr2))
                a.add(n-m);

        System.out.println(a);
    }
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String t = "abc";
        helper(s,t);
    }
}
