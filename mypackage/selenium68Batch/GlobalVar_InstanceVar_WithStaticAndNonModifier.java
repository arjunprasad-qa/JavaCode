package mypackage.selenium68Batch;

public class GlobalVar_InstanceVar_WithStaticAndNonModifier {
	//  refer this program that how we can access global and instance variable.
	static int a =100 ;
	 int b=200 ;
	public static void main(String[] args) {
		GlobalVar_InstanceVar_WithStaticAndNonModifier b1=new GlobalVar_InstanceVar_WithStaticAndNonModifier();
		int a=10;
		int b=20;
		System.out.println("Local Variable a --> "+ a +" "+"local variable b "+ b);
		System.out.println("Instance Var : " + GlobalVar_InstanceVar_WithStaticAndNonModifier.a);
		System.out.println("Value of Instance variable i.e GV with non static: " + b1.b);
	}

}
