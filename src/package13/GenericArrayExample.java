package package13;

class GenericClass<T extends Number> {
	private T object;
	private T values[]; // OK

	GenericClass(T obj, T[] nums) {
		this.object = obj;

		// can't create an array of T
		// values = new T[10];

		// But, this statement is right, to assign reference to existent array
		values = nums;
	}
}

public class GenericArrayExample {
	public static void main(String args[]) {
		Integer nums[] = { 1, 2, 3, 4, 5 };

		GenericClass<Integer> iOb = new GenericClass<Integer>(50, nums);

		// Can't create an array of type-specific generic references.
		// GenericClass<Integer> GenericClass[] = new GenericClass<Integer>[10];

		// This is OK.
		GenericClass<?> generic[] = new GenericClass<?>[10];
	}
}
