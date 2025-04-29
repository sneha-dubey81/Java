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

    public static void main(String[] args) {
       // natural_no(5);
       // even(5,10);
       //reverse(7);
       sum(5);
        
    }
    
}
