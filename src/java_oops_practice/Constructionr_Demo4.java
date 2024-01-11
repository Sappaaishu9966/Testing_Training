package java_oops_practice;
class Life{ //constructors  name contains same as class name

    private String Name;
	private int Num;
//public	Life (String Name,int Num)// constructors creations ,only set values in assing(stringname,intnum)
//	{
//		this.Name=Name;// this keyword current object declerations
//		this.Num=Num;
//	}
	
	public String getName()
	{
		return Name;
	}
	public int getNum()
	{
		return Num;
	}
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public void setNum(int Num)
	{
		this.Num=Num;
	}
	
}
class child_class extends Life
{
	 private String StdID;
	 private int Stdrollnum;	
	 private String stdname;
	 private int stdfav;
	 public String getStdID()
	 {
		 return StdID;
	 }
	 public int getStdrollnum()
	 {
		 return Stdrollnum;
	 }
	 public String getstdname()
	 {
		 return stdname;
		 
	 }
	 public int getstdfav()
	 {
		 return stdfav;
	 }
	 public void setStdID(String StdID)
	 {
		 this.StdID=StdID;
	 }
	 public void setStdrollnum(int Stdrollnum)
	 {
		 this.Stdrollnum=Stdrollnum;
	 }
	 public void setstdname(String stdname)
	 {
		 this.stdname=stdname;
	 }
	 public void setstdfav(int stdfav)
	 {
		 this.stdfav=stdfav;
	 }
}
public class Constructionr_Demo4 {

	public static void main(String[] args) {
		child_class a1=new child_class();
	a1.setName("HoneyBee");
	a1.setNum(1212);
	a1.setstdfav(79);
	a1.setStdID("Y193250320");
	a1.setstdname("Aishu");
	a1.setStdrollnum(12345);
	
	System.out.println(a1.getNum());
	System.out.println(a1.getName());
	System.out.println(a1.getstdfav());
	System.out.println(a1.getStdID());
	System.out.println(a1.getstdname());
	System.out.println(a1.getStdrollnum());

	}

}
