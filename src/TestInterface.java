public interface TestInterface<T> {

    public static final int abc=5 ;
    public abstract int add();

    public  default T add(T a){
        return a;
    }


}
