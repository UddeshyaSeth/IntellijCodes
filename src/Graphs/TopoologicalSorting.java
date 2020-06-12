package Graphs;

import java.util.HashMap;
import java.util.LinkedList;

public class TopoologicalSorting {
        public static void main(String[] args) {
            graph g = new graph();
            g.addEdge(4,0,false);
            g.addEdge(0,1,false);
            g.addEdge(2,1,false);
            g.addEdge(2,3,false);
            g.addEdge(4,2,false);
            g.addEdge(3,4,false);
           g.print();
    }

    static class graph {
        HashMap<Integer, LinkedList<Integer>> map = new HashMap<>();

        graph() { }
        void addEdge(int u, int v, boolean b) {
            if (!map.containsKey(u)) {
                map.put(u, new LinkedList<Integer>());
            }
            if (!map.containsKey(v))
                map.put(v, new LinkedList<Integer>());
            map.get(u).addLast(v);
            if (b)
                map.get(v).addLast(u);
        }
        void print() {
            for (int t : map.keySet()) {
                System.out.print(t + ":");
                for (int k : map.get(t))
                    System.out.print(k + " ");
                System.out.println();
            }
        }
    }

}
