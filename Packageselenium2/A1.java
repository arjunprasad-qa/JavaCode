package Packageselenium2;

public class A1 {

	public static void main(String[] args) {

		/*
		 * String s = "Anumati"; System.out.println(s.replace('n', 'b'));
		 * System.out.println(s.replace("Anu", "Bibhu"));
		 * System.out.println(s.replaceAll("[A-Z]", "Ja")); String f =
		 * "I love cats. My friends also love cats.";
		 * System.out.println(f.replaceFirst("cats", "dogs"));
		 */

		/*
		 * StringBuilder sb = new StringBuilder("Susmit ghosh ");
		 * 
		 * sb.append(11); System.out.println(sb);
		 * 
		 * sb.insert(6, " anukalp"); System.out.println(sb);
		 * 
		 * System.out.println(sb.reverse()); System.out.println(sb);
		 * 
		 * sb.indexOf("hsohg"); System.out.println(sb);
		 * 
		 */

		// Create our StringBuilder
		StringBuilder sb = new StringBuilder("Automation Testing is fun. Automation is great.");

		System.out.println("Original Text: " + sb);
		System.out.println("-------------------------------------------------");

		// Scenario 1: Standard indexOf() - Finding the first occurrence
		int index1 = sb.indexOf("Testing");
		System.out.println("1. Index of 'Testing': " + index1);

		// Scenario 2: When the word does NOT exist
		int index2 = sb.indexOf("Manual");
		System.out.println("2. Index of 'Manual': " + index2);

		// Scenario 3: indexOf() with a starting position (fromIndex)
		// We tell it to start searching ONLY after index 15
		int index3 = sb.indexOf("Automation", 15);
		System.out.println("3. Index of second 'Automation': " + index3);
	}

}
