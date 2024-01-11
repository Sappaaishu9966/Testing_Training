package list;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Lhset {

	public static void main(String[] args) {

		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		set.add("Ravi");  
		
		set.add("Vijay"); 
		
		set.add("Ravi");
		
		set.add("Ajay"); 
		
		System.out.println(set);
		
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		 
		
	}

}
