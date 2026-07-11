package practice.mypackage;

import java.util.Scanner;

public class Assignment_27_AssertKeyword {

	public static void main(String[] args) 
	{
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter your Age : ");
		int age = s1.nextInt();
		
		assert (age>=18) : "Error : You are not Eligible for Voting" ;
		
		System.out.println("You can Vote in Electrion");
		
		s1.close();
		
		
	}

}
