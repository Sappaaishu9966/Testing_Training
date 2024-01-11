package java_oops_practice;// one parent class and child is called single level inheritance.

 class Ex1
 {
 public void Oops_1()
 {
System.out.println("very Important");	
 }
}
class Ex2 extends Ex1
 {
 public void Encapulation_1()
 {
 System.out.println("Main Used in projects");
	 }
 }
 public class Inhertance_Demo2
 {
public static void main (String args[])
{
	Ex2 I1= new Ex2();
	I1.Oops_1();
	I1.Encapulation_1();
}
 }
		
