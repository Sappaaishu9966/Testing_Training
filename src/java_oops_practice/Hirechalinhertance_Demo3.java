package java_oops_practice;
class Chrani{
	public void Joing()
	{
		System.out.println("Govinndha");
	}
}
class Teamlead extends Chrani{


	public void Name()
	{
		System.out.println("Prasanth");
	}
}
class MD extends Chrani{
	public void Behaviour()
	{
		System.out.println("No Response");
	}
}

public class Hirechalinhertance_Demo3 {

	public static void main(String[] args) {
	
MD M = new MD();
M.Behaviour();
M.Joing();
Teamlead T = new Teamlead();	
T.Name();
T.Joing();


	}
}
