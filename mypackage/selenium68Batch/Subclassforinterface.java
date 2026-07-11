package mypackage.selenium68Batch;

public class Subclassforinterface implements Superinterface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subclassforinterface s1=new Subclassforinterface();
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
