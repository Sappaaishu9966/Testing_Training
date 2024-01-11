package java_oops_practice;

 class Methodoverloading_Demo2 {
public static void classA(int a,int b)
{
	System.out.println("print a and b values "+a+b);
}
public void classA(String a,String b,String c)
{
	System.out.println("print a and b and c values "+a+b+c);
	
}
public static void main(String[] args) {
	classA(123,234);
	Methodoverloading_Demo2 ref=new Methodoverloading_Demo2();
	ref.classA("Ammu","Aishu","dhamayanthi");
}
}
