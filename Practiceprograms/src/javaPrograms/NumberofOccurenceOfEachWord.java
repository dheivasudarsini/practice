package javaPrograms;

import java.util.HashSet;

public class NumberofOccurenceOfEachWord {

	public static void main(String[] args) {

		String str = "welcome to india welcome to taminadu";

		String[] s = str.split(" ");

		HashSet<String> set = new HashSet<String>();

		for (int i = 0; i < str.length(); i++) {
			set.add(str);
		}

		for (String word : set) {

			int count = 0;

			for (int i = 0; i < str.length(); i++) {
				if (word.equals(str))

					count++;

			}

			System.out.println(word + "=" + count);
		}

	}

}
