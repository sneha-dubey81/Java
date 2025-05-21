interface Client{
    void print();
    void show();
}
class Dev implements Client{
    public void print(){
        System.out.println("menu");
    }
    public void show(){
        System.out.println("pasta");
    }
}
public class Int_face {
    public static void main(String[] args) {
        Dev obj=new Dev();
        obj.print();
        obj.show();
    } 
}
 