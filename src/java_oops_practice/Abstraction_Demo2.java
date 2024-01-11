package java_oops_practice;
///if a method  doesn't contain any body is called Abstraction method
//It is not possible  to create an object in Abstract method
//If a method contains at least one Abstract method ,Then it is called Abstract class
abstract class Foodapp
{
	abstract public void TypeofFood();
	abstract public void Menu();                       
	public void Listofresturant() 
	{
	System.out.println("leg pices");
	
	}
}
class Hyd extends Foodapp
{
  public void TypeofFood()
  {
	 System.out.println("Dhum Briyani");
  }
  public void Menu()
  {
	  System.out.println("Aishu special meals");
  }
}



public class Abstraction_Demo2 {

	public static void main(String[] args) {
		Hyd a1=new Hyd();
		a1.Menu();
		a1.Listofresturant();
		a1.TypeofFood();
	}

}
