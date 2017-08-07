import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

  class charger implements Comparable<charger>{
    int x,y;
    charger(int x,int y){
      this.x=x;
      this.y=y;
    }
    public int compareTo(charger other){
      //For ascending sorting
      return Integer.compare(this.x,other.x);
      //For Decending sorting
      //return Integer.compare(other.age,this.age);
    }

  }
  class charger2 implements Comparable<charger2>{
    int x,y;
    charger2(int x,int y){
      this.x=x;
      this.y=y;
    }
    public int compareTo(charger2 other){
      //For ascending sorting
      return Integer.compare(this.y,other.y);
      //For Decending sorting
      //return Integer.compare(other.age,this.age);
    }

  }
 class Solution {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        charger[] arr=new charger[m];
        charger2[] arr2=new charger2[m];
        for(int a0 = 0; a0 < m; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            arr[a0]=new charger(x,y);
            arr2[a0]=new charger2(x,y);
        }

          Arrays.sort(arr);
        // Write Your Code Here
        int max=400000;
        for(int i=0;i<m;i++){
          int sum=0;
          for(int j=i;j<(k+i-1);j++)
          {

            sum += myCal(arr[j%m],arr[(j+1)%m]);
          }
          //System.out.println(sum);
          if(max>sum)
            max=sum;
        }


        Arrays.sort(arr2);
        int max2=400000;
        for(int i=0;i<m;i++){
          int sum=0;
          for(int j=i;j<(k+i-1);j++)
          {

            sum += myCal2(arr2[j%m],arr2[(j+1)%m]);
          }
          //System.out.println(sum);
          if(max2>sum)
            max2=sum;
        }

        System.out.println(Math.min(max,max2));
        in.close();
    }
    static int myCal(charger x,charger y){
      int sum1 =Math.abs(x.x-y.x);
      int sum2=Math.abs(x.y-y.y);
      return sum1+sum2;
    }
    static int myCal2(charger2 x,charger2 y){
      int sum1 =Math.abs(x.x-y.x);
      int sum2=Math.abs(x.y-y.y);
      return sum1+sum2;
    }
}
