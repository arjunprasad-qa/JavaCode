package practice.mypackage;


class Super_004
{	double salary =1000;
	Super_004()
	{   this(20);
		System.out.println("I am non Parameterized default Constructor under Super class");
	}
	
	Super_004(int age)
	{
		System.out.println("I am  Parameterized  Constructor under Super class");
	}
}
public class Assign_31 extends Super_004
{
	Assign_31()
	{
		System.out.println("I am non Parameterized subclass Constructor");
	}
	
	Assign_31(String name)
	{
		this();
		System.out.println("I am Parameterized subclass Constructor");
	}

	public static void main(String[] args) 
	{
		Assign_31  a1 = new Assign_31("Arjun");
		System.out.println(a1.salary);
	}

}
