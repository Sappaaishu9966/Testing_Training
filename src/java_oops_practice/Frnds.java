package java_oops_practice;// one parent and two child class is called Hirerachial.

 class Frnds
 {
 public  void kanna ()
  {
System.out.print("Chatting With Me");
  }
 }
 class Bujii extends Frnds
  {
 public void Aishuamma()
{
 System.out.println("Aishu Vedio call me");
}
}
 class Chinu extends Bujii
 {
public void Gold()	
{
System.out.println("Only Smily");
}
 }
  class Forever
 {
public static  void main(String args[])
{
	Bujii B1= new Bujii();
	B1.kanna();
	B1.Aishuamma();
	Chinu C1=new Chinu();
	C1.kanna();
	C1.Gold();
}
 }

	
		  
	 


