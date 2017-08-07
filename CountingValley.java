import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountingValley {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        String s=obj.next();
        int valley=0;
        boolean g=false;
        int count=0;
        for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='U')
            count++;
          else
            count--;

          if(count>=0)
            g=false;

          if(!g && count<0){
            g=true;
            valley++;
          }

        }

        System.out.println(valley);
    }
}
