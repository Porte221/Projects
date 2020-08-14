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
import java.util.Scanner;
public class EmployeeApp {

	
	public static void main(String[] args) {
		
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many employees would you like to enter:");
		int size = input.nextInt();
		
		//Creates an employee array of size input by user
		Object[] emp = new Employee[size];
		
		//Display length of array you will input
		System.out.println("Size of array: "+ emp.length);
	
		//Prompt user to enter name of first employee
		System.out.println("Please enter the name of 1st employee: ");
			String name = input.next();
		
		//Prompt user to enter id of first employee
		System.out.println("Please enter the id of the 1st employee: ");		
			int id = input.nextInt();
			
		//Create an employeeObject and call the child class
			Employee employeeObject = new Employee(name, id);
			
		//Set object equal to index at 0
			emp[0] = employeeObject;
			
		//Prompt user to enter name of 2nd employee
		System.out.println("Please enter the name of the 2nd employee: ");
				name = input.next();
				
		//Prompt user to enter id of 2nd employee 
		System.out.println("Please enter the id of the 2nd employee: ");		
				 id = input.nextInt();
		
		//Create an employeeObject
			Employee employeeObject2 = new Employee(name, id);

		//emp array at index 1 is equal to employeeObject2
			emp[1] = employeeObject2;

		System.out.println("Please enter the name of the 3rd employee: ");
				name = input.next();
				
		System.out.println("Please enter the id of the 3rd employee: ");		
		        id = input.nextInt();
			
			Employee employeeObject3 = new Employee(name, id);
			
			emp[2] = employeeObject3;

			//Iterate each value of the array starting from 0
		for(int i = 0; i < emp.length; i++) {
			
				
			for (int j = 1 + i; j < emp.length; j++)
				
			//Compare the values at each index for both employees entered
			if((emp[i].equals(emp[j]))) {
				System.out.println("The employees, " +((Employee)emp[i]).getName()+ " and "  + ((Employee)emp[j]).getName() + " are the same.");
			}
			else 
				System.out.println("Employee's are different");
			
			}
			
			
		}

	
		
	}









