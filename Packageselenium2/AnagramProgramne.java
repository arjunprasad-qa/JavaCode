package Packageselenium2;

import java.util.Arrays;

public class AnagramProgramne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     String a="tone";
	        String b="note";
	        
	        if(a.length()!=b.length())
	        {
	                System.out.println("They cant be anagram");
	        }
	        else
	        {
	                char [] c1=                a.toCharArray();
	                char c2[]=b.toCharArray();
	                
	                Arrays.sort(c1);//[a s w]
	                Arrays.sort(c2);//[a s w]
	                
	                if(Arrays.equals(c1, c2))
	                {
	                        System.out.println("They are ANAGRAM");
	                        System.out.println(Arrays.toString(c1));
	                        System.out.println(Arrays.toString(c2));
	                }
	                else
	                {
	                        System.out.println("They are NOT ANAGRAM");
	                }
	                
	                
	        }
	}

}
