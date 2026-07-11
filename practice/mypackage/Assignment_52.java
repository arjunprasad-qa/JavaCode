package practice.mypackage;

public class Assignment_52 {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("Automation");

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
	}

}
