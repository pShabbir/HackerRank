
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;



public class SequenceNumber {
  static HashMap<Integer,Integer> arr=new HashMap<Integer,Integer>();
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=1;i<=n;i++){
          arr.put(i,obj.nextInt());
        }
        for(int i=1;i<=n;i++)
          {
            int key=i;
            for (int j :arr.keySet() ) {
              if(key==arr.get(j))
                {
                  key=j;
                  break;
                }
            }
            for (int j :arr.keySet() ) {
              if(key==arr.get(j))
                  System.out.println(j);
            }

          }
    }
}
