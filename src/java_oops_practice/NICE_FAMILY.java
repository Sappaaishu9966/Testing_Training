package java_oops_practice;

 class Dad
  {
	 public void Father()
	 {
		System.out.println("Simha"); 
	 }
  }
 class Mother extends Dad
   {
	public void Mommy()
	{
		System.out.println("Dhamha");
	}
   }
 class Son extends Mother 
 {
	public void Sonname()
	{
		System.out.println("Jagu");
	}
 }
 public class NICE_FAMILY
     {
	public  void main(String[] args)
	   {
			Son s = new Son();
			s.Father();
			s.Mommy();
			s.Sonname();
		}
	  }
     
	
	 
  
 
