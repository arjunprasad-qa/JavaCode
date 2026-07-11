package Packageselenium2;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        String input="1civic1";
        String output="";
        
        for(int i=input.length()-1;i>=0;i--)
        {
                char c1=        input.charAt(i);
                output=output+c1;
                        
        }
        System.out.println("This is your input->"+input);
        System.out.println("This is your output-"+output);
        
        
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
