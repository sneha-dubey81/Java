public class obj {
    public static void main(String[] args) {
        student o =new student();
        o.fullName();
    }
}
class student{
    String firstName="sneha";
    String lastName="dubey";
    void fullName(){
        System.out.println(firstName+" "+lastName);    
    }
}
