package javaPrograms;

import java.util.HashSet;

public class PrintSoManyNumberofDuplicateWords {

	public static void main(String[] args) {

		String str = "welcome to india welcome to tamilnadu";

		String[] s = str.split(" ");

		HashSet<String> set = new HashSet<String>();

		for (int i = 0; i < str.length(); i++) {
			set.add(str);
		}

		for (String Word : set) {

			int count = 0;

			for (int i = 0; i < str.length(); i++) {
				if (Word.equals(str)) {

					count++;
				}
				if (count > 1) {
					System.out.println(Word + "=" + count);
				}
			}
		}
	}

}
