package practice.mypackage;


class Abc
{
	
	public void nonStaticMethod()	
	{
		
		System.out.println("Non Static Method of Other Class");
	}
	
	public static void staticMethod()	
	{
		
		System.out.println("Static Method of Other Class");
	}
	
}


public class Assignment_6 
{
	
	public Assignment_6()
	
	{		
		System.out.println("I am under .Java class named Assignment6 ");
	}
	
	void method1()
	{
		System.out.println("non Static method of .Java class named Assignment6 ");
	}
	
	static  void  method2()
	{
		System.out.println("non Static method of .Java class named Assignment6 ");
	}

	public static void main(String[] args) 
	
	{
		Assignment_6 a1 = new Assignment_6(); 
		a1.method1();
		method2();
		Abc obj1 =new Abc(); 
		Abc.staticMethod();
		obj1.nonStaticMethod();
	
	}

}
