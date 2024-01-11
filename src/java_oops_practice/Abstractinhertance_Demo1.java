package java_oops_practice;
///if a method  doesn't contain any body is called Abstraction method
// It is not possible  to create an object in Abstract method
//If a method contains at least one Abstract method ,Then it is called Abstract class
 abstract class Codeing
 {
	abstract void Selenium();
	  public void Testing()
	  {
		System.out.println("Display Testing");  
	  }
}
 class learing extends Codeing{
	 public void Selenium(){
		 System.out.println("Display Selenium");
	 }
 }
public class Abstractinhertance_Demo1 {
	

	public static void main(String[] args) {
		learing l = new learing();
		l.Selenium();
		l.Testing();

	}
	

}
