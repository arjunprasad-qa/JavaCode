package Packageselenium2;

public class StringMutabilityConcept {

	public static void main(String[] args) {
		
		   String a="AUtomation";//String is Immutable
		   String b ="AUtomation";
		   
		   
		   /*
           String c=        a.concat("Testing");
                   System.out.println(c);
                   System.out.println(b);  */
		   
		   String g = a.concat("Testing");
		   System.out.println(g);

	}

}
