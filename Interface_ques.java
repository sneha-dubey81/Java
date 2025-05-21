interface Walkable{
    void walk();
    void run();
}
interface Runnable{
    void walk();
    void run();
}
class Human implements Walkable,Runnable{
    public void walk(){
        System.out.println("slowly");
    }
    public void run(){
        System.out.println("fast");
    }
}
public class Interface_ques {
    public static void main(String[] args) {
        Human h=new Human();
        h.walk();
        h.run();
    }
}
