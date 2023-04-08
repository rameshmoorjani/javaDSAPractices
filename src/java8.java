import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class java8 {

    public static void main(String[] args) {
        Integer[] a= {1,2,3,5};
        // Extra, streams apply to any data type.
        List<Integer> num = Arrays.asList(a);
        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(collect1); //[2, 4, 6, 8, 10]


        //ArrayList<Integer> list = new ArrayList<>();
        Arrays.asList(a).stream().map(b -> b*3).collect(Collectors.toList());
       // list.stream().map(b -> b*3).collect(Collectors.toList());

        List<Integer> collect2 =Arrays.asList(a).stream().flatMap(b-> Stream.of(b*3)).collect(Collectors.toList());

        System.out.println("collect2 "+collect2);

        List<Integer> collect3 =Arrays.asList(a).stream().map(b-> b*3).collect(Collectors.toList());

        System.out.println("collect3 "+collect3);

       int val= sum(2,3);

        System.out.println(val);
        int[] a2= {1,2,3,5};
        Operator<Integer> bt = ( a3,b)-> a3 +b;

       int d= bt.process(5,6);

        System.out.println("d value is "+d);

        // Creating a list of Prime Numbers
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);

        // Creating a list of Odd Numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);

        // Creating a list of Even Numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> listOfListofInts =
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);

        System.out.println("The Structure before flattening is : " +
                listOfListofInts);

        List<Integer> list =listOfListofInts.stream().flatMap(g->g.stream()).collect(Collectors.toList());

        System.out.println("list after flat map is "+list);
    }

    public  static  int  sum(int a, int b)
    {
        return a+b;
    }
}

@FunctionalInterface
interface Operator<T> {
    T process(T a, T b);
}