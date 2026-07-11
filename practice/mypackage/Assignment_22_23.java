package practice.mypackage;

class A
{
	static String name ="Arjun";
}
public class Assignment_22_23 
{
	static int age =18;
	public static void main(String[] args)
	{
		System.out.println("Before updating Global Var Value: " +age );
		age = 20;
		System.out.println("Post Update of Global Var: " +age);
		
		//Accessing  class A Static Variable inside Class "Assignment_22_23"
		
		System.out.println("Before updating Global Var Value in Class A:  " +A.name );
		A.name = "Manish";
		System.out.println("Post Update of Global Var in class Assignment_22_23 : " +A.name);
	}

}
