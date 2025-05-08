public class overloading {
    public static void main(String[] args) {
        // Calculate c=new Calculate();
        // c.sum(2,3);
        // c.sum(1, 2, 3);
        // c.sum(1.2, 1.3);
        Area a=new Area();
        a.area(2);
        a.area(1,2,3);
        a.area(7,3);
    }
}
class Calculate{
    void sum(int a,int b){
        System.out.println(a+b);      
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void sum(double a,double b){
        System.out.println(a+b);
    }
}
class Area{
    void area(int l,int b,int h){
        System.out.println("area of reactangle:"+(l*b*h));
    }
    void area(int a){
        System.out.println("area of square:"+(a*a));
    }
    void area(double b,double h){
        System.out.println("area of triangle:"+(0.5*b*h));
    }
} 