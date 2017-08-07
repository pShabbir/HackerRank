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



 class Solution {

   static ArrayList<charger> se(HashMap<String,charger> arr,int n){
     ArrayList<charger> myarr=new ArrayList<>();
     for(int x=0;x<=n;x++){
       if(arr.containsKey(x+""+0))
         myarr.add(arr.get(x+""+0));
     }
     for(int x=1;x<=n;x++){
       if(arr.containsKey(5+""+x))
         myarr.add(arr.get(5+""+x));
     }
     for(int x=n-1;x>=0;x--){
       if(arr.containsKey(x+""+5))
         myarr.add(arr.get(x+""+5));
     }
     for(int x=n-1;x>0;x--){
       if(arr.containsKey(0+""+x))
         myarr.add(arr.get(0+""+x));
     }

     return myarr;
   }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        HashMap<String,charger> map=new HashMap<String,charger>();

        for(int a0 = 0; a0 < m; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            map.put(x+""+y,new charger(x,y));

        }
        ArrayList<charger> z=se(map,n);

        // Write Your Code Here
        int max=400000;
        for(int i=0;i<m;i++){
          int sum=0;
          for(int j=i;j<(k+i-1);j++)
          {

            sum += myCal(z.get(j%m),z.get((j+1)%m));
          }
          //System.out.println(sum);
          if(max>sum)
            max=sum;
        }



        System.out.println(max);
        in.close();
    }
    static int myCal(charger x,charger y){
      int sum1 =Math.abs(x.x-y.x);
      int sum2=Math.abs(x.y-y.y);
      return sum1+sum2;
    }

}
