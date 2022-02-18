package javaPrograms;

public class DisplayEveryWordFirstLetter {

	public static void main(String[] args) {

		String s = "dheiva sudarsini";

		String[] word = s.split(" ");

		char c = ' ';

		int count = 0;

		for (String w : word) {

			char[] ch = w.toCharArray();

			c = ch[0];

			for (int i = 0; i < w.length() - 1; i++) {
				if (c == ch[i]) {
					count++;

					if (count > 1) {
						System.out.println(ch[0] + " ");
						break;
					} else {
						System.out.println(ch[0] + " ");
					}

				}
			}

		}
	}
}
