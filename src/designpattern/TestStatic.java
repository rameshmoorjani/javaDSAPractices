package designpattern;

class Test{

    static {
        System.out.println("in static block ");
    }

    public static String hello()
    {
        return "ramesh";
    }

    public static final int x=20;

}

// example where static block is not called

public class TestStatic {

    public static void main(String[] args) {
        System.out.println(""+Test.x);
    }

}


