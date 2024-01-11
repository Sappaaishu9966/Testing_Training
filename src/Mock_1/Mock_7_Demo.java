package Mock_1;
/*Write a Java program to create an abstract class Vehicle with abstract methods startEngine() and stopEngine(). 
 * Create subclasses Car and Motorcycle that extend the Vehicle class and implement the respective methods to 
 * start and stop the engines for each vehicle type.
 */

abstract class Vehicle {
	abstract void startEngine();

	abstract void stopEngine();
}

class Car extends Vehicle {
	void startEngine() {
		System.out.println("Car: start engine");
	}

	void stopEngine() {
		System.out.println("Car: stop engine");
	}
}

class Motorcycle extends Vehicle {
	void startEngine() {
		System.out.println("Motorcycle: start engine ");
	}

	void stopEngine() {
		System.out.println("Motorcycle: Stop engine ");
	}
}

public class Mock_7_Demo {
	public static void main(String[] args) {
		Car c = new Car();
		c.stopEngine();
		c.stopEngine();
		Motorcycle m = new Motorcycle();
		m.startEngine();
		m.stopEngine();

	}
}
