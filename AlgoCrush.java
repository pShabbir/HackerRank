/*You are given a list of size , initialized with zeroes.
You have to perform operations on the list and output the maximum of final values of all the elements in the list.
 For every operation, you are given three integers , and
  you have to add value to all the elements ranging from index to (both inclusive). */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlgoCrush {

    static double[] arr;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner obj=new Scanner(System.in);
          int n=obj.nextInt();
          int q=obj.nextInt();
          arr=new double[n];

          for(int i=0;i<q;i++){
            new AlgoCrush().calculate(obj);
          }
          double m=0,sum=0;
          for(int i=0;i<n;i++){
            sum +=arr[i];
            if(m<sum)
              m=sum;
          }
          System.out.printf("%.0f\n", m);


    }

    void calculate(Scanner obj){
      int a=obj.nextInt();
      a--;
      int b=obj.nextInt();
      b--;
      double k=obj.nextInt();

      arr[a] += k;
      if(!(b>=arr.length-1)){
        arr[b+1] -= k;
      }
      // for(int i=a;i<=b;i++){
      //   arr[i] += k;
      // }
      // for(int i=0;i<arr.length;i++){
      //     System.out.printf("%.0f ",arr[i]);
      // }
      // System.out.println();
    }
}
