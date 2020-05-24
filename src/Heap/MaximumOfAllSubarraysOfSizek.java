package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaximumOfAllSubarraysOfSizek {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int test = st.nextInt();
        while (test-- > 0) {
            int t = st.nextInt();
            int k = st.nextInt();
            int arr[] = new int[t];
            for (int i = 0; i < arr.length; i++)
                arr[i] = st.nextInt();
            PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
            for (int i = 0; i < k; i++)
                q.add(arr[i]);
            System.out.print(q.peek()+" ");

            for (int i = k; i < arr.length; i++) {
                q.remove(arr[i - k]);
                q.add(arr[i]);
                System.out.print(q.peek() + " ");
            }
            System.out.println();
        }
    }
}
