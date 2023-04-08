public class RecursiveJavaFactorialProgram {

  public static void main(String args[]) {
    long nFactoriral = factorialProgram(3);
    System.out.println(nFactoriral);
  }

  /* Java factorial program with recursion. */
  public static long factorialProgram(long n) {
    long a;
    if (n <= 1) {
      return 1;
    } else {
      a= n * factorialProgram(n - 1);
      return a;
    }
  }
}