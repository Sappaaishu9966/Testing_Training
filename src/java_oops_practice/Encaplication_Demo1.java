package java_oops_practice;

	 class Emp1 {

        // Step 1: Declare variables private in the class.
        private String Emp1Name; // private field.
        private int Emp1Salary;
        private int Emp1Id;

        // Step 2: Apply public getter method for each private vairable in the class.
        public String getEmp1Name()
        {
            return Emp1Name;
        }
        public int getEmp1Salary()
        {
        return Emp1Salary;
         }

    public int getEmp1Id()
    {
        return Emp1Id;
    }

    
        // Step 3: Apply public setter method for each private variable in the class.
        public void setEmp1Name(String name)
        {
           this. Emp1Name  = name;
        }
        public void setEmp1Salary(int Salary)
        {
           this. Emp1Salary = Salary;
        }
        public void setEmp1Id(int id)
        {
           this. Emp1Id = id;
        }
    }
    public class Encaplication_Demo1 {
        public static void main(String[][] args)
        {
// Step 4: Create the object of class Student by using new keyword.
            Emp1 obj = new Emp1(); // Here, obj is reference variable of class Student and pointing to objects of class Student.

// Step 5: Call setter method and set the value of variables.
            obj.setEmp1Name("Aishwraya Sappa");
            obj.setEmp1Salary(500);
            obj.setEmp1Id(12);

// Step 6: Call getter method to read the value of variables and print it on console.
            System.out.println("Emp1's Name: " +obj.getEmp1Name());
            System.out.println("Emp1's Salary: " +obj.getEmp1Salary());
            System.out.println("Emp1's Id: " +obj.getEmp1Id());
        
	}

}
