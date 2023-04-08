public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strs = new String[]{"Ralesh","Ralul","Ral"};

        System.out.println(longestCommonPrefix(strs));

    }

    private static String longestCommonPrefix(String[] strs) {

        String longestCommonPrefix = "";
        if (strs == null || strs.length == 0) {
            return longestCommonPrefix;
        }

        int index = 0;
        for (char c : strs[0].toCharArray()) {
            for (int i = 1; i < strs.length; i++) {
                if (index > strs[i].length() || c != strs[i].charAt(index)) {
                    return longestCommonPrefix;
                }

            }
            longestCommonPrefix += c;
            index+=1;

        }

        return longestCommonPrefix;

    }



























        /*
        String longestCommonPrefix="";
        if(strs==null || strs.length==0)
        {
            return longestCommonPrefix;
        }

        int index=0;
        for(char c : strs[0].toCharArray())
        {
            for(int i=1;i< strs.length;i++)
            {
                if(strs[i].charAt(index)!=c)
                {
                    return longestCommonPrefix;
                }
            }
            index++;
            longestCommonPrefix+=c;

        }

        return longestCommonPrefix;
    }*/
   // }
}
