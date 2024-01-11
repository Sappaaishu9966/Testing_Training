package java_oops_practice;//question Two private methods and one NOrmal method using the constuctor call the methods in main class..?
class Dhamhayanthi
{
	private String Name;
	private int Favnum;
	public void Phonenumber()
	{
		System.out.println("9963636450");
	}
 public Dhamhayanthi(String Name,int Favnum)
	{
		this.Name=Name;
		this.Favnum=Favnum;	  
	}
	public String getName()
	{
	return Name;	
	}
	public int getFavnum()
      { 
		return Favnum;
		}

	
}
 
public class Constructonr_Demo5 {

	public static void main(String[] args) {
		Dhamhayanthi a1=new Dhamhayanthi("Aishu", 7);
		a1.Phonenumber();
		System.out.println(a1.getName()+"\n"+a1.getFavnum());
		

	}

}
