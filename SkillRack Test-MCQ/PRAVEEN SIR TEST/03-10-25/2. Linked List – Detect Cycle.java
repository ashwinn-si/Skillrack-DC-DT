/*
Problem:
Given the head of a linked list, determine if the linked list has a cycle.
Input Format (for exam assume adjacency list style):
- First line: integer N (number of nodes)
- Second line: N integers (node values)
- Third line: integer pos (index of node where last node connects, –1 if no cycle)
Constraints:
- 1 ≤ N ≤ 10^5
- –10^4 ≤ node values ≤ 10^4
Output Format:
- Print "YES" if a cycle exists, otherwise "NO".
Test Cases:
Input:
3
1 2 3
1
Output:
YES

Input:
4
1 2 3 4
-1
Output:
NO
 */

import java.util.*;

class Node {
  int value;
  Node next;

  Node(int value) {
    this.value = value;
  }
}

class Main {
  static boolean isCyclic(Node head) {
    if (head == null || head.next == null || head.next.next == null) {
      return false;
    }

    Node slow = head;
    Node fast = head.next.next;
    while (fast != null && fast.next != null && slow.next != null) {
      if (slow == fast) {
        return true;
      }
      slow = slow.next;
      fast = fast.next.next;
    }

    return false;
  }

  public static void main(String[] args) {
    // Your Code Here
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Node head = new Node(-1);
    Node tail = head;
    for (int index = 0; index < N; index++) {
      tail.next = new Node(sc.nextInt());
      tail = tail.next;
    }
    int linkIndex = sc.nextInt();
    boolean result = false;
    if (linkIndex == -1) {
      result = isCyclic(head.next);
    } else {
      Node currNode = head.next;
      for (int index = 0; index < linkIndex; index++) {
        currNode = currNode.next;
      }
      tail.next = currNode;
      result = isCyclic(head.next);
    }
    if (result) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
    sc.close();
  }
}
