package javaPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharactersfromaString {

	public static void main(String[] args) {

		// step 1 : convert the given string into char array
		String s = "india";

		// step 2: find the only unique character
		char[] c = s.toCharArray();

		// step 3:print unique character in proper order
		LinkedHashSet<Character> lh = new LinkedHashSet<Character>();

		for (int i = 0; i < c.length; i++) {
			lh.add(c[i]);
		}

		for (char ch : lh) {

			System.out.println(ch);

		}

	}

}
