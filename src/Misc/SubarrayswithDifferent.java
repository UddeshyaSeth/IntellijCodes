package Misc;

import java.util.*;

public class SubarrayswithDifferent {
    public static boolean compare(Queue<Integer> q,int k ) {
        HashSet<Integer> set = new HashSet<>();
        set.addAll(q);
        if(set.size() == k)
            return true;
        return false;
    }
    public static void helper(int[] arr,int k) {
        int c = 0;
        for (int j  = k;j<=arr.length;j++) {
            System.out.print(j+"$");
            Queue<Integer> q = new LinkedList<>();
            for(int i = 0;i<j;i++)
                q.add(arr[i]);
            Iterator<Integer>itt = q.iterator();
            while(itt.hasNext()) {
                System.out.print(itt.next());
            }
            System.out.println();
            if(compare(q,k))
                c++;

            for (int i = j;i<arr.length;i++) {
                q.poll();
                q.add(arr[i]);
                Iterator<Integer>it = q.iterator();
                while(it.hasNext()) {
                    System.out.print(it.next());
                }
                System.out.println();
               // System.out.print("#"+c+"#");
                if(compare(q,k))
                    c++;
            }

        }
        System.out.print(c);
        //18004256396
    }
    public static void main(String[] args) {
        int arr[] = {2,1,2,1,2};
        int k  = 2;
        helper(arr,k);
    }
}
