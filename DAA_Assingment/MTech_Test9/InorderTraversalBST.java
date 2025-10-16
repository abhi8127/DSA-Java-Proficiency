package DAA_Assingment.MTech_Test9;

import java.util.Scanner;

/*
You are given a list of integers representing nodes to be inserted into a Binary Search Tree (BST)
 in the order they appear. Construct the BST and print its Inorder Traversal.

Input Format

The first line contains an integer N, the number of nodes to be inserted.

The next line contains N space-separated integers representing the node values.

Constraints

1 ≤ N ≤ 10^3 1 ≤ Node Value ≤ 10^4

Output Format

Print the Inorder Traversal of the BST as space-separated integers on a single line.

Sample Input 0

7
15 10 20 8 12 17 25
Sample Output 0

8 10 12 15 17 20 25
Sample Input 1

5
50 30 70 20 40
Sample Output 1

20 30 40 50 70
 */


public class InorderTraversalBST {

    static class BinaryTreeNode {
        int data;
        BinaryTreeNode leftChild;
        BinaryTreeNode rightChild;

        BinaryTreeNode(int data) {
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    // Insert method
    static BinaryTreeNode insert(BinaryTreeNode root, int newValue) {
        if (root == null) {
            return new BinaryTreeNode(newValue);
        }

        if (newValue < root.data) {
            root.leftChild = insert(root.leftChild, newValue);
        } else if (newValue > root.data) {
            root.rightChild = insert(root.rightChild, newValue);
        }

        return root;
    }

    // Inorder traversal (Left → Root → Right)
    static void inorder(BinaryTreeNode root) {
        if (root == null) return;

        inorder(root.leftChild);
        System.out.print(root.data + " ");
        inorder(root.rightChild);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();                   // Number of nodes
        int[] arr = new int[n];
        System.out.println("Enter the value in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        BinaryTreeNode root = null;
        for (int val : arr) {
            root = insert(root, val);
        }

        inorder(root);
    }
}
