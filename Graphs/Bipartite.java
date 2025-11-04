import java.util.*;
public class Bipartite {
    static class Edge{
        int src;
        int dest;

        public Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }

    public static void create(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));

        
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph){
        int col[]=new int[graph.length];

        for(int i=0;i<graph.length;i++){
            col[i]=-1;
        }

        for(int i=0;i<graph.length;i++){

            if(col[i]==-1){
                if(!utilBipartite(graph,col,i)){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean utilBipartite(ArrayList<Edge>[] graph,int[] col,int i ){
        Queue<Integer> q=new LinkedList<>();
        col[i]=0;
        q.add(i);

        while(!q.isEmpty()){
            int curr=q.remove();
            for(int j=0;j<graph[curr].size();j++){
                Edge e=graph[curr].get(j);

                if(col[curr]== col[e.dest] ){
                    return false;
                }
                else if(col[e.dest]==-1){
                    int nextcol=col[curr]==0?1:0;
                    col[e.dest]=nextcol;
                    // col[dest]=1-col[curr];
                    q.add(e.dest);
                }
                
            }


            
        }
        return true;

    }

    public static void main(String[] args) {
        int v=5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph=new ArrayList[v];
        create(graph);
        System.out.print(isBipartite(graph));
        

        
    }
    
}
