import java.util.Scanner;
public class array {
    public static void main(String[] args) {
      //  int arr[]={1,2,3,4,5,6};
      Scanner in= new Scanner(System.in);
      System.out.println("Enter size of array: ");
      int n=in.nextInt();
      int[] arr=new int[n];
      System.out.println("Enter values of array: ");

      for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
      }
      System.out.println("Array is:");

        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
        System.out.println("Reverse of array:");
        for(int j=arr.length-1;j>=0;j--){
            System.out.println(arr[j]);
        }


    }
    
}
 