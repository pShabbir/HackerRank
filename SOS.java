import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SOS {

    static int count=0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        // Pattern p = Pattern.compile("SOS");
        // Matcher m = p.matcher(S);
        // while(m.matches()){
        //   System.out.println(m.);
        // }

        int k=S.length()%3;
        for(int i=0;i<S.length();i=i+3){

          String g=S.charAt(i)+""+S.charAt(i+1)+""+S.charAt(i+2)+"";
          //  System.out.println(g);
          calculate(g);
        }
        System.out.println(count);

    }

    static void calculate(String s){
      int f=0;
      if(s.charAt(0)!='S')
        f++;
      if(s.charAt(1)!='O')
        f++;
      if(s.charAt(2)!='S')
        f++;
      count +=f;
    }


}
