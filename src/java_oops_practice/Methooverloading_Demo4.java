package java_oops_practice;

public class Methooverloading_Demo4 {
     public  static void add (int a, int b  )               
     {
    	 int c=a+b;
    	 System.out.println(c);
     }
     public   void add (char b, char a) 
     {
        
    	System.out.println(a+"\n"+b);	
     } 
     public  void add(double a,double b)
     {
    	 double c=a+b;
    	 System.out.println(c);
     }
     
	public static void main(String[] args) {// static varibles 		
      add(12,23);
      Methooverloading_Demo4 m=new Methooverloading_Demo4();
      m.add('A', 'M');
      m.add(23.00, 75.00);
	}

}
