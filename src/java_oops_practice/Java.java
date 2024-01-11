package java_oops_practice;// one parent class and child is called single level inheritance.

 class Java
 {
 public void Oops()
 {
System.out.println("very Important");	
 }
}
class Abstract extends Java
 {
 public void Encapulation()
 {
 System.out.println("Main Used in projects");
	 }
 }
 class Famliy
 {
public static void main (String args[])
{
	Abstract I1= new Abstract();
	I1.Oops();
	I1.Encapulation();
}
 }
		


	
 
 
 