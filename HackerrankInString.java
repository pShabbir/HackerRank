import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerrankInString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        char[] arr={'h','a','c','k','e','r','r','a','n','k'};

        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int count=0;
            for(int i=0;i<10;i++){
              if(s.contains(arr[i]+"")){
                s=s.replaceFirst(arr[i]+"","");
                count++;
              }else{
                break;
              }
            }
            if(count==10)
              System.out.println("YES");
            else
              System.out.println("NO");
            // your code goes here
        }
    }
}
