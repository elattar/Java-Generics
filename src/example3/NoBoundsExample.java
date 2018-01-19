package example3;

/**
 * Average attempts (unsuccessfully) to create a generic class that can compute the average of an array of numbers of any given type.<br>
 * The class contains an error!
 * 
 * @author El-Attar
 * @Date 14/01/2018
 * @version 1.0
 */
class Average<T> {
	private T[] numbers; // nums is an array of type T

	public Average(T[] numbers) {
		this.numbers = numbers;
	}

	// Return type double in all cases.
	public double average() {
		double sum = 0.0;
		for (int i = 0; i < this.numbers.length; i++)
			// Compilation error : The method doubleValue() is undefined for the type T
			// sum += numbers[i].doubleValue();
			sum += 0;

		return (sum / this.numbers.length);
	}
}

public class NoBoundsExample {
	public static void main(String args[]) {

		Integer intNums[] = { 1, 2, 3, 4, 5 };
		Average<Integer> intObj = new Average<Integer>(intNums);
		double v = intObj.average();
		System.out.println("intObj average is " + v);

	}
}
