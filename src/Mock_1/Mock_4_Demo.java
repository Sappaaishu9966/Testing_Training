package Mock_1;
abstract class Animal_A {
	abstract void eat();

	abstract void sleep();
}

class Lion_L extends Animal_A {
	void eat() {
		System.out.println("Lion eats Meat");
	}

	void sleep() {
		System.out.println("Lion sleep on grass land");
	}
}

class Tiger_T extends Animal_A {
	void eat() {
		System.out.println("Tiger eats meat");
	}

	void sleep() {
		System.out.println("Tiger sleep on grassland");
	}
}

class Deer_D extends Animal_A {
	void eat() {
		System.out.println("Deer eats Grass");
	}

	void sleep() {
		System.out.println("deer sleep on grassland");
	}
}

public class Mock_4_Demo {
	public static void main(String[] args) {
		Lion_L l = new Lion_L();
		l.eat();
		l.sleep();
		Tiger_T t = new Tiger_T();
		t.eat();
		t.sleep();
		Deer_D d = new Deer_D();
		d.eat();
		d.sleep();
	}
}
