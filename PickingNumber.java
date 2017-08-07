import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PickingNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        HashSet<Integer> arr=new HashSet<>();

        for (int i=0;i<n ;i++ ) {

            for(int j=0;j<n;j++){
              if(i!=j){
                if(Math.abs(a[i]-a[j])<=1)
                  {
                    arr.add(a[i]);
                    arr.add(a[j]);
                  }
              }
            }
        }
        Object[] o=arr.toArray();
        int []l=new int[o.length];
        for(int i=0;i<o.length;i++)
          {
            l[i]=(int)o[i];
          }

       System.out.println(arr);
      //  r(arr);



    }

    public static void r(int[] remove){

    }
}
