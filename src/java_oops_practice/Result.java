package java_oops_practice;



class Sunny {
	 private String name;
	 private int age;
	 
	 Sunny(String Pname,int Page){
		 this.name=Pname;
		 this.age=Page;
		 
	 }
	 public void print_result_Sunny() {
		 System.out.println("name value: "+name);
		 System.out.println("age:"+age);
	 }
}

class Bunny extends Sunny {
	  
	 private String address;
	 private int salary;
	 
	 Bunny(String Bname,int Bage,String Baddress,int Bsalary){
		 
		 super(Bname,Bage);
		 this.address=address;
		 this.salary=salary;
		 
	 }
	 public void print_result(){
		 System.out.println("address value: "+address);
		 System.out.println("salary:  "+salary);
		 
	 }
}

public class Result{
	 public static void main(String[] args) {
		 
		 Bunny b = new Bunny("sunil",25,"vizag",20000);
		 b.print_result_Sunny();
		 b.print_result();
	}
}