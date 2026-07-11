package mypackage.selenium68Batch;

public class SingleLevelInheritance_BaseChild extends SingleLevelInheritance_Base {
	
	static void addToCart()
	{
		System.out.println("addToCart");
	}
	
	public static void main(String[] args)
	{
		addToCart();
		launchBrowser();
		SingleLevelInheritance_BaseChild c1=new SingleLevelInheritance_BaseChild();
		c1.closeBrowser();
		System.out.println("Value of z : "+z);
		System.out.println("Value of d : " +c1.d);
		
	}
	

}
