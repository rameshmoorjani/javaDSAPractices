
@FunctionalInterface
public interface TestFunctionalInterface {

    public abstract int add(int num,int num2);
    public default int add2(int num,int num2){
        return 1;
    };
}

