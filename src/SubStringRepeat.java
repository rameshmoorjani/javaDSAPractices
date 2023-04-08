public class SubStringRepeat {

    public static void main(String[] args) {

        System.out.println(repeatSubstring("abaa"));
    }

    public static boolean repeatSubstring(String s)
    {
        int length = s.length();
        for(int i=length/2;i>=1;i--)
        {
            if(length%i==0)
            {
                int num_repeat = length/i;
                String subString=s.substring(0,i);
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<num_repeat;j++)
                {
                    sb.append(subString);
                }
                if(s.equals(sb.toString())) return true;
            }

        }

        return  false;
    }
}
