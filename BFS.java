import java.util.*;

class BFS{

  HashMap<Integer,HashSet<Integer>> myMap=new HashMap<Integer,HashSet<Integer>>();

  public  void addValue(int v,int e){
    if(myMap.containsKey(v)){
      HashSet<Integer> arr=myMap.get(v);
      arr.add(e);
      myMap.put(v,arr);
    }else{
      HashSet<Integer> arr=new HashSet<>();
      arr.add(e);
      myMap.put(v,arr);
    }
  }
  void BFSfind(int s){
    HashMap<Integer,Integer> level=new HashMap<Integer,Integer>();
    HashMap<Integer,Integer> parent=new HashMap<Integer,Integer>();
    level.put(s,0);
    parent.put(s,null);

    int i=1;
    ArrayList<Integer> frontier=new ArrayList<>();
    frontier.add(s);
      System.out.print(s);
    while(!frontier.isEmpty()){
      ArrayList<Integer> next=new ArrayList<>();
      for (int f : frontier ) {
        HashSet<Integer> arr2=myMap.get(f);
        Iterator<Integer> arr=arr2.iterator();
        while(arr.hasNext()){
            int j=arr.next();
              if(!(level.containsKey(j))){
                level.put(j,i);
                parent.put(j,f);
                next.add(j);
                System.out.print(" "+j);
              }
        }
      }
      frontier=next;
      i++;
    }

    System.out.print("\nLevel :");
    System.out.print(level);

    System.out.print("\nParent :");
    System.out.println(parent);
  }

  public static void main(String[] args) {
    BFS obj=new BFS();
    obj.addValue(0,1);
    obj.addValue(0,2);
    obj.addValue(1,2);
    obj.addValue(2,0);
    obj.addValue(2,3);
    obj.addValue(3,3);

    for (Integer a : obj.myMap.keySet() ) {
        HashSet set=obj.myMap.get(a);
        Iterator<Integer> r=set.iterator();
          System.out.print(a);
        while(r.hasNext()){
          System.out.print("-->"+r.next());
        }
        System.out.println();
    }

    obj.BFSfind(0);
  }
}
