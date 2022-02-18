package javaPrograms;

public class ReverseaStringusingThirdVariable {

	public static void main(String[] args) {

		String str = "sudarsini";

		char[] ch = str.toCharArray();

		String rev = " ";

		for (int i = ch.length - 1; i >= 0; i--)

		{

			rev = rev + ch[i];

		}

		System.out.print(rev);
	}

}
