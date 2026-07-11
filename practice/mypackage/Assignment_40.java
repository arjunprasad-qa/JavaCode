package practice.mypackage;

public class Assignment_40 {

	public static void main(String[] args) {

		String str = "Automation";
		String s1 = new String("Testing");
		String b1 = s1.concat(" Application");
		System.out.println(b1);

		System.out.println("String Length : " + str.length());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());

		System.out.println("Substring : " + str.substring(str.length() - 4));
		System.out.println("Substring start and End Index : " + str.substring(0, 4));

		System.out.println("CharAt function : " + str.charAt(2));

		boolean bool = str.equals(b1);
		System.out.println(bool);

		boolean bool1 = str.contains("Au");
		System.out.println(bool1);

		boolean bb1 = str.equalsIgnoreCase("automation");
		System.out.println(bb1);

		System.out.println(b1.isEmpty());
		System.out.println(b1.replace('A', 'O'));
		System.out.println(b1.replace("App", "Dup"));
		System.out.println(b1.replaceAll("[A-Z]", ""));
		System.out.println(b1.replaceAll("[a-z]", "1"));
		System.out.println("---End----");
	}

}
