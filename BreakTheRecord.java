import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s){
                int lc=0,hc=0;
            int score=s[0],ls=s[0],hs=s[0];
            for(int i=1;i<s.length;i++){
              if(s[i]>hs)
                {
                    hc++;
                    hs=s[i];
                  }
              if(s[i]<ls)
                  {
                    lc++;
                    ls=s[i];
                  }
            }

            int a[]=new int[2];
            a[0]=hc;
            a[1]=lc;
            return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
