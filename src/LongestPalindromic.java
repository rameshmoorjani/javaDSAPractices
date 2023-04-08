public class LongestPalindromic {

    public static void main(String[] args) {

        longestPalindromic("444947137");
    }

    public static String longestPalindromic(String s)
    {
        int[] counts = new int[10];
        for(char c : s.toCharArray()) counts[c-'0']++;

        System.out.println("length is "+counts.length);


        StringBuilder result = new StringBuilder();

        for(int i= counts.length-1;i>=0;i--)
        {
            if(counts[i]>=2)
            {
                for(int j=0;j< counts[i]/2;j++) result.append(i);
                counts[i]%=2;
            }
        }

        System.out.println("result "+result);
                return "";
    }
}
