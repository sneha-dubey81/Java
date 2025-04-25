public class str_builder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("hello");
        str.append("hii");
        System.out.println(str);

        StringBuilder str1=new StringBuilder(15);
        str1.append("hiii hello heyyy");
        System.out.println(str1.length());
        System.out.println(str1.capacity());
        
         
    }
    
}
