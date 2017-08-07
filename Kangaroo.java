import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
        String d="NO";
        if(x1==x2){
           d="YES";
        }else{
          if(v1>v2){
            int h=v1-v2;
            if((x2-x1)%h==0)
              d="YES";
          }

        }
        return d;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);

          //System.out.println(x1+":"+x2+":"+v1+":"+v2);
        System.out.println(result);
    }
}
