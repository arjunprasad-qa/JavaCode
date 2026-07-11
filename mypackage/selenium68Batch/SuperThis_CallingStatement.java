package mypackage.selenium68Batch;

class B2
{
        B2()
        {
                this(100);
                System.out.println("C1");
        }
        B2(int a)
        {
                System.out.println("C2");
        }
}
public class SuperThis_CallingStatement  extends B2
{
        SuperThis_CallingStatement()
        {        
                //super(); -> not required as it is present implicitly
                System.out.println("C3");
        }
        SuperThis_CallingStatement(int a)
        {
                this();
                System.out.println("C4");
        }
        public static void main(String[] args) 
        {
                new SuperThis_CallingStatement(100);
        }
}



