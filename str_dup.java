public class str_dup {
    public static void main(String[] args) {
        String str="racecar";
        String str1="";
        for(int i=0;i<str.length();i++) {
            char c=str.charAt(i);
            if(str1.indexOf(c)==-1) {
                str1 +=c;
            }
        }
        System.out.println("String without duplicate value: "+str1);
    }
    
}
