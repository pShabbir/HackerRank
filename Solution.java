import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine().trim().toLowerCase();
        HashSet<String> map1=new HashSet<>();
        for(int i=0;i<s.length();i++){
            map1.add(s.charAt(i)+"");
        }
        if(map1.size()==27){
            System.out.println("pangram");
        }else{
            System.out.println("not pangram");
        }
    }
}
