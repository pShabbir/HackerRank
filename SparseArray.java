/*
There is a collection of strings ( There can be multiple occurences of a particular string ). Each string's length is no more than characters. There are also queries.
 For each query, you are given a string, and you need to find out how many times this string occurs in the given collection of strings.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SparseArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
          arr[i]=obj.next();
        }
        int q=obj.nextInt();
        for (int i=0;i<q ;i++ ) {
          int c=0;
          String que=obj.next();
          for(int j=0;j<n;j++){
            if(arr[j].equals(que)){
              c++;
            }
          }
            System.out.println(c);
        }
    }
}
