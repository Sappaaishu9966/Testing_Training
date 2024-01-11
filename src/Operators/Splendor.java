package Operators;


class SBI  {
	public void getRateOfInterest() {
//		return 8.4f;
		System.out.println("i am looking simple");
	}
	public void getRateOfInterest(int a) {
//		return 8.4f;
		System.out.println("hi i am bank class  "+a);
		
	}
	public void getRateOfInterest(int a ,int b) {
//		return 8.4f;
		System.out.println("hitwo argument method  "+(a+b));
	}
	public void getRateOfInterest(double a) {
//		return 8.4f;
		System.out.println("hi argument method  "+(a));
	}
}


public class Splendor {
	public static void main(String args[]) {
		SBI b1=new SBI();
		b1.getRateOfInterest();
		b1.getRateOfInterest(35.5);
//		
	}
}
