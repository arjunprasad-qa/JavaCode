package Packageselenium2;

public class DemoStringBuffer_Builder {

	public static void main(String[] args) {
		  StringBuffer s1=new StringBuffer("My is Anu");//heap Memory
		  s1.append(" Prasad") ; 
		 // System.out.println(s1);
		  
		  s1.insert(2, " name");		  
		  
          System.out.println(s1);
          
          s1.replace(11, 14, "Komal");
          System.out.println(s1);
          
          StringBuffer s2=new StringBuffer("Manual Testing");//heap Memory 
          s2.delete(0, 7);
          System.out.println(s2); 
          System.out.println(s2.reverse());
          
          StringBuilder t2=new StringBuilder("Kaziranga Park");//heap Memory 
          System.out.println(t2.substring(2));
          System.out.println(t2.substring(2, 9));
          
	}

}
