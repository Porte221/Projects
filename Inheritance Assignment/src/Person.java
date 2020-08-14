
//Create an abstract person class
public abstract class Person {
	protected int id;
	
	
	//Create a constructor and initialize.
	Person(int id){
		
		//Use id param to initialize instance variable
		 this.id = id;
		 
	}
	
	//Return id of super class
	int getId() {
		return id;
	}
	


}
