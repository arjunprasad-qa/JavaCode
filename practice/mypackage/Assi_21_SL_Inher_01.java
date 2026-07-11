package practice.mypackage;

class BaseClass {

	static int z = 5;
	int d = 4;

	static void launchBrowser() {
		System.out.println("LaunchBrowser");
	}

	void closeBrowser() {
		System.out.println("Close Browser");
	}

}

public class Assi_21_SL_Inher_01 extends BaseClass {

	static void addToCart() {
		System.out.println("addToCart");
	}

	public static void main(String[] args) {

		Assi_21_SL_Inher_01 obj = new Assi_21_SL_Inher_01();
		launchBrowser(); // Assessing Static Method
		addToCart(); // Assessing Static method
		System.out.println("Value of Static Global Var : " + z);
		System.out.println("Value of Non static Instance Var " + obj.d);
		obj.closeBrowser(); // Accessing Non Static method
	}

}
