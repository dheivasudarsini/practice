package javaPrograms;

import java.util.HashSet;

public class CountonlyDuplicateWords {

	public static void main(String[] args) {
		
		String str = "welcome to india welcome to tamilnadu";
		
		String[] s = str.split(" ");
		
		int count1 = 0;
		
		HashSet<String> set = new HashSet<String>();
		
		for (int i = 0; i < str.length(); i++) {
			set.add(str);
		}
		System.out.println(set);

		for (String word : set) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (word.equals(str)) {
					count++;
				}

				if (count > 1)
					count1++;
			}

			System.out.println(count1);
		}

	}

}
