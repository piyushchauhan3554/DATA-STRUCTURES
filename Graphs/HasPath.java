import java.util.ArrayList;

public class HasPath {
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
        
        

    }

    public static boolean hasPath(ArrayList<Edge>[] graph,int src,int des,boolean[] isVis){
        if(src==des) return true; // base case 
        isVis[src]=true;

        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            if(!isVis[e.dest]&& hasPath(graph,e.dest, des, isVis)){
                return true;
            }
        }
        return false;

    }
    

    public static void main(String[] args) {
        int v=7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[]=new ArrayList[v];
        create(graph);
        System.out.println(hasPath(graph, 0, 5, new boolean[v]));
        System.out.println(hasPath(graph, 0, 10, new boolean[v]));
        
    }
    
}
