public class sum {
    public static void main(String[] args) {
        int a=123;
        int sum=0; 
        while(a>0){
            int digit =a%10;
            a=a/10;
            sum= sum +digit;

        }        
        System.out.println("sum is :"+sum);
    }
}
