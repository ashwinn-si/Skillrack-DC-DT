import java.util.*;

public class Hello {

  public static void main(String[] args) {
    // Your Code Here
    Scanner sc = new Scanner(System.in);
    int V = sc.nextInt();
    int E = sc.nextInt();
    sc.nextLine();
    @SuppressWarnings("unchecked")
    List<int[]>[] graph = new ArrayList[V];
    for (int index = 0; index < V; index++) {
      graph[index] = new ArrayList<>();
    }

    for (int index = 0; index < E; index++) {
      int u = sc.nextInt() - 1;
      int v = sc.nextInt() - 1;
      int w = sc.nextInt();
      graph[u].add(new int[] { v, w });
      graph[v].add(new int[] { u, w });
    }

    PriorityQueue<Element> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);
    boolean visited[] = new boolean[V];
    int resultSum = 0;

    pq.offer(new Element(0, 0, -1));
    while (!pq.isEmpty()) {
      Element currElement = pq.poll();
      int node = currElement.node;
      int parent = currElement.parent;
      if (visited[node]) {
        continue;
      }
      visited[node] = true;
      resultSum += currElement.weight;
      for (int iter[] : graph[node]) {
        int adjNode = iter[0];
        int weight = iter[1];
        if (adjNode != parent && !visited[adjNode]) {
          pq.offer(new Element(adjNode, weight, node));
        }
      }
    }
    System.out.println(resultSum);
  }
}

class Element {
  int node, weight, parent;

  Element(int node, int weight, int parent) {
    this.node = node;
    this.weight = weight;
    this.parent = parent;
  }
}