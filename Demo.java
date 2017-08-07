import java.util.*;
class Demo{
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int n=obj.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
      arr[i]=obj.nextInt();
  }

  public static void so(int arr[]){
    int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
  }
}
