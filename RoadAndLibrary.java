import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RoadAndLibrary {

    static HashMap<Integer,HashSet<Integer>> myMap;
    static HashMap<Integer,Boolean> vertex;
  public  static HashMap<Integer,HashSet<Integer>> addValue(HashMap<Integer,HashSet<Integer>> myMap,int v,int e){
    if(myMap.containsKey(v)){
      HashSet<Integer> arr=myMap.get(v);
      arr.add(e);
      myMap.put(v,arr);

    }else{
      HashSet<Integer> arr=new HashSet<>();
      arr.add(e);
      myMap.put(v,arr);

    }
    return myMap;
  }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
             myMap=new HashMap<Integer,HashSet<Integer>>();
             vertex=new HashMap<Integer,Boolean>();
            // HashSet<Integer> arr=new HashSet<Integer>();
            int n = in.nextInt();
            int m = in.nextInt();
            long x = in.nextLong();
            long y = in.nextLong();
            for(int a1 = 0; a1 < m; a1++){
                int city_1 = in.nextInt();
                int city_2 = in.nextInt();
                myMap=addValue(myMap,city_1,city_2);
                myMap=addValue(myMap,city_2,city_1);
                if(!vertex.containsKey(city_1))
                    vertex.put(city_1,false);
                if(!vertex.containsKey(city_2))
                    vertex.put(city_2,false);

            }
            for (int i : myMap.keySet() ) {
                  HashSet<Integer> r=myMap.get(i);
                  Iterator<Integer> t=r.iterator();
                  System.out.print(i +": ");
                  while(t.hasNext()){
                    System.out.print("-->"+t.next());
                  }
                  System.out.println();
            }

            for (int i : vertex.keySet()) {
                if(!vertex.get(i)){
                  //vertex.put(i,true);
                  DFS(myMap,vertex,i)
                }
            }

        }
    }

    public static DFS(HashMap<Integer,HashSet<Integer>> myMap,HashMap<Integer,Boolean> vertex,int key){
      ArrayList<Integer> arr=new ArrayList<>();
      arr.add(key);
      while(!arr.isEmpty()){
        arr=new ArrayList<>()
      }




    }
}
