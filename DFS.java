import java.util.*;
class DFS{
    int v;
  //  LinkedList<Integer> adj[];
     HashSet<Integer> adj[];
     static HashMap<Integer,Boolean> a;
     static long x,y;
     static long count;

    DFS(int n){
      v=n;
      adj=new HashSet[v];
      for (int i=0;i<n ;i++ ) {
        adj[i]=new HashSet();
      }
    }

    void addEdge(int key,int value){
      adj[key].add(value);
    }

    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int q = in.nextInt();
      for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
             x = in.nextLong();
             y = in.nextLong();
            a=new HashMap<Integer,Boolean>();
            for(int i=0;i<n;i++){
              a.put(i,false);
            }
            DFS myGraph=new DFS(n);
            for(int a1 = 0; a1 < m; a1++){
                int city_1 = in.nextInt();
                int city_2 = in.nextInt();
                city_2--;
                city_1--;
                myGraph.addEdge(city_1,city_2);
                myGraph.addEdge(city_2,city_1);
            }
          //myGraph.startDFS(0);
          if(x>y){
            for (int k :a.keySet() ) {
                if(!a.get(k)){
                  count+=x;
                  count-=y;
                  myGraph.startDFS(k);
                }
            }
          }else{
            count=x*n;
          }
          System.out.println(count);
        }


      // int n=obj.nextInt();
      // DFS myGraph=new DFS(n);
      // for(int i=0;i<n;i++){
      //   int c1=obj.nextInt();
      //   int c2=obj.nextInt();
      //   myGraph.addEdge(c1,c2);
      //   myGraph.addEdge(c2,c1);
      // }
      // myGraph.startDFS(2);

    }

    void DFSUtil(int s,boolean[] visited){
      visited[s]=true;
      a.put(s,true);
      count+=y;
      //System.out.print(" "+s);
      Iterator<Integer> i=adj[s].iterator();
      while(i.hasNext()){
        int n=i.next();
        if(!visited[n])
          DFSUtil(n,visited);
      }
    }

    public void startDFS(int x){
      boolean[] visited=new boolean[v];

      DFSUtil(x,visited);
    }
}
