import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    static String timeConversion(String sq) {
        // Complete this function
        String s[] = sq.split(":");
        int t=0;
        int hr=Integer.parseInt(s[0]);//Integer.parseInt(s[0].charAt(0)+"")+Integer.parseInt(s[0].charAt(1)+"");
        int min=Integer.parseInt(s[1]);//Integer.parseInt(s[1].charAt(0)+"")+Integer.parseInt(s[1].charAt(1)+"");
        int sec=Integer.parseInt(Integer.parseInt(s[2].charAt(0)+"")+""+Integer.parseInt(s[2].charAt(1)+""));
        String a=""+hr,b=""+min,c=""+sec;
        if(s[2].charAt(2)=='P')
          {
            if(!(hr==12))
              hr+=12;
            a=""+hr;
          }else{
            if(hr==12)
              hr=0;
            a="0"+hr;
          }

          if(min<10)
            b="0"+min;
          if(sec<10)
            c="0"+sec;

        // int h=Integer.parseInt(s[0]);
        // h=h+t;
        // if(h==24){
        //   if(!(min==0 && sec==0))
        //       h=0;
        // }
        // s[0]=h+"";
        //
        // s[2]=Integer.parseInt(s[2].charAt(0)+"")+""+Integer.parseInt(s[2].charAt(1)+"")+"";
        // String result="";

        return (a+":"+b+":"+c);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
