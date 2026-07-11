package mypackage.selenium68Batch;

public class SuperKeyword_MethodOverriding 
{
    void login()   //This method is overridden-
    {
            System.out.println("Login using EMail id");
    }
    
    public static void main(String[] args) 
    {
    	int a=5;
            if(a>2) //just think but for now I put some condition to ssatisfy programe User is entering the mobile no)
            {
            ClassMethod3 c1=new ClassMethod3();
            c1.login();
            }
            else
            {
            	SuperKeyword_MethodOverriding c1=new SuperKeyword_MethodOverriding();
                    c1.login();
            }
    }   
    
} 


class ClassMethod3 extends SuperKeyword_MethodOverriding
{
	
    void login()
    {
            System.out.println("Login using Mobile No");
    }

}
