import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int arr[];
    static int migratoryBirds(int n, int[] ar) {
        // Complete this functio

        for(int i:ar){
          switch (i) {
            case 1: arr[i-1]++;
                    break;
            case 2:arr[i-1]++;
                    break;
            case 3:arr[i-1]++;
                    break;
            case 4:arr[i-1]++;
                    break;
            case 5:arr[i-1]++;
                    break;

          }
        }
        int x=arr[0],h=0;
        for (int i=1;i<5;i++ ) {
          if(x<arr[i])
            {
              x=arr[i];
              h=i;
            }
        }
        return h+1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        arr[]=new int[5];
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
