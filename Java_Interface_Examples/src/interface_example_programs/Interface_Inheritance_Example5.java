package interface_example_programs;

interface Printable1{
	void print();
}

interface Showable extends Printable1{
	void show();
	//void print() method is hidden inside this interface
	//Next class we have implement Showable interface methods only
	//Then automatically print() also called to the main class
}

public class Interface_Inheritance_Example5 implements Showable{
	public void print() {
		System.out.println("From printable.....");
	}
	public void show() {
		System.out.println("From showable......");
	}
	public static void main(String[] args) {
		Interface_Inheritance_Example5 obj1=new Interface_Inheritance_Example5();
		obj1.print();
		obj1.show();
	}

}
