package javaPrograms;

import java.util.HashSet;

public class NumberofOccurenceofEachCharacter

{
	public static void main(String[] args)

	{

		// 1) declare a string
		String str = "dheiva";

		// 2)convert it into char array
		char[] ch = str.toCharArray();

		// 3)create a collection with generics to find only unique character of the given string
		HashSet<Character> set = new HashSet<Character>();

		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}

		// 4)compare each characters of collection with all the characters of character array
		for (char c : set) {
			int count = 0;

			for (int i = 0; i < ch.length; i++) {

				if (c == ch[i])

					count++;
			}

			System.out.println(c + "=" + count);
		}

	}

}
