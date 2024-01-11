package java_oops_practice;
import java.util.Vector;

public class vpracties {

	public static void main(String[] args) {
		//size =number of elements in list
		//capacity=array capacity
		Vector v1 =new Vector();
		v1.add("srikanth");
		v1.add("suni");
		v1.add(0,"safi");
		v1.add("aravind");
		v1.add("hema");
		v1.add("poojie");
		v1.add("jagu");
//		v1.add("Y1");
//		v1.add("y2");
//		v1.add("y3");
//		v1.add("y20");
//		v1.add("srikanth");
//		v1.add("suni");
//		v1.add(0,"safi");
//		v1.add("aravind");
//		v1.add("hema");
//		v1.add("poojie");
//		v1.add("jagu");
//		v1.add("Y1");
//		v1.add("y2");
//		v1.add("y3");
//		v1.add("y20");
//		v1.add("srikanth");
//		v1.add("suni");
//		v1.add(0,"safi");
//		v1.add("aravind");
//		v1.add("hema");
//		v1.add("poojie");
//		v1.add("jagu");
//		v1.add("Y1");
//		v1.add("y2");
//		v1.add("y3");
//		v1.add("srikanth");
//		v1.add("suni");
//		v1.add(0,"safi");
//		v1.add("aravind");
//		v1.add("hema");
//		v1.add("poojie");
//		v1.add("jagu");//this is all about size and capacity program
//		System.out.print("size: "+v1.size());
//		System.out.print("capacity: "+v1.capacity());
		
		Vector v2 =new Vector();
		v2.add("jagu");
		v2.add("srikanth");
		System.out.print(v1);
		v1.addAll(0,v2);
		System.out.println(v1);
		System.out.println(v1.get(2));// v1 value andie get() test lo added cheysathamuu// additional elements list
		//output 2 lo safi printed
		
		
		

		
		
	
		
		
		
		

	}

}
