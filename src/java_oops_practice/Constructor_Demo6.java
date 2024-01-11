package java_oops_practice;
class Nanna
{
	private String Name;
	private long Adharanumber;
	 public void Hero()
	 {
		 int a=10;
		System.out.println("display a value "+a); 
	 }
	 public  void Naidu()
	 {
		 float b=2.3f;
		 System.out.println("display  the float number"+b);
		 
	 }
	 Nanna(String Name,long Adharanumber){
		 this.Name=Name;
		 this.Adharanumber=Adharanumber;
		 
	 }
	 
	 
	 public String getName()
	 {
		return Name; 
	 }
	 public long getAdharanumber()
	 {
		return Adharanumber ;
	 }
}

public class Constructor_Demo6 {

	public static void main(String[] args) {
		Nanna N = new Nanna("I love my Nana", 1234567899987654l);
		N.Naidu();
		N.Hero();
		System.out.println(N.getAdharanumber()+"\n"+N.getName());

	}

}
