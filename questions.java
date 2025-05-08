public class questions {
    static void natural_no(int n){
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
    static void even(int a,int b){
        for(int i=a;i<=b;i++){
            if(i%2==0){
            System.out.println(i);
            }
        }
    }
    static void reverse(int n){
        for(int i=n;i>0;i--){
            System.out.println(i);
        }
    }
    static void sum(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
    static void product(int n){
        int mul=1;
        for(int i=1;i<=n;i++){
            mul=mul*i;
        }
        System.out.println(mul);
    }
    static void digit(int n){
        while(n>0){
           int digit =n%10;
           System.out.println(digit);
           n=n/10;
        }
    }
    static void sum_dig(int n){
        int sum=0;
        while(n>0){
            int digit =n%10;
            sum+=digit;
            n=n/10;
         }
         System.out.println(sum);
    }
    static void count_dig(int n){
        int count =0;
        while(n>0){
            int digit =n%10;
            digit=count++;
            n=n/10;
         }
         System.out.println(count);
    }
    static void reverse_no(int n){
        while(n>0){
            int digit =n%10;
            System.out.print(digit);
            n=n/10;
         }
    }
    static void palindrome(){
        String palindrome= "1221";
        String reverse="";
        for(int i=palindrome.length()-1;i>=0;i--){
            reverse += palindrome.charAt(i);
        }
        if(reverse.equals(palindrome)) {
            System.out.println("its a palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }        
    }

    public static void main(String[] args) {
       // natural_no(5);
       // even(5,10);
       //reverse(7);
         //sum(5);
        //product(3);
        //digit(1234);
       // sum_dig(1234);
       // count_dig(209);
       //reverse_no(1234);
       //palindrome();
        
    }
    
}
