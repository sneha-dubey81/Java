public class str_target {
    public static void main(String[] args) {
        String palindrome ="racecar";
       // String target='r';
        char[] arr=palindrome.toCharArray();
        for(int i=0;i<arr.length;i++) {
            if(arr[i]=='r'){
             System.out.println(i);
            }
        }
    }
    
}
