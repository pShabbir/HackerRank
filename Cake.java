import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Solution {

    static long howManyToInvite(long A, long B, long a) {
        // Return the number of people Leha should invite to his party
        double d=a;
        double c=(double)A/B;
        // System.out.print(c);
        d=d/c;
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long A = in.nextLong();
        long B = in.nextLong();
        long a = in.nextLong();
        long b = howManyToInvite(A, B, a);
        System.out.println(b);
        in.close();
    }
}
