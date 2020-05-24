package Misc;

import java.awt.desktop.SystemEventListener;
import java.util.*;
public class Solution {
    private static Object Character;

    public static void main(String[] args) {
        String s = "raaeaedere";
        HashMap<Character,Integer> n = new HashMap<>();
        for(int i = 0;i<s.length();i++) {
            if (n.containsKey(s.charAt(i)))
                n.put(s.charAt(i), n.get(s.charAt(i)) + 1);
            else n.put(s.charAt(i), 1);
        }
        
        ArrayList<Integer> p = new ArrayList<>();

        Map<Character,Integer> map = sorted(n);
        StringBuilder st = new StringBuilder();
        for(Map.Entry<Character,Integer> e : map.entrySet()){
            char k = e.getKey();
            int m = e.getValue();
          while(m-- != 0){
              st.append(k);
          }
        }
        System.out.print(st.reverse());
        System.out.println();
        System.out.print(map);

    }
    private static Map<Character,Integer> sorted( HashMap<Character,Integer> n){
        List<Map.Entry<Character, Integer>> list =
                new LinkedList<Map.Entry<Character, Integer>>(n.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> o1,
                               Map.Entry<Character, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        

        Map<Character, Integer> sortedMap = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}
