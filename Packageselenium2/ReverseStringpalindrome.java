package Packageselenium2;

public class ReverseStringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    String input="auto my name";
        String output="";
        
        for(int i=input.length()-1;i>=0;i--)
        {
                char c1=        input.charAt(i);
                output=output+c1;
                /*i=3,c1=o,o=o
                 * i=2,c1=t,o=ot
                 * i=1,c1=u,o=ot+u=otu
                 * i=0,c1=a,o=otu+a=otua
                 * 
                 */                        
        }
        System.out.println("This is your input->"+input);
        System.out.println("This is your output-"+output);
        
        //Palindrom programe
        if(input.equals(output))
        {
                System.out.println("Is its a Palindorme words");
        }
        else
        {
                System.out.println("It is not a Palindorme word");
        }

		
	}

}
