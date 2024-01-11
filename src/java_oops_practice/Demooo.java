package java_oops_practice;

//implementation of abstraction through abstract class 
abstract class Animal_123{

	 void eat(){
		System.out.println("The animal is eating.");
	}

	Animal_123() {
		System.out.println("An Animal is going to be created.");
	}
	abstract void walk();
}

class Cow extends Animal_123 {
	Cow() {
		System.out.println("You have created a Cow");
	}

	void walk() {
		System.out.println("Cow is walking.");
	}
	
}

class Goat extends Animal_123 {
	Goat() {
		System.out.println("You have created a Goat");
	}

	void walk() {
		System.out.println("Goat is walking.");
	}
}

public class Demooo {
	public static void main(String args[]) {
		Cow Goat = new Cow();

		Goat goat = new Goat();
		goat.walk();
		goat.eat();
	}
}