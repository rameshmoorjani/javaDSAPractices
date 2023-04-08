
public class Client {


    public static void main(String[] args)
    {
        Locker<Integer> locker=new Locker<>();
        locker.setValue(5);

        System.out.println(locker.getClass().getName());

    }

}


