package interface_example_programs;

interface Drawing{
	//method
	void draw();
	//default method
	default void msg() {
		System.out.println("From default method....");
	}
}

class Tree implements Drawing{
	//implementing the above method
	 public void draw() {
		System.out.println("Calling draw method");
	}
}

public class Interface_With_DefaultMethod_Example6 {
	public static void main(String[] args) {
		//Object creation
		Drawing obj1=new Tree();
		//calling methods with the help of objects
		obj1.draw();
		obj1.msg();
	}
}
