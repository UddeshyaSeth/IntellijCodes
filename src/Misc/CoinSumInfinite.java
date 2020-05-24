package Misc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class CoinSumInfinite {
    public static void check(int[] arr) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++) {
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else map.put(arr[i],1);
        }
        Pairs temp[] = new Pairs[map.size()];
        int k =0;
        for(Map.Entry<Integer,Integer> e : map.entrySet()) {
            int c = e.getKey();
            int d = e.getValue();
            temp[k++] = new Pairs(c,d);
        }
        Arrays.sort(temp, new Comparator<Pairs>() {
            @Override
            public int compare(Pairs o1, Pairs o2) {
                return o1.y - o2.y;
            }
        });
        for(int i = 0;i<temp.length-1;i++) {
            if (temp[i].y == temp[i + 1].y) {
                System.out.println("false");
                return;
            }
        }
            System.out.println("true");
       /* for(int i =0;i<temp.length;i++){
            System.out.print(temp[i].x+" "+ temp[i].y);
            System.out.println();
        }*/
    }

    public static void main(String[] args) {

        int arr[] = {1,2,2,2,1,1,3};
        check(arr);
    }
}

 class Pairs {
    int x,y;
    Pairs(int x,int y) {
        this.x = x;
        this.y = y;
    }
}
