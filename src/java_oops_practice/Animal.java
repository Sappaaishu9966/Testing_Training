package java_oops_practice;

class Animal
  {
  public void Eat()
  {
  System.out.println("Animal Eats");
  }
  }
  class Dog extends Animal
  {
   public void Brak()	
   {
   System.out.println("Dog Brak");
   }
   }
  class cat extends Dog
  {
  public void Meow()
	{
  System.out.print("Cat Meow");
	}
    }
   class Forest_2
  {
	public static void main(String args[])
	{
	cat c1= new cat();
	c1.Eat();
	c1.Brak();
	c1.Meow();
	}
}
	
	
	
	
  