import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args)
    {
        Integer[] arr = new Integer[]{0,0,1,1,1,2,2,3,3,4};
        int index =1;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                arr[index++]=arr[i+1];
            }
        }

        System.out.println("sorted array isss :::"+ Arrays.asList(arr).toString());

        Integer arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        List<Integer> arrList = new ArrayList<>();

        arrList.addAll(Arrays.asList(arr));
        System.out.println(arrList);

        Collections.sort(arrList);
        for(int i=0;i<arrList.size()-1;i++)
        {
            if(arrList.get(i)==arrList.get(i+1))
            {
                arrList.remove(i);
                i--;
            }
        }

        System.out.println("sorted list after removal of duplicate "+arrList);

        String str[] = { "Homer", "Marge", "Bart", "Lisa", "Maggie" };
        List<String> lst1 = Arrays.asList(str);
        System.out.println(lst1.size());
    }
}
