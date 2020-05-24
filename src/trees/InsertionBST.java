package trees;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

// Insertion and deletion in trees
public class InsertionBST {
    public static void main(String[] args) {
        InsertionBST r = new InsertionBST();
            node root = null;
            root = r.insert(root,8);
            root = r.insert(root,4);
            root = r.insert(root,9);
            root = r.insert(root,1);
            root = r.insert(root,16);
            root = r.insert(root,5);
            root = r.insert(root,7);
            r.deletion(root,4);
            r.preorder(root);

        }

        public node insert(node root, int data) {
            if(root == null) {
                node temp = new node(data);
                return temp;
            }
            else if(root.val > data)
                root.left = insert(root.left,data);
            else if(root.val < data)
                root.right = insert(root.right,data);
            return root;
        }
        public void preorder(node root) {
            if(root == null) return;
            System.out.print(root.val +" ");
            preorder(root.left);
            preorder(root.right);
        }
    public void inorder(node root) {
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val +" ");
        inorder(root.right);
    }
    public node deletion(node root,int data) {

            if(root == null) return null;

            else if(root.val > data)
                root.left = deletion(root.left,data);

            else if(root.val < data)
                root.right = deletion(root.right,data);

            else {
                if (root.right == null && root.left == null) {
                    root = null;
                    return root;
                }
                if (root.left == null) {
                    root = root.right;
                    return root;
                }
                if (root.right == null) {
                    root = root.left;
                    return root;
                }

                if (root.left != null && root.right != null) {
                    node curr = min(root.right);
                    root.val = curr.val;
                    //return root;
                    root.right = deletion(root.right,curr.val);
                }
            }
            return  root;
    }

    public node min(node root) {
        if (root.left == null) {
            return root;
        } else return min(root.left);
    }

    static class node {
        int val;
        node left, right;
        public node(int val) {
            this.val = val;
            left =right= null;
        }
    }
}
