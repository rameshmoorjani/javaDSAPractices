public class CrunchifyGenerateOOM {
 
	/**
	 * @author Crunchify.com
	 * @throws Exception
	 * 
	 */
 
	public static void main(String[] args) throws Exception {
		try {
			CrunchifyGenerateOOM memoryTest = new CrunchifyGenerateOOM();
			memoryTest.generateOOM();
		}catch(Throwable e)
		{
			System.out.println("in catch excpetion");
		}
	}
 
	public void generateOOM() throws Exception {
		int iteratorValue = 20;
		System.out.println("\n=================> OOM test started..\n");
		try {
			for (int outerIterator = 1; outerIterator < 20; outerIterator++) {
				System.out.println("Iteration " + outerIterator + " Free Mem: " + Runtime.getRuntime().freeMemory());
				int loop1 = 2;
				int[] memoryFillIntVar = new int[iteratorValue];
				// feel memoryFillIntVar array in loop..
				do {
					memoryFillIntVar[loop1] = 0;
					loop1--;
				} while (loop1 > 0);
				iteratorValue = iteratorValue * 5;
				System.out.println("\nRequired Memory for next loop: " + iteratorValue);
				Thread.sleep(1000);
			}
		}
		catch (Throwable e)
		{

		}
		System.out.println("at end of generateDOM");
	}
 
}