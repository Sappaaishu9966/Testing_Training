package java_oops_practice;
class Moblie
{
	public void Smg()
	{
		System.out.println("Qualtiy Good");
	
	}
	}
class Myphone extends Moblie
{
	public void Realme()
	{
System.out.print("Nice phone");
	}
	}
class Smile extends Myphone

{
	public void  Iphone()
	{
		System.out.print("I hate phones");
	}
	
	}
public class Mutipleinhertance_Demo2 {

	public static void main(String[] args) {
		Smile s = new  Smile();
		s.Iphone();
		s.Realme();
		s.Smg();
	}
}


	
