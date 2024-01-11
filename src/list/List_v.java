package list;

import java.util.Vector;

public class List_v {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Vector
		Vector name=new Vector();
		
		name.add("Lion");
		
		name.add("Tiger");
		
		name.add("Fox");
		
		name.add("Rat");
		
		name.add("Cow");
		
		name.add(0,"Peacock");
		

		System.out.println(name);
		
		System.out.println("size: "+name.size());	//6
		
		System.out.println("capacity: "+name.capacity());	//10
		
		Vector name1=new Vector();
		
//		Adding
		
		name1.add("Dove");
		
		name1.add("Crow");
		
//		name.addAll(name1);	//[Peacock, Lion, Tiger, Fox, Rat, Cow, Dove, Crow]

		name.addAll(0,name1);
		
		System.out.println(name);	//[Dove, Crow, Peacock, Lion, Tiger, Fox, Rat, Cow]
		
//		Retrieval 
		
		System.out.println(name.get(2));	//Peacock
		
//		Removal
		
		System.out.println(name.remove(3));	//Lion
		
		


	}

}
