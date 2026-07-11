package practice.mypackage;

class BaseClass_001 {

	void login() // This method is overridden-
	{
		System.out.println("Login using EMail id");
	}
}

public class Assign_32 extends BaseClass_001 {
	void login() {
		super.login();// it will call your parent class method
		System.out.println("Login using Mobile No");
	}

	public static void main(String[] args) {
		Assign_32 c1 = new Assign_32();
		c1.login();

	}
}
