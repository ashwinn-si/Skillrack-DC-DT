
/*
Problem:
Given a binary tree, find its height (the number of edges in the longest path from root to a leaf).
Input Format:
- First line: integer N (number of nodes)
- Second line: N integers (level order, use -1 for NULL)
Constraints:
- 1 ≤ N ≤ 10^5
Output Format:
- Print height of the tree
Test Cases:
Input:
7
1 2 3 4 5 -1 -1
Output:
2

Input:
3
1 2 -1
Output:
1
 */

import java.util.*;

class Node {
  int value;
  Node left;
  Node right;

  Node(int value) {
    this.value = value;
  }
}

class Main {
  static int getHeight(Node node) {
    if (node == null) {
      return 0;
    }
    int left = getHeight(node.left) + 1;
    int right = getHeight(node.right) + 1;
    return Math.max(left, right);
  }

  public static void main(String[] args) {
    // Your Code Here
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Queue<Node> queue = new LinkedList<>();
    Node root = new Node(sc.nextInt());
    queue.offer(root);
    int i = 1;

    while (!queue.isEmpty() && i < N) {
      Node parent = queue.poll();

      // Left child
      if (i < N) {
        int val = sc.nextInt();
        if (val != -1) {
          parent.left = new Node(val);
          queue.offer(parent.left);
        }
        i++;
      }

      // Right child
      if (i < N) {
        int val = sc.nextInt();
        if (val != -1) {
          parent.right = new Node(val);
          queue.offer(parent.right);
        }
        i++;
      }
    }

    System.out.println(getHeight(root));
    sc.close();
  }
}
