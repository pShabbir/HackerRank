import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FibModified {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner obj=new Scanner(System.in);
        BigInteger a=new BigInteger(obj.next());
        BigInteger b=new BigInteger(obj.next());
        int n=obj.nextInt();
        if(n==1)
            System.out.println(a);
        else if(n==2)
            System.out.println(a);
        else{
            BigInteger c=new BigInteger(String.valueOf(0));
            for(int i=3;i<=n;i++){
                BigInteger k=b.multiply(b);
                k=a.add(k);
                c=k;
                a=b;
                b=c;
                //System.out.println(c);
            }
            System.out.println(c);
        }
    }
}
