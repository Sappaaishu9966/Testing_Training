package java_oops_practice;

class Laddu
{
	 public  String Name;
	 private long phonum;
	 Laddu(String Name,long phonum)
	 {
		 this.Name=Name;
		 this.phonum=phonum;
	 }
	 public void Print_class()
	 {
		 System.out.println("Name is "+Name);
		 System.out.println("phonum is +"+phonum);
	 }
	 
}
class DD 
{
	public static void main(String[] args)
	{
		Laddu l=new Laddu("MAD",9963382l);
		l.Print_class();
		
	}
}
