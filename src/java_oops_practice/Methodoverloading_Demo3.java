package java_oops_practice;

public class Methodoverloading_Demo3 {
    public void add (int a,int b) 
    {
    	System.out.println(a+b);
    	
    }
    public void add (int x,int a, int c)
    {
    	System.out.println(x+a+c);
    }
	public static void main(String[] args) {
		Methodoverloading_Demo3 M = new Methodoverloading_Demo3();
		M.add(11, 22);
		M.add(1111, 1234, 1234);
		
	}

}
