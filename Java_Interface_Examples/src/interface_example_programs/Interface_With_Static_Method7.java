package interface_example_programs;

interface Machine{
	//Method
	void run();
	//Static method
	static int square(int x) {
		return x*x;
	}
}

class Drill implements Machine{
	//implementing method from the above interface
	public void run() {
		System.out.println("Drill machine is running...");
	}
	
}

public class Interface_With_Static_Method7 {
	public static void main(String[] args) {
		//Creating object for the interface IS-A relationship
		Machine obj1=new Drill();
		
		//calling method with the help object
		obj1.run();
		
		//Static methods can be called along with the interfacename.method name
		System.out.println(Machine.square(5));
	}
}
