package example1;

/**
 * This class shows an example of how to use generic (simple example). <br>
 * 'T' is a type parameter that will be replaced by a real type when an object of type Generic is created.
 * 
 * @author El-Attar
 * @Date 14/01/2018
 * @version 1.0
 */
class Generic<T> {
	// declare an object of type T
	private T obj;

	// the constructor takes a reference to an object of type 'T' as a parameter
	Generic(T obj) {
		this.obj = obj;
	}

	// returns Object.
	public T getObj() {
		return obj;
	}

	// Show type of obj.
	public void showType() {
		System.out.println("Type of T is " + obj.getClass().getName());
	}
}

public class GenericExample {
	public static void main(String args[]) {
		// Create a Generic reference for Integers.
		Generic<Integer> intObj;

		// Create a Generic<Integer> object and assign its reference to intObj.
		// Don't forget the use of autoboxing to encapsulate the value 50 within an Integer object.
		intObj = new Generic<Integer>(50);

		// compilation error as we declared it with integer type so can't refer to double object
		// intObj = new Generic<Double>(88.0);

		// compilation error as we can't use primitive type, pass only any class type
		// Generic<int> intOb = new Generic<int>(53);

		// Show the type of data used by intObj.
		intObj.showType();

		// Get the value of intObj.
		// no cast is needed.
		int v = intObj.getObj();
		System.out.println("value: " + v);

		// Create a Generic object for Strings.
		Generic<String> strObj = new Generic<String>("Generic String");

		// Show the type of data used by strObJ.
		strObj.showType();

		// Get the value of strObJ. Again, no cast is needed.
		String str = strObj.getObj();
		System.out.println("value: " + str);

		// compilation error cant convert from Generic<String> to Generic<Integer>
		// so it helps me to not have a run-time error
		// intObj = strObj;
		// v = (Integer) strObj.getObj();
	}
}
