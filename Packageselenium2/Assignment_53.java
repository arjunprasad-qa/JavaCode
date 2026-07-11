package Packageselenium2;

public class Assignment_53 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Automation");

		sb1.append(" Testing");
		System.out.println(sb1);

		sb1.insert(11, "QA ");
		System.out.println(sb1);

		sb1.replace(0, 10, "Manaual");
		System.out.println(sb1);

		System.out.println(sb1.reverse());

		System.out.println(sb1.substring(8));
		System.out.println(sb1.substring(0, 7));
		System.out.println(sb1.charAt(0));
		System.out.println(sb1.delete(0, 8));
	}

}
