import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class WUS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        int g=s.length();
        //int[] arr=new int[g];
        ArrayList<Integer> arr=new ArrayList<>();
        int sum=0;
        for(int i=0;i<g;i++){
          sum+=(int)s.charAt(i)-96;
          if(i+1<g){
            if(s.charAt(i)!=s.charAt(i+1))
              {
                arr.add(sum);
                sum=0;
              }else{
                  arr.add(sum);
              }
          }else {
              arr.add(sum);
          }

        }
        HashMap<Integer,String> myMap=new HashMap<Integer,String>();
        for (int k :arr ) {
          myMap.put(k,"Yes");
        }

          // for (int k:myMap.keySet()) {
          //     System.out.println(myMap.get(k));
          // }

          for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            // your code goes here
            if(myMap.containsKey(x))
               System.out.println("Yes");
            else {
               System.out.println("No");
            }
        }





    }
}
