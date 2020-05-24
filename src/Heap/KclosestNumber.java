package Heap;

import java.util.*;

public class KclosestNumber {
    public static void close(int[] arr,int k, int x,ArrayList<Integer> ans)  {
        PriorityQueue<l> q = new PriorityQueue<l>(new Comparator<l>() {
            @Override
            public int compare(l o1, l o2) {
                if(o1.x == o2.x)
                    return o1.y - o2.y;
                return o1.x - o2.x;
            }
        });
        for(int i = 0;i<arr.length;i++) {
            q.add(new l(Math.abs(arr[i]-x),arr[i]));
        }
        while (!q.isEmpty()) {
            l p = q.poll();
            System.out.println(p.x+" "+p.y);
        }

    }
    public static void main(String[] args) {
        int arr[] = {0,0,1,2,3,3,4,7,7,8};
        int k = 3;
        int x = 5;
        ArrayList<Integer> ans = new ArrayList<>();
        close(arr,k,x,ans);
    }
}

class l {
    int x;int y;

    public l(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
