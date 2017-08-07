import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.regex.*;

public class HowManySubString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        String s = in.next();
        for(int a0 = 0; a0 < q; a0++){
            int left = in.nextInt();
            int right = in.nextInt();
            // your code goes here
            String g=s.substring(left,right+1);

            System.out.println(getAllUniqueSubset(g));
        }

    }

      public static int getAllUniqueSubset(String str) {
          // HashMap<String,Integer> myMap=new HashMap<String,Integer>();
          HashSet<String> myMap=new HashSet<>();
          for (int i = 0; i < str.length(); i++) {
              for (int j = 0; j < str.length() - i; j++) {
                  String elem = str.substring(j, j + (i+1));
                  // if (!set.contains(elem)) {
                  //     set.add(elem);
                  // }
                  // if(!myMap.containsKey(elem))
                  //     {
                  //       myMap.put(elem,1);
                  //
                  //     }
                  myMap.add(elem);
              }
          }
          return myMap.size();
      }
}
