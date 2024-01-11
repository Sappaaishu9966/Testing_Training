package java_oops_practice;
//Abstraction--
//1.If a method doesn't contain any body is called Abstraction method
//2.It is not possible to create an object in Abstraction class
//3.if a method contains atleast one Abstract method ,then it is called abstaract class
//4.we will implement the code in different classes

 abstract class Bigfan
{
	abstract public void fav();
	abstract public void Hubbies() ;
	

	public void Name()
	{
		System.out.println("Anushashetty");
	
	  System.out.println("I love Smiley");	
	}
}
	class Smiley extends Bigfan
	{
		public void Hubbies() 
		{
			System.out.println("I love sarres");
		}
		public void fav()
		{
			System.out.println("Anu baby");
		}
	}
	



public class Abstract_Demo3
{
  public static void main(String[] args)
  {
	Smiley S =  new Smiley();
	S. fav();
	S.Hubbies();
	
}
  
}
