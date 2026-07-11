package Packageselenium2;

import java.util.Arrays;

public class ArrayConcept2 {
    // Copying one Array into Another Array
	public static void main(String[] args) {
		
		/*
		 * int [] rollno=new int[3]; rollno[0]=10; rollno[1]=42; rollno[2]=5;
		 */
                             
         			
			/*
			 * int [] B=new int[rollno.length];
			 * 
			 * 
			 * for(int i=0;i<rollno.length;i++) { B[i]=rollno[i];
			 * 
			 * }
			 */
		
		  int[]s1= {11,12,13,14}; //Declaring and Initializing array in one line
		  
	            int [] B=new int[s1.length];
	         
	         
	         for(int i=0;i<s1.length;i++)
	         {
	         B[i]=s1[i];
	          
	         }
			 
                 System.out.println("Input Array=> "+Arrays.toString(s1));
                 System.out.println("Output Array=> "+Arrays.toString(B));

	}

}
