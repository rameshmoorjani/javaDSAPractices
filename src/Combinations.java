import java.util.*;

public class Combinations {

    public static void main(String[] args)
    {

        PriorityQueue<Integer> minHeap = new PriorityQueue();

        String s = "Rajaram";

        Map<Character,Integer> hmap = new HashMap<>();


        for(char c :s.toCharArray())
        {
               hmap.put(c, hmap.getOrDefault(c,0)+1);
        }

        System.out.println("map is "+hmap);

        Queue<Integer> queue = new LinkedList<>();



        int[] n = {1,2};
        List<List<Integer>> result = new LinkedList<>();
        printAllCombinations(n,0,result,new LinkedList<Integer>());

        System.out.println("list is "+result);
    }

    static void printAllCombinations(int[] n,int i,List<List<Integer>> result,List<Integer> path)
    {

        if(i==n.length)
        {
            result.add(path);
            return;
        }

        List<Integer> pathWithCurrent = new LinkedList(path);
        pathWithCurrent.add(n[i]);

       // printAllCombinations(n,i+1,result,path);

        printAllCombinations(n,i+1,result,pathWithCurrent);

    }



}
