package Mock_1;

abstract class Shape3D_1{
	abstract double calculateVolume();

	abstract double calculateSurfaceArea();
}

class Sphere_1 extends Shape3D_1{
	double radius;

	Sphere_1(double radius) {
		this.radius = radius;
	}

	double calculateVolume() {
		return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	}

	double calculateSurfaceArea() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}
}

class Cube_1 extends Shape3D_1 {
	double sideLength;

	Cube_1(double sideLength) {
		this.sideLength = sideLength;
	}

	double calculateVolume() {
		return Math.pow(sideLength, 3);
	}

	public double calculateSurfaceArea() {
		return 6 * Math.pow(sideLength, 2);
	}
}

public class Mock_6_Demo {
	public static void main(String[] args) {
		Sphere_1 s = new Sphere_1(5);
		System.out.println("Sphere volume:" + s.calculateVolume());
		System.out.println("Sphere surfaceArea:" + s.calculateSurfaceArea());
		Cube_1 c = new Cube_1(6);
		System.out.println("cube volume:" + c.calculateVolume());
		System.out.println("cube surfaceArea:" + c.calculateSurfaceArea());
	}
}