package Packageselenium2;

import java.util.Arrays;

public class ArrayConcept1 {
	//WAP to copy one array into another array in the reverse order
	public static void main(String[] args) {
		   int [] rollno1=new int[5];
           rollno1[0]=10;
           rollno1[1]=42;
           rollno1[2]=50;
           rollno1[3]=54;
           rollno1[4]=2345;

           int [] rollno2=new int[rollno1.length];
           
           for(int i=0,j=rollno1.length-1;i<rollno1.length;i++,j--)
           {
                   rollno2[j]=rollno1[i];
           
           }
                   System.out.println("Input Array=> "+Arrays.toString(rollno1));
                   System.out.println("Output Array=> "+Arrays.toString(rollno2));

	}

}
