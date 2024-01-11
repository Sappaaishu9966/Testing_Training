	package Mock_1;


	abstract class Animal
	{
	abstract void sound();
	}
	class Lion extends Animal
	{
	public void sound()
	{
	System.out.println("Animal eats grass");
	}
	}
	class Tiger extends Animal
	{
	public void sound()
	{
	System.out.println("Animal eats");
	}
	}
    public  class Mock_1_Demo {
	public static void main(String[] args) {
	Tiger t1=new Tiger();
	t1.sound();
	Lion l1=new Lion();
	l1.sound();
	}
	}
	
	
