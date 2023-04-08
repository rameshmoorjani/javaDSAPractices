public class TestFunctionalInterfaceImpl implements TestInterface {

    public static void main(String[] args) {
        TestFunctionalInterface functionalInterface = new TestFunctionalInterface() {
            @Override
            public int add(int num, int num2) {
                return num+num2;
            }
        };

       TestFunctionalInterface functionalInterface1= (int num,int num2)-> num+num2;

        System.out.println(functionalInterface.add(2,3));

        System.out.println(functionalInterface1.add(8,9));

        TestFunctionalInterfaceImpl testFunctionalInterface = new TestFunctionalInterfaceImpl();

        testFunctionalInterface.add("Ramesh");

        }

    @Override
    public int add() {
        return 0;
    }


}
