package mypackage.selenium68Batch;

public class HierarchicalLevelInheritance_BaseChild1 extends HierarchicalLevelInheritance_Base {
	
	static void addToCart()
	{
		System.out.println("addToCart");
	}
	
	public static void main(String[] args)
	{
		addToCart();
		launchBrowser();
		HierarchicalLevelInheritance_BaseChild1 c1=new HierarchicalLevelInheritance_BaseChild1();
		c1.closeBrowser();
		System.out.println("Value of z : "+z);
		System.out.println("Value of d : " +c1.d);
		
	}
	

}
