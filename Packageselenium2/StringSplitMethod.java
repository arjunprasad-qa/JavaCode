package Packageselenium2;

import java.util.Arrays;

public class StringSplitMethod {

	public static void main(String[] args) {
		
	    String a="My Name is Ram"; 
	    String []s1= a.split(" ");       
        System.out.println(Arrays.toString(s1)); // Output will be "String of Array" --> [My, Name, is, Ram]
        
  
        // 1. Remove all spaces from the sentence FIRST
        // This turns "My Name is Ram" into "MyNameisRam"
        String d =a.replace(" ","");
        
       // Break the clean, spaceless string into characters
        char [] c1= d.toCharArray();
        
        
        /* Get the standard layout text: "[M, y, N, a, m, e, i, s, R, a, m]"
         O/p will be char of array--> [M, y, N, a, m, e, i, s, R, a, m]
        you can further use replace method to make o/p without extra spaces */
        
        System.out.println(Arrays.toString(c1)); 
        
        /*When you use .split(" ", 3), you are passing two instructions to Java:
		The Separator (" "): "Look for blank spaces to decide where to cut the sentence."
		The Limit (3): "I only want a maximum of 3 pieces in total. Once you have 3 pieces,
		stop cutting and leave the rest of the sentence alone!"  */
        
        String []s2= a.split(" ",3);        
        System.out.println(Arrays.toString(s2));
        
        //you can do in this way if want to direct extract partial text from string
        String g ="My name is Khan";
        String d1 =g.split(" ")[3];
        System.out.println(d1);
        
        
        
	}

}
