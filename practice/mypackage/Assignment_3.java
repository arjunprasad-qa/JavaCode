package practice.mypackage;

public class Assignment_3 {
	
	static int a =10;
	String s = "Manish" ;

	public static void main(String[] args) {
		
		int b =6 ;
		
		Assignment_3 obj =new Assignment_3();
		
		System.out.println("Global Variable : " + a);	
		
		System.out.println("Instance Variable : " + obj.s);
		
		System.out.println("Local Variable : "+b);
	}

}
