package mypackage.selenium68Batch;

class Walmart
{
	Walmart(int a)
	        {
	                System.out.println("1st Constructor");
	        }
	}
	class Amazon extends Walmart     //parent Class
	{
	        Amazon()
	        {
	                super(100);
	                System.out.println("2nd Constructor");
	        }
	}
	public class Flipkart_SuperCalligStatementDemo extends Amazon    //Child CLass
	{
		int a=10;
	        Flipkart_SuperCalligStatementDemo(String a,char b)
	        {
	                super();
	                System.out.println("3rd Constructor");
	        }
	        public static void main(String[] args) 
	        {
	                Flipkart_SuperCalligStatementDemo f1=new Flipkart_SuperCalligStatementDemo("Automation",'X');
	                // new Amazon();//creating new object
	                 //presence of super calling statement
	                
	                System.out.println("Instance Variable --> " +f1.a);
	        }
	}

	
