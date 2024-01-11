package Mock_1;
/*  Write a Java program to create an abstract class Shape2D with abstract methods draw() and resize(). 
 * Create subclasses Rectangle and Circle that extend the Shape2D class and implement the respective methods
 *  to draw and resize each shape
 */
abstract class Shape2D  {
	abstract void draw ();
	abstract void resize ();
}
class Rectangle extends Shape2D {
	void draw() {
		System.out.println("Rectangle: Draw the Rectangle ");
	}
	void resize() {
		System.out.println("Rectangle: Resizing of Rectangle " );
	}
}
class Circle extends Shape2D {
	void draw () {
		System.out.println("Circle: Draw a Circle ");
	}
	void resize () {
		System.out.println("Circle: Resizing of Circle ");
	}
}
public class Mock_10_Demo {
	public static void main(String[] args) {
		Rectangle r= new Rectangle();
		r.draw();
		r.resize();
		Circle v = new Circle();
		v.draw();
		v.resize();
	}
}



