public class LinearSearch {

    public static  int Lsearch(int arr[]){
        int target=7;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
            else return -1;
        }
         
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={2,1,54,7,3,6,8,12}; 
        //Lsearch obj= new Lsearch();
        System.out.println(Lsearch(arr));        
    }
    
}
