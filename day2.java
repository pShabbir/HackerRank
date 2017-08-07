import java.io.*;
import java.util.*;
class day2{
  public static void main(String[] args) {
    try{
    //  BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
      Scanner obj=new Scanner(System.in);
      int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        int i2;
       double d2;
       String s2;

      //  i2=Integer.parseInt(obj.readLine());
      //  d2=Double.parseDouble(obj.readLine());
      //  s2=obj.readLine();
        s2=obj.nextLine();
      i2=obj.nextInt();
      d2=obj.nextDouble();


       System.out.println(i+i2);

        System.out.println(d+d2);

        System.out.println(s+s2);
    }catch (Exception e) {

    }
  }
}
