package Heap;

import java.util.*;

public class TopKfrequentWords {
    public static void frequent( String[] words,int k,ArrayList<String> ans) {
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0;i<words.length;i++)
            if(map.containsKey(words[i]))
                map.put(words[i],map.get(words[i])+1);
            else map.put(words[i],1);
        PriorityQueue<h>q = new PriorityQueue<>(new Comparator<h>() {
            @Override
            public int compare(h o1, h o2) {
                if(o1.x == o2.x)
                    return o1.s.compareTo(o2.s);
                return o1.x - o2.x;
            }
        });
       for (Map.Entry<String,Integer> i : map.entrySet()) {
           q.add(new h(i.getValue(),i.getKey()));
           if(q.size() > k)
               q.poll();
       }
       while(!q.isEmpty()) {
           h temp = q.poll();
           ans.add(temp.s);
           System.out.println(temp.s + " "+ temp.x);
       }

    }
    public static void main(String[] args) {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        ArrayList<String> ans = new ArrayList<>();
        frequent(words,k,ans);
    }
}
class h {
    String s; int x;
    public h(int x,String s) {
        this.s = s;
        this.x = x;
    }
}
