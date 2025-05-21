interface Vehicle {
    void start();
}
class Car implements Vehicle{
    public void start(){
        System.out.println("vehicle is starting");
    }
}
public class Interface_ques5 {
    public static void main(String[] args) {
       Car c=new Car();
       c.start(); 
    }
}
