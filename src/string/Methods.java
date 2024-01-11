package string;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Hi Nice to meet you";
		
		String a1=" How  are you ";
		
		String a2="im so Lonely";
		
		String a3="Aravind";
		
		String a4="Aravind";
		
		String a5="ARAVIND";
		
		String a6="";
		
		String a7=" ";


		System.out.println(a);	//How are you 
		
		System.out.println(a1);	//Who are you

//	1.	charAt:
	
		System.out.println(a.charAt(5));	//c
		
		System.out.println(a1.charAt(7));	//r
	
//	2.	LengthOf:
	
		System.out.println(a1.length());	//14
		
		System.out.println(a2.length());	//12
 
//	3.	Contains:
		
		System.out.println(a1.contains("a"));	//true
		
		System.out.println(a.contains("are"));	//false	

		
//	4.	Concat:
		
		System.out.println(a.concat(a1));	// Hi Nice to meet you How  are you 
		
		System.out.println(a.concat(" ").concat(a3));	//Hi Nice to meet you Aravind

//	5.	ContentEqual:
		
		System.out.println(a3.contentEquals(a4));	//true
		
		System.out.println(a.contentEquals(a3));	//false
		
//	6.	IndexOf:
		
		System.out.println(a.indexOf("i"));		//1
		
		System.out.println(a3.indexOf("n"));	//5
		
//	7.	CompareTo:
		
		System.out.println(a3.compareTo(a4));	//0 both are same
		
		System.out.println(a.compareTo(a4));	//7 a is 7 times greater than h
		
//	8.	Ends with:
		
		System.out.println(a.endsWith("you"));	//true because every character is same 
				
		System.out.println(a1.endsWith("You"));	//false because of Y and y are different
		
//	9.	Equals:
		
		System.out.println(a3.equals(a4));	//true because every character is same 
		
		System.out.println(a3.equals(a5));	//false a3,a5 are not same
		
//	10.	EqualIgnor:	
		
		System.out.println(a3.equalsIgnoreCase(a5));	//true; a3,a5 are same character
		
		System.out.println(a3.equalsIgnoreCase(a4));	//true; a3,a4 are same character
		
//	11.	Replace: 
		
		System.out.println(a3.replace("A","s"));	//sravind
		
		System.out.println(a1.replace("Who","How"));	//How are you

//	12.	Replaceall:
		
		System.out.println(a.replaceAll("How","Who"));	//Hi Nice to meet you
		
		System.out.println(a.replaceFirst("How","Who"));	//Hi Nice to meet you
		
//	13.	Uppercase & Lowercase
		
		System.out.println(a.toUpperCase());	//HI NICE TO MEET YOU
		
		System.out.println(a5.toLowerCase());	//aravind

//	14.	isEmpty
		
		System.out.println(a5.isEmpty());//false because it have characters
		
		System.out.println(a6.isEmpty());//true because it have no characters
		
//	15.	Intern
		
		System.out.println(a3.intern());//Aravind
		
		System.out.println(a3 == a4);//true
		
//	16.	Starts with
				
		System.out.println(a1.startsWith("How"));	//false
		
		System.out.println(a.startsWith("Hi"));		//true

		
//	17.	Trim
		
		String a8=" it eliminate Leading and Trailing Spaces "; 
		
		System.out.println(a8.trim());	//it eliminate Leading and Trailing Spaces


				
	}

}
	
	
	


 