package interface_example_programs;

//Creating interfaces with 4 methods
interface Fruits{
	//these methods are by default, public and abstract
	void method1();
	void method2();
	void method3();
	void method4();
}

//Creating abstract class that provides implementation of one method of interface Fruitsabstract class M
abstract class Apple implements Fruits{
	//implementing method 1
	public void method1() {
		System.out.println("Method1 is calling...");
	}
}

//creating sub class for the above abstract class, to provide implementations for the remaining methods
class GreenApple extends Apple{
	//implementing remaining methods
	public void method2() {
		System.out.println("Method2 is calling...");
	}
	public void method3() {
		System.out.println("Method3 is calling...");
	}
	public void method4() {
		System.out.println("Method4 is calling...");
	}
}

//Main class
public class Difference_Between_AbstractClass_Interface8 {
	public static void main(String[] args) {
		//creating object for the Fruits
		Fruits obj1=new GreenApple();
		
		//Calling methods with help object
		obj1.method1();
		obj1.method2();
		obj1.method3();
		obj1.method4();
	}
}
