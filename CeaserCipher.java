import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CeaserCipher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        k=k%26;
        String g="";
        char[] arr=new char[s.length()];
        for(int i=0;i<s.length();i++){
          int m=s.charAt(i);
              //System.out.println(k);
          if(m>64 && m<91){
            int h=m+k;
            if(h>90)
              h=64+(h-90);
            g += ""+(char)h;
        
            arr[i]=(char)h;
          }else if(m>96 && m<123){
            int h=m+k;
            if(h>122)
              h=96+(h-122);
            g+=""+(char)h;

            arr[i]=(char)h;
          }else {
            arr[i]=(char)(m);

            g+=(char)(m);
          }

        }
          System.out.print(g);
        // for (char c : arr) {
        //   System.out.print(c);
        // }

    }
}
