package DAA_Assingment.MTech_Test10;


/*
Balanced BST — Implement AVL Tree Insertion

Problem:
You are given an empty AVL tree. You need to insert N integer keys into it, one by one,
maintaining the AVL property after each insertion.

Your task is to implement the insert function that inserts a key into the AVL tree
and rebalances it if required.

After all insertions, print the preorder traversal of the final AVL tree.

Input Format:
The first line contains an integer N, the number of nodes to insert.
The second line contains N space-separated integers representing the keys to insert sequentially.

Constraints:
1 ≤ N ≤ 1000
1 ≤ Key ≤ 10^5
Keys are unique.

Output Format:
Print the preorder traversal of the final balanced AVL tree (space-separated).

Sample Input:
3
30 20 10

Sample Output:
20 10 30
*/

import java.util.*;

class Node {
    int data, height;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.height = 1;
    }
}

public class Balanced_BST_Implement_AVL_Tree_Insertion {
    // Get height
    static int height(Node root) {
        if (root == null) return 0;
        return root.height;
    }

    // Get balance factor
    static int getBalance(Node root) {
        if (root == null) return 0;
        return height(root.left) - height(root.right);
    }

    // Right rotation
    static Node rightRotate(Node y) {
        Node x = y.left;
        Node temp = x.right;

        x.right = y;
        y.left = temp;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left rotation
    static Node leftRotate(Node x) {
        Node y = x.right;
        Node temp = y.left;

        y.left = x;
        x.right = temp;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Insert a new node
    static Node insert(Node root, int key) {
        if (root == null) return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);
        else
            return root;

        root.height = 1 + Math.max(height(root.left), height(root.right));
        int balance = getBalance(root);

        // 4 cases
        if (balance > 1 && key < root.left.data) // Left Left
            return rightRotate(root);
        if (balance < -1 && key > root.right.data) // Right Right
            return leftRotate(root);
        if (balance > 1 && key > root.left.data) { // Left Right
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        if (balance < -1 && key < root.right.data) { // Right Left
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    // Preorder traversal
    static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of node to insert");
        int n = sc.nextInt();

        Node root = null;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter value for node " + i + ": ");
            int x = sc.nextInt();
            root = insert(root, x);
            System.out.println("Node " + i + " inserted successfully!");
        }
        System.out.println("Preorder Traversal of Balanced AVL Tree:");
        preorder(root);
    }
}
