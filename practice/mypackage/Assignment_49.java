package practice.mypackage;

//WAP to check in the given Strings how many are characters,numeric,space and special char?

public class Assignment_49 {

	public static void main(String[] args) {
		int noOfSpaces = 0, noOfAlphbatic = 0, noOfNumeric = 0;
		String str = "Mkt 1 @#%* ";

		char ch[] = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			boolean b1 = Character.isAlphabetic(ch[i]);
			// System.out.println(b1);
			if (b1 == true) {
				noOfAlphbatic++;
			}

			boolean b2 = Character.isDigit(ch[i]);
			// System.out.println(b2);
			if (b2 == true) {
				noOfNumeric++;
			}

			boolean b3 = Character.isWhitespace(ch[i]);
			// System.out.println(b3);
			if (b3 == true) {
				noOfSpaces++;
			}
		}

		System.out.println("No of Alphabet : " + noOfAlphbatic);
		System.out.println("No of Numerics : " + noOfNumeric);
		System.out.println("No of Spaces : " + noOfSpaces);

		int SpecialCharCount = str.length() - (noOfAlphbatic + noOfNumeric + noOfSpaces);
		System.out.println("No of Special Character : " + SpecialCharCount);
	}
}
