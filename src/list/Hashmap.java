package list;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {

//		HashMap (String,Integer)
		
		HashMap<Integer, String>Students=new HashMap<Integer, String>();

		Students.put(25,"Aravind");
		
		Students.put(27,"James");
		
		Students.put(29,"Narendra");
		
		Students.put(30,"Ramesh");
		
		Students.put(32,"Krish");
		
		Students.size();
		
		Set<Integer> Keys =Students.keySet();
		
//		Retrival of Keys from map
		
		for (Integer key : Keys) {
			
			System.out.println(key);
			
		}
		
//		Retrival of Values from map
		
		Collection<String> values = Students.values();
		
		for (String value : values) {
			
			System.out.println(value);

		}

		
		System.out.println(Students);	//{Krish=32, Aravind=25, James=27, Narendra=29, Ramesh=30}
		
		System.out.println(Students.get("Aravind"));	//25
		
		System.out.println(Students.remove("Krish"));	//32
		
		System.out.println(Students);	//{Aravind=25, James=27, Narendra=29, Ramesh=30}
		
		System.out.println(Students.size());	//4		
		
		
		HashMap<String, String>Cities=new HashMap<String, String>();
		
		Cities.put("Andhra", "Amaravathi");

		Cities.put("Maharastr", "Mumbai");
		
		Cities.put("Goa", "Panaji");
		
		Cities.put("Telangana", "Hyderabad");
		
		Cities.put("Kerala", "Thiruvananthapuram");
		
		System.out.println(Cities);	//{Telangana=Hyderabad, Andhra=Amaravathi, Goa=Panaji, Maharastr=Mumbai, Kerala=Thiruvananthapuram}
		
		System.out.println(Cities.get("Andhra"));	//Amaravathi
		
		System.out.println(Cities.remove("Andhra"));	//Amaravathi

		System.out.println(Cities.containsKey("Goa"));	//True
		
		
		
		

		
	}

}
