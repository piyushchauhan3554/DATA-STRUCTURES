import java.util.*;
class Implementation{
    static class Edges{
        int source;
        int destination;
        int weight;

        public Edges(int s,int d,int w){{
            source=s;
            destination=d;
            weight=w;
        }

        }
    }
    public static void main(String[] args) {
        int v=5;

        // array of arraylist and arraylist is type of edge
        @SuppressWarnings("unchecked")
        ArrayList<Edges> graph[]=new ArrayList[v];

        // in starting there is no arraylist in array , so we create them


        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>(); // empty array list 
        }

        // 0 - vertex 

        graph[0].add(new Edges(0, 1, 5));

        // 1 - vertex 

        graph[1].add(new Edges(1, 0, 5));
        graph[1].add(new Edges(1, 2, 1));
        graph[1].add(new Edges(1, 3, 3));

        // 2 - vertex 

        graph[2].add(new Edges(2, 1, 1));
        graph[2].add(new Edges(2, 3, 1));
        graph[2].add(new Edges(2, 4, 2));

        // 3 -  vertex 

        graph[3].add(new Edges(3, 1, 3));
        graph[3].add(new Edges(3, 2, 1));

        // 4 - vertex 

        graph[4].add(new Edges(4,2, 2));

        // how to find neighbors of a particular vertex 



        // for(int i=0;i<graph[2].size();i++){
        //     Edges e= graph[2].get(i);
        //     System.out.println(e.destination);

        //  }


        // neighbors of all the vertices 
        
        for(int i=0;i<graph.length;i++){
            System.out.print("neighbors of "+i+" are :- ");
            for(int j=0;j<graph[i].size();j++){
                Edges e= graph[i].get(j);
                System.out.print(e.destination+" ");
            }
            System.out.println();           
        }

        
    }
}