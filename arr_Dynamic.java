import java.util.ArrayList;
import java.util.Collections;
public class arr_Dynamic {
    public static void main(String[] args) {
        //ArrayList<String>arr= new ArrayList<>();
        // arr.add("sneha");
        // arr.add("dubey");
        // arr.add("sneha");
        // arr.add(0,"dubey");
        // for(String str:arr){
        //     System.out.println(str);
        // }

        // arr.add("A");
        // arr.add("c");
        // arr.add("d");
        // arr.add("B");
        // Collections.sort(arr);
        // System.out.println(arr);

        // System.out.println(arr);
        // System.out.println(arr.get(0));
        // System.out.println(arr.size());
        // arr.set(2,"anjali");
        // System.out.println(arr);
        // System.out.println(arr.getFirst());
        // System.out.println(arr.getLast());
        // arr.removeLast();
        // arr.remove(1);
        // System.out.println(arr);
        // System.out.println(arr.reversed());

        ArrayList<Integer>arr1= new ArrayList<>();
        // for(int i=1;i<=10;i++){
        //     arr1.add(i);
        // }
        // System.out.println(arr1);

        arr1.add(2);
        arr1.add(-7);
        arr1.add(0);
        arr1.add(5);
        arr1.add(6);
        arr1.add(-3);
        arr1.add(0);
        arr1.add(1);
        int sum=0;
        for(int i=0;i<arr1.size();i++){
            sum+=arr1.get(i);
        }
        System.out.println(sum);

        
    }
}
