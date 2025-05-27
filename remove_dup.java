import java.util.HashSet;
public class remove_dup {
    public static void main(String[] args) {
    HashSet<Integer> set=new HashSet<>();
 
    int[] arr={1,2,2,42,4,5,3,53,45,3,5};
    for(int i=0;i<arr.length;i++){
         if(set.contains(i)){
             System.out.println(arr[i]);
        }
        else{
            set.add(arr[i]);                 
        } 
        //System.out.println(set); 
    }
    }
}
