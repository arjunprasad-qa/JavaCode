package practice.mypackage;

class BaseClass_01 {
	static int z = 5;
	int d = 4;

	static void launchBrowser() {
		System.out.println("LaunchBrowser");
	}

	void closeBrowser() {
		System.out.println("Close Browser");
	}
}

class BaseClass_01_SubClass extends BaseClass_01 {
	void login() {
		System.out.println("Please login with your valid Credetials");
	}
}

public class Assi_21_ML_Inher_2 extends BaseClass_01_SubClass {
	static void addToCart() {
		System.out.println("addToCart");
	}

	public static void main(String[] args) {

		Assi_21_ML_Inher_2 obj = new Assi_21_ML_Inher_2();
		launchBrowser(); // Assessing Static Method
		obj.login(); // Login to Application
		addToCart(); // Assessing Static method
		System.out.println("Value of Static Global Var : " + z);
		System.out.println("Value of Non static Instance Var " + obj.d);
		obj.closeBrowser(); // Accessing Non Static method
	}

}
