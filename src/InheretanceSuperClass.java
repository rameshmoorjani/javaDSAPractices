public class InheretanceSuperClass {
    int count=5;

}

class DerivedClass{

    int count=2;
    InheretanceSuperClass inheretanceSuperClass = new InheretanceSuperClass();

}

class childClass extends DerivedClass{

    public static void main(String[] args) {

        childClass childClass = new childClass();
        childClass.test();

    }
   public void test(){

       System.out.println("value is test method "+super.inheretanceSuperClass.count);
       System.out.println("value is test method 2 "+super.count);
    }

}