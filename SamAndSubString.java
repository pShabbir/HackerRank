import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SamAndSubString {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner obj=new Scanner(System.in);
        String n=obj.next();
        int size=n.length();
        String a[]=new String[size];
        // BigInteger a[]=new BigInteger[size];
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<size;i++)
          a[i]=n.charAt(i)+"";
          // a[i]=new BigInteger(n.charAt(i)+"");

        sub(a,size);
      }

    public static void sub(String[] arr,int size){
      BigInteger sum=new BigInteger("0");
      //BigInteger f=new BigInteger("1000000007");
      for(int i=1;i<=size;i++){
        for(int j=0;j<=size-i;j++){
          String d="";
          int k=j+i-1;
          for(int h=j;h<=k;h++)
            d+=arr[h];
            //System.out.print(arr[h]);
          sum=sum.add(new BigInteger(d);
        }
      }
        System.out.println(sum.mod(new BigInteger("1000000007")));
    }
}
