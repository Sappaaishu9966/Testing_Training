package Mock_1;

/*Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume() and calculateSurfaceArea(). 
 * Create subclasses Sphere and Cube that extend the Shape3D class and implement the respective methods to calculate the volume 
 * and surface area of each shape.
 */

abstract class Shape3D {
	abstract double calculateVolume();

	abstract double calculateSurfaceArea();
}

class Sphere extends Shape3D {
	double radius;

	Sphere(double radius) {
		this.radius = radius;
	}

	double calculateVolume() {
		return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	}

	double calculateSurfaceArea() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}
}

class Cube extends Shape3D {
	double sideLength;

	Cube(double sideLength) {
		this.sideLength = sideLength;
	}

	double calculateVolume() {
		return Math.pow(sideLength, 3);
	}

	public double calculateSurfaceArea() {
		return 6 * Math.pow(sideLength, 2);
	}
}

public class Mock_2_Demo {
	public static void main(String[] args) {
		Sphere s = new Sphere(7);
		System.out.println("Sphere volume:" + s.calculateVolume());
		System.out.println("Sphere surfaceArea:" + s.calculateSurfaceArea());
		Cube c = new Cube(6);
		System.out.println("cube volume:" + c.calculateVolume());
		System.out.println("cube surfaceArea:" + c.calculateSurfaceArea());

	}
}