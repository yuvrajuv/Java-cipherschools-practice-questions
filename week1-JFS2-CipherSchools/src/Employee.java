public class Employee {
		// Constructor
		//<identification>
		// 1.1 same name as class name 
		// 1.2 No return Type
		//<purpose>
		//1.1 it creates/intializes Object in Memory (RAM)
		//1.2 you can use constructor Block to initialize some default values.
		
		int employeeID;
		int salary;
		String dept;
		
		Employee (int empid,int sal,String d) {
		employeeID=empid; 
		salary=sal;
		dept =d;
		}
    public static void main(String[] args) {
    	Employee harsha = new Employee(101,3000,"Testing"); 
    	System.out.println(harsha.employeeID+" Salary "+harsha.salary+" Dept "+harsha.dept);
    	
    	Employee varsha = new Employee(102,5000,"Testing"); 
    	System.out.println(varsha.employeeID+" Salary "+varsha.salary+" Dept "+varsha.dept);
    }
}