interface Client1{
    void show();
}
interface Client2 {
    void print();
    void show();
}
class Dev implements Client1,Client2{
    public void print(){
        System.out.println("hii");
    }
    public void show(){
        System.out.println("heyy");
    }
}
public class Interface_multi {
    public static void main(String[] args) {
        Dev obj=new Dev();
        obj.show();
        obj.print();
    }
}
