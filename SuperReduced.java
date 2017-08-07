import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SuperReduced {

    static void super_reduced_string(String s){
        // Complete this function
        ArrayList<String> arr=new ArrayList<>();
        for (int i=0;i<s.length();i++ ) {
          arr.add(s.charAt(i)+"");
        }
        boolean t=true;
        int k=1;
        while(t){
          k=1;
          for(int i=0;i<arr.size()-1;i++)
          {


            if(arr.get(i).contains(arr.get(i+1)))
            {
              arr.remove(i);
              arr.remove(i);
              k=0;
            }
            //  System.out.println(arr+" i= "+i );
          }
          if(k==1)
            break;
        }
        if(arr.size()==0)
          System.out.println("Empty String");
        else {
          for (String m :arr ) {
            System.out.print(m);
          }
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
         super_reduced_string(s);
        // System.out.println(result);
    }
}
