package interface_example_programs;

interface Loan{
	float rateOfIntrest();
}

class Homeloan implements Loan{
	public float rateOfIntrest() {
		return 7.3f;
	}
}

class Carloan implements Loan{
	public float rateOfIntrest() {
		return 8.7f;
	}
}

class Goldloan implements Loan{
	public float rateOfIntrest() {
		return 6.3f;
	}
}

public class Interface_Example_Loan3 {
	public static void main(String[] args) {
		Loan obj1=new Homeloan();
		System.out.println("The home loan rate of intrest is "+ obj1.rateOfIntrest());
		
		Loan obj2=new Carloan();
		System.out.println("The car lone rate of intrest is "+ obj2.rateOfIntrest());
		
		Loan obj3=new Goldloan();
		System.out.println("The gold loan rate of intrest is "+obj3.rateOfIntrest());
	}
}
