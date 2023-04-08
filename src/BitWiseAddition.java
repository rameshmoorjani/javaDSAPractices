public class BitWiseAddition {

    public static void main(String[] args) {

        int a=2;
        int b=3;
        while(b!=0)
        {
            int temp= (a&b)<<1;
           a= a^b;
           b=temp;

        }

        System.out.println("a value is "+a);

    }

}
