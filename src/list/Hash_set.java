package list;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_set {

	public static void main(String[] args) {

/*		HashSet<String> set=new HashSet<String>();  
		
		set.add("Ravi");  
		
		set.add("Vijay");
		
		set.add("Ravi"); 
		
		set.add("Ajay"); 
		
		System.out.println(set);
		
		Iterator<String> itr=set.iterator();  
		
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		
	}	*/
		HashSet<String> set=new HashSet<String>();
		
        set.add("Ravi");  
        
        set.add("Vijay");
        
        set.add("Arun"); 
        
        set.add("Sumit"); 
        
        System.out.println(set); 
        
        set.remove("Ravi");  
        
        System.out.println(set);
        
        HashSet<String> set1=new HashSet<String>();
        
        set1.add("Ajay");  
        
        set1.add("Gaurav");
        
        set.addAll(set1);  
        
        System.out.println(set); 
        
        set.removeAll(set1); 
        
        System.out.println(set); 
        
        set.removeIf(str->str.contains("Vijay"));    
        
        System.out.println(set);  
        
        set.clear();  
        
        System.out.println(set);  
}  

		
	}


