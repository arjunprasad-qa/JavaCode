package Packageselenium2;

import practice.mypackage.AS_Interface_01;
import practice.mypackage.AS_Interface_02;

public class AS1_ClassA_Implements_Interface_02 implements AS_Interface_02 {

	public static void main(String[] args) {

		System.out.println("Value of Interface 1 variable a: " + AS_Interface_01.a);
		System.out.println("Value of Interface 2 variable str : " + AS_Interface_02.str);

		AS1_ClassA_Implements_Interface_02 obj = new AS1_ClassA_Implements_Interface_02();
		obj.age();
		obj.address();
	}

	@Override
	public void age() {
		System.out.println("Age Method Implemented from Interface 1");

	}

	@Override
	public void address() {
		System.out.println("Address Method Implemented from Interface 2");
	}

}
