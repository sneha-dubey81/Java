public class str_vowel {
    public static void main(String[] args) {
        String vowel= "racecario";
        char ch;
        int count=0;
        for(int i=0;i<vowel.length();i++) {
            ch=vowel.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
             count++;
            }

        }
        System.out.println(count);
    }
    
}
