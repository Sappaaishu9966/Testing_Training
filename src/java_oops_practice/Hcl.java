package java_oops_practice;

 class Job {
	 private String name;
	 private int age ;
	 Job(String name,int age)
	 {
		this.name=name;
		this.age=age;

	 }
     public void EmployeJob() {
    	 System.out.println("name:"+name);
    	 System.out.println("age: " +age);
     }
 }
 class Tcs extends Job{
	 private int id;
	 private int rollno;
	 Tcs(String name,int age,int id ,int rollno){
		 super(name,age);
		 this.id=id;
		 this.rollno=rollno;
		 
	 }
	  public void ItLife() {
		  System.out.println("id: "+id);
		  System.out.println("rollno:"+rollno);
	  }
 }
 public class Hcl{
	public  static void main(String[] args) {
		Tcs t =new Tcs("name",19,1997,11112222);
         t.EmployeJob();
         t.ItLife();
         
	}

}
 
