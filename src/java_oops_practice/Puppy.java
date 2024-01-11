package java_oops_practice;

 class Puppy 
  {
	 public void BOW()
	 {
		System.out.println("Puppy carying"); 
	 }
  } 
  class Browny extends Puppy
  {
	public void Angery()
	{
		System.out.println("Browny Angery");
	}
	
    public static class My
      {
	public static void main(String[] args)
	  {
		Browny B = new Browny();
		B.Angery();
	    B.BOW();		
	}
	  
   }
  }
    
