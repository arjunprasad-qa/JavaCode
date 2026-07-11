package Packageselenium2;

import practice.mypackage.AS_Package1_PublicClass1;

public class AS_Package2_PublicClass4 extends AS_Package1_PublicClass1 {

	public static void main(String[] args) {

		AS_Package2_PublicClass4 obj2 = new AS_Package2_PublicClass4();
		obj2.m1(); // protected Method of public class 1
		obj2.m7(); //// Public Method of public class 1

		System.out.println("a : " + obj2.a);
		System.out.println("Ch : " + obj2.ch);

	}

}
