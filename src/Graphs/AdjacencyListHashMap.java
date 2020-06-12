package Graphs;

import java.util.*;

public class AdjacencyListHashMap {

    static class graph {
        HashMap<Integer, LinkedList<Integer>> map = new HashMap<>();
        int parent[];

        graph() {}

        public static void main(String[] args) {
            graph g = new graph();
         /*   g.addEdge(0, 1, false);
            g.addEdge(0, 2, false);
            g.addEdge(2, 4, false);
            g.addEdge(2, 3, false);*/
//g.print();
         //   g.bfs(0);

        int arr[][] = {{},{}};
        System.out.println(arr.length);
        }

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

        void bfs(int source) {
            parent = new int[map.size()];
            Arrays.fill(parent,-1);
            Queue<Integer> q = new LinkedList<>();
            boolean visited[] = new boolean[map.size()];
            q.add(source);
            while (!q.isEmpty()) {
                int s = q.poll();
                visited[s] = true;
                System.out.print(s+" ");
                for(int l :map.get(s)){
                    if(!visited[l]) {
                        q.add(l);
                        parent[l] = s;
                    }
                    }
            }
            System.out.print("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            for(int i = 0;i<parent.length;i++)
                System.out.print(parent[i]+" ");
        }
    }
}