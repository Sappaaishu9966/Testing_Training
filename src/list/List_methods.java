package list;

import java.util.ArrayList;
import java.util.Iterator;
public class List_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	1.	ArrayList
		
		ArrayList<String>Brand= new ArrayList<String>();
		
		Brand.add("Benz");
		
		Brand.add("Ford");
		
		Brand.add("Audi");
		
		Brand.add("Jaguar");
		
		Brand.set(0, "Aravind");

		System.out.println(Brand);	//[Aravind, Ford, Audi, Jaguar]
		
		System.out.println(Brand.remove(0));	//Aravind
		
		System.out.println(Brand.remove(2));	//Jaguar
		
//		Iterator
		
		Iterator<String> itr =Brand.iterator();
		
		while (itr.hasNext()) {
			
		System.out.println(itr.next());  
			
		}
		
//		ArrayList (Integer)		

		ArrayList<Integer>list =new ArrayList<Integer>();
		
		list.add(28);
		
		list.add(143);
		
		list.add(225);
		
		list.add(1010);
		
		System.out.println(list);	//[28, 143, 225, 1010]
		
		System.out.println(list.remove(2));	//225


	}

}
