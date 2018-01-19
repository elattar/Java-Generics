package example2;

//A simple generic class with two type parameters: T and V. 
class MultiGeneric<T, V> {
	T obj1;
	V obj2;

	// constructor
	MultiGeneric(T obj1, V obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	// Show types of T and V.
	void showTypes() {
		System.out.println("Type of T is " + obj1.getClass().getName());
		System.out.println("Type of V is " + obj2.getClass().getName());
	}

	// returns Object1.
	T getob1() {
		return obj1;
	}

	// returns Object2.
	V getob2() {
		return obj2;
	}
}

public class MultiGenericExample {
	public static void main(String args[]) {
		MultiGeneric<Integer, String> multiGenObj = new MultiGeneric<Integer, String>(50, "Generics");

		// Show the types.
		multiGenObj.showTypes();

		// Obtain and show values.
		int v = multiGenObj.getob1();
		System.out.println("value: " + v);

		String str = multiGenObj.getob2();
		System.out.println("value: " + str);
	}
}
