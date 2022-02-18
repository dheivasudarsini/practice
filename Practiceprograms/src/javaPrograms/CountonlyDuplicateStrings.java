package javaPrograms;

import java.util.HashSet;

public class CountonlyDuplicateStrings {

	public static void main(String[] args) {

		String str = "malayalam";

		char[] ch = str.toCharArray();

		int count1 = 0;// extra step 1

		HashSet<Character> set = new HashSet<Character>();

		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}
		System.out.println(set);

		for (char c : set) {
			int count = 0;
			for (int i = 0; i < ch.length; i++) {
				if (c == ch[i]) {
					count++;
				}

				if (count > 1)//extra step 2
					count1++;//extra step 3
			}

			System.out.println(count1);//extra step 4
		}
	}

}
