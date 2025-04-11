import java.util.Scanner;
public class vowel_conso {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter any character");
        char ch =in.next().charAt(0);

        switch(ch) {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' : 
            System.out.println("vowel");
            break;
            default : System.out.println("consonant");
        }
    }
}