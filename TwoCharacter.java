import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.regex.*;




public class TwoCharacter {

      static  int max=0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        ArrayList<String> distinct=  distictCharacter(s);
        int n=distinct.size();
        for(int i=0;i<n-1;i++){



          for(int j=i+1;j<n;j++){
            char q1=distinct.get(i).charAt(0);
            char  q2=distinct.get(j).charAt(0);

             String g=new String(s);
            for(int k=0;k<n;k++){
              if(!(k==i||k==j)){
                g=g.replace(distinct.get(k),"");
              }
            }
            isUniqueString(g,Math.abs(q1-q2));
            // System.out.println("G :"+g);
          }
          // if(k+1<n){
          //   String g=new String(s);
          //   for (int j=k+1;j<n ;j++ ) {
          //   //  g+=distinct.get(j);
          //       g=g.replace(distinct.get(j),"");
          //   }
          //   System.out.println("G :"+g);
          // }

        }
                    System.out.println(max);
    }

    public static void isUniqueString(String s,int diff){

        // System.out.println(diff);
      for(int i=0;i<s.length()-1;i++)
      {
        if(Math.abs(s.charAt(i)-s.charAt(i+1))==diff){

        }else{
          return;
        }
      }
      if(max<s.length())
          max=s.length();

    }

    public static ArrayList<String> distictCharacter(String s){
      ArrayList<String> arr=new ArrayList<>();
      HashMap<String,Integer> myMap=new HashMap<String,Integer>();
      for(int i=0;i<s.length();i++){
        String key=s.charAt(i)+"";
        if(myMap.containsKey(key))
            {
              int k=myMap.get(key);
              myMap.put(key,k++);
            }else {
                  myMap.put(key,1);
                  arr.add(key);
            }
      }

      // for (String k:myMap.keySet()) {
      //     System.out.println(k+" : "+myMap.get(k));
      // }
      // System.out.println(arr);
      return arr;
    }
}
