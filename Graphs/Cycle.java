import java.util.ArrayList;

public class Cycle {
    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            src=s;
            dest=d;

        }

    }
    public static void create( ArrayList<Edge>[] graph){

        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));


    }
    // for all connected components 
    public static boolean detectCycle( ArrayList<Edge>[] graph){
        boolean isVisited[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!isVisited[i]){
                if(utildetectCycle(graph,isVisited,i,-1)){
                    return true;
                }
            }
        }
        return false;

    }
    public static boolean utildetectCycle( ArrayList<Edge>[] graph,boolean[] isVisited,int curr,int par){

        isVisited[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            // case 1: neighbour not visited 
            if(!isVisited[e.dest]){
                if(utildetectCycle(graph, isVisited,e.dest,curr)){
                    return true;
                }
            }
            // case 2:- neighbour visited and not parent 
            else if(isVisited[e.dest] && e.dest!=par){
                return true;
            }
            // case 3:- neighbour visited and parent
            // do nothing
            else{
                continue;
            }


        }
        return false;
    }
    public static void main(String[] args) {
        int v=5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph=new ArrayList[v];
        create(graph);
        boolean isCycle=detectCycle(graph);
        System.out.println(isCycle);

        
        
    }
    
}
