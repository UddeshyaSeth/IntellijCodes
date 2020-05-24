package Heap;
import java.io.*;
import java.util.PriorityQueue;
import java.util.Scanner;

public class NearlySortedArray {
    public static void nearly(int[] arr,int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i =0;i<arr.length;i++) {
            if (q.size() > k) {
                System.out.print(q.peek() + " ");
                q.poll();
            }
            q.add(arr[i]);
        }
        while (!q.isEmpty())
            System.out.print(q.poll()+" ");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while (test-- > 0 ) {
            String i[] = br.readLine().trim().split("\\s+");
         /*   int arr[] = new int[n];
            String[] in = br.readLine().trim().split("\\s+");
            for(int i = 0;i<arr.length;i++)
                arr[i] = Integer.parseInt(in[i]);
            nearly(arr,k);
        }


      /*  Scanner st = new Scanner(System.in);
        int test = st.nextInt();
        while (test-- > 0) {
            int n = st.nextInt();
            int k = st.nextInt();
            int[]  arr = new int[n];
            for (int i=0;i<arr.length;i++)
                arr[i] = st.nextInt();
            nearly(arr,k);

       */
        }

     }
}
