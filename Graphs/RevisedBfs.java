import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RevisedBfs {

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

    public static void bfs(ArrayList<Edge> graph[]){
        boolean isVisited[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!isVisited[i]){
                bfsUtil(graph,isVisited,i);
            }
        }


    }

    public static void bfsUtil(ArrayList<Edge> graph[],boolean[] isVisited,int start){
        Queue<Integer> q=new LinkedList<>();
        

        q.add(start);
        while(!q.isEmpty()){
            int curr=q.remove();

            if(!isVisited[curr]==true){
                System.out.print(curr+" ");
                isVisited[curr]=true;
                // add neighbors

                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }

    }
    public static void main(String[] args) {
        int v=10;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[]=new ArrayList[v];
        create(graph);
        bfs(graph);

        
    }
    
}
