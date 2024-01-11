package list;

import java.util.LinkedHashSet;
import java.util.Set;

public class Se_t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> data = new LinkedHashSet<Integer>();   
        data.add(31);   
        data.add(21);   
        data.add(41);   
        data.add(11);   
        data.add(61);   
        data.add(51);   
        System.out.println("data: " + data);
        System.out.println("Set: " + data);  
        System.out.println("Does the Set contains '91'?" + data.contains(11));   
        System.out.println("Does the Set contains '15'?" + data.contains(15));   
        System.out.println(data.hashCode());   
        System.out.println(data.isEmpty());   

    }   

	}


