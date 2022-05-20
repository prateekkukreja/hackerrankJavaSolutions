package main.java.JavaPrograms;

import java.util.*;


public class FindCousinsBinaryTree {

    static class Node {
        int data;
        Node left, right;
    }

    static Node node(int item) {
        Node temp = new Node();
        temp.data = item;
        temp.left = null;
        temp.right = null;
        return temp;
    }

    public static void main(String[] args) {

        Node root = node(1);
        root.left = node(2);
        root.right = node(3);
        root.left.left = node(4);
        root.left.right = node(5);
        root.right.left = node(6);
        root.right.right = node(7);

        findCousin(root, root.left.left);
    }

    public static void findCousin(Node root, Node node) {

        int currLevel = findLevel(root, node, 1);
        getSiblingNodes(root, node, currLevel);
    }

    static int findLevel(Node root, Node node, int firstLevel) {

        if (root == null)
            return 0;
        if (root == node)
            return firstLevel;

        int nextLevel = findLevel(root.left, node, firstLevel + 1);

        //leftnode   //2
        if (nextLevel != 0)
            return nextLevel;

        //rightnode
        nextLevel = findLevel(root.right, node, firstLevel + 1);
        return nextLevel;
    }

    static void getSiblingNodes(Node root, Node node, int currLevel) {
        if (root == null || currLevel < 2)
            return;

        if (currLevel == 2) {//  cl => 2
            if (root.left == node || root.right == node)
                return;
            if (root.left != null)
                System.out.println(root.left.data + " ");
            if (root.right != null)
                System.out.println(root.right.data + " ");
        } else if (currLevel > 2) {  //5
            getSiblingNodes(root.left, node, currLevel - 1);
            getSiblingNodes(root.right, node, currLevel - 1);
        }
    }

}