import java.util.HashMap;

public class freq_words {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        String str="programming is a fun and programming is a fun";
        String[] words=str.split(" ");
        for(String i:words){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        System.out.println(map);
    }
}
