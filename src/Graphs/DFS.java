package Graphs;

import java.util.*;

public class DFS {
        public static void main(String[] args) {
            graph g = new graph();
            g.addEdge(0,1);
            g.addEdge(0,2);
            g.addEdge(2,0);
            g.addEdge(1,3);


            g.print();
            int visited[] = new int[g.map.size()];
            Arrays.fill(visited, -1);
            Stack<Integer> st = new Stack<>();
            g.DFS(visited, 0, st);
            //System.out.print(st);
            //for (int i = 0; i < visited.length; i++)
              //  System.out.print(visited[i] + " ");

        }

    static class graph {
        HashMap<Integer, LinkedList<Integer>> map = new HashMap<>();

        graph() {
        }

        void addEdge(int u, int v) {
            if (!map.containsKey(u))
                map.put(u, new LinkedList<Integer>());
            if (!map.containsKey(v))
                map.put(v, new LinkedList<Integer>());
            map.get(u).addLast(v);
        }

        void print() {
            for (int k : map.keySet()) {
                System.out.print(k + ":");
                for (int j : map.get(k))
                    System.out.print(j + " ");
                System.out.println();
            }
        }

        // the DFS is also checking if the graph has any cycles in it or not
        void DFS(int visited[], int source, Stack<Integer> st) {
            if (map.get(source).size() == 0) {
                int n = st.pop();
                visited[n] = 1;
                System.out.print(n);
            }
            if (visited[source] == 0) {
                System.out.print("Cycle");
                return;
            }
            st.push(source);
            visited[source] = 0;
           // System.out.print(source + "#
           System.out.println(map.get(source).size());
            if(visited[map.get(source).getFirst()] == -1)
                DFS(visited,map.get(source).getFirst(),st);
            return;
        }
    }
    }

