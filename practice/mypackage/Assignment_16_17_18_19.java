package practice.mypackage;

import java.util.Scanner;

public class Assignment_16_17_18_19 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
        
        
        // 1. CIRCLE CALCULATIONS
        // -----------------------------------------------------------------
        System.out.println("---Circle Calculations ---");
        System.out.print("Enter the radius of the Circle: ");
        double radius = scanner.nextDouble();

        // Formulas: Area = π * r * r, Circumference = 2 * π * r
        double circleArea = Math.PI * radius * radius;
        double circleCircumference = 2 * Math.PI * radius;

        System.out.println("Circle Area: " + circleArea);
        System.out.println("Circle Circumference: " + circleCircumference);

        
        // 2. SQUARE CALCULATIONS
        // -----------------------------------------------------------------
        System.out.println("---Square Calculations ---");
        System.out.print("Enter the side length of the Square: ");
        double side = scanner.nextDouble();

        // Formulas: Area = side * side, Perimeter = 4 * side
        double squareArea = side * side;
        double squarePerimeter = 4 * side;

        System.out.println("Square Area: " + squareArea);
        System.out.println("Square Perimeter: " + squarePerimeter);

        
        // 3. RECTANGLE CALCULATIONS
     
        System.out.println("---Rectangle Calculations ---");
        System.out.print("Enter the Length of the Rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the Width of the Rectangle: ");
        double width = scanner.nextDouble();

        // Formulas: Area = length * width, Perimeter = 2 * (length + width)
        double rectangleArea = length * width;
        double rectanglePerimeter = 2 * (length + width);

        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Rectangle Perimeter: " + rectanglePerimeter);

       
        // 4. TRIANGLE CALCULATIONS
       
        System.out.println("\n--Triangle Calculations ---");
        System.out.print("Enter Side A of the Triangle: ");
        double sideA = scanner.nextDouble();
        System.out.print("Enter BaseSide B  of the Triangle: ");
        double baseB = scanner.nextDouble();
        System.out.print("Enter Side C of the Triangle: ");
        double sideC = scanner.nextDouble();
        System.out.print("Enter the vertical Height of the Triangle: ");
        double height = scanner.nextDouble();

        // Formulas: Area = 0.5 * base * height, Perimeter = sideA + baseB + sideC
        double triangleArea = 0.5 * baseB * height;
        double trianglePerimeter = sideA + baseB + sideC;

        System.out.println("Triangle Area: " + triangleArea);
        System.out.println("Triangle Perimeter: " + trianglePerimeter);

        
        // Close scanner
        scanner.close();

	}

}
