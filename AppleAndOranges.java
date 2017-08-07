import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppleAndOranges {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        int cou=0;
        for(int h:apple){
          int k=a+h;
          if(s<=k && k<=t)
            cou++;
        }
        System.out.println(cou);
         cou=0;
        for(int h:orange){
          int k=b+h;
          if(s<=k && k<=t)
            cou++;
        }
        System.out.println(cou);
    }
}
