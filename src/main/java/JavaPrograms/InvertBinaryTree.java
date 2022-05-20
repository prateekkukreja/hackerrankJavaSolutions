//package main.java.JavaPrograms;
//
//import javax.swing.tree.TreeNode;
//
//public class InvertBinaryTree {
//
//    class Node {
//
//        int data;
//        Node left, right;
//
//        public Node(int item) {
//            item = data;
//            left = right = null;
//        }
//    }
//
//    public Node invertTree(Node root) {
//
//        if (root == null) {
//            return root;
//        }
//
//        Node leftSubTree = invertTree(root.left);
//        Node rightSubTree = invertTree(root.right);
//
//        root.left = rightSubTree;
//        root.right = leftSubTree;
//
//        return root;
//    }
//
//
//    public static void main(String[] args) {
//
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(4);
//        Node root = new Node(1);
//        Node root = new Node(1);
//
//        invertTree tree = new invertTree();
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);
//    }
//}
