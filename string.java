public class string {
    public static void main(String[] args) {
        String str="sneha";
        String str1="sniia";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==str1.charAt(i)){
                System.out.println(str.charAt(i));
                count++;
            }
        
        }
         
        System.out.println("no of same elements"+count);
        
    }
    
}
