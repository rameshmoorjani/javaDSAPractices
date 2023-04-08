import java.util.HashMap;

public class SubStringKDistinct {

    public static void main(String[] args) {
        System.out.println(longestSubstringKDistinct("ababceeeeeeed",3));
    }


 public static int longestSubstringKDistinct(String str,int k)
 {
     int j=0;
     int i=0;
     HashMap<Character,Integer> map = new HashMap<>();
     int maxVal = Integer.MIN_VALUE;
     while(j<str.length())
     {
         char c = str.charAt(j);
         map.put(c,map.getOrDefault(c,0)+1);

         while (map.size()>k)
         {
             char leftChar = str.charAt(i);
             int val= map.get(leftChar);
             map.put(leftChar,val-1);
             if(map.get(leftChar)==0)
             {
                 map.remove(str.charAt(i));
             }
             i++;
         }



         if(map.size()==k)
         {
             maxVal = Math.max(maxVal,j-i+1);
         }
         j++;
     }

     return maxVal;

 }

}
