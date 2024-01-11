package java_oops_practice;

public class Demo_1 {
	

	class Student
	{
		private String name;
		private String surname;
	           int rollNo; 
	Student(String studentName, String studentSurname, int studentRollNo)
	{ 
		this.name= studentName; 
		this.surname = studentSurname; 
		this.rollNo= studentRollNo; 
	} 
	 void getStudentDetails()
	{ 
		System.out.println("The name of the student is "+ this.name +" "+ this.surname); 
		System.out.println("The roll no of the student is "+ this.rollNo); 
	} 
	} 

	  class Private_con_demo1
	{ 
	public void main(String[] args)
	{ 
		Student a1=new Student("Simha","Naidu",143143);
		a1.getStudentDetails();
	} 
	}
}

