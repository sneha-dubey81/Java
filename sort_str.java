public class sort_str {
    static void sort(){
        String[] str={"B","A","C"};
        for(int i=0;i<str.length;i++){
         for(int j=0;j<str.length-i-1;j++){
            if((int)str[i].charAt(0)>(int)str[j+1].charAt(0)){
                String temp=str[j];
                str[j]=str[j+1];
                str[j+1]=temp;
            }
         }
       
        }        
        for(String i:str){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        sort();        
    }
    
}
