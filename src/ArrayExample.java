import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class ArrayExample {

    public static void main(String[] args)
    {


        String str = "abcde";
        str.trim();
        str.toUpperCase();
        str.substring(3, 4);
        System.out.println(str);

        List<Boolean> list1 = new ArrayList<>();  list1.add(true);
        list1.add(Boolean.parseBoolean("False"));  list1.add(Boolean.TRUE);
        System.out.print(list1.size());
        System.out.print(list1.get(0) instanceof Boolean);

        String[] arrStr = {"Rahul","Geeta","Ramesh","Tanishka"};

        String[] arrStr2 = {"Rahul",new String("Geeta"),"Ramesh","Tanishka"};


         List<String> abc =Arrays.asList(arrStr);
        abc.sort(Comparator.comparing(String::toString));
        //Collections.sort(abc);
         System.out.println(abc);

         List<String> def = Arrays.asList(arrStr2);

        System.out.println("hiii "+abc.equals(def));


        List<String> ls =Arrays.asList(arrStr);

        List<String> l2 =ls.stream().map(a->a+"hello").collect(Collectors.toList());

        System.out.println("l2 string is "+l2);

        List<String> list = Arrays.asList("3", "6", "8",
                "14", "15");



        List<String> list2= Arrays.asList("5","6","7","8","9","10");

        //list2.stream().collect(Collectors.toList());
        List<String> a = Arrays.asList("One", "Two", "three");
        List<Integer> lengths =a.stream().mapToInt(String::length).boxed().collect(Collectors.toList());


        //system.out.println("list 3 is "+list3);

















        // Using Stream mapToInt(ToIntFunction mapper)
        // and displaying the corresponding IntStream
        list.stream().mapToInt(num -> Integer.parseInt(num))
                .filter(num -> num % 3 == 0)
                .forEach(System.out::println);







        Arrays.sort(arrStr);

        System.out.println(Arrays.asList(arrStr));

        String[] arrStr3= Arrays.copyOf(arrStr,arrStr.length);

        System.out.println("array3 "+Arrays.asList(arrStr3));

        System.out.println(Arrays.equals(arrStr,arrStr));

        Arrays.sort(arrStr);

        System.out.println("arrStr ::"+arrStr[0]);

        String[] arr =Arrays.copyOf(arrStr,(arrStr.length)*2);

        System.out.println(arr.length);

        int [][] arrayLottery = {{1,2},{2,4},{5,6}};

        for(int i=0;i<arrayLottery.length;i++)
        {
            System.out.println(" value "+arrayLottery[i][0]+" "+arrayLottery[i][1]);
        }

        int[][] A = new int[5][3];
        for(int i =0;i<A.length;i++)
        {
           // A[i]=new int[5];
        }

        System.out.println("A.length "+A.length);
        for (int i =0;i<A.length;i++)
        {
            System.out.println("A[i] lenght "+A[i].length);
            for(int j=0;j<A[i].length;j++)
            {
                A[i][j]=0;
            }
        }

        for (int i =0;i<A.length;i++)
        {
            System.out.println("\n");
            for(int j=0;j<A[i].length;j++)
            {

                System.out.println("element is "+A[i][j]);
            }
        }
    }
}
