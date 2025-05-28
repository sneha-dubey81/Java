import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(1,10);
        map.put(2, 20);
        map.put(3, 30);     
        System.out.println(map);
        // System.out.println(map.get("id0"));  //op 1
        // System.out.println(map.get("id4"));  //op null
        // System.out.println(map.containsKey("id0"));
       System.out.println(map.getOrDefault(1,0));
        // System.out.println(map.containsValue(5));
       // map.remove("id0");
        //System.out.println(map);

        // for(int key:map.keySet()){
        //     if(key>2){
        //     System.out.println(key);
        //     }
        // }
        // map.forEach((key,value) ->{
        //     // if(key>2){
        //     // System.out.println(key + " " + value);
        //     // }
        //     if(value.equals(10)){
        //         System.out.println(value);
        //     }
        // });

        // HashMap<Integer,String> map1= new HashMap<>();
        // map1.put(1,"hii");
        // map1.put(2, "hello");
        // map1.put(3, "hyyy");
        // for(String value:map1.values()){
        //     if(value.equals("hello")){
        //         System.out.println(value);
        //     }
        // }
    }        
}
        