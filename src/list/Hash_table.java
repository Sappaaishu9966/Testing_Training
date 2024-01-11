package list;

import java.util.Hashtable;

public class Hash_table {

	public static void main(String[] args) {

		 Hashtable<Integer,String> map=new Hashtable<Integer,String>(); 
		 
	     map.put(100,"Amit");   
	     
	     map.put(102,"Ravi"); 
	     
	     map.put(101,"Vijay");
	     
	     map.put(103,"Rahul");  
	     
	     System.out.println("Before remove: "+ map);//Before remove: {103=Rahul, 102=Ravi, 101=Vijay, 100=Amit}
   
	     map.remove(102);  
	     System.out.println("After remove: "+ map);//After remove: {103=Rahul, 101=Vijay, 100=Amit}
	     
	     System.out.println(map.get(103));//Rahul
	     
	     System.out.println(map.get(107));//null
	     
	     System.out.println(map.putIfAbsent(104, "James"));

	     System.out.println(map.putIfAbsent(101, "Vijay"));


	   }      
	
	}


