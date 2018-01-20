package Example8;

/**
 * This class is used to declare a generic constructor inside non-generic class
 * 
 * @author El-Attar
 * @Date 20/01/2018
 * @version 1.0
 */
public class GenericConstructorExample {
	private double value;

	// constructor accepts only numeric values
	public <T extends Number> GenericConstructorExample(T value) {
		this.value = value.doubleValue();
	}

	public void showval() {
		System.out.println("value: " + value);
	}

	public static void main(String args[]) {

		GenericConstructorExample ex = new <Integer>GenericConstructorExample(100);
		GenericConstructorExample ex2 = new <Float>GenericConstructorExample(123.5F);

		// This Won't compile! Types must be same class (T) or sub class of Number (T).
		// GenericConstructorExample ex3 = new <String>GenericConstructorExample("one");

		ex.showval();
		ex2.showval();
	}
}
