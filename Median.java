import java.util.*;
class Median{
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int n=obj.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
      arr[i]=obj.nextInt();
    calculate(arr);
  }
  public static void calculate(int[] arr){
    java.util.Arrays.sort(arr);
    int n=arr.length;
    if(n%2==0){
      System.out.print(arr[n/2]);
    }else{
        System.out.print(arr[n/2]);
    }
  }

  }
