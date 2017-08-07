import java.io.*;
import java.math.*;
import java.math.BigInteger;
import java.text.*;
import java.util.*;
import java.util.regex.*;
public class BigIntegerFact{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger b=new BigInteger("1");
        for(int i=2;i<=n;i++ )
          b = b.multiply(BigInteger.valueOf(i));
        System.out.println(b);
    }
}
