
public class Person {
	//Without static it belongs to the object, not the class.
	public static int instanceCount;
	
	public int localCount;
	
	public Person() {
		instanceCount++;
		localCount++;
	}
}
