package practice.mypackage;

public class Assignment_8 {

	
	// 1. Method with 1 integer parameter
    public void searchUser(int id) {
        System.out.println("ID: " + id);
    }

    // 2. Overloaded method with 1 String parameter (Different data type)
    public void searchUser(String email) {
        System.out.println("Searching user by Email: " + email);
    }

    // 3. Overloaded method with 2 parameters (Different number of parameters)
    public void searchUser(String name, String location) {
        System.out.println("Name: " + name + "Location: " + location);
    }

    public static void main(String[] args)
 {
        // Since these are non-static methods, we create an object of the class first

        Assignment_8 searchObj = new Assignment_8();

        searchObj.searchUser(101); 
       
        searchObj.searchUser("arjun@example.com"); 
      
        searchObj.searchUser("arjun", "Kolkata"); 
    }

}
