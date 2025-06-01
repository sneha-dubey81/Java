import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class iterator {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Deeksha");
        list.add("Anushka");
        list.add("Anjali");
        list.add("Sneha");
        list.add("Avni");
        // System.out.println(list);
        // Iterator<String> it=list.iterator();
        // while(it.hasNext()){
        //     String data=it.next();
        //     if(data.startsWith("D")){
        //         it.remove();
        //     }
        // }
        // System.out.println(list);

        // ListIterator<String> it=list.listIterator();  //works only for lists
        // while(it.hasNext()){
        //     String data=it.next();
        //     System.out.println(data);
        // }
        // System.out.println("now reverse");
        // while(it.hasPrevious()){
        //     String PrevData=it.previous();
        //     System.out.println(PrevData);
        // }

        ListIterator<String> str= list.listIterator();
        // while(str.hasNext()){
        //     String data=str.next();
        //     if(data.length()<5){
        //        data="bye";
        //     }
        //     System.out.println(data);
        // }
        // int count=0;
        // while(str.hasPrevious()){
        //     String pdata=str.previous();
        //     int size=list.size();
        //     count++;
        //     if(count!=size){
        //        // pdata="hiii";
        //        str.set("hehe");
        //     }
        // }
        // System.out.println(list);
        int count=0;
        while(str.hasNext()){
            String data=str.next();
            count++;
            if(data.equals("Sneha")){
                System.out.println(count);
            }
        }

    }
}
