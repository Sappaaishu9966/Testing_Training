package Mock_1;
abstract class Employe
{
  String Name;
  int Employeid;
  Employe (String Name, int Employeid)
  {
	  this.Name=Name;
	  this.Employeid=Employeid;    
  }
  abstract  double calculateSalary();
  abstract  void displayInfo();
}
class Manager extends Employe 
{
	private double StaringSalary;
	private double BonusSalary;
	Manager(String Name, int Employeid,double StaringSalary,double BonusSalary)
	{
		 super(Name,Employeid);
		 this .BonusSalary=BonusSalary;
		 this.StaringSalary=StaringSalary;
	}
	public double calculateSalary()
	{
	return 	StaringSalary+BonusSalary;
	}
	public void displayInfo()
	{
		System.out.println("Jagu details");
        System.out.println("Name is : "+Name);
        System.out.println("Company ID : "+Employeid);
        System.out.println("StaringSalar"+StaringSalary);
        System.out.println(BonusSalary);
        
	}
}
class Programmer extends  Employe 
{
	private double  Salaryperhour;
	private int   officehours;
	Programmer(double Salaryperhour,int officehours,String Name,int Employeid)
	{
		super(Name,Employeid);
		this.officehours=officehours;
		this.Salaryperhour=Salaryperhour;
		
	}
	public double  calculateSalary()
	{
		return   Salaryperhour*officehours;
	}
	public void displayInfo()
	{
		System.out.println("Aishu details");
        System.out.println(Name);
        System.out.println(Employeid);
        System.out.println(officehours);
        System.out.println(Salaryperhour);	
	}
	
	   
}
public class Program_5 {

	public static void main(String[] args) {
		
		Programmer p1= new Programmer(1600.9, 7,"Sono", 19870);
		p1.displayInfo();
		Manager m1=new Manager("Ammu", 143143, 14700.45,1400);
		m1.displayInfo();
	}

}
