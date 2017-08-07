import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GemStone {

    static HashSet<String> getSet(String s){
      HashSet<String> a=new HashSet<>();
      for(int i=0;i<s.length();i++){
        a.add(s.charAt(i)+"");
      }
      return a;
    }
    static int gemstones(String[] arr){
        // Complete this function
        HashSet<String> arr2=getSet(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
          arr2.retainAll(getSet(arr[i]));
        }

      //  System.out.println(arr2);
        return arr2.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
    }
}
