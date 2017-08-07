  import java.util.*;
  class Lily{
    public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      int n=obj.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++)
        arr[i]=obj.nextInt();
      calculate(arr);
    }
    public static void calculate(int []arr){
      int[] sorted =  new int[arr.length];
      for (int i=0;i<arr.length ;i++ ) {
        sorted[i]=arr[i];
      }
      Arrays.sort(sorted);
      int count=0;
      for (int i=0;i<arr.length;i++ ) {
        if(sorted[i]!=arr[i])
          count++;
      }
      count--;
      System.out.print(count);

    }

    }
