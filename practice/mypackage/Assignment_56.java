package practice.mypackage;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment_56 {

	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<String>(Arrays.asList("MKT", "GroTech", "Minds"));

		for (int i = 0; i < str.size(); i++) {
			String s = str.get(i);

			System.out.println("value of Index " + i + " is " + s);
		}

	}

}
