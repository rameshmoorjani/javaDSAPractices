import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaExpression {

    public static void main(String[] args)
    {

        Comparator<String> comparator = new Comparator<String>(){

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }


        };
        String abc="ramesh";
        String xyz="kumar";
        System.out.println("data is "+comparator.compare(abc,xyz));

        Comparator<String> comparator2 = ( o1, o2) -> o1.compareTo(o2);

        Comparator<String> comparator3 = ( o3,o4) -> o3.compareTo(o4);

        System.out.println("data 2 is "+comparator2.compare(abc,xyz));

        Consumer<Integer> consumer= new Consumer<>(){

            @Override
            public void accept(Integer integer) {
                System.out.println("Hi value is ::"+integer);
            }
        };

        Consumer<Integer> cons = (Integer intg) -> System.out.println("Hi lambda "+intg);

        Function<Integer,Integer> func =  number -> number++;

        int val =func.apply(5);

        System.out.println("val is "+val);

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(10);

        arrayList.forEach(consumer);

        arrayList.forEach(cons);

        //Thread t = new Thread(()->printMessage());
        Thread t = new Thread(LambdaExpression::printMessage);
        t.start();

        Consumer consumer1 = LambdaExpression::printMessage2;

        consumer1.accept("ramesh");

        Consumer consumer2 = System.out::print;

        consumer2.accept("moorjani");

    }




    static void printMessage()
    {
        System.out.println("hello");
    }

    static void printMessage2(Object s)
    {
        System.out.println("hello "+s);
    }
}
