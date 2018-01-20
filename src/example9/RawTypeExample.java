package example9;

/**
 * This class is used to declare a generic class with raw type.
 * 
 * @author El-Attar
 * @Date 20/01/2018
 * @version 1.0
 */
class GenericClass<T> {
	// declare an object of type T
	T object;

	public GenericClass(T obj) {
		object = obj;
	}

	public T getob() {
		return object;
	}
}

public class RawTypeExample {
	public static void main(String args[]) {

		// Create a GenericClass object for Integers.
		GenericClass<Integer> intObj = new GenericClass<Integer>(50);
		int value = intObj.getob(); // no need to cast as the type is known
		System.out.println("value: " + value);

		// Create a GenericClass object for Strings.
		GenericClass<String> stringObj = new GenericClass<String>("Generics string");
		String value2 = stringObj.getob(); // no need to cast as the type is known
		System.out.println("value: " + value2);

		// Create a raw-type GenericClass object and give it a Double value.
		// you can see there is a warning says "GenericClass is a raw type. References to generic type GenericClass<T> should be parameterized"
		GenericClass raw = new GenericClass(Double.valueOf(20.5));

		// Cast here is necessary because type is unknown.
		double d = (Double) raw.getob();
		System.out.println("value: " + d);

		// The use of a raw type can lead to run-time exceptions. Here are some examples.

		// The following cast causes a run-time error! as it is double value want to store it in int.
		// int i = (Integer) raw.getob(); // run-time error

		// This assigment overrides type safety as no compilation error while storing unknown type to string type variable
		stringObj = raw;
		// String str = strOb.getob(); // run-time error as you want to save double in string

		// This assingment also overrides type safety as you store known value (int) to unknown type variable (raw)
		raw = intObj; // OK, but potentially wrong
		// d = (Double) raw.getob(); // run-time error as you want to save int in double
	}
}
