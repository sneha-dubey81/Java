import java.util.HashMap;

public class hashmap_freq {
    public static void main(String[] args) {
        // HashMap<Character,Integer> map=new HashMap<>();
        // String str="programming";
        // char[] arr=str.toCharArray();
        // for(char i:arr){
        //     map.put(i, map.getOrDefault(i, 0)+1);
        // }
        // System.out.println(map);

        // for(int i=0;i<arr.length;i++){
        //     int count=0;
        //     for(int j=0;j<arr.length;j++){
        //         if(arr[i]==arr[j]){
        //             count++;
        //         }
        //     }
        //     map.put(arr[i], count);
        // }
        // System.out.println(map);

        HashMap<Character,Integer> map=new HashMap<>();
        String str="aaasbbbccccf";
        char[] arr=str.toCharArray();
        for(char i:arr){
        map.put(i, map.getOrDefault(i, 0)+1);       
        }
        // map.forEach((key,value)->{
        //     if(value.equals(1)){
        //         System.out.println(key);
        //     }
        // });
        for(char i:map.keySet()){
            if(map.get(i)==1){
                System.out.println(i);
                break;
            }
        }
    }
}
