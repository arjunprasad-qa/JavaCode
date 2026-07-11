package practice.mypackage;

class OtherClass {
	String test;
	int a = 5;

	public OtherClass(String str) {
		this();
		this.test = str;
		System.out.println("Under OtherClass - Parametrized Constructor : " + test);
	}

	public OtherClass() {

		System.out.println("Under OtherClass - Default Constructor");
	}

}

public class Assignment_5 {
	int b = 7;

	public Assignment_5()

	{
		System.out.println("I am under own class Constructor");
	}

	public static void main(String[] args)

	{
		Assignment_5 a1 = new Assignment_5(); // To call Own class Constructor I created obj of current class
		System.out.println(a1.b);
		OtherClass obj1 = new OtherClass("MKT"); // To call Other class Constructor, I created obj of Other class Obj
		System.out.println(obj1.a);
	}

}
