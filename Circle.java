public class Circle extends GeometricObject implements Comparable<Circle> {
	private double radius;

	// Construct a default circle
	public Circle() {
		this.radius = 1;
	}
	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	// Return radius
	public double getRadius() {
		return radius;
	}

	//Set a new radius
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override // Return area
	public double getArea() {
		return radius * radius * Math.PI;
	}

	// Return diameter 
	public double getDiameter() {
		return 2 * radius;
	}
	
	// Return perimeter
	@Override 
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	//Return true if objects radii are the same
	@Override 
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Circle circle = (Circle) o;
		return Double.compare(circle.radius, radius) == 0;
	}

	@Override
	public int hashCode() {
		return Double.hashCode(radius);
	}

	// Implement compareTo method
	@Override 
	public int compareTo(Circle o) {
		if (this.radius > o.radius)
			return 1;
		else if (this.radius < o.radius)
			return -1;
		else
			return 0;
	}

	//Implement the toString method in GeometricObject
	@Override 
	public String toString() {
		return super.toString() +
			"\nRadius: " + radius;
	}
}
