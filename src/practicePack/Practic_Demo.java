package practicePack;


class Rectangle_r {
// Declare instance variables as private in the class. 
private int length; 
private int breadth; 

// Declare a constructor Rectangle and define parameters of constructor. 
Rectangle_r(int length,int breadth){ 
this.length= length;
this.breadth = breadth; 
} 
// Create a getter method for each private variable. 
public int getLength() {
return length;
}
public int getBreadth()
{ 
return breadth; 
} 
}
public class Practic_Demo 
{
public static void main(String[] args) {
	Rectangle_r R = new Rectangle_r(10, 101);
	R.getLength();
	R.getBreadth();
	System.out.println(R.getLength());
	System.out.println(R.getBreadth());
	
}	
}


