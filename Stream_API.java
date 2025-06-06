import java.lang.classfile.ClassFile.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream_API {
    public static void main(String[] args) {
        // List<Integer> list=Arrays.asList(5,10,15,20,25);
        // // List<Integer> evenList=list.stream().filter(n-> n%2==0).map(n->n*5).collect(Collectors.toList());
        // // Optional<Integer> sum= list.stream().reduce((a,b)->a+b);
        // int sum= list.stream().reduce(0,(a,b)->a+b);
        // System.out.println(sum);

        // List<Integer> list=Arrays.asList(1,0,1,2,3,4,5,6);
        // List<Integer>list2=list.stream().filter(n->n>2).filter(n->n%2==0).collect(Collectors.toList());
        // int sum=list2.stream().reduce(0,(a,b)->a+b);
        // System.out.println(sum);


        List<Integer> list=Arrays.asList(5,10,15,20,25);
        int max=list.stream().reduce(0,(a,b)-> a>b?a:b);
        List<Integer> list2= list.stream().filter(a->a!=max).collect(Collectors.toList());
        int max2=list2.stream().reduce(0,(a,b)-> a>b?a:b);
        System.out.println(max2);

    }
}
