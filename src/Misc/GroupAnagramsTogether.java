package Misc;

import java.util.*;

public class GroupAnagramsTogether {
    public static void hash(String[] arr) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++ ) {
            char c[] = arr[i].toCharArray();
            Arrays.sort(c);
            String temp = new String(c);
            if(map.containsKey(temp))
                map.put(temp,map.get(temp)+1);
            else map.put(temp,1);
        }
        System.out.print(map);
        int a[] = new int[map.size()]; int k = 0;
        for (Map.Entry<String,Integer>i : map.entrySet()) {
            a[k++] = i.getValue();
        }
        Arrays.sort(a);
        for(int i:a)
            System.out.print(i+" ");
    }
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
     String arr[] = new String[5];
     for (int i = 0;i<arr.length;i++)
         arr[i] = st.next();
        //String arr[] ={"act", "cat", "tac" ,"god","dog"};
     hash(arr);
    }
}
