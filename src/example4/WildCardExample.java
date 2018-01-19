package example4;

/**
 * Average attempts (unsuccessfully) to create a generic class that can compute the average of an array of numbers of any given number type.<br>
 * T extends abstract class java.lang.Number which extended by (Integer, Float, Double, Long, Short)
 * 
 * @author El-Attar
 * @Date 14/01/2018
 * @version 1.0
 */
class AverageBounds<T extends Number> {
	private T[] numbers; // nums is an array of type T

	public AverageBounds(T[] numbers) {
		this.numbers = numbers;
	}

	// Return type double in all cases.
	public double average() {
		double sum = 0.0;
		for (int i = 0; i < this.numbers.length; i++)
			// No Compilation error : The method doubleValue() is defined for the type T which extends Number class
			sum += numbers[i].doubleValue();

		return (sum / this.numbers.length);
	}

	// Determine if two averages are the same.
	// Notice the use of the wildcard.
	public boolean sameAvgerage(AverageBounds<?> ob) {
		if (average() == ob.average())
			return true;

		return false;
	}
}

public class WildCardExample {
	public static void main(String args[]) {

		Integer intNums[] = { 1, 2, 3, 4, 5 };
		AverageBounds<Integer> intObj = new AverageBounds<Integer>(intNums);
		double v = intObj.average();
		System.out.println("intObj average is " + v);

		Integer intNums2[] = { 1, 2, 3, 4, 5 };
		AverageBounds<Integer> intObj2 = new AverageBounds<Integer>(intNums2);
		double v2 = intObj2.average();
		System.out.println("intObj2 average is " + v2);

		Double doubleNums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		AverageBounds<Double> doubleObj = new AverageBounds<Double>(doubleNums);
		double w = doubleObj.average();
		System.out.println("doubleObj average is " + w);

		Float floatNums[] = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };
		AverageBounds<Float> floatObj = new AverageBounds<Float>(floatNums);
		double x = floatObj.average();
		System.out.println("floatObj average is " + x);

		// See which arrays have same average.
		// here it's working as the T type for both is same
		System.out.print("Averages of intObj and doubleObj: ");
		if (intObj.sameAvgerage(intObj2))
			System.out.println("are the same.");
		else
			System.out.println("differ.");

		// compilation error here as T is Integer and other type is float!!
		System.out.print("Averages of iob and fob ");
		if (intObj.sameAvgerage(floatObj))
			System.out.println("are the same.");
		else
			System.out.println("differ.");

	}
}