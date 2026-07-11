package Packageselenium2;

import java.util.Arrays;

public class ArrayBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] rollno = new int[3];
		rollno[0] = 10;
		rollno[1] = 42;
		rollno[2] = 5;

		System.out.println(Arrays.toString(rollno));

		String[] name = new String[3];
		name[0] = "Mohan";
		name[1] = "Parvati";
		name[2] = "Bhavana";

		System.out.println(Arrays.toString(name));

		char[] surname = new char[3];
		surname[0] = 'P';
		surname[1] = 'S';
		surname[2] = 'A';

		System.out.println(Arrays.toString(surname));

		for (int i = 0; i < surname.length; i++) {
			System.out.println("name :" + name[i] + " rollno : " + rollno[i] + " surname : " + surname[i]);
		}

		/*
		 * for(int i=0;i<name.length;i++) { System.out.println("Name is ->"+name[i] +
		 * " ,Initial is ->"+surname[i] +" ,RollNo is->"+rollno[i] ); }
		 */

	}

}
