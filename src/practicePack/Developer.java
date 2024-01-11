package practicePack;

 class Developer {
	 private String  Name;
	 private String  Employe;
	 private int Num;
	 private int Homenumber;
	 public Developer (String Name, String Employe,int Num,int Homenumber)
	 {
		this.Name=Name;
		this.Employe=Employe;
		this.Num=Num;
		this.Homenumber=Homenumber;
	 }
	public String getName()
	{
	 return Name;
	}
	 public String getEmploye()
	 {
		 return Employe; 
	 }
	 public int getNum() 
	 {
		return Num;
	 }
	 public int getHomenumber()
	 {
		 return Homenumber;
		 
	 }
 
          public static void main(String[] args)
     {
	    
    	 Developer D = new Developer("Laddu","SZ6154",143,350-350);
    	D.getEmploye();
    	D.getHomenumber();
    	D.getName();
    	D.getNum();
    	System.out.println(D.getEmploye());
	}
 }

     
