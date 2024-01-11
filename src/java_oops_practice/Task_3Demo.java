package java_oops_practice;

class Result123{

	private String name;
	public String name1;
	private String StdId;

	private int age;

	Result123(String Pname, int Page, String PName1) {

		this.name = Pname;
		this.age = Page;
		this.name1 = PName1;
	}

	public void print_result_parrent() {

		System.out.println("name value: " + name);
		System.out.println("name value: " + name1);

		System.out.println("age :" + age);

	}
}

class Child_practice124 extends Result123 {

	private String address;
	private int salary;

	public void print_result() {

		System.out.println("address value: " + address);
		System.out.println("salary :" + salary);

	}

	Child_practice124(String Cname, int Cage, String Caddress, int Csalary, String Cname1) {

		super(Cname, Cage, Cname1);
		this.address = Caddress;
		this.salary = Csalary;

	}

}

public class Task_3Demo {

	public static void main(String[] args) {

		Child_practice12 c = new Child_practice12("venky", 24, "guntur", 15000, "Aravind");
		c.print_result_parrent();
		c.print_result();

	}

}