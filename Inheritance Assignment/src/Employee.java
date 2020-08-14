/**
 * Xavier Porter
 *  601 - 01 Found of Software Dev.
 *  11/11/19
 *  
 *  Program: Ask the user to enter three employee names and three id numbers. Calling the parent class, to demonstrate
 *  inheritance from the child class and compare if two employees are the same if they have the same ID and name.
 *  Display if employees are the same or different based on user input. 
 * 
 */
 
public class Employee extends Person {

	//Private variable 
	private String name;
	
	//Constructor of the child or subclass
	Employee(String name, int id) {
		
		//Call to super or parent class constructor
		 super(id);
		 
		 //Initialize name and id through employee constructor
		this.name = name;
		this.id = id;
		
	} 		

	//Return the name instance variable
	String getName() {
		return name;
	}
	
	
	//Compares and overrides two employees if name and id are the same. 
	public boolean equals(Object obj) {
		Employee Employee = (Employee) obj;
		if(obj == null || obj.getClass() != this.getClass()) 
		return false;
		
		return this.name.equals(((Employee)obj).name) && this.id==((Employee)obj).id; 
		}



}
