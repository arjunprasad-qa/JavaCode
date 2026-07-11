package practice.mypackage;

import java.util.Scanner;

public class Assignment_13 {

	public static void main(String[] args) {
Scanner s1 =new Scanner (System.in);
		
		System.out.println("Enter your age : ");		
		int age = s1.nextInt();
		
		if (age>=18)
		{
			System.out.println("you are eligible for Vote");
		}
		
		else
		{
			System.out.println("You are not adult and not Eligible for giving vote");
		}
		
		s1.close();
		

	}

}
