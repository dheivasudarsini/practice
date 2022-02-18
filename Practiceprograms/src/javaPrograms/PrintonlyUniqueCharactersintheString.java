package javaPrograms;

import java.util.HashSet;

public class PrintonlyUniqueCharactersintheString {

	public static void main(String[] args) {

		String str = "tamilnadu";

		char[] ch = str.toCharArray();

		HashSet<Character> set = new HashSet<Character>();

		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}

		System.out.println(set);

		for (char c : set)

		{
			int count = 0;
			for (int i = 0; i < ch.length; i++) {
				if (c == ch[i]) {
					count++;
				}
			}

			if (count > 1) {//extra step 1
				System.out.println(c + "=" + count);//extra step2
			}

		}
	}

}
