import java.util.*;
class ClosNumber{
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int n=obj.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
      {
        arr[i]=obj.nextInt();
      }
    calculate(arr);

  }

  public static void calculate(int []arr){
      //System.out.print(arr[0]+" ");
      java.util.Arrays.sort(arr);
      int min=Integer.MAX_VALUE;
      for(int i=0;i<arr.length-1;i++){
        int k=arr[i+1]-arr[i];
              if(k<min){
                min=k;
            }
      }
    

    for (int i=0;i<arr.length-1 ;i++ ) {
      int k=Math.abs(arr[i]-arr[i+1]);
            if(k==min){
              p(arr[i],arr[i+1]);
            }
    }


  }

  public static void p(int a,int b){

        System.out.print(a+" ");
        System.out.print(b+" ");

  }
}
