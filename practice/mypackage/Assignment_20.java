package practice.mypackage;

public class Assignment_20 {

	// 1. GLOBAL VARIABLE (Instance Variable)
    // Declared inside the class but outside any method. 
    // Accessible by all non-static methods in this class.
    String globalName = "MKT";

    // 2. GLOBAL STATIC VARIABLE
    // Accessible anywhere, even inside static methods like main() without an object.
    static String institute = "GroTechMinds";

    // 3. FINAL VARIABLE (Constant)
    // Once assigned, its value CANNOT be changed or modified.
    final int a = 3;

    public void displayInformation() 
    {
        // 4. LOCAL VARIABLE
        // Declared strictly inside a method. 
        // It only lives inside this method and cannot be accessed outside.
        int b = 95; 

        System.out.println("--- Inside Non-Static Method ---");
        System.out.println("Accessing Global Instance Variable: " + globalName);
        System.out.println("Accessing Global Static Variable: " + institute);
        System.out.println("Accessing Local Variable: " + a);
        System.out.println("Accessing Final Variable: " + b);
        
        // Trying to change final variable will cause compile error:
        // a = 5; // ❌ UNCOMMENTING THIS WILL BREAK THE CODE
    }

    public static void main(String[] args) {
        // Creating an object to access non-static members
        Assignment_20 obj = new Assignment_20();
        
        // Executing our method to see everything printed
        obj.displayInformation();

        System.out.println("\n--- Inside Static Main Method ---");
        // We can access the static global variable directly by name or class name (both will work)
        System.out.println("Directly accessing Static Global Variable inside main method: " + institute);
        
    }
}


