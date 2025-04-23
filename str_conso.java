public class str_conso {
    public static void main(String[] args) {
        String vowel= "racecario";
        char ch;
        int count;
        for(int i=0;i<vowel.length();i++) {
            ch=vowel.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
             count=0;
            }
            else count=1;
            if(count==1) {
                System.out.println(vowel.charAt(i));
            }
        }
    }
}
