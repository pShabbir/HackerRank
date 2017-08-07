import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BookPage {

    static int solve(int n, int p){
        // Complete this function
        // int max=0;
        //
        // if(p==1){
        //   return 0;
        // }
        // int counter=1;
        // for(int i=2;i<=n;i++){
        //   if(p==i || p==(i+1)){
        //     max=counter;
        //     break;
        //   }else{
        //    counter++;
        //     i++;
        //   }
        //
        // }
        //
        // if(n%2==0){
        //   if(n==p)
        //     return 0;
        //   else{
        //     int counter2=1;
        //     for(int i=n-1;i>=1;i--){
        //       if(p==i || p==(i-1)){
        //         if(counter2<max)
        //             max=counter2;
        //         break;
        //       }else{
        //         counter += 1;
        //         i--;
        //       }
        //
        //     }
        //   }
        // }else{
        //   if(n==p || n-1==p)
        //     return 0;
        //   else{
        //     int counter2=1;
        //     for(int i=n-1;i>=1;i--){
        //       if(p==i || p==(i-1)){
        //         if(counter2<max)
        //             max=counter2;
        //         break;
        //       }else{
        //         counter += 1;
        //         i--;
        //       }
        //
        //     }
        //   }
        // }
        //
        // return max;

        return Math.min(p/2,n/2-p/2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);

        System.out.println(result);
    }
}
