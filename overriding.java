public class overriding {
    public static void main(String[] args) {
        Parent obj= new Child();
        obj.eat();
    }    
}
class Parent{
    void eat(){
        System.out.println("dal chawal");
    }
}
class Child extends Parent{
    int a=5;
    void eat(){
        System.out.println("pizza");
    }
}
