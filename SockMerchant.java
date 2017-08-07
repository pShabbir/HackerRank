import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        // Complete this function
        HashMap<Integer,Integer> arr=new HashMap<>();
        for (int a : ar) {
          if(arr.containsKey(a)){
            int h=arr.get(a);
            h++;
            arr.put(a,h);
          }else{
            arr.put(a,1);
          }
        }

        int count=0;
        for (int i : arr.keySet() ) {
          count += arr.get(i)/2;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
