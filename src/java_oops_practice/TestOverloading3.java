package java_oops_practice;

class Adder {
	static int add(int a) {
		return a+20 ;
	}
	static double add(double b) {
		return b+10.5 ;
	}
	static double add(int a,double b) {
		return a+10+5 ;
	}

	static double add(int a, int b,int c) {
		return a + b+c-b;
	}
}

public class TestOverloading3 {
	public static void main(String[] args) {
		System.out.println(Adder.add(11, 11.22));
		System.out.println(Adder.add(11, 11,11));
		System.out.println(Adder.add(11, 11));
		System.out.println(Adder.add(11));
		// ambiguity
	}
}