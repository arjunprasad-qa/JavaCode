package practice.mypackage;

abstract class BaseClass_99 {
	abstract void method1();// this is going to be exposed

	abstract void method2();// this is going to be exposed

	static void method3() // This is concrete Method
	{
		System.out.println("1. Its logic is being exposed");
	}

	void method4() // This is concrete Method
	{
		System.out.println(" 2. Its logic is being exposed");
	}
}

public class Assign_33_34_35 extends BaseClass_99 {
	void method1() {
		System.out.println("I am under Method 1");
	}

	void method2() {
		System.out.println("I am under Method 2");
	}

	public static void main(String[] args) {
		Assign_33_34_35 a2 = new Assign_33_34_35();
		a2.method1();
		a2.method2();
		BaseClass_99.method3(); // static method of base class
		a2.method4(); // Non static method of base class

	}
}
