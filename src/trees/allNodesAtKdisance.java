package trees;
import java.util.*;

public class allNodesAtKdisance {
    static Node root;
    static Node temp = root;

    static void insert(Node temp, int key) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();
            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else
                q.add(temp.left);
            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else
                q.add(temp.right);
        }
    }

   /* public static void inorder(Node root) {
        if(root==null) return;
        System.out.print(root.key+" ");
        inorder(root.left);

        inorder(root.right);
    }*/
   public static void solve(Node root,Node target,int k) {
       ArrayList<Node> ans = new ArrayList<>();
       HashMap<Node,Node> map = new HashMap<>();
       mapping(map,root);
     /* for (Map.Entry<Node,Node> o : map.entrySet()){
          Node key = o.getKey();
          Node val = o.getValue();
          System.out.println(key.key + " "+val.key);
      }*/

      Node curr = null;
      search(root,target,curr,ans,map,k);
       System.out.print(curr.key);
     //  for(int i = 0;i<ans.size();i++)
       //    System.out.print(ans.get(i).key+" ");

   }

   public static void search(Node root,Node target,Node curr, ArrayList<Node> ans, HashMap<Node,Node> map,int k) {
       if(root == null) return;

       if(root.key == target.key) {
            curr = root;
            test(curr,root,ans,map,k);
          return;
       }
       search(root.left,target,curr,ans,map,k);
       search(root.right,target,curr,ans,map,k);

   }

    public static void test(Node curr,Node root, ArrayList<Node> ans, HashMap<Node,Node> map,int k) {
       HashSet<Node> set = new HashSet<>();
       Queue<Node> q = new LinkedList<>();
       q.add(curr);
       int c = 0;
       while (!q.isEmpty()) {

           }
       }

   public static void mapping(HashMap<Node,Node> map,Node root) {
       if(root == null) return;
    if(root.left != null)
      map.put(root.left,root);
    if(root.right != null)
      map.put(root.right,root);
       mapping(map,root.left);
       mapping(map,root.right);
   }

    public static void main(String args[]) {
        root = new Node(8);
        root.left = new Node(7);
        root.left.left = new Node(5);
        root.right = new Node(10);
        root.right.left = new Node(9);
        root.right.right = new Node(11);
        root.left.left.left =new Node(4);
        root.left.left.right = new Node(6);
        Node target = root.left;
        solve(root,target,2);
    }

    static class Node {
        int key;
        Node left, right;
        Node(int key) {
            this.key = key;
            left = null;
            right = null;
        }
    }
}
