import java.util.Scanner;
public class exception_handling {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
    //    System.out.println("enter a:");
    //     int a=in.nextInt();
    //     System.out.println("enter b:");
    //     int b=in.nextInt();
    //     try {
    //        int c=a/b;
    //        System.out.println(c);
    //     } catch (Exception e) {
    //          System.out.println("We cannot divide zero or by zero");
    //     }
    //     System.out.println("hellooo");
        System.out.println("enter length of array:");
        int n=in.nextInt();
        int[] arr=new int [n];
        System.out.println("enter array");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        int a=10;int b=0;
        try {
            System.out.println(arr[5]);
            //if size of array is less than 6 exception will occur
            int c=a/b;
            System.out.println(c);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array out of bounds");
        }
        catch (ArithmeticException e){
            System.out.println("can not divide by zero");
        }
        //if there are multiple exception in try block only first exception will work
        
     }
}


