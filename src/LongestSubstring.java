import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class LongestSubstring {

        public static int lengthOfLongestSubstring(String s) {
            int n = s.length(), ans = 0;
            Map<Character, Integer> map = new HashMap<>(); // current index of character
            // try to extend the range [i, j]
            for (int j = 0, i = 0; j < n; j++) {
                /*if (map.containsKey(s.charAt(j))) {
                    i = Math.max(map.get(s.charAt(j)), i);
                }*/
                if (map.containsKey(s.charAt(j))) {
                    i = Math.max(map.get(s.charAt(j)), i);
                   // i++;
                }
                ans = Math.max(ans, j - i + 1);
                map.put(s.charAt(j), j + 1);
            }
            return ans;
        }

    public static int lengthOfLongestSubstringwithCharArray(String s) {
        int n = s.length(), ans = 0;
       // Map<Character, Integer> map = new HashMap<>(); // current index of character
        int[] charArray = new int[256];

        System.out.println("charArray is "+Arrays.toString(charArray));
        // try to extend the range [i, j]
        int i=0,j=0;
        int a ='b';

        while ( j<s.length()) {
              /*  if (map.containsKey(s.charAt(j))) {
                    i = Math.max(map.get(s.charAt(j)), i);
                }
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
                // i++;
            }*/
           // ans = Math.max(ans, j - i + 1);
            //map.put(s.charAt(j), j + 1);
            charArray[s.charAt(j)]++;
            while (charArray[s.charAt(j)]>1)
            {
                charArray[s.charAt(i)]--;
                i++;
            }
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }

        public static void main(String args[])
        {
            System.out.println("LongestSubstring :::"+lengthOfLongestSubstring("aabcad"));
          //  System.out.println("longestSubString with char Array "+lengthOfLongestSubstringwithCharArray("aabcad"));

        }
}
