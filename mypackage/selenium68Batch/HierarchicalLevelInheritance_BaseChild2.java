package mypackage.selenium68Batch;

public class HierarchicalLevelInheritance_BaseChild2 extends HierarchicalLevelInheritance_Base {
	
	static void addToWishlist()
	{
		System.out.println("addToWishlist");
	}
	
	public static void main(String[] args)
	{
		addToWishlist();
		launchBrowser();		
		HierarchicalLevelInheritance_BaseChild2 c1=new HierarchicalLevelInheritance_BaseChild2();
		c1.closeBrowser();
		System.out.println("Value of z : "+z);
		System.out.println("Value of d : " +c1.d);
		
	}
	

}
