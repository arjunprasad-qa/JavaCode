package practice.mypackage;

public class Assig_37_Subclassforinterface_03 implements Assign37_Superinterface2_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assig_37_Subclassforinterface_03 s1 = new Assig_37_Subclassforinterface_03();
		s1.m1();
		s1.m2();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("I am from Superinterface");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("I am from Superinterface2");
	}

}
