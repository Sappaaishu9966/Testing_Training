package java_oops_practice;

 abstract class MyTest 
{ 
   abstract void calculate(int a, int b); // No body. 
} 
 class Addition extends MyTest 
{ 
  public  void calculate(int a, int b)
   { 
      int x = a + b; 
      System.out.println("Sum :" +x); 
   } 
} 
 class Subtraction extends MyTest 
{ 
   public void calculate(int a, int b)
   { 
      int y = a - b; 
      System.out.println("Subtract :" +y); 
   } 
} 
 class Multiplication extends MyTest 
{ 
	 public void calculate(int a, int b)
   { 
      int z = a * b; 
      System.out.println("Multiply :"+z); 
   } 
} 
 class MyClass_1
{ 
public static void main(String[] args) 
{ 
 // Creating objects of classes. 
    Addition a = new Addition(); 
    a.calculate(12, 23);
    Subtraction b=new Subtraction();
    b.calculate(12, 21);
    Multiplication c=new Multiplication();
    c.calculate(12, 10);
      }
}

