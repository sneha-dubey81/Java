public class area {
    public static void main(String[] args) {
        formula a= new formula();
        a.rectangle(5, 3);        
    }    
}
class formula {
    void rectangle(int l,int b){
        System.out.println(l*b);
    }
}
