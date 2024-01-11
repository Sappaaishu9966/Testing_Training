package Mock_1;
	
	abstract class Employe_1
	{
	  String Name;
	  int Employeid;
	  Employe_1 (String Name, int Employeid)
	  {
		  this.Name=Name;
		  this.Employeid=Employeid;    
	  }
	  abstract  double calculateSalary();
	  abstract  void displayInfo();
	}
	class Manager_1 extends Employe_1 
	{
		private double StaringSalary;
		private double BonusSalary;
		Manager_1(String Name, int Employeid,double StaringSalary,double BonusSalary)
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
	        System.out.println("StaringSalar: Rs "+StaringSalary);
	        System.out.println("BonusSalary: Rs "+BonusSalary);
	        System.out.println("Total salary: Rs "+calculateSalary());
	        
		}
	}
	class Programmer_1 extends  Employe_1 
	{
		private double  Salaryperhour;
		private int   officehours;
		Programmer_1(String Name, int Employeid,double Salaryperhour,int officehours)
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
	        System.out.println("Name employ:"+Name);
	        System.out.println("Employeid:"+Employeid);
	        System.out.println("officehours:"+officehours );
	        System.out.println("Salaryperhour: Rs "+Salaryperhour);
	        System.out.println("Total salary: Rs "+calculateSalary());	

		}
		
		   
	}
	public class Mock_5_Demo {

		public static void main(String[] args) {
			
			Programmer_1 p1= new Programmer_1("Jaggu", 1614,300, 9);
			p1.displayInfo();
			Manager_1 m1=new Manager_1("Aishu", 143143, 14700.45,1400);
			m1.displayInfo();
		}

	}

