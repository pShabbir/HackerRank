import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Solution {

    static int anagaram(String s){
        // Complete this function
        int n=s.length();
        int mid=0;
        if(n%2!=0)
            return -1;
        else
            mid=n/2;
        ArrayList<String> a1=new ArrayList<>();
        ArrayList<String> a2=new ArrayList<>();
        for(int i=0;i<mid;i++)
            a1.add(s.charAt(i)+"");
        for(int i=mid;i<n;i++)
            a2.add(s.charAt(i)+"");
        //System.out.println(a1+" "+a2);
        for (int j=0;j<a1.size();j++) {
          for (int i=0;i<a2.size();i++ ) {
            if(a1.get(j).equals(a2.get(i)))
              {
                a1.remove(j);
                j--;
                a2.remove(i);
                break;
              }
          }
        }
          //System.out.println(a1+" "+a2);
          return a1.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = anagaram(s);
            System.out.println(result);
        }
    }
}
