public class str_compare {
    public static void main(String[] args) {
        String str1="hello";
        String str2="hello";
        System.out.println(str1==str2); //compares address
        System.out.println(str1.compareTo(str2));


        String str11="Hiii";
        String str22="hiii";
        System.out.println(str11==str22); //false
        System.out.println(str11.equalsIgnoreCase(str22)); //true


        String s1="hello";
        String s2=s1+"";
        System.out.println(s1==s2); //false
        System.out.println(s1.equals(s2)); //true

    }
    
}
