package Heap;

import java.util.*;

public class TopKFrequentElements {
    public static void frequent(int[] arr,int k) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int i = 0;i<arr.length;i++)
            if(ans.containsKey(arr[i]))
                ans.put(arr[i],ans.get(arr[i])+1);
            else ans.put(arr[i],1);

        PriorityQueue<G> q = new PriorityQueue<G>(new Comparator<G>() {
            @Override
            public int compare(G o1, G o2) {
                return o1.x-o2.x;
            }
        });
        for (Map.Entry<Integer,Integer> i : ans.entrySet()) {
           // System.out.println(q.size());
            q.add(new G(i.getValue(),i.getKey()));
            if(q.size() > 2)
                q.poll();

        }

        while(!q.isEmpty()) {
            G temp = q.poll();
            System.out.println(temp.x+" "+temp.y);
        }

    }
    public static void main(String[] args) {
        int arr[] = {3,0,1,0};
        int k = 1;
        frequent(arr,k);
    }
}
class G {
    int x,y;

    public G(int x, int y) {
        this.x = x;
        this.y = y;
    }
}