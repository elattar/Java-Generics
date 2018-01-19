package example1;

/**
 * This class shows an example of how to use object as generic case
 * 
 * @author El-Attar
 * @Date 14/01/2018
 * @version 1.0
 */
class NonGeneric {
	// obj is of type 'Object' superclass of all objects
	private Object obj;

	// the constructor takes a reference to an object as a parameter
	public NonGeneric(Object obj) {
		this.obj = obj;
	}

	// returns Object.
	public Object getObj() {
		return obj;
	}

	// Show type of obj.
	public void showType() {
		System.out.println("Type of object is " + obj.getClass().getName());
	}
}

public class NonGenericExample {

	public static void main(String args[]) {
		// Create NonGeneric Object and store an Integer in it.
		// 50 is casted from primitive type (int) to Object type Integer (called autoboxing)
		NonGeneric intObj = new NonGeneric(50);

		// Show the type of data used by intObj.
		intObj.showType();

		// Get the value of intObj.
		// The first problem we face is we need to cast the returned value.
		int v = (Integer) intObj.getObj();
		System.out.println("value: " + v);

		// Create another NonGen object and store a String in it.
		NonGeneric strObj = new NonGeneric("Non-Generic String");

		// Show the type of data used by strObj.
		strObj.showType();

		// Get the value of strObj and again, we need to cast the returned value.
		String str = (String) strObj.getObj();
		System.out.println("value: " + str);

		// The second problem:
		// assign string object to integer object! and it never gives compilation error
		intObj = strObj;
		// while casting string object to integer to store it, run time error
		v = (Integer) strObj.getObj();
	}
}
