import java.util.*;

public class RevisedDfs {
    static class Edge{
        int src;
        int dest;
        int wt;
    
        public Edge(int s,int d,int w){
            src=s;
            dest=d;
            wt=w;
        }
    }
    public static void create(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 0));
        graph[2].add(new Edge(2, 4, 0));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 4, 0));
        graph[3].add(new Edge(3, 5, 0));

        graph[4].add(new Edge(4, 2, 0));
        graph[4].add(new Edge(4, 3, 0));
        graph[4].add(new Edge(4, 5, 0));

        graph[5].add(new Edge(5, 3, 0));
        graph[5].add(new Edge(5, 4, 0));
        graph[5].add(new Edge(5, 6, 0));

        graph[6].add(new Edge(6, 5, 0));

        graph[7].add(new Edge(7, 8, 0));
        graph[8].add(new Edge(8, 9, 0));
        graph[9].add(new Edge(9, 7, 0));
        
        

    }

    public static void dfs(ArrayList<Edge>[] graph){
        boolean isvisited[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){

            if(!isvisited[i]){
                dfsUtil(graph, i, isvisited);
            }
        }

    }

    public static void dfsUtil(ArrayList<Edge>[] graph,int curr,boolean[] isVisited){
        System.out.print(curr+" ");
        isVisited[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!isVisited[e.dest]){
                dfsUtil(graph,e.dest, isVisited);
            }
        }

    }
    public static void main(String[] args) {
        int v=10;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph=new ArrayList[v];

        create(graph);
        dfs(graph);
        
        
    }
    
}
