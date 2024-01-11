package java_oops_practice;
class Method_overloading_Demo
{
	public static void Name(int a)
	{
		System.out.println("Print a value"+a);
	}
	public static void Name(String a)
	{
		System.out.println("Print name value"+a);
	}

public static void main(String[] args) {
	

Name(1234);
Name("Ammu");
}
}