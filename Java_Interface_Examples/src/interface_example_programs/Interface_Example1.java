package interface_example_programs;

interface Printable{
	void print();
}

public class Interface_Example1 implements Printable {
	public void print() {
		System.out.println("Data printing...");
	}
	public static void main(String[] args) {
		Interface_Example1 obj1=new Interface_Example1();
		obj1.print();
	}
}
