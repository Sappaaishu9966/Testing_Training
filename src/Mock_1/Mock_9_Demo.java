package Mock_1;
/* Write a Java program to create an abstract class Instrument with abstract methods play() and tune().
 *  Create subclasses for Glockenspiel and Violin that extend the Instrument class and implement the 
 *  respective methods to play and tune each instrument.
 */

abstract class Instrument {
	abstract void play ();
	abstract void tune ();
}
class Glockenspiel extends Instrument {
	void play() {
		System.out.println("Safiya");
	}
	void tune() {
		System.out.println("Aishu " );
	}
}
class Violin extends Instrument {
	void play () {
		System.out.println("Bond ");
	}
	void tune () {
		System.out.println("James ");
	}
}
public class Mock_9_Demo {
	public static void main(String[] args) {
		Glockenspiel g= new Glockenspiel();
		g.play();
		g.tune();
		Violin v = new Violin();
		v.play();
		v.tune();
	}
}
