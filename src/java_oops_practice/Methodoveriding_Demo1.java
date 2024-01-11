package java_oops_practice;

class MAD {// this one class creation 
	public static void Name(int a)// this one static method creation 
	{
		System.out.println("I love movie in mad" + a);// implemention 
	}

}

class Vennala extends MAD {// this  is child class. 
	public void Name(String a) {// this one non static  method
		System.out.println("nice vennala character" + a); // implemention
	}
}

class Methodoveriding_Demo1 {// main class also

	public static void main(String[] args) {//
		Vennala V = new Vennala();// For creating an object we cannot Access not Static method in side the Static class
		V.Name("Nice");
		V.Name(123);//calling the Static and non-Static methods in the Object creation.
		

	}

}
//  Method Over=loading 
/* we create methods with same name and different arguments types is called as Method Over-loading*/
/* we create methods with same name and different class is called method Over-overiding*/