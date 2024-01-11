package Mock_1;
/* Write a Java program to create an abstract class Person with abstract methods eat() and exercise(). 
 * Create subclasses Athlete and LazyPerson that extend the Person class and implement the respective
 *  methods to describe how each person eats and exercises.
 */

abstract class Person {
	abstract void eat();
	abstract void exercise();

}
class Athlete extends Person {
	void eat() {
		System.out.println("Safiya");
	}
	void exercise() {
		System.out.println("Aishu " );
	}
}
class LazyPerson extends Person {
	void eat () {
		System.out.println("Bond ");
	}
	void exercise () {
		System.out.println("James ");
	}
}
public class Mock_8_Demo {
	public static void main(String[] args) {
		Athlete a= new Athlete();
		a.eat();
		a.exercise();
		LazyPerson lp = new LazyPerson();
		lp.eat();
		lp.exercise();
	}
}
