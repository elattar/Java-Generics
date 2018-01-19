package example3;

/*
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
}

public class BoundsExample {
	public static void main(String args[]) {

		Integer intNums[] = { 1, 2, 3, 4, 5 };
		AverageBounds<Integer> intObj = new AverageBounds<Integer>(intNums);
		double v = intObj.average();
		System.out.println("intObj average is " + v);

		Double doubleNums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		AverageBounds<Double> doubleObj = new AverageBounds<Double>(doubleNums);
		double w = doubleObj.average();
		System.out.println("doubleObj average is " + w);

		// This won't compile because String is not a subclass of Number.
		// String strs[] = { "1", "2", "3", "4", "5" };
		// AverageBounds<String> strob = new AverageBounds<String>(strs);
		// double x = strob.average();
		// System.out.println("strob average is " + v);

	}
}
