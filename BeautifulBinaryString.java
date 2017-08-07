import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BeautifulBinaryString {

    static int minSteps(int n, String B){
        // Complete this function
        Pattern p=Pattern.compile("010");
        Matcher m=p.matcher(B);
        int count=0;
        while(m.find()){
          count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
    }
}
