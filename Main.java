/* 
-----------------------------------------
|          GeometricObject              |
-----------------------------------------
| - color: String                       |
| - filled: boolean                     |
-----------------------------------------
| + GeometricObject()                   |
| + GeometricObject(color: String,      |
|   filled: boolean)                    |
| + getColor(): String                  |
| + setColor(color: String): void       |
| + isFilled(): boolean                 |
| + setFilled(filled: boolean): void    |
| + toString(): String                  |
| + getArea(): double                   |  <<abstract>>
| + getPerimeter(): double              |  <<abstract>>
-----------------------------------------
         
(extends)

-----------------------------------------
|               Circle                  |
-----------------------------------------
| - radius: double                      |
-----------------------------------------
| + Circle()                            |
| + Circle(radius: double)              |
| + Circle(radius: double,              |
|   color: String, filled: boolean)     |
| + getRadius(): double                 |
| + setRadius(radius: double): void     |
| + getArea(): double                   |
| + getDiameter(): double               |
| + getPerimeter(): double              |
| + equals(o: Object): boolean          |
| + hashCode(): int                     |
| + compareTo(o: Circle): int           |
| + toString(): String                  |
-----------------------------------------
*/
public class Main {
	public static void main(String[] args) {
		// Create three Circle objects
		Circle circle1 = new Circle(5, "red", true);
		Circle circle2 = new Circle(5, "green", false);
		Circle circle3 = new Circle(4, "green", false);

		// Display results
		System.out.println("Circle1 radius: " + circle1.getRadius());
		System.out.println("Circle2 radius: " + circle2.getRadius());
		System.out.println("Circle3 radius: " + circle3.getRadius());

		System.out.println("Circle1 is " + (circle1.equals(circle2) ? "" : "not ") +
			"equal to circle2");

		System.out.println("Circle1 is " + (circle1.equals(circle3) ? "" : "not ") +
			"equal to circle3");
	}
}