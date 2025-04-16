import java.util.Scanner;

public class max_val {
    public static void main(String[] args) {
      Scanner in= new Scanner(System.in);
      System.out.println("Enter size of array: ");
      int n=in.nextInt();
      int[] arr=new int[n];
      System.out.println("Enter values of array: ");

      for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
      }
      int max=0;
      for(int j=0;j<n;j++){
        if (arr[j]>max){
            max=arr[j];
        }
      }
      System.out.println("Max element is :");
      System.out.println(max);
      
    }
    
}
