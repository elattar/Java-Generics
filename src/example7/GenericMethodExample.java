package example7;

/**
 * This class is used to declare a generic method inside non-generic class
 * 
 * @author El-Attar
 * @Date 20/01/2018
 * @version 1.0
 */
public class GenericMethodExample {

	/**
	 * This method check if object is exists in array or not.<br>
	 * The main difference in declaring generic method the type parameter is added before return type<br>
	 * Comparable is an interface declared in java.lang where class that implements Comparable defines objects that can be ordered.<br>
	 * since Comparable<T> is generic and need to define the type of object it will order so we use T type parameter <br>
	 * since we want to order same class or any subclass so we used V extends T which accepts class T and any subclass of T.
	 * 
	 * @param object
	 * @param array
	 * @return
	 */
	public <T extends Comparable<T>, V extends T> boolean objectExists(T object, V[] array) {
		for (int i = 0; i < array.length; i++) {
			if (object.equals(array[i]))
				return true;
		}
		return false;
	}

	public static void main(String args[]) {

		// Initialize class object
		GenericMethodExample gme = new GenericMethodExample();

		// Define array of Integers.
		Integer nums[] = { 1, 2, 3, 4, 5 };

		if (gme.objectExists(3, nums))
			System.out.println("2 is in nums");

		if (!gme.objectExists(7, nums))
			System.out.println("7 is not in nums");

		System.out.println();

		// Define array of Strings.
		String strings[] = { "one", "two", "three", "four", "five" };

		if (gme.objectExists("two", strings))
			System.out.println("two is in strs");

		if (!gme.objectExists("seven", strings))
			System.out.println("seven is not in strs");

		// This Won't compile! Types must be same class (T) or sub class of String (T).
		if (gme.objectExists("two", nums))
			System.out.println("two is in strs");
	}
}
