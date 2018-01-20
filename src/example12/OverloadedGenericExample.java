package example12;

/**
 * This class is used to overload its method.
 * 
 * @author El-Attar
 * @Date 20/01/2018
 * @version 1.0
 */
public class OverloadedGenericExample<T, V> {
	private T object1;
	private V object2;

	// These two overloaded methods are ambiguous giving compile-time error!!
	public void set(T obj) {
		object1 = obj;
	}

	public void set(V obj) {
		object2 = obj;
	}
}
