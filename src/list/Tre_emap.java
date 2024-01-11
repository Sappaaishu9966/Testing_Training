package list;

import java.util.TreeMap;

public class Tre_emap {

	public static void main(String[] args) {

		TreeMap<Integer,String> map=new TreeMap<Integer,String>(); 
		
	      map.put(100,"Amit");   
	      
	      map.put(102,"Ravi");  
	      
	      map.put(101,"Vijay"); 
	      
	      map.put(103,"Rahul");  
	      
	      System.out.println("descendingMap: "+map.descendingMap());//{103=Rahul, 102=Ravi, 101=Vijay, 100=Amit}
	      
	      System.out.println("headMap: "+map.headMap(102,true));//{100=Amit, 101=Vijay, 102=Ravi}  
	      
	      System.out.println("tailMap: "+map.tailMap(102,true)); //{102=Ravi, 103=Rahul} 
	      
	      System.out.println("subMap: "+map.subMap(100, false, 102, true));//{101=Vijay, 102=Ravi}   
	 }  
	 
	}


