package practice.mypackage;

public class AS_Package1_PublicClass3 {
	static void m3() {
		System.out.println("I am in Package 1 public class 3 - M3 Method");
	}

	void m8() {
		System.out.println("I am in Package 1 public class 3 - M8 Method ");
	}

	public static void main(String[] args) {

		m3();
		AS_Package1_DefaultClass2.m2();
		AS_Package1_PublicClass1 obj = new AS_Package1_PublicClass1();
		obj.m1();

		// obj.method11() not accessible as method11() is private and can be accessible
		// in it's class only.
	}

}
