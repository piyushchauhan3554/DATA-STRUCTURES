import java.util.PriorityQueue;

public class WeakestSoldier {
   public static  class Rows implements Comparable<Rows>{
    int soldiers;
    int idx;

    public Rows(int soldiers,int idx){
        this.soldiers=soldiers;
        this.idx=idx;

    }

    @Override
    public int compareTo(Rows R){
        if(this.soldiers==R.soldiers){
           return this.idx-R.idx;
        }
        return this.soldiers-R.soldiers;

    }

    }
    public static void main(String[] args) {
        int army[][]={{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int k=2;
        PriorityQueue<Rows> pq=new PriorityQueue<>();
        for(int i=0;i<army.length;i++){
            int countSoldiers=0;
            for(int j=0;j<army[0].length;j++){
                if(army[i][j]==1) countSoldiers+=1;
                else countSoldiers+=0;

            }
            pq.add(new Rows(countSoldiers, i));
        }
        for(int i=1;i<=k;i++){
            System.out.println("R"+ pq.remove().idx);
        }        
    }
    
}
