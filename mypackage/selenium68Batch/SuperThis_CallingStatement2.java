package mypackage.selenium68Batch;

class B4
{
        B4()
        {
                this(500);
                System.out.println("C1");
        }
        B4(int a)
        {
                System.out.println("C2");
        }
}
public class SuperThis_CallingStatement2  extends B4
{
	SuperThis_CallingStatement2()
        {        
                this(10);
                System.out.println("C3");
        }
	SuperThis_CallingStatement2(int a)
        {
                //super(); --> not mandatory to write
                System.out.println("C4");
        }
        public static void main(String[] args) 
        {
        	SuperThis_CallingStatement2 a1=  new SuperThis_CallingStatement2();
        }
}
