

public class MostCommonSubStringPrefix {



    public static void main(String[] args) {
        String[] strArray =new String[] {"flower","fkow","flight"};

        String str =mostCommonPrefix(strArray);
        System.out.println("string is "+str);
    }

    static String  mostCommonPrefix(String[] strArray)
    {
        String mostCommonPrefix="";
        for(int i=0;i<strArray[0].length();i++)
        {
            char c=strArray[0].charAt(i);
            for(int j=1; j<strArray.length;j++)
            {
                if(c!=strArray[j].charAt(i))
                {
                    return mostCommonPrefix;
                }


            }
            mostCommonPrefix+=c;
        }

        return mostCommonPrefix;
    }
}
