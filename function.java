public class function {
    static void sum(){
        int a=5; int b=6;
        int add=a+b;
        System.out.println(add);
    }
    int sum(int a,int b){
        return a+b;
    }
    static void sum2(int a) {
        int sum=0;
        while(a>0){
            int digit=a%10;
            sum+=digit;
            a=a/10;

        }
        System.out.println(sum);

    }


    
    public static void main(String[] args) {
      //  sum();
       // function obj= new function();
       // System.out.println(obj.sum(5,5));
        sum2(123);
    }
    
}
