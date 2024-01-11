package java_oops_practice;

 class Rectangle 
{ 
// Declare instance variables as private in the class. 
   private int length; 
   private int breadth; 

// Declare a constructor Rectangle and define parameters of constructor. 
 Rectangle(int l1, int b1)
 { 
  this.length = l1; 
  this.breadth = b1; 
 } 
// Create a getter method for each private variable. 
public int getLength()
{ 
 return length; 
} 
public int getBreadth()
{ 
 return breadth; 
} 
// Create a setter method for each private variable and define parameter. 
public void setLength(int length)
{ 
 this.length = length; 
} 
public void setBreadth(int breadth)
{ 
 this.breadth = breadth; 
 } 
}

public class RectangleTest 
{ 
public static void main(String[] args)
{ 
// Create an object of class Rectangle and assign values of the parameter used in constructor. 
  Rectangle rt = new Rectangle(20,30); 
  
  Rectangle rt1 = new Rectangle(35,30); 

// Call getter method to read value of variable because we cannot read the value directly due to privacy. 
  int lth = rt.getLength(); 
  int bth = rt.getBreadth(); 

// Calculate area of the rectangle and print it on the console. 
  int Area = lth * bth; 
  System.out.println("Area: " +Area); 

  
  int lth1 = rt1.getLength(); 
  int bth1 = rt1.getBreadth(); 

// Calculate area of the rectangle and print it on the console. 
  int Area1 = lth1 * bth1; 
  System.out.println("Area1: " +Area1);
// Let's update the new value of variable using setter method. 
  rt.setLength(50); 
  rt.setBreadth(60); 

// Call getter method to read the updated value. 
  int ln = rt.getLength(); 
  int br = rt.getBreadth(); 
  int newArea = ln * br; 
 System.out.println("New area: " +newArea); 
 } 
}
