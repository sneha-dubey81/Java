import java.util.Scanner;

public class sum_arr {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
      System.out.println("Enter size of array: ");
      int n=in.nextInt();
      int [] arr=new int[n];
      System.out.println("Enter values of array: ");

      for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
      }
      for(int j=0;j<n;j++){
        for(int k=0;k<n;k++){
        int sum=arr[j]+arr[k];
        if(sum==5){
            System.out.println("index:");
            System.out.println(k +" and "+ j);
        }}

      }
    }
    
}
