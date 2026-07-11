package mypackage.selenium68Batch;

class Inheritace_base1 {
	// Static method in the parent class
	public void display() {
		System.out.println("A");
	}
}

public class Inheritace_Practice_001 extends Inheritace_base1 {
	// This static method HIDES the display() method in the Parent class
	public void display() {
		super.display();
		System.out.println("B");
	}

	public static void main(String[] args) {

		new Inheritace_Practice_001().display();

	}
}
