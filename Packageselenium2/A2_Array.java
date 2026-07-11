package Packageselenium2;

public class A2_Array {

	String bookName;
	String authorName;

	public A2_Array(String bookName, String authorName) {
		this.bookName = bookName;
		this.authorName = authorName;
	}

	public static void main(String[] args) {

		A2_Array obj1 = new A2_Array("Java", "Gosling");
		A2_Array obj2 = new A2_Array("Physics", "Denjal");
		A2_Array obj3 = new A2_Array("Basics of Chemistry", "N K Jana");

		A2_Array[] arr = new A2_Array[3];
		arr[0] = obj1;
		arr[1] = obj2;
		arr[2] = obj3;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Book Name: " + arr[i].bookName + " Author name : " + arr[i].authorName);
		}

	}

}
