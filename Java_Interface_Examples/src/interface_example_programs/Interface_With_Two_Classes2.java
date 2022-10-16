package interface_example_programs;

interface Shape{
	void draw();
}

class Triangle implements Shape{
	public void draw() {
		System.out.println("Drawing triangle");
	}
}

class Circle implements Shape{
	public void draw() {
		System.out.println("Drawing circle");
	}
}

public class Interface_With_Two_Classes2 {
	public static void main(String[] args) {
		Shape obj1=new Triangle();
		obj1.draw();
		Shape obj2=new Circle();
		obj2.draw();
	}
}
