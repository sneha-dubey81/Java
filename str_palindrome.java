public class str_palindrome {
    public static void main(String[] args) {
        String palindrome= "racecar";
        String reverse="";
        for(int i=palindrome.length()-1;i>=0;i--){
            reverse += palindrome.charAt(i);
        }
        if(reverse.equals(palindrome)) {
            System.out.println("its a palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }

    }
    
}
