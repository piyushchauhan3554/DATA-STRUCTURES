// using rank and using size
class DisSetU{
  int[] rank;
  int[] parent;
  int[] size;

  public DisSetU(int n){
    rank=new int[n+1];
    size=new int[n+1];
    parent=new int[n+1];
    for(int i=0;i<n+1;i++){
      parent[i]=i;
      size[i]=1;
    }
  }

  // find parent using path compression

  public int findParent(int node){
    if(node==parent[node]){
      return node;
    }
    return parent[node]=findParent(parent[node]);
  }

  public void findUnionBysize(int u,int v){
    int ulp_u=findParent(u);
    int ulp_v=findParent(v);

    if(ulp_u==ulp_v) return;// same parent mtlb kisi ko kisi se nhi jodna
    if(size[ulp_u]<size[ulp_v]){
      parent[ulp_u]=ulp_v;
      size[ulp_v]+=size[ulp_u];
    }else{
      parent[ulp_v]=ulp_u;
      size[ulp_u]+=size[ulp_v];
    }
  }

  public void findUnionByRank(int u,int v){
    // find ultimate parent

    int ulp_u=findParent(u);
    int ulp_v=findParent(v);

    if(ulp_u==ulp_v) return;
    if(rank[ulp_u]<rank[ulp_v]){
      // attached smaller to the larger one

      parent[ulp_u]=ulp_v;
    }else if(rank[ulp_u]>rank[ulp_v]){
      parent[ulp_v]=ulp_u;
    }
    else{
      parent[ulp_v]=ulp_u;
      rank[ulp_u]++;
    }
  }
}

public class Main {
  public static void main(String[] args) {
    DisSetU d=new DisSetU(7);
    d.findUnionBysize(1, 2);
    d.findUnionBysize(2, 3);
    d.findUnionBysize(4, 5);
    d.findUnionBysize(6, 7);
    d.findUnionBysize(5, 6);
    if(d.findParent(3)==d.findParent(7)){
        System.out.println("same");
    }else{
      System.out.println("not same");
    }
    d.findUnionBysize(3, 7);
    if(d.findParent(3)==d.findParent(7)){
        System.out.println("same");
    }else{
      System.out.println("not same");
    }

  }
}
