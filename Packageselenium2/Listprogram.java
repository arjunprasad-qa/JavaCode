package Packageselenium2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listprogram {

	public static void main(String[] args) {
		   List<String> l1= new ArrayList<String>();
           l1.add("Ram");
           l1.add("Sita");
           l1.add("Laxman");
           l1.add("Bheem");
           l1.add("Kavya");
           l1.add("Kavya");
           l1.add(null);
           l1.add(null);
           
           /* we can also use list to store data in one line
           //List<String> l1 = new ArrayList<>(Arrays.asList(
	       "Ram", "Sita", "Laxman", "Bheem", "Kavya", "Kavya", null, null
	   )); */

           System.out.println(l1);
           
           Iterator <String> i1 = l1.iterator();
           while (i1.hasNext())
           {
        	   System.out.println(i1.next());
           }
          
           
          // l1.listIterator();

	}

}
