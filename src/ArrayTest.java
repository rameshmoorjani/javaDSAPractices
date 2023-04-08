import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public  class ArrayTest {

    public static void main(String[] args) {
        int[] [] a ={{1,3}};
        Arrays.sort(a);

        System.out.println("array is "+a);

        for(int[] c : a)
        {
            for(int d: c)
            {

            }
        }

        Map<String,String> map = new HashMap();

        map.put("1","Ramesh");
        map.put("2","Geeta");
        map.put("3","Rahul");
        map.put("4","Tanishka");

        for(Map.Entry<String,String> entry: map.entrySet())
        {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }





        for(Map.Entry<String,String> entry: map.entrySet())
        {

        }

        for(String key : map.keySet()){
            System.out.println(key);
        }


        for(String v : map.values())
        {
            System.out.println(v);
        }

        List<String> list =new ArrayList<>(map.values());
        Collections.sort(list);



        for(String name: list)
        {
            System.out.println("is "+name);
        }

        Collections.reverse(list);

        for(String name: list )
        {
            System.out.println("reverse is "+name);
        }

       // int[] b=Arrays.copyOf(a,a.length);

        //System.out.println("array b is "+b);

        map.entrySet().stream().forEach(System.out::println);

        String name="ramesh";

        String[] names = new String[] {"Ramesh"};

        List<String> list1=Arrays.asList(names);

        Predicate<String> predicate = x -> x.startsWith("k");

        System.out.println(Stream.of(names).findAny().orElseGet(()->"rameshmoorjani"));
        System.out.println(Arrays.asList().stream().findAny().orElseGet(()->"rameshmoor"));
        Arrays.stream(names).forEach(System.out::println);


        Optional test =Stream.of(names).filter(t->t.contains("Ramesh")).findFirst();

        if(test.isPresent())
        {
            System.out.println("Present");
        }


        list1.stream().filter(t->t.contains("raj")).forEach(System.out::println);











        List<String> list2 =Arrays.stream(names).collect(Collectors.toList());

        System.out.println(list1);
        System.out.println("hello1");
        list1.stream().filter(s->s.contains("hi")).forEach(System.out::println);
        System.out.println("hello");
        list1.stream().forEach(System.out::println);
    }

    static class test{

    }
}
