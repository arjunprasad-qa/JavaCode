package practice.mypackage;

		
public class Assi_21_HL_Inher_3_02 extends Assig_HLI_BaseClass_001
{
	
	static void addToCart()
	{
		System.out.println("addToCart");
	}
	
	

	public static void main(String[] args)
	{
		
		Assi_21_HL_Inher_3_02 obj = new Assi_21_HL_Inher_3_02();
		launchBrowser();  //Assessing Static Method	
		addToCart();  // Assessing Static method
		System.out.println("Value of Static Global Var : " +z);
		System.out.println("Value of Non static Instance Var " +obj.d);
		obj.closeBrowser(); //Accessing Non Static method
	}

}
