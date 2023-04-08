public class Palindrome
{

    public static void main(String[] args)
    {
        int x =121;
       /* System.out.println("x is "+x%4);
        x/=10;
        System.out.println("x is "+x);*/

        System.out.println(isPalindRome(3223));


    }

    public static boolean isPalindRome(int x)
    {
        int reverted =0;
        while (x>reverted)
        {
            reverted = reverted*10+x%10;
            x/=10;
        }
        return x== reverted || x == reverted/10;
    }
}
