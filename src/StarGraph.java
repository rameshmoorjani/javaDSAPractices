import java.util.HashMap;

/*
      1

       2

 3            4*/

public class StarGraph {
    public static void main(String[] args) {
        int[][] edges = {{1,2},{2,3},{4,2}};

        System.out.println(findCenter(edges));

    }
    public  static int findCenter( int[][] edges)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int[] edge:edges)
        {
            map.put(edge[0],map.getOrDefault(edge[0],0)+1);
            map.put(edge[1],map.getOrDefault(edge[1],0)+1);
        }

        for(int key: map.keySet())
        {
            if(map.get(key)== edges.length)
            {
                return key;
            }
        }

        return 0;

    }
}
