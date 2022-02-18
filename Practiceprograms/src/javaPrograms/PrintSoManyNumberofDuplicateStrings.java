package javaPrograms;

import java.util.HashSet;

public class PrintSoManyNumberofDuplicateStrings {

	public static void main(String[] args) {

		String str = "india";

		char[] ch = str.toCharArray();

		HashSet<Character> hs = new HashSet<Character>();

		for (int i = 0; i < ch.length; i++) {
			hs.add(ch[i]);
		}

		for (char c : hs) {

			int count = 0;

			for (int i = 0; i < ch.length; i++) {
				if (c == ch[i]) {
					count++;
				}
				if (count > 1)//only extra step 
				{
					System.out.print(c + "=" + count);
				}

			}
		}

	}

}
