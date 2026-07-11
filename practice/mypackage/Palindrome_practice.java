package practice.mypackage;

public class Palindrome_practice {

	public static void main(String[] args) {

		String s1 = "civics";
		String s2 = "";

		for (int i = s1.length() - 1; i >= 0; i--) {
			char a = s1.charAt(i);
			s2 = s2 + a;
		}
		System.out.println("reverse String : " + s2);

		if (s1.equals(s2)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}
