package java_oops_practice;

class  Parrent_practice{
	private String name;
	private int age;
	private int StudentRollNo;
	private int StudentID;
	public int  getStudentRollNo()
	{
		return StudentRollNo;
	}
	public int  getStudentID()
	{
		return StudentID;
		
	}
	public void setStudentRollNo(int string )
	{
		this.StudentRollNo=string;  //this keyword refers to Current Object
	}
	public void setStudentID( int StudentID) 
	{
		this.StudentID=StudentID;
	}

//  2 type use  (get&method,constructor)
	Parrent_practice(String Cname,int Cage){//this the constructor throw call name dooraa call cheyasthamuu..
		this.name=Cname;
		this.age=Cage;
	}

	
public void print_result_parrent() {// get place oka normal  method create cheysaie ,akkadnuchie printh cheysathamuu
		
		System.out.println("name value: "+name);//direct ga name and age ni call cheysthamu
		System.out.println("age :"+age);
		
		
	}
}


class Child_practice extends Parrent_practice {//methods and varibles  acess cheyukothammu child class loo ki
	
	private String address;
	private int salary;
	
	Child_practice(String Cname,int Cage,String Caddress,int Csalary ){
	//  3 type (super keyword)	 
		super(Cname, Cage);
//      superkeyword --//child class to parent class ki call cheysathamu.
//		1.acess immediately parent class constructores
//		2 acess immediately parent class methods
//		3.access immediately parent class varaibles
		this.address=Caddress;
		this.salary=Csalary;
		
		
	}
	
	public void print_result() {
		
		System.out.println("address value: "+address);
		System.out.println("salary :"+salary);
	
		
	}

	public void setStudentRollNo(String string) {
		// TODO Auto-generated method stub
		
	}
}

public class Task_2Demo {

	
	public static void main(String[] args) {
		
		Child_practice c=new Child_practice("venky",24,"guntur",15000);
		c.print_result_parrent();
		c.print_result();
		c.setStudentID(6540);
		c.setStudentRollNo("12345@");
		c.getStudentID();
		c.getStudentRollNo();
		System.out.println("STDID "+c.getStudentID());
		System.out.println("STDROLLNUM "+c.getStudentRollNo());
		
	}

}
	