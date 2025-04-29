public class ascii {
    static void abc(){
        String[] str={"A","B","C","D","Z"};
        for(int i=0;i<str.length;i++){
            char ch=str[i].charAt(0);
            int ascii=ch+32;
            System.out.println((char)ascii);
            }
        }    
    public static void main(String[] args) {
        abc();
        
    }
    
}
