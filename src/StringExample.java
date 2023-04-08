import java.util.Arrays;

public class StringExample {

    public static void main(String[] args)
    {
        String     str = new String("Ramesh");
        String str1=str+"Moorjani";
        //str1=str;
        System.out.println(" values is "+str.hashCode());
        System.out.println(" new String value is "+str1.hashCode());

        char[] chars = new char [] {'r','a','m','e','s','h'};

        System.out.println("chars is "+chars);

        Arrays.fill(chars,'*');

        System.out.println("char array is "+chars);
        System.out.println("val is "+chars[1]);
        for(char abc:chars)
        {
           System.out.println("val in loop "+abc);
        }
        System.out.println("char array is "+chars);

        String starString = "ram*es*h";
        StringBuilder finalStr=new StringBuilder();
        int starCount=0;
        for (int i = starString.length()-1; i >=0 ; i--) {
            if(starString.charAt(i)=='*')
            {
                starCount++;
            }
            else
            {
                if(starCount>0)
                {
                    starCount--;
                }
                else{
                    finalStr.append(starString.charAt(i));
                }
            }
        }

        System.out.println("final string is "+finalStr.reverse());
    }
}
