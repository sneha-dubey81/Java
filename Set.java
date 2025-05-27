import java.util.TreeSet;
import java.util.HashSet;
public class Set {
    public static void main(String[] args) {
        TreeSet<String> Tset = new TreeSet<>();
        Tset.add("A");
        Tset.add("A");
        Tset.add("a");
        Tset.add("B");
        System.out.println(Tset);

        HashSet<String> Hset =new HashSet<>();
        Hset.add("C");
        Hset.add("A");
        Hset.add("C");
        Hset.add("a");
        System.out.println(Hset);
    }
}
