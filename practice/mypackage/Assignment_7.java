package practice.mypackage;

public class Assignment_7 {


    // 1. Default / No-Argument Constructor
    public Assignment_7()
 {
             
        System.out.println("No-Arg Constructor");
    }


    // 2. Overloaded Constructor with 1 Parameter

    public Assignment_7(String s2)
	{
   
        System.out.println("Overloaded Constructor with 1 Param");
    	}


    // 3. Overloaded Constructor with multiple Parameters

    public Assignment_7(String s3,int a3) {
        
        System.out.println("Overloaded Constructor with multiple Params");
    }
    
 // 4. Overloaded Constructor with multiple Parameters (Different Sequence)
    
  public Assignment_7(int a3 ,String s3) {
        
        System.out.println("Overloaded Constructor with multiple Params with different sequence");
    }

    public static void main(String[] args) {
      
        Assignment_7 test1 = new Assignment_7();       
        Assignment_7 test2 = new Assignment_7("GroTechMinds"); 
        Assignment_7 test3 = new Assignment_7("GroTechMinds_1", 10); 
        Assignment_7 test4 = new Assignment_7(10,"GroTechMinds_2"); 
    }

}
