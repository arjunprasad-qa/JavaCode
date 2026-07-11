package mypackage.selenium68Batch;

import java.util.Scanner;

public class AssertKeyword {

	public static void main(String[] args)
	{
		/*assert false;
		// to print error message syntext is assert false or true :"message"
		assert false :"Sorry age should be atleast 18";
		System.out.println("Execute if cond is true");*/
		
		Scanner s1=new Scanner(System.in);
		System.out.println("what is your age");
		int age = s1.nextInt();
		assert age>18 :"Sorry age should be atleast 18";
		
		System.out.println("yes,you can apply for voter id");
		s1.close();
		

	}

}
