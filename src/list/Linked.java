package list;

import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Linked List
		
		LinkedList<String> Fruits =new LinkedList<String>();
		
		Fruits.add("Apple");
		
		Fruits.add("Banana");
		
		Fruits.add("Mango");
		
		Fruits.add("Coconut");


		System.out.println(Fruits);	//[Apple, Banana, Mango, Coconut]
		
//		Addition of elements from list
		
		Fruits.add(2,"Strawberry");	//[Apple, Banana, Strawberry, Mango, Coconut]
		
		Fruits.addFirst("Grapes");	//[Grapes, Apple, Banana, Mango, Coconut]
		
		Fruits.addLast("Orange");	//[Apple, Banana, Mango, Coconut, Orange]

//		Retrieval of elements from list
		
		System.out.println(Fruits.getFirst());	//Apple
		
		System.out.println(Fruits.getLast());	//Coconut
		
		
//		Verification of elements from list
		
		System.out.println(Fruits.contains("Banana"));	//true
		
//		Updation of element
		
		System.out.println(Fruits.set(1,"Cherry"));
		
//		Deletion of elements from list	
		
		Fruits.remove("Coconut");
		
		System.out.println(Fruits);	//[Apple, Cherry, Mango]
		
		
		for (String string : Fruits) {
			
		}System.out.println(Fruits);

	
	}

}
