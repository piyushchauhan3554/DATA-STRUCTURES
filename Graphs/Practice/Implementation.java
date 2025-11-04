// package Practice;

import java.util.*;

public class Implementation {
  static class Pair {
    int src;
    int dest;

    public Pair(int s, int d) {
      this.src = s;
      this.dest = d;
    }
  }

  public static void createGraph(ArrayList<ArrayList<Pair>> graph) {
    graph.get(0).add(new Pair(0, 1));
    graph.get(0).add(new Pair(0, 2));
    graph.get(1).add(new Pair(1, 0));
    graph.get(1).add(new Pair(1, 2));
    graph.get(2).add(new Pair(2, 0));
    graph.get(2).add(new Pair(2, 1));
    graph.get(2).add(new Pair(2, 3));
    graph.get(3).add(new Pair(3, 2));
  }

  public static void main(String[] args) {
    int v = 4;
    // @SuppressWarnings("unchecked")
    ArrayList<ArrayList<Pair>> graph = new ArrayList<>();

    for (int i = 0; i < v; i++) { // v:-4 0,1 ,2,3
      graph.add(new ArrayList<Pair>());
    }

    createGraph(graph);

    for (int i = 0; i < graph.size(); i++) {
      for (int j = 0; j < graph.get(i).size(); j++) {
        Pair p = graph.get(i).get(j);
        System.out.println("src is :" + p.src + "  " + "dest is :" + p.dest);
      }
      System.out.println();
    }
  }
}
