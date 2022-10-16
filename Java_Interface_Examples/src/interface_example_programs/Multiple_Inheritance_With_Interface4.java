package interface_example_programs;

//MULTIPLE INHERITANCE CAN ACHIVED BY USING INTERFACE CONCEPT
interface Book{
	void read();
}

interface LongBook{
	void write();
}

public class Multiple_Inheritance_With_Interface4 implements Book,LongBook{
	public void read() {
		System.out.println("Reading book");
	}
	
	public void write() {
		System.out.println("Writing on long book");
	}
	
	public static void main(String[] args) {
		Multiple_Inheritance_With_Interface4 obj1=new Multiple_Inheritance_With_Interface4();
		obj1.read();
		obj1.write();
	}
}
