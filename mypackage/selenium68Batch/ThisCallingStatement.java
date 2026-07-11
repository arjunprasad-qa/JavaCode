package mypackage.selenium68Batch;

public class ThisCallingStatement {

	ThisCallingStatement(int a)
     {
             System.out.println("Constructro 1");
     }
	ThisCallingStatement(double b)
     {
             this(500);
             System.out.println("Constructro 2");
     }
	ThisCallingStatement(String c)
     {
             this(78.9);
             System.out.println("Constructro 3");
     }
	ThisCallingStatement(char d)
     {
             this("Automation");
             System.out.println("Constructro 4");
     }
	
	void randomMethod()
	{
		System.out.println("Random Method");
	}
     public static void main(String[] args) 
     {
    	 //obj creation code
    	 ThisCallingStatement obj1=   new ThisCallingStatement('X');
             
             //to access non static method ,use obj creation code and use dot.
            obj1.randomMethod();
     }
	}


