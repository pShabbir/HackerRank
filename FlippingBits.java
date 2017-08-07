import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FlippingBits {

  public static void main(String[] args) {
      /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();
      for(int i=0;i<n;i++){
        int[] a=new int[32];
        String s=Integer.toBinaryString(obj.nextInt());
        for(int j=0;j<s.length();j++){
          a[j]=Integer.parseInt(s.charAt(j));
        }
        for(int j=s.length();j<32;j++)
          a[j]=0;

        for(int j=s.length()-1;j>=0;j--)
          {
            if(a[j]==0)
              
          }
      }
  }
}
