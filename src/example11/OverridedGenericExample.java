package example11;

/**
 * This class is a parent that used to override its method.
 * 
 * @author El-Attar
 * @Date 20/01/2018
 * @version 1.0
 * @param <T>
 */
class FirstGenericClass<T> {
	// declare an object of type T
	T object;

	FirstGenericClass(T obj) {
		object = obj;
	}

	T getObj() {
		System.out.print("FirstGenericClass getob(): ");
		return object;
	}
}

class SecondGenericClass<T> extends FirstGenericClass<T> {
	SecondGenericClass(T obj) {
		super(obj);
	}

	// Override getob().
	T getObj() {
		System.out.print("SecondGenericClass's getob(): ");
		return object;
	}
}

public class OverridedGenericExample {
	public static void main(String args[]) {

		// Create a FirstGenericClass object for Integers.
		FirstGenericClass<Integer> intObject = new FirstGenericClass<Integer>(10);

		// Create a SecondGenericClass object for Integers.
		SecondGenericClass<Integer> intObject2 = new SecondGenericClass<Integer>(20);

		// Create a SecondGenericClass object for Strings.
		SecondGenericClass<String> strObject = new SecondGenericClass<String>("Generics string");

		System.out.println(intObject.getObj());
		System.out.println(intObject2.getObj());
		System.out.println(strObject.getObj());
	}
}
