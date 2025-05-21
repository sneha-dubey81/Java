interface Shape{
    void area();
}
class Circle implements Shape{
    public void area(){
       int r=5;
       double area=3.14*r*r;
       System.out.println(area);
    }
}
public class Interface_ques4 {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.area();
    }
}
