import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String funnyString(String s){
        // Complete this function
        int c=0;

        for(int i=0;i<s.lenght()-1;i++)
        {
          if((Math.abs(s.charAt(i+1)-s.charAt(i)))==(Math.abs(s.charAt(s.length()-1-1-i)-s.charAt(s.length()-1-i))))
              c++;
        }
        if(c==s.length()-1)
          return "Funny";
        else
          return "Not Funny";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}
