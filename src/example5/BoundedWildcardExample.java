package example5;

// Demonstrate a bounded wildcard. 
/**
 * Bounded Wildcard arguments <br>
 * This class holds an array of coordinate objects.<br>
 * Notice that Coords specifies a type parameter bounded by Point.<br>
 * This means that any array stored in a Coords object will contain objects of type Point or one of its subclasses.
 * 
 * @author El-Attar
 * @Date 14/01/2018
 * @version 1.0
 */
class Coords<T extends Point> {
	T[] coords;

	public Coords(T[] o) {
		coords = o;
	}
}

public class BoundedWildcardExample {

	/**
	 * It states that the ? can match any type as long as it is Point, or a class derived from Point.
	 * 
	 * @param c
	 */
	public void showXY(Coords<?> c) {
		System.out.println("X Y Coordinates:");
		for (int i = 0; i < c.coords.length; i++)
			System.out.println(c.coords[i].x + " " + c.coords[i].y);
		System.out.println();
	}

	/**
	 * It states that the ? can match any type as long as it is Triangle, or a class derived from Triangle. <br>
	 * It can be called by Coords<Square>[subclass] ot Coords<Triangle>[class itself], <br>
	 * but we can't call it by Coords<Point> as it gives compile time error.
	 * 
	 * @param c
	 */
	public void showXYZ(Coords<? extends Triangle> c) {
		System.out.println("X Y Z Coordinates:");
		for (int i = 0; i < c.coords.length; i++)
			System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
		System.out.println();
	}

	/**
	 * It states that the ? can match any type as long as it is Square, or a class derived from Square.
	 * 
	 * @param c
	 */
	public void showAll(Coords<? extends Square> c) {
		System.out.println("X Y Z T Coordinates:");
		for (int i = 0; i < c.coords.length; i++)
			System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].w);
		System.out.println();
	}

	public static void main(String args[]) {
		BoundedWildcardExample bwe = new BoundedWildcardExample();

		Point points[] = { new Point(0, 0), new Point(2, 3), new Point(1, 5), new Point(1, 5) };
		Coords<Point> pointsCoords = new Coords<Point>(points);

		System.out.println("Contents of pointsCoords.");
		// since all classes super and subclasses has x and y so it will print
		bwe.showXY(pointsCoords);
		// bwe.showXYZ(pointsCoords); // Error, not a triangle
		// bwe.showAll(pointsCoords); // Error, not a square

		System.out.println("Contents of trianglesCoords.");
		Triangle triangles[] = { new Triangle(1, 2, 3), new Triangle(6, 7, 8), new Triangle(9, 0, 1) };
		Coords<Triangle> trianglesCoords = new Coords<Triangle>(triangles);
		// since all classes super and subclasses has x and y so it will print
		bwe.showXY(pointsCoords);
		// since it is triangle so it supports.
		bwe.showXYZ(trianglesCoords);
		// bwe.showAll(pointsCoords); // Error, not a square

		System.out.println("Contents of squareCoords.");
		Square squares[] = { new Square(1, 2, 3, 4), new Square(5, 6, 7, 8), new Square(9, 7, 4, 1), new Square(5, 3, 2, 1) };
		Coords<Square> squareCoords = new Coords<Square>(squares);
		// These are all OK.
		bwe.showXY(squareCoords);
		bwe.showXYZ(squareCoords);
		bwe.showAll(squareCoords);
	}
}
