package javaPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordsfromaString {

	public static void main(String[] args) {

		String s = "welcome to india welcome to tyss";

		String[] str = s.split("");
				
		LinkedHashSet<String> lh = new LinkedHashSet<String>();

		for (int i = 0; i < s.length(); i++) {
			lh.add(s);
		}

		for (String word : lh) {

			System.out.println(word);

		}

	}

}
